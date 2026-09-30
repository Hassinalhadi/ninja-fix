package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t3.h;
import vg.at;

/* loaded from: classes2.dex */
public final class DataModule_ProvideTicketsServiceFactory implements b {
    private final d alpha;
    private final dagger.internal.d bravo;

    public static h bravo(d dVar, at atVar) {
        h provideTicketsService = dVar.provideTicketsService(atVar);
        AbstractC2763s0.delta(provideTicketsService);
        return provideTicketsService;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public h get() {
        return bravo(this.alpha, (at) this.bravo.get());
    }
}
