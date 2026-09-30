package com.checkout.components.rememberme;

import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class m2 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f6002a;

    public m2(WalletScreenViewModel walletScreenViewModel) {
        this.f6002a = walletScreenViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        this.f6002a.updateErrorMessage$rememberme_standardRelease((String) obj);
        return Unit.INSTANCE;
    }
}
