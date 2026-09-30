package com.checkout.components.wallet;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.i implements Function0 {
    public j(WalletComponent walletComponent) {
        super(0, 0, WalletComponent.class, walletComponent, "invokePaymentAttempt", "invokePaymentAttempt$wallet_standardRelease()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((WalletComponent) this.receiver).invokePaymentAttempt$wallet_standardRelease();
        return Unit.INSTANCE;
    }
}
