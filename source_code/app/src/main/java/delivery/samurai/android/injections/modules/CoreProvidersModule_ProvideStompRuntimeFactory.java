package delivery.samurai.android.injections.modules;

import Nb.h;
import Q9.c;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;
import v3.InterfaceC3171a;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideStompRuntimeFactory implements b {
    private final d alpha;

    public static InterfaceC3171a bravo(h hVar) {
        InterfaceC3171a provideStompRuntime = c.alpha.provideStompRuntime(hVar);
        AbstractC2763s0.delta(provideStompRuntime);
        return provideStompRuntime;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC3171a get() {
        return bravo((h) this.alpha.get());
    }
}
