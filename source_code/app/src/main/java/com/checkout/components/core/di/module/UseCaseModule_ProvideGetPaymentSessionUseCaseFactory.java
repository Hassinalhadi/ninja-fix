package com.checkout.components.core.di.module;

import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.core.usecase.GetPaymentSessionUseCase;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class UseCaseModule_ProvideGetPaymentSessionUseCaseFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final UseCaseModule f4782a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4783b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4784c;

    public UseCaseModule_ProvideGetPaymentSessionUseCaseFactory(UseCaseModule useCaseModule, d dVar, d dVar2) {
        this.f4782a = useCaseModule;
        this.f4783b = dVar;
        this.f4784c = dVar2;
    }

    public static UseCaseModule_ProvideGetPaymentSessionUseCaseFactory create(UseCaseModule useCaseModule, d dVar, d dVar2) {
        return new UseCaseModule_ProvideGetPaymentSessionUseCaseFactory(useCaseModule, dVar, dVar2);
    }

    public static GetPaymentSessionUseCase provideGetPaymentSessionUseCase(UseCaseModule useCaseModule, JsonAdapter<ErrorResponse> jsonAdapter, PaymentRepository paymentRepository) {
        GetPaymentSessionUseCase provideGetPaymentSessionUseCase = useCaseModule.provideGetPaymentSessionUseCase(jsonAdapter, paymentRepository);
        AbstractC2763s0.delta(provideGetPaymentSessionUseCase);
        return provideGetPaymentSessionUseCase;
    }

    @Override // Kd.a
    public final GetPaymentSessionUseCase get() {
        GetPaymentSessionUseCase provideGetPaymentSessionUseCase = this.f4782a.provideGetPaymentSessionUseCase((JsonAdapter) this.f4783b.get(), (PaymentRepository) this.f4784c.get());
        AbstractC2763s0.delta(provideGetPaymentSessionUseCase);
        return provideGetPaymentSessionUseCase;
    }
}
