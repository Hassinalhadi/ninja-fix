package na;

import androidx.lifecycle.az;
import com.app.network.network.models.breaks.BreakResponse;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import r3.C2492a;
import vf.ab;
import vf.ad;
import vf.ah;

/* loaded from: classes2.dex */
public final class o extends Pd.i implements Xd.l {
    public Ref.ObjectRef alpha;
    public ah purple;
    public List red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ OrdersViewModel white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(OrdersViewModel ordersViewModel, Nd.c cVar) {
        super(2, cVar);
        this.white = ordersViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        o oVar = new o(this.white, cVar);
        oVar.teal = obj;
        return oVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ah golf;
        Ref.ObjectRef objectRef;
        List list;
        Ref.ObjectRef objectRef2;
        Object obj2;
        ab abVar = (ab) this.teal;
        Od.a aVar = Od.a.alpha;
        int i4 = this.silver;
        Long l10 = null;
        OrdersViewModel ordersViewModel = this.white;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    list = this.red;
                    objectRef2 = this.alpha;
                    ResultKt.alpha(obj);
                    BreakResponse breakResponse = (BreakResponse) obj;
                    obj2 = objectRef2.alpha;
                    if (obj2 != null) {
                        az azVar = ordersViewModel.foxtrot;
                        if (breakResponse != null) {
                            l10 = new Long(breakResponse.getRemainingBreakMillis());
                        }
                        f fVar = new f(list, l10);
                        C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                        c2492a.charlie = fVar;
                        azVar.postValue(c2492a);
                    } else {
                        ordersViewModel.foxtrot.postValue(new C2492a(0, (String) obj2));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            golf = this.purple;
            objectRef = this.alpha;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            ordersViewModel.foxtrot.postValue(new C2492a(2, "loading"));
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            ah golf2 = ad.golf(abVar, null, new n(ordersViewModel, objectRef3, null), 3);
            golf = ad.golf(abVar, null, new m(ordersViewModel, null), 3);
            this.teal = null;
            this.alpha = objectRef3;
            this.purple = golf;
            this.silver = 1;
            Object tango = golf2.tango(this);
            if (tango != aVar) {
                objectRef = objectRef3;
                obj = tango;
            }
            return aVar;
        }
        List items = ((DataResponse) obj).getItems();
        this.teal = null;
        this.alpha = objectRef;
        this.purple = null;
        this.red = items;
        this.silver = 2;
        Object await = golf.await(this);
        if (await != aVar) {
            list = items;
            obj = await;
            objectRef2 = objectRef;
            BreakResponse breakResponse2 = (BreakResponse) obj;
            obj2 = objectRef2.alpha;
            if (obj2 != null) {
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
