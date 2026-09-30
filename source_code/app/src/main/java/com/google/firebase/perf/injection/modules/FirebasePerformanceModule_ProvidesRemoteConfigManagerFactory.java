package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t8.a;

/* loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory implements b {
    public final a alpha;

    public FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(a aVar) {
        this.alpha = aVar;
    }

    @Override // Kd.a
    public final Object get() {
        RemoteConfigManager providesRemoteConfigManager = this.alpha.providesRemoteConfigManager();
        AbstractC2763s0.delta(providesRemoteConfigManager);
        return providesRemoteConfigManager;
    }
}
