package com.checkout.components.rememberme;

import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.rememberme.di.RepositoryModule;

/* loaded from: classes3.dex */
public final class H0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5755a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5756b;

    public H0(RepositoryModule repositoryModule, dagger.internal.b bVar) {
        this.f5755a = repositoryModule;
        this.f5756b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        RepositoryModule repositoryModule = this.f5755a;
        RememberMeConfiguration rememberMeConfiguration = (RememberMeConfiguration) this.f5756b.get();
        repositoryModule.getClass();
        return new C0997y0(rememberMeConfiguration);
    }
}
