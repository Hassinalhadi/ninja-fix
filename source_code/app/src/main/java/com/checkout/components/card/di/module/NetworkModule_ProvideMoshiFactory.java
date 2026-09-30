package com.checkout.components.card.di.module;

import com.squareup.moshi.Moshi;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideMoshiFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f4140a;

    public NetworkModule_ProvideMoshiFactory(NetworkModule networkModule) {
        this.f4140a = networkModule;
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
        Moshi provideMoshi = this.f4140a.provideMoshi();
        AbstractC2763s0.delta(provideMoshi);
        return provideMoshi;
    }

    @Override // Kd.a
    public final Object get() {
        Moshi provideMoshi = this.f4140a.provideMoshi();
        AbstractC2763s0.delta(provideMoshi);
        return provideMoshi;
    }
}
