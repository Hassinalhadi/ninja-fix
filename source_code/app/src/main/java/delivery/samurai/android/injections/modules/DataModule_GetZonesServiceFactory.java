package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t3.i;
import vg.at;

/* loaded from: classes2.dex */
public final class DataModule_GetZonesServiceFactory implements b {
    private final d alpha;
    private final dagger.internal.d bravo;

    public static i bravo(d dVar, at atVar) {
        i zonesService = dVar.getZonesService(atVar);
        AbstractC2763s0.delta(zonesService);
        return zonesService;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public i get() {
        return bravo(this.alpha, (at) this.bravo.get());
    }
}
