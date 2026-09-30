package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.NetworkModule;
import com.squareup.moshi.Moshi;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0934d0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkModule f5874a;

    public C0934d0(NetworkModule networkModule) {
        this.f5874a = networkModule;
    }

    @Override // Kd.a
    public final Object get() {
        Moshi moshi = this.f5874a.moshi();
        AbstractC2763s0.delta(moshi);
        return moshi;
    }
}
