package com.google.firebase.perf.injection.modules;

import B7.g;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t8.a;

/* loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory implements b {
    public final a alpha;

    public FirebasePerformanceModule_ProvidesFirebaseAppFactory(a aVar) {
        this.alpha = aVar;
    }

    @Override // Kd.a
    public final Object get() {
        g providesFirebaseApp = this.alpha.providesFirebaseApp();
        AbstractC2763s0.delta(providesFirebaseApp);
        return providesFirebaseApp;
    }
}
