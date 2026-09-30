package na;

import androidx.lifecycle.az;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import gc.C1766d;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import n.Y;
import vf.ab;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public final /* synthetic */ OrdersViewModel alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(OrdersViewModel ordersViewModel, int i4, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = ordersViewModel;
        this.purple = i4;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new l(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        OrdersViewModel ordersViewModel = this.alpha;
        Single<R> flatMap = ordersViewModel.bravo.alpha(this.purple).flatMap(new j(1, new Y(1, ordersViewModel)));
        az azVar = this.red;
        flatMap.subscribe(new C1766d(13, new C2109a(azVar, 6)), new C1766d(14, new g(azVar, ordersViewModel, 2)));
        return Unit.INSTANCE;
    }
}
