package gc;

import Pd.i;
import Xd.l;
import delivery.samurai.android.ui.orders.viewmodel.OrdersMainViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: gc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1765c extends i implements l {
    public final /* synthetic */ OrdersMainViewModel alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1765c(OrdersMainViewModel ordersMainViewModel, Nd.c cVar) {
        super(2, cVar);
        this.alpha = ordersMainViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1765c(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1765c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        OrdersMainViewModel ordersMainViewModel = this.alpha;
        ordersMainViewModel.alpha.gray(null).subscribe(new X9.f(27, new C1764b(ordersMainViewModel, 0)), new X9.f(28, new C1764b(ordersMainViewModel, 1)));
        return Unit.INSTANCE;
    }
}
