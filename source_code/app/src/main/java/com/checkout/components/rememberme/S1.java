package com.checkout.components.rememberme;

import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class S1 extends kotlin.jvm.internal.i implements Function1 {
    public S1(WalletScreenViewModel walletScreenViewModel) {
        super(1, 0, WalletScreenViewModel.class, walletScreenViewModel, "onCvvFocusChanged", "onCvvFocusChanged$rememberme_standardRelease(Z)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((WalletScreenViewModel) this.receiver).onCvvFocusChanged$rememberme_standardRelease(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }
}
