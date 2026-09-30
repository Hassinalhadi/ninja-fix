package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import h3.InterfaceC1805b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideBackendPingProviderFactory implements b {
    public static InterfaceC1805b bravo() {
        InterfaceC1805b provideBackendPingProvider = c.alpha.provideBackendPingProvider();
        AbstractC2763s0.delta(provideBackendPingProvider);
        return provideBackendPingProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC1805b get() {
        return bravo();
    }
}
