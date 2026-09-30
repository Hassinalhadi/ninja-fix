package Kc;

import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SuspensionViewModel purple;
    public final /* synthetic */ boolean red;

    public /* synthetic */ h(SuspensionViewModel suspensionViewModel, boolean z2, int i4) {
        this.alpha = i4;
        this.purple = suspensionViewModel;
        this.red = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        Object dVar;
        switch (this.alpha) {
            case 0:
                DataResponse dataResponse = (DataResponse) obj;
                List items = dataResponse.getItems();
                if (items == null) {
                    items = CollectionsKt.emptyList();
                }
                int pageCount = dataResponse.getPageCount();
                SuspensionViewModel suspensionViewModel = this.purple;
                if (pageCount != 0 && pageCount - 1 != suspensionViewModel.juliet) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                suspensionViewModel.kilo = z2;
                suspensionViewModel.lima = false;
                ArrayList arrayList = suspensionViewModel.mike;
                boolean z10 = this.red;
                if (z10) {
                    arrayList.clear();
                }
                arrayList.addAll(items);
                if (arrayList.isEmpty()) {
                    dVar = a.alpha;
                } else {
                    dVar = new d(CollectionsKt.z(arrayList), true ^ suspensionViewModel.kilo, false);
                }
                N n5 = suspensionViewModel.delta;
                n5.getClass();
                n5.juliet(null, dVar);
                if (z10) {
                    Boolean bool = Boolean.FALSE;
                    N n10 = suspensionViewModel.foxtrot;
                    n10.getClass();
                    n10.juliet(null, bool);
                }
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                SuspensionViewModel suspensionViewModel2 = this.purple;
                suspensionViewModel2.lima = false;
                Intrinsics.checkNotNull(th);
                String onHandleError = suspensionViewModel2.onHandleError(th);
                ArrayList arrayList2 = suspensionViewModel2.mike;
                boolean isEmpty = arrayList2.isEmpty();
                N n11 = suspensionViewModel2.delta;
                if (isEmpty) {
                    b bVar = new b(onHandleError);
                    n11.getClass();
                    n11.juliet(null, bVar);
                } else {
                    d dVar2 = new d(CollectionsKt.z(arrayList2), !suspensionViewModel2.kilo, false);
                    n11.getClass();
                    n11.juliet(null, dVar2);
                    suspensionViewModel2.hotel.alpha(onHandleError);
                }
                if (this.red) {
                    Boolean bool2 = Boolean.FALSE;
                    N n12 = suspensionViewModel2.foxtrot;
                    n12.getClass();
                    n12.juliet(null, bool2);
                }
                return Unit.INSTANCE;
        }
    }
}
