package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RepositoryModule;

/* loaded from: classes3.dex */
public final class J0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5764a;

    public J0(RepositoryModule repositoryModule) {
        this.f5764a = repositoryModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5764a.getClass();
        return new A0();
    }
}
