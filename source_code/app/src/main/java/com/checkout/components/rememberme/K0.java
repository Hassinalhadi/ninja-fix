package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RepositoryModule;

/* loaded from: classes3.dex */
public final class K0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5766a;

    public K0(RepositoryModule repositoryModule) {
        this.f5766a = repositoryModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5766a.getClass();
        return new B0();
    }
}
