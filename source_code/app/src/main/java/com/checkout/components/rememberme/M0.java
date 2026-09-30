package com.checkout.components.rememberme;

import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.rememberme.di.DefaultStyleProvider;
import com.checkout.components.rememberme.di.RepositoryModule;
import com.checkout.components.rememberme.savecard.SaveCardViewStateRepository;
import com.checkout.components.rememberme.utils.JWTTokenEncoder;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class M0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5776a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5777b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5778c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f5779d;
    public final dagger.internal.d e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.d f5780f;

    public M0(RepositoryModule repositoryModule, C0949i0 c0949i0, dagger.internal.d dVar, dagger.internal.b bVar, dagger.internal.b bVar2, dagger.internal.b bVar3) {
        this.f5776a = repositoryModule;
        this.f5777b = c0949i0;
        this.f5778c = dVar;
        this.f5779d = bVar;
        this.e = bVar2;
        this.f5780f = bVar3;
    }

    @Override // Kd.a
    public final Object get() {
        SaveCardViewStateRepository saveCardViewStateRepository = this.f5776a.saveCardViewStateRepository(((Boolean) this.f5777b.get()).booleanValue(), (DefaultStyleProvider) this.f5778c.get(), new JWTTokenEncoder(), (Function1) this.f5779d.get(), (LogDetails) this.e.get(), (Logger) this.f5780f.get());
        AbstractC2763s0.delta(saveCardViewStateRepository);
        return saveCardViewStateRepository;
    }
}
