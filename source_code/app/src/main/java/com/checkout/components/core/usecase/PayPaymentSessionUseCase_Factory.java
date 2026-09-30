package com.checkout.components.core.usecase;

import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class PayPaymentSessionUseCase_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f5059a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5060b;

    public PayPaymentSessionUseCase_Factory(d dVar, d dVar2) {
        this.f5059a = dVar;
        this.f5060b = dVar2;
    }

    public static PayPaymentSessionUseCase_Factory create(d dVar, d dVar2) {
        return new PayPaymentSessionUseCase_Factory(dVar, dVar2);
    }

    public static PayPaymentSessionUseCase newInstance(JsonAdapter<ErrorResponse> jsonAdapter, PaymentRepository paymentRepository) {
        return new PayPaymentSessionUseCase(jsonAdapter, paymentRepository);
    }

    @Override // Kd.a
    public final PayPaymentSessionUseCase get() {
        return new PayPaymentSessionUseCase((JsonAdapter) this.f5059a.get(), (PaymentRepository) this.f5060b.get());
    }
}
