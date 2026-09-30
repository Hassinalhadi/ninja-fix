package com.checkout.components.card.di.module;

import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.squareup.moshi.Moshi;
import dagger.internal.b;
import dagger.internal.d;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideNetworkApiClientImplFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f4141a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4142b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4143c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4144d;
    private final d e;

    public NetworkModule_ProvideNetworkApiClientImplFactory(NetworkModule networkModule, d dVar, d dVar2, d dVar3, d dVar4) {
        this.f4141a = networkModule;
        this.f4142b = dVar;
        this.f4143c = dVar2;
        this.f4144d = dVar3;
        this.e = dVar4;
    }

    public static NetworkModule_ProvideNetworkApiClientImplFactory create(NetworkModule networkModule, d dVar, d dVar2, d dVar3, d dVar4) {
        return new NetworkModule_ProvideNetworkApiClientImplFactory(networkModule, dVar, dVar2, dVar3, dVar4);
    }

    public static NetworkApiClientImpl provideNetworkApiClientImpl(NetworkModule networkModule, OkHttpClient okHttpClient, Moshi moshi, String str, String str2) {
        NetworkApiClientImpl provideNetworkApiClientImpl = networkModule.provideNetworkApiClientImpl(okHttpClient, moshi, str, str2);
        AbstractC2763s0.delta(provideNetworkApiClientImpl);
        return provideNetworkApiClientImpl;
    }

    @Override // Kd.a
    public final NetworkApiClientImpl get() {
        NetworkApiClientImpl provideNetworkApiClientImpl = this.f4141a.provideNetworkApiClientImpl((OkHttpClient) this.f4142b.get(), (Moshi) this.f4143c.get(), (String) this.f4144d.get(), (String) this.e.get());
        AbstractC2763s0.delta(provideNetworkApiClientImpl);
        return provideNetworkApiClientImpl;
    }
}
