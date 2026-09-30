package com.google.firebase.perf.injection.modules;

import dagger.internal.b;
import s6.AbstractC2763s0;
import s8.C2837a;
import t8.a;

/* loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesConfigResolverFactory implements b {
    public final a alpha;

    public FirebasePerformanceModule_ProvidesConfigResolverFactory(a aVar) {
        this.alpha = aVar;
    }

    @Override // Kd.a
    public final Object get() {
        C2837a providesConfigResolver = this.alpha.providesConfigResolver();
        AbstractC2763s0.delta(providesConfigResolver);
        return providesConfigResolver;
    }
}
