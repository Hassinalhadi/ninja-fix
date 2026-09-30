package com.checkout.components.card.di.module;

import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.squareup.moshi.Moshi;
import dagger.internal.b;
import dagger.internal.d;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_CagNetworkApiClientImplFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f4136a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4137b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4138c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4139d;
    private final d e;

    public NetworkModule_CagNetworkApiClientImplFactory(NetworkModule networkModule, d dVar, d dVar2, d dVar3, d dVar4) {
        this.f4136a = networkModule;
        this.f4137b = dVar;
        this.f4138c = dVar2;
        this.f4139d = dVar3;
        this.e = dVar4;
    }

    public static NetworkApiClientImpl cagNetworkApiClientImpl(NetworkModule networkModule, OkHttpClient okHttpClient, Moshi moshi, String str, String str2) {
        NetworkApiClientImpl cagNetworkApiClientImpl = networkModule.cagNetworkApiClientImpl(okHttpClient, moshi, str, str2);
        AbstractC2763s0.delta(cagNetworkApiClientImpl);
        return cagNetworkApiClientImpl;
    }

    public static NetworkModule_CagNetworkApiClientImplFactory create(NetworkModule networkModule, d dVar, d dVar2, d dVar3, d dVar4) {
        return new NetworkModule_CagNetworkApiClientImplFactory(networkModule, dVar, dVar2, dVar3, dVar4);
    }

    @Override // Kd.a
    public final NetworkApiClientImpl get() {
        NetworkApiClientImpl cagNetworkApiClientImpl = this.f4136a.cagNetworkApiClientImpl((OkHttpClient) this.f4137b.get(), (Moshi) this.f4138c.get(), (String) this.f4139d.get(), (String) this.e.get());
        AbstractC2763s0.delta(cagNetworkApiClientImpl);
        return cagNetworkApiClientImpl;
    }
}
