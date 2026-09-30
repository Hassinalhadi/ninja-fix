package Jb;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q implements v2.j, v2.i {
    public final /* synthetic */ OrdersFragmentV2 alpha;

    @Override // v2.j
    public void onRefresh() {
        OrdersFragmentV2 ordersFragmentV2 = this.alpha;
        J2.t tVar = ordersFragmentV2.f12302j;
        if (tVar != null) {
            ((SwipeRefreshLayout) tVar.red).setRefreshing(true);
            ordersFragmentV2.november();
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }
}
