package com.checkout.components.card.di.module;

import dagger.internal.b;
import dagger.internal.d;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideOkHttpClientFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f4145a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4146b;

    public NetworkModule_ProvideOkHttpClientFactory(NetworkModule networkModule, d dVar) {
        this.f4145a = networkModule;
        this.f4146b = dVar;
    }

    public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule networkModule, d dVar) {
        return new NetworkModule_ProvideOkHttpClientFactory(networkModule, dVar);
    }

    public static OkHttpClient provideOkHttpClient(NetworkModule networkModule, String str) {
        OkHttpClient provideOkHttpClient = networkModule.provideOkHttpClient(str);
        AbstractC2763s0.delta(provideOkHttpClient);
        return provideOkHttpClient;
    }

    @Override // Kd.a
    public final OkHttpClient get() {
        OkHttpClient provideOkHttpClient = this.f4145a.provideOkHttpClient((String) this.f4146b.get());
        AbstractC2763s0.delta(provideOkHttpClient);
        return provideOkHttpClient;
    }
}
