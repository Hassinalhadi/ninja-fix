package com.clevertap.android.sdk.login;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.ValidationResultFactory;
import com.clevertap.android.sdk.validation.ValidationResultStack;

/* loaded from: classes3.dex */
public class ConfigurableIdentityRepo implements IdentityRepo {
    private static final String TAG = "ConfigurableIdentityRepo";
    private final CleverTapInstanceConfig config;
    private IdentitySet identitySet;
    private final LoginInfoProvider infoProvider;
    private final ValidationResultStack validationResultStack;

    public ConfigurableIdentityRepo(CleverTapInstanceConfig cleverTapInstanceConfig, LoginInfoProvider loginInfoProvider, ValidationResultStack validationResultStack) {
        this.config = cleverTapInstanceConfig;
        this.infoProvider = loginInfoProvider;
        this.validationResultStack = validationResultStack;
        loadIdentitySet();
    }

    private void handleError(IdentitySet identitySet, IdentitySet identitySet2) {
        if (identitySet.isValid() && identitySet2.isValid() && !identitySet.equals(identitySet2)) {
            this.validationResultStack.pushValidationResult(ValidationResultFactory.create(531));
            this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepopushing error due to mismatch [Pref:" + identitySet + "], [Config:" + identitySet2 + Constants.AES_SUFFIX);
            return;
        }
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepoNo error found while comparing [Pref:" + identitySet + "], [Config:" + identitySet2 + Constants.AES_SUFFIX);
    }

    @Override // com.clevertap.android.sdk.login.IdentityRepo
    public IdentitySet getIdentitySet() {
        return this.identitySet;
    }

    @Override // com.clevertap.android.sdk.login.IdentityRepo
    public boolean hasIdentity(String str) {
        boolean contains = this.identitySet.contains(str);
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepoisIdentity [Key: " + str + " , Value: " + contains + Constants.AES_SUFFIX);
        return contains;
    }

    public void loadIdentitySet() {
        IdentitySet from = IdentitySet.from(this.infoProvider.getCachedIdentityKeysForAccount());
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepoPrefIdentitySet [" + from + Constants.AES_SUFFIX);
        IdentitySet from2 = IdentitySet.from(this.config.getIdentityKeys());
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepoConfigIdentitySet [" + from2 + Constants.AES_SUFFIX);
        handleError(from, from2);
        if (from.isValid()) {
            this.identitySet = from;
            this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepoIdentity Set activated from Pref[" + this.identitySet + Constants.AES_SUFFIX);
        } else if (from2.isValid()) {
            this.identitySet = from2;
            this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepoIdentity Set activated from Config[" + this.identitySet + Constants.AES_SUFFIX);
        } else {
            this.identitySet = IdentitySet.getDefault();
            this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepoIdentity Set activated from Default[" + this.identitySet + Constants.AES_SUFFIX);
        }
        if (!from.isValid()) {
            String identitySet = this.identitySet.toString();
            this.infoProvider.saveIdentityKeysForAccount(identitySet);
            this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "ConfigurableIdentityRepoSaving Identity Keys in Pref[" + identitySet + Constants.AES_SUFFIX);
        }
    }
}
