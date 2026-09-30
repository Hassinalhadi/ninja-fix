package com.checkout.components.redirecthandler;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/checkout/components/redirecthandler/RedirectEventValues;", "", "", "RENDERER_CUSTOM_TABS", "Ljava/lang/String;", "RENDERER_WEB_VIEW", "RESULT_SUCCEEDED", "RESULT_FAILED", "RESULT_ABANDONED", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectEventValues {

    @NotNull
    public static final RedirectEventValues INSTANCE = new RedirectEventValues();

    @NotNull
    public static final String RENDERER_CUSTOM_TABS = "custom_tabs";

    @NotNull
    public static final String RENDERER_WEB_VIEW = "web_view";

    @NotNull
    public static final String RESULT_ABANDONED = "abandoned";

    @NotNull
    public static final String RESULT_FAILED = "failed";

    @NotNull
    public static final String RESULT_SUCCEEDED = "succeeded";

    private RedirectEventValues() {
    }
}
