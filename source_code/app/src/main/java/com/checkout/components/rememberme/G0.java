package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.RepositoryModule;

/* loaded from: classes3.dex */
public final class G0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5754a;

    public G0(RepositoryModule repositoryModule) {
        this.f5754a = repositoryModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5754a.getClass();
        return new C0994x0(kotlin.collections.t.alpha);
    }
}
