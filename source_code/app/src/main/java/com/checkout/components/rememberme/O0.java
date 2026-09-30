package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RepositoryModule;
import com.checkout.components.rememberme.model.RememberMeScreen;

/* loaded from: classes3.dex */
public final class O0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5786a;

    public O0(RepositoryModule repositoryModule) {
        this.f5786a = repositoryModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5786a.getClass();
        return new D0(RememberMeScreen.Alternative.INSTANCE);
    }
}
