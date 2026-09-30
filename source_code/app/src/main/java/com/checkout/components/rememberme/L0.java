package com.checkout.components.rememberme;

import com.checkout.components.rememberme.data.PaymentStateRepository;
import com.checkout.components.rememberme.di.RepositoryModule;
import kotlin.jvm.internal.Intrinsics;
import yf.at;

/* loaded from: classes3.dex */
public final class L0 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryModule f5768a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5769b;

    public L0(RepositoryModule repositoryModule, dagger.internal.b bVar) {
        this.f5768a = repositoryModule;
        this.f5769b = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        RepositoryModule repositoryModule = this.f5768a;
        at paymentStateFlow = (at) this.f5769b.get();
        repositoryModule.getClass();
        Intrinsics.echo(paymentStateFlow, "paymentStateFlow");
        return new PaymentStateRepository(paymentStateFlow);
    }
}
