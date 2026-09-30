package com.checkout.components.wallet.di;

import com.squareup.moshi.Moshi;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class GooglePayModule_ProvideMoshiFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final GooglePayModule f6506a;

    public GooglePayModule_ProvideMoshiFactory(GooglePayModule googlePayModule) {
        this.f6506a = googlePayModule;
    }

    public static GooglePayModule_ProvideMoshiFactory create(GooglePayModule googlePayModule) {
        return new GooglePayModule_ProvideMoshiFactory(googlePayModule);
    }

    public static Moshi provideMoshi(GooglePayModule googlePayModule) {
        Moshi provideMoshi = googlePayModule.provideMoshi();
        AbstractC2763s0.delta(provideMoshi);
        return provideMoshi;
    }

    @Override // Kd.a
    public final Moshi get() {
        Moshi provideMoshi = this.f6506a.provideMoshi();
        AbstractC2763s0.delta(provideMoshi);
        return provideMoshi;
    }

    @Override // Kd.a
    public final Object get() {
        Moshi provideMoshi = this.f6506a.provideMoshi();
        AbstractC2763s0.delta(provideMoshi);
        return provideMoshi;
    }
}
