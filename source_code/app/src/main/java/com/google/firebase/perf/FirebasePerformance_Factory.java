package com.google.firebase.perf;

import B7.g;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
import com.google.firebase.perf.session.SessionManager;
import dagger.internal.b;
import i8.InterfaceC1904b;
import j8.InterfaceC1947d;
import s8.C2837a;

/* loaded from: classes2.dex */
public final class FirebasePerformance_Factory implements b {
    public final FirebasePerformanceModule_ProvidesFirebaseAppFactory alpha;
    public final FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory bravo;
    public final FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory charlie;
    public final FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory delta;
    public final FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory echo;
    public final FirebasePerformanceModule_ProvidesConfigResolverFactory foxtrot;
    public final FirebasePerformanceModule_ProvidesSessionManagerFactory golf;

    public FirebasePerformance_Factory(FirebasePerformanceModule_ProvidesFirebaseAppFactory firebasePerformanceModule_ProvidesFirebaseAppFactory, FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory firebasePerformanceModule_ProvidesRemoteConfigComponentFactory, FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory firebasePerformanceModule_ProvidesFirebaseInstallationsFactory, FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory firebasePerformanceModule_ProvidesTransportFactoryProviderFactory, FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory firebasePerformanceModule_ProvidesRemoteConfigManagerFactory, FirebasePerformanceModule_ProvidesConfigResolverFactory firebasePerformanceModule_ProvidesConfigResolverFactory, FirebasePerformanceModule_ProvidesSessionManagerFactory firebasePerformanceModule_ProvidesSessionManagerFactory) {
        this.alpha = firebasePerformanceModule_ProvidesFirebaseAppFactory;
        this.bravo = firebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
        this.charlie = firebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
        this.delta = firebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
        this.echo = firebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
        this.foxtrot = firebasePerformanceModule_ProvidesConfigResolverFactory;
        this.golf = firebasePerformanceModule_ProvidesSessionManagerFactory;
    }

    @Override // Kd.a
    public final Object get() {
        return new q8.b((g) this.alpha.get(), (InterfaceC1904b) this.bravo.get(), (InterfaceC1947d) this.charlie.get(), (InterfaceC1904b) this.delta.get(), (RemoteConfigManager) this.echo.get(), (C2837a) this.foxtrot.get(), (SessionManager) this.golf.get());
    }
}
