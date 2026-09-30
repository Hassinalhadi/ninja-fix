package Dc;

import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.shiftsV2.ShiftSummariesViewModelV2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import yf.N;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ShiftSummariesViewModelV2 purple;
    public final /* synthetic */ boolean red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ShiftSummariesViewModelV2 shiftSummariesViewModelV2, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.purple = shiftSummariesViewModelV2;
        this.red = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new l(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: all -> 0x0013, Exception -> 0x0016, TRY_ENTER, TryCatch #1 {Exception -> 0x0016, blocks: (B:5:0x000f, B:6:0x0030, B:8:0x003c, B:12:0x0045, B:15:0x004d, B:16:0x0050, B:18:0x005b, B:19:0x006b, B:27:0x005e, B:32:0x0023), top: B:2:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0013, Exception -> 0x0016, TryCatch #1 {Exception -> 0x0016, blocks: (B:5:0x000f, B:6:0x0030, B:8:0x003c, B:12:0x0045, B:15:0x004d, B:16:0x0050, B:18:0x005b, B:19:0x006b, B:27:0x005e, B:32:0x0023), top: B:2:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[Catch: all -> 0x0013, Exception -> 0x0016, TryCatch #1 {Exception -> 0x0016, blocks: (B:5:0x000f, B:6:0x0030, B:8:0x003c, B:12:0x0045, B:15:0x004d, B:16:0x0050, B:18:0x005b, B:19:0x006b, B:27:0x005e, B:32:0x0023), top: B:2:0x000b, outer: #0 }] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        List items;
        int pageCount;
        boolean z2;
        ArrayList arrayList;
        Object jVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        boolean z10 = this.red;
        ShiftSummariesViewModelV2 shiftSummariesViewModelV2 = this.purple;
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
                    t3.f fVar = shiftSummariesViewModelV2.alpha;
                    int i5 = shiftSummariesViewModelV2.hotel;
                    this.alpha = 1;
                    obj = fVar.juliet(i5, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                DataResponse dataResponse = (DataResponse) obj;
                items = dataResponse.getItems();
                pageCount = dataResponse.getPageCount();
            } catch (Exception e) {
                if (!(e instanceof CancellationException)) {
                    shiftSummariesViewModelV2.juliet = false;
                    String onHandleError = shiftSummariesViewModelV2.onHandleError(e);
                    ArrayList arrayList2 = shiftSummariesViewModelV2.kilo;
                    boolean isEmpty = arrayList2.isEmpty();
                    N n5 = shiftSummariesViewModelV2.bravo;
                    if (isEmpty) {
                        h hVar = new h(onHandleError);
                        n5.getClass();
                        n5.juliet(null, hVar);
                    } else {
                        j jVar2 = new j(CollectionsKt.z(arrayList2), true ^ shiftSummariesViewModelV2.india, false);
                        n5.getClass();
                        n5.juliet(null, jVar2);
                        shiftSummariesViewModelV2.foxtrot.alpha(onHandleError);
                    }
                    if (z10) {
                        bool = Boolean.FALSE;
                    }
                } else {
                    throw e;
                }
            }
            if (pageCount != 0 && pageCount - 1 != shiftSummariesViewModelV2.hotel) {
                z2 = false;
                shiftSummariesViewModelV2.india = z2;
                shiftSummariesViewModelV2.juliet = false;
                arrayList = shiftSummariesViewModelV2.kilo;
                if (z10) {
                    arrayList.clear();
                }
                arrayList.addAll(items);
                N n10 = shiftSummariesViewModelV2.bravo;
                if (!arrayList.isEmpty()) {
                    jVar = g.alpha;
                } else {
                    jVar = new j(CollectionsKt.z(arrayList), !shiftSummariesViewModelV2.india, false);
                }
                n10.getClass();
                n10.juliet(null, jVar);
                if (z10) {
                    bool = Boolean.FALSE;
                    N n11 = shiftSummariesViewModelV2.delta;
                    n11.getClass();
                    n11.juliet(null, bool);
                }
                return Unit.INSTANCE;
            }
            z2 = true;
            shiftSummariesViewModelV2.india = z2;
            shiftSummariesViewModelV2.juliet = false;
            arrayList = shiftSummariesViewModelV2.kilo;
            if (z10) {
            }
            arrayList.addAll(items);
            N n102 = shiftSummariesViewModelV2.bravo;
            if (!arrayList.isEmpty()) {
            }
            n102.getClass();
            n102.juliet(null, jVar);
            if (z10) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (z10) {
                N n12 = shiftSummariesViewModelV2.delta;
                Boolean bool2 = Boolean.FALSE;
                n12.getClass();
                n12.juliet(null, bool2);
            }
            throw th;
        }
    }
}
