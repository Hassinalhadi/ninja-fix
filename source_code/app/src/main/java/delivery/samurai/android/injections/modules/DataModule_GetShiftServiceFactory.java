package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t3.f;
import vg.at;

/* loaded from: classes2.dex */
public final class DataModule_GetShiftServiceFactory implements b {
    private final d alpha;
    private final dagger.internal.d bravo;

    public static f bravo(d dVar, at atVar) {
        f shiftService = dVar.getShiftService(atVar);
        AbstractC2763s0.delta(shiftService);
        return shiftService;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public f get() {
        return bravo(this.alpha, (at) this.bravo.get());
    }
}
