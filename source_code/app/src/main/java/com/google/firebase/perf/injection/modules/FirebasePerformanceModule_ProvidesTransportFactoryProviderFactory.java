package com.google.firebase.perf.injection.modules;

import dagger.internal.b;
import i8.InterfaceC1904b;
import s6.AbstractC2763s0;
import t8.a;

/* loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory implements b {
    public final a alpha;

    public FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(a aVar) {
        this.alpha = aVar;
    }

    @Override // Kd.a
    public final Object get() {
        InterfaceC1904b providesTransportFactoryProvider = this.alpha.providesTransportFactoryProvider();
        AbstractC2763s0.delta(providesTransportFactoryProvider);
        return providesTransportFactoryProvider;
    }
}
