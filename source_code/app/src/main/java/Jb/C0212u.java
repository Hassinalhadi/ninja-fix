package Jb;

import delivery.samurai.android.services.CaptainLocationMonitoringService;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;

/* renamed from: Jb.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0212u extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0215x purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0212u(C0215x c0215x, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0215x;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0212u(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((C0212u) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        Ba.e eVar = new Ba.e(3, this.purple);
        this.alpha = 1;
        n5.collect(eVar, this);
        return aVar;
    }
}
