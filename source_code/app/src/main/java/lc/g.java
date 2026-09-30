package lc;

import android.widget.LinearLayout;
import androidx.appcompat.widget.i1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.points.presentation.PointsFragment;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ PointsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PointsFragment pointsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = pointsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        g gVar = new g(this.purple, cVar);
        gVar.alpha = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((C2492a) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        List list;
        int i4;
        C2492a c2492a = (C2492a) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (c2492a != null) {
            num = new Integer(c2492a.alpha);
        } else {
            num = null;
        }
        PointsFragment pointsFragment = this.purple;
        boolean z2 = true;
        if (num != null && num.intValue() == 2) {
            i1 i1Var = pointsFragment.f12435f;
            if (i1Var != null) {
                ((SwipeRefreshLayout) i1Var.foxtrot).setRefreshing(true);
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        } else if (num != null && num.intValue() == 1) {
            DataResponse dataResponse = (DataResponse) c2492a.charlie;
            if (dataResponse != null) {
                list = dataResponse.getItems();
            } else {
                list = null;
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            DataResponse dataResponse2 = (DataResponse) c2492a.charlie;
            if (dataResponse2 != null) {
                i4 = dataResponse2.getPageCount() - 1;
            } else {
                i4 = 0;
            }
            if (i4 != pointsFragment.f12437h) {
                z2 = false;
            }
            pointsFragment.f12438i = z2;
            if (list.isEmpty() && pointsFragment.f12437h == 0) {
                String string = pointsFragment.getString(R.string.there_is_no_transaction_till_now);
                Intrinsics.delta(string, "getString(...)");
                pointsFragment.romeo(string);
            } else {
                int i5 = pointsFragment.f12437h;
                Ca.c cVar = pointsFragment.f12436g;
                if (i5 == 0) {
                    cVar.bravo(list);
                } else {
                    cVar.alpha(list);
                }
                i1 i1Var2 = pointsFragment.f12435f;
                if (i1Var2 != null) {
                    ((RecyclerView) i1Var2.echo).setVisibility(0);
                    ((LinearLayout) i1Var2.delta).setVisibility(8);
                    ((SwipeRefreshLayout) i1Var2.foxtrot).setRefreshing(false);
                } else {
                    Intrinsics.lima("binding");
                    throw null;
                }
            }
        } else if (num != null && num.intValue() == 0) {
            String str = c2492a.bravo;
            if (str == null) {
                str = pointsFragment.getString(R.string.error_something_went_wrong);
                Intrinsics.delta(str, "getString(...)");
            }
            pointsFragment.romeo(str);
        } else if (num != null && num.intValue() == 3) {
            pointsFragment.f12438i = true;
            i1 i1Var3 = pointsFragment.f12435f;
            if (i1Var3 != null) {
                ((SwipeRefreshLayout) i1Var3.foxtrot).setRefreshing(false);
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        return Unit.INSTANCE;
    }
}
