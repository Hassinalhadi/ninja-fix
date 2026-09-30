package gc;

import androidx.lifecycle.az;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.orders.viewmodel.OrdersMainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* renamed from: gc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1764b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ OrdersMainViewModel purple;

    public /* synthetic */ C1764b(OrdersMainViewModel ordersMainViewModel, int i4) {
        this.alpha = i4;
        this.purple = ordersMainViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                az azVar = this.purple.charlie;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (DataResponse) obj;
                azVar.postValue(c2492a);
                return Unit.INSTANCE;
            case 1:
                Throwable th = (Throwable) obj;
                OrdersMainViewModel ordersMainViewModel = this.purple;
                az azVar2 = ordersMainViewModel.charlie;
                Intrinsics.checkNotNull(th);
                String msg = ordersMainViewModel.onHandleError(th);
                Intrinsics.echo(msg, "msg");
                azVar2.postValue(new C2492a(0, msg));
                return Unit.INSTANCE;
            case 2:
                az azVar3 = this.purple.echo;
                C2492a c2492a2 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a2.charlie = (DataResponse) obj;
                azVar3.postValue(c2492a2);
                return Unit.INSTANCE;
            default:
                Throwable th2 = (Throwable) obj;
                OrdersMainViewModel ordersMainViewModel2 = this.purple;
                az azVar4 = ordersMainViewModel2.echo;
                Intrinsics.checkNotNull(th2);
                String msg2 = ordersMainViewModel2.onHandleError(th2);
                Intrinsics.echo(msg2, "msg");
                azVar4.postValue(new C2492a(0, msg2));
                return Unit.INSTANCE;
        }
    }
}
