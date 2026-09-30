package com.checkout.components.insight.di;

import okhttp3.logging.HttpLoggingInterceptor;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideLoggingInterceptor$insight_standardReleaseFactory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f5240a;

    public NetworkModule_ProvideLoggingInterceptor$insight_standardReleaseFactory(NetworkModule networkModule) {
        this.f5240a = networkModule;
    }

    public static NetworkModule_ProvideLoggingInterceptor$insight_standardReleaseFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideLoggingInterceptor$insight_standardReleaseFactory(networkModule);
    }

    public static HttpLoggingInterceptor provideLoggingInterceptor$insight_standardRelease(NetworkModule networkModule) {
        HttpLoggingInterceptor provideLoggingInterceptor$insight_standardRelease = networkModule.provideLoggingInterceptor$insight_standardRelease();
        AbstractC2763s0.delta(provideLoggingInterceptor$insight_standardRelease);
        return provideLoggingInterceptor$insight_standardRelease;
    }

    @Override // Kd.a
    public final Object get() {
        HttpLoggingInterceptor provideLoggingInterceptor$insight_standardRelease = this.f5240a.provideLoggingInterceptor$insight_standardRelease();
        AbstractC2763s0.delta(provideLoggingInterceptor$insight_standardRelease);
        return provideLoggingInterceptor$insight_standardRelease;
    }

    @Override // Kd.a
    public final HttpLoggingInterceptor get() {
        HttpLoggingInterceptor provideLoggingInterceptor$insight_standardRelease = this.f5240a.provideLoggingInterceptor$insight_standardRelease();
        AbstractC2763s0.delta(provideLoggingInterceptor$insight_standardRelease);
        return provideLoggingInterceptor$insight_standardRelease;
    }
}
