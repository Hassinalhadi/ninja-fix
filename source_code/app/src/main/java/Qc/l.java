package Qc;

import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsViewModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import r3.C2492a;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ TicketsViewModel purple;
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TicketsViewModel ticketsViewModel, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = ticketsViewModel;
        this.red = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new l(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004d, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        if (kotlin.Unit.INSTANCE != r0) goto L42;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List items;
        boolean z2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        int i5 = this.red;
        TicketsViewModel ticketsViewModel = this.purple;
        try {
        } catch (Exception e) {
            k alpha = k.alpha((k) ticketsViewModel.bravo.getValue(), false);
            N n5 = ticketsViewModel.bravo;
            n5.getClass();
            n5.juliet(null, alpha);
            String onHandleError = ticketsViewModel.onHandleError(e);
            C2492a november = com.google.android.material.datepicker.j.november(0, onHandleError, Constants.KEY_MSG, onHandleError);
            this.alpha = 4;
            N n10 = ticketsViewModel.foxtrot;
            n10.getClass();
            n10.juliet(null, november);
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.alpha(obj);
                DataResponse dataResponse = (DataResponse) obj;
                k kVar = (k) ticketsViewModel.bravo.getValue();
                items = dataResponse.getItems();
                int pageCount = dataResponse.getPageCount();
                if ((items.isEmpty() || i5 <= 0) && ((pageCount <= 0 || i5 < pageCount - 1) && (items.size() >= 10 || i5 <= 0))) {
                    z2 = false;
                    N n11 = ticketsViewModel.bravo;
                    kVar.getClass();
                    k kVar2 = new k(i5, z2, false);
                    n11.getClass();
                    n11.juliet(null, kVar2);
                    N n12 = ticketsViewModel.foxtrot;
                    C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                    c2492a.charlie = dataResponse;
                    this.alpha = 3;
                    n12.getClass();
                    n12.juliet(null, c2492a);
                }
                z2 = true;
                N n112 = ticketsViewModel.bravo;
                kVar.getClass();
                k kVar22 = new k(i5, z2, false);
                n112.getClass();
                n112.juliet(null, kVar22);
                N n122 = ticketsViewModel.foxtrot;
                C2492a c2492a2 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a2.charlie = dataResponse;
                this.alpha = 3;
                n122.getClass();
                n122.juliet(null, c2492a2);
            } else {
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            N n13 = ticketsViewModel.foxtrot;
            C2492a c2492a3 = new C2492a(2, "loading");
            this.alpha = 1;
            n13.getClass();
            n13.juliet(null, c2492a3);
        }
        Mc.a aVar2 = ticketsViewModel.alpha;
        this.alpha = 2;
        obj = ((Lc.a) aVar2).alpha.bravo(i5, 10, this);
        if (obj == aVar) {
            return aVar;
        }
        DataResponse dataResponse2 = (DataResponse) obj;
        k kVar3 = (k) ticketsViewModel.bravo.getValue();
        items = dataResponse2.getItems();
        int pageCount2 = dataResponse2.getPageCount();
        if (items.isEmpty()) {
        }
        z2 = false;
        N n1122 = ticketsViewModel.bravo;
        kVar3.getClass();
        k kVar222 = new k(i5, z2, false);
        n1122.getClass();
        n1122.juliet(null, kVar222);
        N n1222 = ticketsViewModel.foxtrot;
        C2492a c2492a22 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
        c2492a22.charlie = dataResponse2;
        this.alpha = 3;
        n1222.getClass();
        n1222.juliet(null, c2492a22);
    }
}
