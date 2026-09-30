package com.checkout.components.core.data.repository;

import com.checkout.components.core.data.remote.PaymentSessionApi;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class PaymentRepositoryImpl_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4731a;

    public PaymentRepositoryImpl_Factory(d dVar) {
        this.f4731a = dVar;
    }

    public static PaymentRepositoryImpl_Factory create(d dVar) {
        return new PaymentRepositoryImpl_Factory(dVar);
    }

    public static PaymentRepositoryImpl newInstance(PaymentSessionApi paymentSessionApi) {
        return new PaymentRepositoryImpl(paymentSessionApi);
    }

    @Override // Kd.a
    public final PaymentRepositoryImpl get() {
        return new PaymentRepositoryImpl((PaymentSessionApi) this.f4731a.get());
    }
}
