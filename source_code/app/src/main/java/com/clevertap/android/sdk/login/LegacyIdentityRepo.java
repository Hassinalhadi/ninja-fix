package com.clevertap.android.sdk.login;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes3.dex */
public class LegacyIdentityRepo implements IdentityRepo {
    private static final String TAG = "LegacyIdentityRepo";
    private final CleverTapInstanceConfig config;
    private IdentitySet identities;

    public LegacyIdentityRepo(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.config = cleverTapInstanceConfig;
        loadIdentitySet();
    }

    private void loadIdentitySet() {
        this.identities = IdentitySet.getDefault();
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "LegacyIdentityRepo Setting the default IdentitySet[" + this.identities + Constants.AES_SUFFIX);
    }

    @Override // com.clevertap.android.sdk.login.IdentityRepo
    public IdentitySet getIdentitySet() {
        return this.identities;
    }

    @Override // com.clevertap.android.sdk.login.IdentityRepo
    public boolean hasIdentity(String str) {
        boolean contains = this.identities.contains(str);
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "isIdentity [Key: " + str + " , Value: " + contains + Constants.AES_SUFFIX);
        return contains;
    }
}
