package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t8.a;

/* loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesSessionManagerFactory implements b {
    public final a alpha;

    public FirebasePerformanceModule_ProvidesSessionManagerFactory(a aVar) {
        this.alpha = aVar;
    }

    @Override // Kd.a
    public final Object get() {
        SessionManager providesSessionManager = this.alpha.providesSessionManager();
        AbstractC2763s0.delta(providesSessionManager);
        return providesSessionManager;
    }
}
