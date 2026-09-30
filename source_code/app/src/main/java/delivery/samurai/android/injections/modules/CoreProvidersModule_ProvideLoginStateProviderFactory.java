package delivery.samurai.android.injections.modules;

import Q9.c;
import da.InterfaceC1597c;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideLoginStateProviderFactory implements b {
    public static InterfaceC1597c bravo() {
        InterfaceC1597c provideLoginStateProvider = c.alpha.provideLoginStateProvider();
        AbstractC2763s0.delta(provideLoginStateProvider);
        return provideLoginStateProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC1597c get() {
        return bravo();
    }
}
