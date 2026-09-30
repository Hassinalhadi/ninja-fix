package Dc;

import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.shiftsV2.ShiftsViewModelV2;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import yf.N;

/* loaded from: classes2.dex */
public final class ab extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ShiftsViewModelV2 purple;
    public final /* synthetic */ boolean red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ShiftsViewModelV2 shiftsViewModelV2, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.purple = shiftsViewModelV2;
        this.red = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ab(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ab) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Object dVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        boolean z2 = this.red;
        boolean z10 = true;
        ShiftsViewModelV2 shiftsViewModelV2 = this.purple;
        try {
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    t3.f fVar = shiftsViewModelV2.alpha;
                    int i5 = shiftsViewModelV2.juliet;
                    this.alpha = 1;
                    obj = fVar.charlie(i5, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                DataResponse dataResponse = (DataResponse) obj;
                List items = dataResponse.getItems();
                int pageCount = dataResponse.getPageCount();
                if (pageCount != 0 && pageCount - 1 != shiftsViewModelV2.juliet) {
                    z10 = false;
                }
                shiftsViewModelV2.kilo = z10;
                shiftsViewModelV2.lima = false;
                if (z2) {
                    shiftsViewModelV2.india.clear();
                }
                shiftsViewModelV2.india.addAll(items);
                N n5 = shiftsViewModelV2.bravo;
                if (shiftsViewModelV2.india.isEmpty()) {
                    dVar = a.alpha;
                } else {
                    dVar = new d(CollectionsKt.z(shiftsViewModelV2.india), shiftsViewModelV2.hotel);
                }
                n5.getClass();
                n5.juliet(null, dVar);
            } catch (Exception e) {
                if (!(e instanceof CancellationException)) {
                    shiftsViewModelV2.lima = false;
                    String onHandleError = shiftsViewModelV2.onHandleError(e);
                    boolean isEmpty = shiftsViewModelV2.india.isEmpty();
                    N n10 = shiftsViewModelV2.bravo;
                    if (isEmpty) {
                        b bVar = new b(onHandleError);
                        n10.getClass();
                        n10.juliet(null, bVar);
                    } else {
                        d dVar2 = new d(CollectionsKt.z(shiftsViewModelV2.india), shiftsViewModelV2.hotel);
                        n10.getClass();
                        n10.juliet(null, dVar2);
                        shiftsViewModelV2.foxtrot.alpha(onHandleError);
                    }
                    if (z2) {
                        bool = Boolean.FALSE;
                    }
                } else {
                    throw e;
                }
            }
            if (z2) {
                bool = Boolean.FALSE;
                N n11 = shiftsViewModelV2.delta;
                n11.getClass();
                n11.juliet(null, bool);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (z2) {
                N n12 = shiftsViewModelV2.delta;
                Boolean bool2 = Boolean.FALSE;
                n12.getClass();
                n12.juliet(null, bool2);
            }
            throw th;
        }
    }
}
