package na;

import androidx.lifecycle.az;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import gc.C1766d;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import vf.ab;

/* loaded from: classes2.dex */
public final class q extends Pd.i implements Xd.l {
    public final /* synthetic */ OrdersViewModel alpha;
    public final /* synthetic */ az purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(OrdersViewModel ordersViewModel, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = ordersViewModel;
        this.purple = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new q(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        OrdersViewModel ordersViewModel = this.alpha;
        az azVar = this.purple;
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m206constructorimpl(ordersViewModel.bravo.bravo().subscribe(new C1766d(17, new C2109a(azVar, 8)), new C1766d(18, new g(azVar, ordersViewModel, 4))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
