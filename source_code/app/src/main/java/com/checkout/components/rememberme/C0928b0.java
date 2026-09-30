package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.NetworkModule;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0928b0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkModule f5856a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5857b;

    public C0928b0(NetworkModule networkModule, dagger.internal.d dVar) {
        this.f5856a = networkModule;
        this.f5857b = dVar;
    }

    @Override // Kd.a
    public final Object get() {
        OkHttpClient httpClient = this.f5856a.httpClient((HttpLoggingInterceptor) this.f5857b.get());
        AbstractC2763s0.delta(httpClient);
        return httpClient;
    }
}
