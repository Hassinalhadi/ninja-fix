package Yb;

import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import kotlin.ResultKt;
import kotlin.Unit;
import z3.C3462a;

/* renamed from: Yb.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0300d0 extends Pd.i implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Order purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ OrderTask silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0300d0(boolean z2, Order order, int i4, OrderTask orderTask, Nd.c cVar) {
        super(2, cVar);
        this.alpha = z2;
        this.purple = order;
        this.red = i4;
        this.silver = orderTask;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0300d0(this.alpha, this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0300d0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (this.alpha) {
            C3462a.alpha("PickupTaskRow", 12, "evt=HYBRID_HANDSHAKE_PENDING orderId=" + this.purple.getId() + " taskId=" + this.red + " status=" + this.silver.getTaskStatus(), null);
        }
        return Unit.INSTANCE;
    }
}
