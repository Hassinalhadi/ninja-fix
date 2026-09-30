package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.rememberme.di.UseCaseModule;
import com.checkout.components.rememberme.usecase.LogoutUseCase;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1001z1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final UseCaseModule f6421a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f6422b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f6423c;

    public C1001z1(UseCaseModule useCaseModule, dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f6421a = useCaseModule;
        this.f6422b = dVar;
        this.f6423c = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        LogoutUseCase logoutUseCase = this.f6421a.logoutUseCase((PrimitiveStateFlowRepository) this.f6422b.get(), (PrimitiveStateFlowRepository) this.f6423c.get());
        AbstractC2763s0.delta(logoutUseCase);
        return logoutUseCase;
    }
}
