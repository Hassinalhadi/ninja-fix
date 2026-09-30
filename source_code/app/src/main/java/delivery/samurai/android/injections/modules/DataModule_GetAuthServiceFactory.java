package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t3.InterfaceC2956a;
import vg.at;

/* loaded from: classes2.dex */
public final class DataModule_GetAuthServiceFactory implements b {
    private final d alpha;
    private final dagger.internal.d bravo;

    public static InterfaceC2956a bravo(d dVar, at atVar) {
        InterfaceC2956a authService = dVar.getAuthService(atVar);
        AbstractC2763s0.delta(authService);
        return authService;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC2956a get() {
        return bravo(this.alpha, (at) this.bravo.get());
    }
}
