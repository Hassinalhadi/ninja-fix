package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.NetworkModule;
import okhttp3.logging.HttpLoggingInterceptor;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0931c0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkModule f5866a;

    public C0931c0(NetworkModule networkModule) {
        this.f5866a = networkModule;
    }

    @Override // Kd.a
    public final Object get() {
        HttpLoggingInterceptor loggingInterceptor = this.f5866a.loggingInterceptor();
        AbstractC2763s0.delta(loggingInterceptor);
        return loggingInterceptor;
    }
}
