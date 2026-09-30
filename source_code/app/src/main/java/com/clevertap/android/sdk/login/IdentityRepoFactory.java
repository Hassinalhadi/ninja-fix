package com.clevertap.android.sdk.login;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.validation.ValidationResultStack;

/* loaded from: classes3.dex */
public class IdentityRepoFactory {
    private IdentityRepoFactory() {
    }

    public static IdentityRepo getRepo(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ValidationResultStack validationResultStack) {
        IdentityRepo configurableIdentityRepo;
        LoginInfoProvider loginInfoProvider = new LoginInfoProvider(context, cleverTapInstanceConfig);
        if (loginInfoProvider.isLegacyProfileLoggedIn()) {
            configurableIdentityRepo = new LegacyIdentityRepo(cleverTapInstanceConfig);
        } else {
            configurableIdentityRepo = new ConfigurableIdentityRepo(cleverTapInstanceConfig, loginInfoProvider, validationResultStack);
        }
        cleverTapInstanceConfig.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "Repo provider: ".concat(configurableIdentityRepo.getClass().getSimpleName()));
        return configurableIdentityRepo;
    }
}
