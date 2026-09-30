package ga;

import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.N;

/* loaded from: classes2.dex */
public final class y extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ac purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ac acVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = acVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new y(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((y) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        ac acVar = this.purple;
        HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) acVar.f12675h.getValue();
        Ba.e eVar = new Ba.e(10, acVar);
        this.alpha = 1;
        ((N) homeViewModelV2.juliet.alpha).collect(eVar, this);
        return aVar;
    }
}
