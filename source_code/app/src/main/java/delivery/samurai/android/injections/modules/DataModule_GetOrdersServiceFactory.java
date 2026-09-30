package delivery.samurai.android.injections.modules;

import Q9.d;
import dagger.internal.b;
import s6.AbstractC2763s0;
import t3.InterfaceC2958c;
import vg.at;

/* loaded from: classes2.dex */
public final class DataModule_GetOrdersServiceFactory implements b {
    private final d alpha;
    private final dagger.internal.d bravo;

    public static InterfaceC2958c bravo(d dVar, at atVar) {
        InterfaceC2958c ordersService = dVar.getOrdersService(atVar);
        AbstractC2763s0.delta(ordersService);
        return ordersService;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC2958c get() {
        return bravo(this.alpha, (at) this.bravo.get());
    }
}
