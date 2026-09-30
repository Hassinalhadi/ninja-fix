package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t3.InterfaceC2957b;
import vg.at;

/* loaded from: classes2.dex */
public final class DataModule_GetCaptainServiceFactory implements b {
    private final d alpha;
    private final dagger.internal.d bravo;

    public static InterfaceC2957b bravo(d dVar, at atVar) {
        InterfaceC2957b captainService = dVar.getCaptainService(atVar);
        AbstractC2763s0.delta(captainService);
        return captainService;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC2957b get() {
        return bravo(this.alpha, (at) this.bravo.get());
    }
}
