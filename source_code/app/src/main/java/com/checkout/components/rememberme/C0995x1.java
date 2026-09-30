package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.di.UseCaseModule;
import kotlin.Unit;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0995x1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final UseCaseModule f6412a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f6413b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f6414c;

    public C0995x1(UseCaseModule useCaseModule, dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f6412a = useCaseModule;
        this.f6413b = dVar;
        this.f6414c = dVar2;
    }

    @Override // Kd.a
    public final Object get() {
        SuspendUseCase<String, Unit> checkIsAccountAvailablePrefilledUseCase = this.f6412a.checkIsAccountAvailablePrefilledUseCase((CheckoutKMPRememberMe) this.f6413b.get(), (PrimitiveStateFlowRepository) this.f6414c.get());
        AbstractC2763s0.delta(checkIsAccountAvailablePrefilledUseCase);
        return checkIsAccountAvailablePrefilledUseCase;
    }
}
