package com.checkout.components.redirecthandler;

import ao.ad;
import com.checkout.components.redirecthandler.model.RedirectResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redirect-handler_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(RedirectResult.Failure failure) {
        String gray;
        String declineReason = failure.getDeclineReason();
        if (declineReason != null && (gray = ad.gray("Payment was declined. Decline reason: ", declineReason, ".")) != null) {
            return gray;
        }
        return "Payment was declined";
    }
}
