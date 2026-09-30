package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RepositoryModule;

/* loaded from: classes3.dex */
public final class N0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5783a;

    public N0(RepositoryModule repositoryModule) {
        this.f5783a = repositoryModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5783a.getClass();
        return new C0();
    }
}
