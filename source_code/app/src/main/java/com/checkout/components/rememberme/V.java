package com.checkout.components.rememberme;

import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class V implements InterfaceC3439i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f5815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapJWTTokenToWalletUseCase f5816b;

    public V(S s3, MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        this.f5815a = s3;
        this.f5816b = mapJWTTokenToWalletUseCase;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object collect = this.f5815a.collect(new U(interfaceC3440j, this.f5816b), cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
