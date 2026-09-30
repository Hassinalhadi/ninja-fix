package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import h3.InterfaceC1806c;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideConnectionDiagnosticsServiceProviderFactory implements b {
    public static InterfaceC1806c bravo() {
        InterfaceC1806c provideConnectionDiagnosticsServiceProvider = c.alpha.provideConnectionDiagnosticsServiceProvider();
        AbstractC2763s0.delta(provideConnectionDiagnosticsServiceProvider);
        return provideConnectionDiagnosticsServiceProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC1806c get() {
        return bravo();
    }
}
