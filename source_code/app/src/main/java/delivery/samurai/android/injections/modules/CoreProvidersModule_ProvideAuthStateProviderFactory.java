package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import h3.InterfaceC1804a;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideAuthStateProviderFactory implements b {
    public static InterfaceC1804a bravo() {
        InterfaceC1804a provideAuthStateProvider = c.alpha.provideAuthStateProvider();
        AbstractC2763s0.delta(provideAuthStateProvider);
        return provideAuthStateProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC1804a get() {
        return bravo();
    }
}
