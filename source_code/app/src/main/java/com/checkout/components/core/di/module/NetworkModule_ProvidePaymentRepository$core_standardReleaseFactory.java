package com.checkout.components.core.di.module;

import com.checkout.components.core.data.remote.PaymentSessionApi;
import com.checkout.components.core.data.repository.PaymentRepositoryImpl;
import com.checkout.components.core.domain.repository.PaymentRepository;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvidePaymentRepository$core_standardReleaseFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f4768a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4769b;

    public NetworkModule_ProvidePaymentRepository$core_standardReleaseFactory(NetworkModule networkModule, d dVar) {
        this.f4768a = networkModule;
        this.f4769b = dVar;
    }

    public static NetworkModule_ProvidePaymentRepository$core_standardReleaseFactory create(NetworkModule networkModule, d dVar) {
        return new NetworkModule_ProvidePaymentRepository$core_standardReleaseFactory(networkModule, dVar);
    }

    public static PaymentRepository providePaymentRepository$core_standardRelease(NetworkModule networkModule, PaymentSessionApi api) {
        networkModule.getClass();
        Intrinsics.echo(api, "api");
        return new PaymentRepositoryImpl(api);
    }

    @Override // Kd.a
    public final PaymentRepository get() {
        return providePaymentRepository$core_standardRelease(this.f4768a, (PaymentSessionApi) this.f4769b.get());
    }
}
