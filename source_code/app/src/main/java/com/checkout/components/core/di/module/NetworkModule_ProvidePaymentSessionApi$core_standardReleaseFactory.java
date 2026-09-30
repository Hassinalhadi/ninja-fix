package com.checkout.components.core.di.module;

import com.checkout.components.core.data.remote.PaymentSessionApi;
import com.checkout.components.interfaces.Environment;
import com.squareup.moshi.Moshi;
import dagger.internal.b;
import dagger.internal.d;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvidePaymentSessionApi$core_standardReleaseFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f4770a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4771b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4772c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4773d;

    public NetworkModule_ProvidePaymentSessionApi$core_standardReleaseFactory(NetworkModule networkModule, d dVar, d dVar2, d dVar3) {
        this.f4770a = networkModule;
        this.f4771b = dVar;
        this.f4772c = dVar2;
        this.f4773d = dVar3;
    }

    public static NetworkModule_ProvidePaymentSessionApi$core_standardReleaseFactory create(NetworkModule networkModule, d dVar, d dVar2, d dVar3) {
        return new NetworkModule_ProvidePaymentSessionApi$core_standardReleaseFactory(networkModule, dVar, dVar2, dVar3);
    }

    public static PaymentSessionApi providePaymentSessionApi$core_standardRelease(NetworkModule networkModule, Moshi moshi, OkHttpClient okHttpClient, Environment environment) {
        PaymentSessionApi providePaymentSessionApi$core_standardRelease = networkModule.providePaymentSessionApi$core_standardRelease(moshi, okHttpClient, environment);
        AbstractC2763s0.delta(providePaymentSessionApi$core_standardRelease);
        return providePaymentSessionApi$core_standardRelease;
    }

    @Override // Kd.a
    public final PaymentSessionApi get() {
        PaymentSessionApi providePaymentSessionApi$core_standardRelease = this.f4770a.providePaymentSessionApi$core_standardRelease((Moshi) this.f4771b.get(), (OkHttpClient) this.f4772c.get(), (Environment) this.f4773d.get());
        AbstractC2763s0.delta(providePaymentSessionApi$core_standardRelease);
        return providePaymentSessionApi$core_standardRelease;
    }
}
