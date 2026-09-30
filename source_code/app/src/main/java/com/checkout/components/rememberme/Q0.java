package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RepositoryModule;

/* loaded from: classes3.dex */
public final class Q0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5796a;

    public Q0(RepositoryModule repositoryModule) {
        this.f5796a = repositoryModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5796a.getClass();
        return new F0();
    }
}
