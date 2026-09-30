package com.checkout.components.core.di.module;

import dagger.internal.b;
import dagger.internal.d;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideOkHttpClient$core_standardReleaseFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f4766a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4767b;

    public NetworkModule_ProvideOkHttpClient$core_standardReleaseFactory(NetworkModule networkModule, d dVar) {
        this.f4766a = networkModule;
        this.f4767b = dVar;
    }

    public static NetworkModule_ProvideOkHttpClient$core_standardReleaseFactory create(NetworkModule networkModule, d dVar) {
        return new NetworkModule_ProvideOkHttpClient$core_standardReleaseFactory(networkModule, dVar);
    }

    public static OkHttpClient provideOkHttpClient$core_standardRelease(NetworkModule networkModule, HttpLoggingInterceptor httpLoggingInterceptor) {
        OkHttpClient provideOkHttpClient$core_standardRelease = networkModule.provideOkHttpClient$core_standardRelease(httpLoggingInterceptor);
        AbstractC2763s0.delta(provideOkHttpClient$core_standardRelease);
        return provideOkHttpClient$core_standardRelease;
    }

    @Override // Kd.a
    public final OkHttpClient get() {
        OkHttpClient provideOkHttpClient$core_standardRelease = this.f4766a.provideOkHttpClient$core_standardRelease((HttpLoggingInterceptor) this.f4767b.get());
        AbstractC2763s0.delta(provideOkHttpClient$core_standardRelease);
        return provideOkHttpClient$core_standardRelease;
    }
}
