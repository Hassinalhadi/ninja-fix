package com.checkout.components.rememberme;

import com.checkout.components.rememberme.data.TokeniseApi;
import com.checkout.components.rememberme.data.TokeniseRepository;

/* renamed from: com.checkout.components.rememberme.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0992w1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.d f6364a;

    public C0992w1(dagger.internal.d dVar) {
        this.f6364a = dVar;
    }

    @Override // Kd.a
    public final Object get() {
        return new TokeniseRepository((TokeniseApi) this.f6364a.get());
    }
}
