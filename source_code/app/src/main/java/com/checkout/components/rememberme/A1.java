package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.rememberme.data.ConsumerRepository;
import com.checkout.components.rememberme.di.UseCaseModule;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import com.checkout.components.rememberme.utils.JWTDecoder;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class A1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final UseCaseModule f5713a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5714b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5715c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f5716d;
    public final dagger.internal.d e;

    public A1(UseCaseModule useCaseModule, C0975r c0975r, dagger.internal.d dVar, dagger.internal.b bVar, dagger.internal.b bVar2) {
        this.f5713a = useCaseModule;
        this.f5714b = c0975r;
        this.f5715c = dVar;
        this.f5716d = bVar;
        this.e = bVar2;
    }

    @Override // Kd.a
    public final Object get() {
        MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase = this.f5713a.mapJWTTokenToWalletUseCase(new JWTDecoder(), (ConsumerRepository) this.f5714b.get(), (PrimitiveStateFlowRepository) this.f5715c.get(), (LogDetails) this.f5716d.get(), (Logger) this.e.get());
        AbstractC2763s0.delta(mapJWTTokenToWalletUseCase);
        return mapJWTTokenToWalletUseCase;
    }
}
