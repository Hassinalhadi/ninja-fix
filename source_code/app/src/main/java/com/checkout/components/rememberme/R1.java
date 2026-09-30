package com.checkout.components.rememberme;

import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class R1 extends kotlin.jvm.internal.i implements Function1 {
    public R1(WalletScreenViewModel walletScreenViewModel) {
        super(1, 0, WalletScreenViewModel.class, walletScreenViewModel, "onCvvInputTextChanged", "onCvvInputTextChanged$rememberme_standardRelease(Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p02 = (String) obj;
        Intrinsics.echo(p02, "p0");
        ((WalletScreenViewModel) this.receiver).onCvvInputTextChanged$rememberme_standardRelease(p02);
        return Unit.INSTANCE;
    }
}
