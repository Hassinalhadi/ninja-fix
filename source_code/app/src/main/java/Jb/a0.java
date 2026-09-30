package Jb;

import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class a0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ OrdersFragmentV2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(OrdersFragmentV2 ordersFragmentV2, Nd.c cVar) {
        super(2, cVar);
        this.purple = ordersFragmentV2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new a0(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((a0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        yf.N n5 = CaptainLocationMonitoringService.f12067E;
        Ba.e eVar = new Ba.e(4, this.purple);
        this.alpha = 1;
        n5.collect(eVar, this);
        return aVar;
    }
}
