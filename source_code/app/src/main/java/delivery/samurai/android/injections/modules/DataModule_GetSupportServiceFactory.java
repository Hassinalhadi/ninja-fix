package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t3.g;
import vg.at;

/* loaded from: classes2.dex */
public final class DataModule_GetSupportServiceFactory implements b {
    private final d alpha;
    private final dagger.internal.d bravo;

    public static g bravo(d dVar, at atVar) {
        g supportService = dVar.getSupportService(atVar);
        AbstractC2763s0.delta(supportService);
        return supportService;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public g get() {
        return bravo(this.alpha, (at) this.bravo.get());
    }
}
