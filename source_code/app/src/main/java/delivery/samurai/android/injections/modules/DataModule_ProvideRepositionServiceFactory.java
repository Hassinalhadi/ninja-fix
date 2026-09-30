package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t3.InterfaceC2960e;
import vg.at;

/* loaded from: classes2.dex */
public final class DataModule_ProvideRepositionServiceFactory implements b {
    private final d alpha;
    private final dagger.internal.d bravo;

    public static InterfaceC2960e bravo(d dVar, at atVar) {
        InterfaceC2960e provideRepositionService = dVar.provideRepositionService(atVar);
        AbstractC2763s0.delta(provideRepositionService);
        return provideRepositionService;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC2960e get() {
        return bravo(this.alpha, (at) this.bravo.get());
    }
}
