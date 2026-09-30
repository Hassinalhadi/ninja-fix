package com.checkout.components.redirecthandler.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/checkout/components/redirecthandler/utils/RedirectionConstants;", "", "", "REDIRECT_REASON_PARAM", "Ljava/lang/String;", "REDIRECT_SUCCESS_VALUE", "REDIRECT_FAILURE_VALUE", "REDIRECT_SUCCESS", "REDIRECT_FAILURE", "DECLINE_REASON_PARAM", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectionConstants {

    @NotNull
    public static final String DECLINE_REASON_PARAM = "cko-decline-reason";

    @NotNull
    public static final RedirectionConstants INSTANCE = new RedirectionConstants();

    @NotNull
    public static final String REDIRECT_FAILURE = "cko-redirect-reason=failure";

    @NotNull
    public static final String REDIRECT_FAILURE_VALUE = "failure";

    @NotNull
    public static final String REDIRECT_REASON_PARAM = "cko-redirect-reason";

    @NotNull
    public static final String REDIRECT_SUCCESS = "cko-redirect-reason=success";

    @NotNull
    public static final String REDIRECT_SUCCESS_VALUE = "success";

    private RedirectionConstants() {
    }
}
