package com.checkout.components.insight.di;

import com.squareup.moshi.Moshi;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideMoshiFactory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f5241a;

    public NetworkModule_ProvideMoshiFactory(NetworkModule networkModule) {
        this.f5241a = networkModule;
    }

    public static NetworkModule_ProvideMoshiFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideMoshiFactory(networkModule);
    }

    public static Moshi provideMoshi(NetworkModule networkModule) {
        Moshi provideMoshi = networkModule.provideMoshi();
        AbstractC2763s0.delta(provideMoshi);
        return provideMoshi;
    }

    @Override // Kd.a
    public final Moshi get() {
        Moshi provideMoshi = this.f5241a.provideMoshi();
        AbstractC2763s0.delta(provideMoshi);
        return provideMoshi;
    }

    @Override // Kd.a
    public final Object get() {
        Moshi provideMoshi = this.f5241a.provideMoshi();
        AbstractC2763s0.delta(provideMoshi);
        return provideMoshi;
    }
}
