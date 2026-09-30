package com.checkout.components.core.usecase;

import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class GetPaymentSessionUseCase_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f5056a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5057b;

    public GetPaymentSessionUseCase_Factory(d dVar, d dVar2) {
        this.f5056a = dVar;
        this.f5057b = dVar2;
    }

    public static GetPaymentSessionUseCase_Factory create(d dVar, d dVar2) {
        return new GetPaymentSessionUseCase_Factory(dVar, dVar2);
    }

    public static GetPaymentSessionUseCase newInstance(JsonAdapter<ErrorResponse> jsonAdapter, PaymentRepository paymentRepository) {
        return new GetPaymentSessionUseCase(jsonAdapter, paymentRepository);
    }

    @Override // Kd.a
    public final GetPaymentSessionUseCase get() {
        return new GetPaymentSessionUseCase((JsonAdapter) this.f5056a.get(), (PaymentRepository) this.f5057b.get());
    }
}
