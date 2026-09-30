package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import s6.AbstractC2763s0;
import u3.InterfaceC3142e;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideLoggerFactory implements b {
    public static InterfaceC3142e bravo() {
        InterfaceC3142e provideLogger = c.alpha.provideLogger();
        AbstractC2763s0.delta(provideLogger);
        return provideLogger;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC3142e get() {
        return bravo();
    }
}
