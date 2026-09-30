package com.checkout.components.core.di.module;

import dagger.internal.b;
import okhttp3.logging.HttpLoggingInterceptor;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideLoggingInterceptor$core_standardReleaseFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f4764a;

    public NetworkModule_ProvideLoggingInterceptor$core_standardReleaseFactory(NetworkModule networkModule) {
        this.f4764a = networkModule;
    }

    public static NetworkModule_ProvideLoggingInterceptor$core_standardReleaseFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideLoggingInterceptor$core_standardReleaseFactory(networkModule);
    }

    public static HttpLoggingInterceptor provideLoggingInterceptor$core_standardRelease(NetworkModule networkModule) {
        HttpLoggingInterceptor provideLoggingInterceptor$core_standardRelease = networkModule.provideLoggingInterceptor$core_standardRelease();
        AbstractC2763s0.delta(provideLoggingInterceptor$core_standardRelease);
        return provideLoggingInterceptor$core_standardRelease;
    }

    @Override // Kd.a
    public final Object get() {
        HttpLoggingInterceptor provideLoggingInterceptor$core_standardRelease = this.f4764a.provideLoggingInterceptor$core_standardRelease();
        AbstractC2763s0.delta(provideLoggingInterceptor$core_standardRelease);
        return provideLoggingInterceptor$core_standardRelease;
    }

    @Override // Kd.a
    public final HttpLoggingInterceptor get() {
        HttpLoggingInterceptor provideLoggingInterceptor$core_standardRelease = this.f4764a.provideLoggingInterceptor$core_standardRelease();
        AbstractC2763s0.delta(provideLoggingInterceptor$core_standardRelease);
        return provideLoggingInterceptor$core_standardRelease;
    }
}
