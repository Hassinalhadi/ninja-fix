package com.checkout.components.wallet;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.i implements Function0 {
    public k(WalletComponent walletComponent) {
        super(0, 0, WalletComponent.class, walletComponent, "handleComponentNotChecked", "handleComponentNotChecked$wallet_standardRelease()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((WalletComponent) this.receiver).handleComponentNotChecked$wallet_standardRelease();
        return Unit.INSTANCE;
    }
}
