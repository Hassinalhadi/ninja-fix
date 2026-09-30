package com.checkout.components.core.di.module;

import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.core.usecase.PayPaymentSessionUseCase;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class UseCaseModule_ProvidePayPaymentSessionUseCaseFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final UseCaseModule f4785a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4786b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4787c;

    public UseCaseModule_ProvidePayPaymentSessionUseCaseFactory(UseCaseModule useCaseModule, d dVar, d dVar2) {
        this.f4785a = useCaseModule;
        this.f4786b = dVar;
        this.f4787c = dVar2;
    }

    public static UseCaseModule_ProvidePayPaymentSessionUseCaseFactory create(UseCaseModule useCaseModule, d dVar, d dVar2) {
        return new UseCaseModule_ProvidePayPaymentSessionUseCaseFactory(useCaseModule, dVar, dVar2);
    }

    public static PayPaymentSessionUseCase providePayPaymentSessionUseCase(UseCaseModule useCaseModule, JsonAdapter<ErrorResponse> jsonAdapter, PaymentRepository paymentRepository) {
        PayPaymentSessionUseCase providePayPaymentSessionUseCase = useCaseModule.providePayPaymentSessionUseCase(jsonAdapter, paymentRepository);
        AbstractC2763s0.delta(providePayPaymentSessionUseCase);
        return providePayPaymentSessionUseCase;
    }

    @Override // Kd.a
    public final PayPaymentSessionUseCase get() {
        PayPaymentSessionUseCase providePayPaymentSessionUseCase = this.f4785a.providePayPaymentSessionUseCase((JsonAdapter) this.f4786b.get(), (PaymentRepository) this.f4787c.get());
        AbstractC2763s0.delta(providePayPaymentSessionUseCase);
        return providePayPaymentSessionUseCase;
    }
}
