package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.di.UseCaseModule;
import kotlin.Unit;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0998y1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final UseCaseModule f6418a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f6419b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f6420c;

    public C0998y1(UseCaseModule useCaseModule, dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f6418a = useCaseModule;
        this.f6419b = dVar;
        this.f6420c = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        SuspendUseCase<String, Unit> checkIsAccountAvailableUseCase = this.f6418a.checkIsAccountAvailableUseCase((CheckoutKMPRememberMe) this.f6419b.get(), (PrimitiveSharedFlowRepository) this.f6420c.get());
        AbstractC2763s0.delta(checkIsAccountAvailableUseCase);
        return checkIsAccountAvailableUseCase;
    }
}
