package zendesk.core;

/* loaded from: classes.dex */
interface IdentityStorage {
    void clear();

    String getBlipsUuid();

    Identity getIdentity();

    AccessToken getStoredAccessToken();

    Long getUserId();

    String getUuid();

    void storeAccessToken(AccessToken accessToken);

    void storeIdentity(Identity identity);

    void storeSdkGuid(String str);

    void storeUserId(Long l10);

    String updateBlipsUuid();

    String updateSdkGuid();
}
