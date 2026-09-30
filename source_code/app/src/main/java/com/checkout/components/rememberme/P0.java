package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RepositoryModule;

/* loaded from: classes3.dex */
public final class P0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5793a;

    public P0(RepositoryModule repositoryModule) {
        this.f5793a = repositoryModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5793a.getClass();
        return new E0();
    }
}
