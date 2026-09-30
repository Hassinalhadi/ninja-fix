package zendesk.core;

import av.q;
import com.zendesk.logger.Logger;
import com.zendesk.util.StringUtils;
import java.util.Locale;

/* loaded from: classes.dex */
class ZendeskIdentityManager implements IdentityManager {
    private static final String LOG_TAG = "ZendeskIdentityManager";
    private final IdentityStorage identityStorage;

    public ZendeskIdentityManager(IdentityStorage identityStorage) {
        this.identityStorage = identityStorage;
    }

    @Override // zendesk.core.IdentityManager
    public String getBlipsUuid() {
        String blipsUuid = this.identityStorage.getBlipsUuid();
        if (StringUtils.isEmpty(blipsUuid)) {
            return this.identityStorage.updateBlipsUuid();
        }
        return blipsUuid;
    }

    @Override // zendesk.core.IdentityManager
    public Identity getIdentity() {
        Identity identity = this.identityStorage.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
            anonymousIdentity.setSdkGuid(getSdkGuid());
            return anonymousIdentity;
        }
        return identity;
    }

    @Override // zendesk.core.IdentityManager
    public String getSdkGuid() {
        String uuid = this.identityStorage.getUuid();
        if (StringUtils.isEmpty(uuid)) {
            return this.identityStorage.updateSdkGuid();
        }
        return uuid;
    }

    @Override // zendesk.core.IdentityManager
    public String getStoredAccessTokenAsBearerToken() {
        AccessToken storedAccessToken = this.identityStorage.getStoredAccessToken();
        if (storedAccessToken != null) {
            Locale locale = Locale.US;
            return q.echo("Bearer ", storedAccessToken.getAccessToken());
        }
        Logger.w(LOG_TAG, "There is no stored access token, have you initialised an identity and requested an access token?", new Object[0]);
        return null;
    }

    @Override // zendesk.core.IdentityManager
    public Long getUserId() {
        return this.identityStorage.getUserId();
    }

    @Override // zendesk.core.IdentityManager
    public boolean identityIsDifferent(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        if (identity2 != null && identity != null && identity2.equals(identity)) {
            return false;
        }
        return true;
    }

    @Override // zendesk.core.IdentityManager
    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken == null) {
            Logger.w(LOG_TAG, "Access Token object was null, cannot store.", new Object[0]);
            return;
        }
        if (!StringUtils.isEmpty(accessToken.getAccessToken())) {
            this.identityStorage.storeAccessToken(accessToken);
        } else {
            Logger.w(LOG_TAG, "Access token String was null or empty, cannot store.", new Object[0]);
        }
        String userId = accessToken.getUserId();
        if (StringUtils.isNumeric(userId)) {
            this.identityStorage.storeUserId(Long.valueOf(userId));
        } else {
            Logger.w(LOG_TAG, "User ID String was null or empty, cannot store.", new Object[0]);
        }
    }

    @Override // zendesk.core.IdentityManager
    public Identity updateAndPersistIdentity(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        if (identity2 == null) {
            Logger.d(LOG_TAG, "No previous identity set, storing identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        }
        if (identity != null && identityIsDifferent(identity)) {
            Logger.d(LOG_TAG, "Identity has changed, storing new identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        }
        return identity2;
    }
}
