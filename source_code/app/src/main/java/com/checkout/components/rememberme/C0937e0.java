package com.checkout.components.rememberme;

import com.checkout.components.interfaces.Environment;
import com.checkout.components.rememberme.data.TokeniseApi;
import com.checkout.components.rememberme.di.NetworkModule;
import com.squareup.moshi.Moshi;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0937e0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkModule f5916a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5917b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5918c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f5919d;

    public C0937e0(NetworkModule networkModule, dagger.internal.d dVar, dagger.internal.d dVar2, dagger.internal.b bVar) {
        this.f5916a = networkModule;
        this.f5917b = dVar;
        this.f5918c = dVar2;
        this.f5919d = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        TokeniseApi tokeniseApi = this.f5916a.tokeniseApi((OkHttpClient) this.f5917b.get(), (Moshi) this.f5918c.get(), (Environment) this.f5919d.get());
        AbstractC2763s0.delta(tokeniseApi);
        return tokeniseApi;
    }
}
