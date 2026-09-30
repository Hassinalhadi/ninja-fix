package com.checkout.components.rememberme;

import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class S implements InterfaceC3439i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f5797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapJWTTokenToWalletUseCase f5798b;

    public S(O o5, MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        this.f5797a = o5;
        this.f5798b = mapJWTTokenToWalletUseCase;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object collect = this.f5797a.collect(new Q(interfaceC3440j, this.f5798b), cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
