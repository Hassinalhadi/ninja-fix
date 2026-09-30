package com.checkout.components.rememberme;

import com.checkout.components.rememberme.data.ConsumerApi;
import com.checkout.components.rememberme.data.ConsumerRepository;

/* renamed from: com.checkout.components.rememberme.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0975r implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.d f6199a;

    public C0975r(dagger.internal.d dVar) {
        this.f6199a = dVar;
    }

    @Override // Kd.a
    public final Object get() {
        return new ConsumerRepository((ConsumerApi) this.f6199a.get());
    }
}
