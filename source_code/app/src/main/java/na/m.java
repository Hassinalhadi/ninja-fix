package na;

import com.app.network.network.models.breaks.BreakResponse;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class m extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ OrdersViewModel purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(OrdersViewModel ordersViewModel, Nd.c cVar) {
        super(2, cVar);
        this.purple = ordersViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new m(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                t3.f fVar = this.purple.delta;
                this.alpha = 1;
                obj = fVar.bravo(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (BreakResponse) obj;
        } catch (Exception unused) {
            return null;
        }
    }
}
