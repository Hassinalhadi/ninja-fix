package na;

import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import t3.InterfaceC2958c;
import vf.ab;

/* loaded from: classes2.dex */
public final class n extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ OrdersViewModel purple;
    public final /* synthetic */ Ref.ObjectRef red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(OrdersViewModel ordersViewModel, Ref.ObjectRef objectRef, Nd.c cVar) {
        super(2, cVar);
        this.purple = ordersViewModel;
        this.red = objectRef;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new n(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        OrdersViewModel ordersViewModel = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC2958c interfaceC2958c = ordersViewModel.bravo;
                this.alpha = 1;
                obj = interfaceC2958c.juliet(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (DataResponse) obj;
        } catch (Exception e) {
            this.red.alpha = ordersViewModel.onHandleError(e);
            DataResponse dataResponse = new DataResponse();
            dataResponse.setItems(CollectionsKt.emptyList());
            return dataResponse;
        }
    }
}
