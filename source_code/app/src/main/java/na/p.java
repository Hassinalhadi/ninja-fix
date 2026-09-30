package na;

import androidx.lifecycle.az;
import com.app.network.network.models.Order;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import gc.C1766d;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import vf.ab;

/* loaded from: classes2.dex */
public final class p extends Pd.i implements Xd.l {
    public final /* synthetic */ OrdersViewModel alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(OrdersViewModel ordersViewModel, String str, String str2, int i4, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = ordersViewModel;
        this.purple = str;
        this.red = str2;
        this.silver = i4;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new p(this.alpha, this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        OrdersViewModel ordersViewModel = this.alpha;
        String str = this.red;
        Single<DataResponse<Order>> golf = ordersViewModel.bravo.golf(this.purple, str, this.silver);
        az azVar = this.teal;
        golf.subscribe(new C1766d(15, new C2109a(azVar, 7)), new C1766d(16, new g(azVar, ordersViewModel, 3)));
        return Unit.INSTANCE;
    }
}
