package com.checkout.components.rememberme;

import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class O implements InterfaceC3439i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3439i f5784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapJWTTokenToWalletUseCase f5785b;

    public O(InterfaceC3439i interfaceC3439i, MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        this.f5784a = interfaceC3439i;
        this.f5785b = mapJWTTokenToWalletUseCase;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object collect = this.f5784a.collect(new N(interfaceC3440j, this.f5785b), cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
