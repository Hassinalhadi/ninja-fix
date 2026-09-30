package delivery.samurai.android.ui.splash;

import N9.m;
import com.app.feature.location.store.LastSentLocationStore;
import dagger.internal.b;
import dagger.internal.d;
import delivery.samurai.android.AndroidApp;
import ea.InterfaceC1643a;
import t3.InterfaceC2956a;
import ua.InterfaceC3147a;

/* loaded from: classes2.dex */
public final class AuthViewModel_Factory implements b {
    private final d analyticsTrackerProvider;
    private final d appProvider;
    private final d authServiceProvider;
    private final d lastSentLocationStoreProvider;
    private final d signInRepositoryProvider;
    private final d unleashContextUpdaterProvider;

    private AuthViewModel_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        this.appProvider = dVar;
        this.signInRepositoryProvider = dVar2;
        this.authServiceProvider = dVar3;
        this.unleashContextUpdaterProvider = dVar4;
        this.lastSentLocationStoreProvider = dVar5;
        this.analyticsTrackerProvider = dVar6;
    }

    public static AuthViewModel_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        return new AuthViewModel_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6);
    }

    public static AuthViewModel newInstance(AndroidApp androidApp, InterfaceC3147a interfaceC3147a, InterfaceC2956a interfaceC2956a, m mVar, LastSentLocationStore lastSentLocationStore, InterfaceC1643a interfaceC1643a) {
        return new AuthViewModel(androidApp, interfaceC3147a, interfaceC2956a, mVar, lastSentLocationStore, interfaceC1643a);
    }

    @Override // Kd.a
    public AuthViewModel get() {
        return newInstance((AndroidApp) this.appProvider.get(), (InterfaceC3147a) this.signInRepositoryProvider.get(), (InterfaceC2956a) this.authServiceProvider.get(), (m) this.unleashContextUpdaterProvider.get(), (LastSentLocationStore) this.lastSentLocationStoreProvider.get(), (InterfaceC1643a) this.analyticsTrackerProvider.get());
    }
}
