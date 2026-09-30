package com.checkout.components.rememberme;

import com.checkout.components.interfaces.Environment;
import com.checkout.components.rememberme.data.ConsumerApi;
import com.checkout.components.rememberme.di.NetworkModule;
import com.squareup.moshi.Moshi;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0925a0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkModule f5851a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5852b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5853c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f5854d;

    public C0925a0(NetworkModule networkModule, dagger.internal.d dVar, dagger.internal.d dVar2, dagger.internal.b bVar) {
        this.f5851a = networkModule;
        this.f5852b = dVar;
        this.f5853c = dVar2;
        this.f5854d = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        ConsumerApi consumerApi = this.f5851a.consumerApi((OkHttpClient) this.f5852b.get(), (Moshi) this.f5853c.get(), (Environment) this.f5854d.get());
        AbstractC2763s0.delta(consumerApi);
        return consumerApi;
    }
}
