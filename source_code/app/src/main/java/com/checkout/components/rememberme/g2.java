package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.rememberme.model.WalletScreenViewState;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class g2 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalletScreenViewModel f5935a;

    public g2(WalletScreenViewModel walletScreenViewModel) {
        this.f5935a = walletScreenViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        this.f5935a.getStateRepository$rememberme_standardRelease().update((PrimitiveStateFlowRepository<WalletScreenViewState>) obj);
        return Unit.INSTANCE;
    }
}
