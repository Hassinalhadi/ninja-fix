package gc;

import Pd.i;
import Xd.l;
import delivery.samurai.android.ui.orders.viewmodel.OrdersMainViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: gc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1767e extends i implements l {
    public final /* synthetic */ OrdersMainViewModel alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767e(OrdersMainViewModel ordersMainViewModel, Nd.c cVar) {
        super(2, cVar);
        this.alpha = ordersMainViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1767e(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1767e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        OrdersMainViewModel ordersMainViewModel = this.alpha;
        ordersMainViewModel.alpha.indigo(null).subscribe(new X9.f(29, new C1764b(ordersMainViewModel, 2)), new C1766d(0, new C1764b(ordersMainViewModel, 3)));
        return Unit.INSTANCE;
    }
}
