package com.checkout.components.rememberme;

import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class P1 extends kotlin.jvm.internal.i implements Function0 {
    public P1(WalletScreenViewModel walletScreenViewModel) {
        super(0, 0, WalletScreenViewModel.class, walletScreenViewModel, "onLogoutClick", "onLogoutClick$rememberme_standardRelease()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((WalletScreenViewModel) this.receiver).onLogoutClick$rememberme_standardRelease();
        return Unit.INSTANCE;
    }
}
