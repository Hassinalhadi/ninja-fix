package com.google.firebase.perf.injection.modules;

import dagger.internal.b;
import j8.InterfaceC1947d;
import s6.AbstractC2763s0;
import t8.a;

/* loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory implements b {
    public final a alpha;

    public FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(a aVar) {
        this.alpha = aVar;
    }

    @Override // Kd.a
    public final Object get() {
        InterfaceC1947d providesFirebaseInstallations = this.alpha.providesFirebaseInstallations();
        AbstractC2763s0.delta(providesFirebaseInstallations);
        return providesFirebaseInstallations;
    }
}
