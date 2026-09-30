package na;

import androidx.lifecycle.az;
import com.app.network.network.models.Allocation;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import gc.C1766d;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import ma.C2109a;
import vf.ab;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public final /* synthetic */ OrdersViewModel alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(OrdersViewModel ordersViewModel, String str, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = ordersViewModel;
        this.purple = str;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        OrdersViewModel ordersViewModel = this.alpha;
        Single<Allocation> india = ordersViewModel.bravo.india(this.purple);
        az azVar = this.red;
        india.subscribe(new C1766d(11, new C2109a(azVar, 5)), new C1766d(12, new g(azVar, ordersViewModel, 1)));
        return Unit.INSTANCE;
    }
}
