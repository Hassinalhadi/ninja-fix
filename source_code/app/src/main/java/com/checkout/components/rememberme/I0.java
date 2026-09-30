package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RepositoryModule;

/* loaded from: classes3.dex */
public final class I0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5757a;

    public I0(RepositoryModule repositoryModule) {
        this.f5757a = repositoryModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5757a.getClass();
        return new C1000z0();
    }
}
