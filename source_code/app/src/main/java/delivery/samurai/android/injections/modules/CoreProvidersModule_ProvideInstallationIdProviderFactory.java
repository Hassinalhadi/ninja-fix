package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import s6.AbstractC2763s0;
import u3.InterfaceC3140c;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideInstallationIdProviderFactory implements b {
    public static InterfaceC3140c bravo() {
        InterfaceC3140c provideInstallationIdProvider = c.alpha.provideInstallationIdProvider();
        AbstractC2763s0.delta(provideInstallationIdProvider);
        return provideInstallationIdProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC3140c get() {
        return bravo();
    }
}
