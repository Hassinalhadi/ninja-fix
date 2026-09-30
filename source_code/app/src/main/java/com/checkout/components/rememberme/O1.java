package com.checkout.components.rememberme;

import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class O1 extends kotlin.jvm.internal.a implements Function0 {
    public O1(WalletScreenViewModel walletScreenViewModel) {
        super(0, 8, WalletScreenViewModel.class, walletScreenViewModel, "onPayButtonClick", "onPayButtonClick$rememberme_standardRelease()Lkotlinx/coroutines/Job;");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((WalletScreenViewModel) this.receiver).onPayButtonClick$rememberme_standardRelease();
        return Unit.INSTANCE;
    }
}
