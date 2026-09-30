package com.checkout.components.insight.di;

import dagger.internal.d;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideOkHttpClient$insight_standardReleaseFactory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f5242a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5243b;

    public NetworkModule_ProvideOkHttpClient$insight_standardReleaseFactory(NetworkModule networkModule, d dVar) {
        this.f5242a = networkModule;
        this.f5243b = dVar;
    }

    public static NetworkModule_ProvideOkHttpClient$insight_standardReleaseFactory create(NetworkModule networkModule, d dVar) {
        return new NetworkModule_ProvideOkHttpClient$insight_standardReleaseFactory(networkModule, dVar);
    }

    public static OkHttpClient provideOkHttpClient$insight_standardRelease(NetworkModule networkModule, HttpLoggingInterceptor httpLoggingInterceptor) {
        OkHttpClient provideOkHttpClient$insight_standardRelease = networkModule.provideOkHttpClient$insight_standardRelease(httpLoggingInterceptor);
        AbstractC2763s0.delta(provideOkHttpClient$insight_standardRelease);
        return provideOkHttpClient$insight_standardRelease;
    }

    @Override // Kd.a
    public final OkHttpClient get() {
        OkHttpClient provideOkHttpClient$insight_standardRelease = this.f5242a.provideOkHttpClient$insight_standardRelease((HttpLoggingInterceptor) this.f5243b.get());
        AbstractC2763s0.delta(provideOkHttpClient$insight_standardRelease);
        return provideOkHttpClient$insight_standardRelease;
    }
}
