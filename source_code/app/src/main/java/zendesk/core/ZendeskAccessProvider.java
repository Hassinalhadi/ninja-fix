package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.StringUtils;
import java.io.IOException;
import vg.aq;

/* loaded from: classes.dex */
class ZendeskAccessProvider implements AccessProvider {
    private static final String LOG_TAG = "ZendeskAccessProvider";
    private final AccessService accessService;
    private final IdentityManager identityManager;

    public ZendeskAccessProvider(IdentityManager identityManager, AccessService accessService) {
        this.identityManager = identityManager;
        this.accessService = accessService;
    }

    @Override // zendesk.core.AccessProvider
    public aq<AuthenticationResponse> getAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity) {
        Logger.d(LOG_TAG, "Requesting an access token for anonymous identity.", new Object[0]);
        try {
            return this.accessService.getAuthTokenForAnonymous(new AuthenticationRequestWrapper(new ApiAnonymousIdentity(anonymousIdentity, this.identityManager.getSdkGuid()))).execute();
        } catch (IOException e) {
            Logger.e(LOG_TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }

    @Override // zendesk.core.AccessProvider
    public aq<AuthenticationResponse> getAuthTokenViaJwt(JwtIdentity jwtIdentity) {
        Logger.d(LOG_TAG, "Requesting an access token for jwt identity.", new Object[0]);
        if (StringUtils.isEmpty(jwtIdentity.getJwtUserIdentifier())) {
            Logger.e(LOG_TAG, AccessProvider.NO_JWT_ERROR_MESSAGE, new Object[0]);
            return null;
        }
        try {
            return this.accessService.getAuthTokenForJwt(new AuthenticationRequestWrapper(jwtIdentity)).execute();
        } catch (IOException e) {
            Logger.e(LOG_TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }
}
