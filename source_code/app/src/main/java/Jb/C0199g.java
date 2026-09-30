package Jb;

import android.os.Bundle;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.network.network.models.CsatResponse;
import com.app.network.network.models.Order;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import wa.C3248d;

/* renamed from: Jb.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0199g implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0208p purple;

    public /* synthetic */ C0199g(C0208p c0208p, int i4) {
        this.alpha = i4;
        this.purple = c0208p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OrdersFragmentV2 ordersFragmentV2;
        C0208p c0208p = this.purple;
        switch (this.alpha) {
            case 0:
                if (((C2492a) obj).alpha != 2) {
                    androidx.fragment.app.ai parentFragment = c0208p.getParentFragment();
                    if (parentFragment instanceof OrdersFragmentV2) {
                        ordersFragmentV2 = (OrdersFragmentV2) parentFragment;
                    } else {
                        ordersFragmentV2 = null;
                    }
                    if (ordersFragmentV2 != null && ordersFragmentV2.isAdded() && ordersFragmentV2.getView() != null) {
                        J2.t tVar = ordersFragmentV2.f12302j;
                        if (tVar != null) {
                            ((SwipeRefreshLayout) tVar.red).setRefreshing(false);
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C2492a c2492a = (C2492a) obj;
                int i4 = c2492a.alpha;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            c0208p.kilo().bronze();
                        }
                    } else {
                        CsatResponse csatResponse = (CsatResponse) c2492a.charlie;
                        if (csatResponse != null) {
                            C3248d c3248d = new C3248d();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("arg_csat", csatResponse);
                            c3248d.setArguments(bundle);
                            c3248d.romeo(c0208p.getParentFragmentManager(), "Csat Rating Bottom Sheet");
                        }
                        c0208p.kilo().tango();
                    }
                } else {
                    c0208p.kilo().tango();
                }
                return Unit.INSTANCE;
            default:
                Order order = (Order) obj;
                Intrinsics.echo(order, "order");
                String language = Locale.getDefault().getLanguage();
                Intrinsics.delta(language, "getLanguage(...)");
                Order assignLocalizedMetaData = order.assignLocalizedMetaData(language);
                Integer id2 = order.getId();
                if (id2 != null) {
                    int intValue = id2.intValue();
                    int i5 = ProcessOrderActivityV2.f12378N0;
                    c0208p.startActivity(U8.a.golf(c0208p.requireContext(), intValue, assignLocalizedMetaData));
                }
                return Unit.INSTANCE;
        }
    }
}
