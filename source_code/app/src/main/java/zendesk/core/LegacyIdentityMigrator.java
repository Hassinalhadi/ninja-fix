package zendesk.core;

import com.google.gson.JsonSyntaxException;
import com.google.gson.q;
import com.google.gson.s;
import com.zendesk.logger.Logger;
import com.zendesk.util.StringUtils;
import s6.AbstractC2656g0;
import zendesk.core.AnonymousIdentity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LegacyIdentityMigrator {
    private static final String ANONYMOUS_EMAIL_KEY = "email";
    private static final String ANONYMOUS_NAME_KEY = "name";
    private static final String JWT_TOKEN_KEY = "token";
    private static final String LEGACY_ACCESS_TOKEN_KEY = "access_token";
    private static final String LEGACY_ACCESS_TOKEN_USER_ID_KEY = "user_id";
    private static final String LEGACY_IDENTITY_KEY = "zendesk-identity";
    private static final String LEGACY_IDENTITY_TYPE_KEY = "zendesk-identity-type";
    private static final String LEGACY_PUSH_DEVICE_ID_KEY = "identifier";
    private static final String LEGACY_PUSH_RESPONSE_KEY = "pushRegResponseIdentifier";
    private static final String LEGACY_SDK_GUID_KEY = "uuid";
    private static final String LEGACY_STORED_TOKEN_KEY = "stored_token";
    private static final String LEGACY_USER_ID_KEY = "user_id";
    private static final String LOG_TAG = "LegacyIdentityStorage";
    private IdentityManager identityManager;
    private IdentityStorage identityStorage;
    private SharedPreferencesStorage legacyIdentityStorage;
    private SharedPreferencesStorage legacyPushStorage;
    private PushDeviceIdStorage pushDeviceIdStorage;

    /* renamed from: zendesk.core.LegacyIdentityMigrator$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$AuthenticationType;

        static {
            int[] iArr = new int[AuthenticationType.values().length];
            $SwitchMap$zendesk$core$AuthenticationType = iArr;
            try {
                iArr[AuthenticationType.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$AuthenticationType[AuthenticationType.JWT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LegacyIdentityMigrator(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage, IdentityManager identityManager, PushDeviceIdStorage pushDeviceIdStorage) {
        this.legacyIdentityStorage = sharedPreferencesStorage;
        this.legacyPushStorage = sharedPreferencesStorage2;
        this.identityStorage = identityStorage;
        this.identityManager = identityManager;
        this.pushDeviceIdStorage = pushDeviceIdStorage;
    }

    private void clear() {
        this.legacyIdentityStorage.remove(LEGACY_IDENTITY_TYPE_KEY);
        this.legacyIdentityStorage.remove(LEGACY_IDENTITY_KEY);
        this.legacyIdentityStorage.remove(LEGACY_STORED_TOKEN_KEY);
        this.legacyIdentityStorage.remove(LEGACY_SDK_GUID_KEY);
        this.legacyIdentityStorage.remove("user_id");
        this.legacyPushStorage.remove(LEGACY_PUSH_RESPONSE_KEY);
    }

    private AccessToken getLegacyAccessToken() {
        String str = this.legacyIdentityStorage.get(LEGACY_STORED_TOKEN_KEY);
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            q charlie = AbstractC2656g0.charlie(str);
            if (!(charlie instanceof s)) {
                return null;
            }
            s bravo = charlie.bravo();
            q hotel = bravo.hotel(LEGACY_ACCESS_TOKEN_KEY);
            q hotel2 = bravo.hotel("user_id");
            if (hotel == null || hotel2 == null) {
                return null;
            }
            return new AccessToken(hotel.delta(), hotel2.delta());
        } catch (JsonSyntaxException e) {
            Logger.w(LOG_TAG, "Unable to read legacy AccessToken.", e, new Object[0]);
            return null;
        }
    }

    private Identity getLegacyIdentity() {
        AuthenticationType legacyIdentityType = getLegacyIdentityType();
        if (legacyIdentityType == null) {
            return null;
        }
        int i4 = AnonymousClass1.$SwitchMap$zendesk$core$AuthenticationType[legacyIdentityType.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                return null;
            }
            return readLegacyJwtIdentity();
        }
        return readLegacyAnonymousIdentity();
    }

    private AuthenticationType getLegacyIdentityType() {
        return AuthenticationType.getAuthType(this.legacyIdentityStorage.get(LEGACY_IDENTITY_TYPE_KEY));
    }

    private String getLegacyPushId() {
        q hotel;
        String str = this.legacyPushStorage.get(LEGACY_PUSH_RESPONSE_KEY);
        if (StringUtils.hasLength(str)) {
            try {
                q charlie = AbstractC2656g0.charlie(str);
                if ((charlie instanceof s) && (hotel = charlie.bravo().hotel(LEGACY_PUSH_DEVICE_ID_KEY)) != null) {
                    return hotel.delta();
                }
            } catch (JsonSyntaxException e) {
                Logger.w(LOG_TAG, "Unable to read legacy push device ID.", e, new Object[0]);
            }
        }
        return null;
    }

    private String getLegacySdkGuid() {
        return this.legacyIdentityStorage.get(LEGACY_SDK_GUID_KEY);
    }

    private long getLegacyUserId() {
        return this.legacyIdentityStorage.getLong("user_id");
    }

    private AnonymousIdentity readLegacyAnonymousIdentity() {
        String str = this.legacyIdentityStorage.get(LEGACY_IDENTITY_KEY);
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            q charlie = AbstractC2656g0.charlie(str);
            if (!(charlie instanceof s)) {
                return null;
            }
            s bravo = charlie.bravo();
            AnonymousIdentity.Builder builder = new AnonymousIdentity.Builder();
            q hotel = bravo.hotel(ANONYMOUS_EMAIL_KEY);
            if (hotel != null) {
                builder.withEmailIdentifier(hotel.delta());
            }
            q hotel2 = bravo.hotel(ANONYMOUS_NAME_KEY);
            if (hotel2 != null) {
                builder.withNameIdentifier(hotel2.delta());
            }
            return (AnonymousIdentity) builder.build();
        } catch (JsonSyntaxException e) {
            Logger.w(LOG_TAG, "Unable to read legacy AnonymousIdentity.", e, new Object[0]);
            return null;
        }
    }

    private JwtIdentity readLegacyJwtIdentity() {
        String str = this.legacyIdentityStorage.get(LEGACY_IDENTITY_KEY);
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            q hotel = AbstractC2656g0.charlie(str).bravo().hotel(JWT_TOKEN_KEY);
            if (hotel == null) {
                return null;
            }
            return new JwtIdentity(hotel.delta());
        } catch (JsonSyntaxException e) {
            Logger.w(LOG_TAG, "Unable to read legacy JwtIdentity.", e, new Object[0]);
            return null;
        }
    }

    public void checkAndMigrateIdentity() {
        Identity legacyIdentity = getLegacyIdentity();
        if (legacyIdentity == null) {
            return;
        }
        this.identityStorage.storeIdentity(legacyIdentity);
        long legacyUserId = getLegacyUserId();
        if (legacyUserId != 0) {
            this.identityStorage.storeUserId(Long.valueOf(legacyUserId));
        }
        AccessToken legacyAccessToken = getLegacyAccessToken();
        if (legacyAccessToken != null) {
            this.identityManager.storeAccessToken(legacyAccessToken);
        }
        if (getLegacyIdentityType() == AuthenticationType.ANONYMOUS) {
            String legacySdkGuid = getLegacySdkGuid();
            if (StringUtils.hasLength(legacySdkGuid)) {
                this.identityStorage.storeSdkGuid(legacySdkGuid);
            }
        }
        String legacyPushId = getLegacyPushId();
        if (StringUtils.hasLength(legacyPushId)) {
            this.pushDeviceIdStorage.storeRegisteredDeviceId(legacyPushId);
        }
        clear();
    }
}
