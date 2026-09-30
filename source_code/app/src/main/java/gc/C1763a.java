package gc;

import Pd.i;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.orders.viewmodel.OrdersMainViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import t3.InterfaceC2958c;
import vf.ab;

/* renamed from: gc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1763a extends i implements l {
    public int alpha;
    public final /* synthetic */ OrdersMainViewModel purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1763a(OrdersMainViewModel ordersMainViewModel, Nd.c cVar) {
        super(2, cVar);
        this.purple = ordersMainViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1763a(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1763a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        OrdersMainViewModel ordersMainViewModel = this.purple;
        az azVar = ordersMainViewModel.delta;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC2958c interfaceC2958c = ordersMainViewModel.bravo;
                this.alpha = 1;
                obj = interfaceC2958c.juliet(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
            c2492a.charlie = (DataResponse) obj;
            azVar.postValue(c2492a);
        } catch (Exception e) {
            String msg = ordersMainViewModel.onHandleError(e);
            Intrinsics.echo(msg, "msg");
            azVar.postValue(new C2492a(0, msg));
        }
        return Unit.INSTANCE;
    }
}
