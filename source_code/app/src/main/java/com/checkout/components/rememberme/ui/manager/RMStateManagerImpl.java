package com.checkout.components.rememberme.ui.manager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yf.AbstractC3428A;
import yf.at;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/rememberme/ui/manager/RMStateManagerImpl;", "Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "<init>", "()V", "Lyf/at;", "", "a", "Lyf/at;", "getUiPaymentErrorMessage", "()Lyf/at;", "uiPaymentErrorMessage", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RMStateManagerImpl implements RMStateManager {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final at uiPaymentErrorMessage = AbstractC3428A.charlie("");

    @Override // com.checkout.components.rememberme.ui.manager.RMStateManager
    @NotNull
    public final at getUiPaymentErrorMessage() {
        return this.uiPaymentErrorMessage;
    }
}
