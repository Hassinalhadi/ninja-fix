package delivery.samurai.android.injections.modules;

import Z9.c;
import dagger.internal.b;
import dagger.internal.d;
import g3.w;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideLocationSendFacadeFactory implements b {
    private final d alpha;

    public static w bravo(c cVar) {
        w provideLocationSendFacade = Q9.c.alpha.provideLocationSendFacade(cVar);
        AbstractC2763s0.delta(provideLocationSendFacade);
        return provideLocationSendFacade;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public w get() {
        return bravo((c) this.alpha.get());
    }
}
