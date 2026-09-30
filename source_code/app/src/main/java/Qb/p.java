package Qb;

import B9.ab;
import B9.ao;
import B9.ap;
import Lb.C;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.au;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.BaseViewModel;
import com.app.network.network.models.LanguageMetaData;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import s6.AbstractC2661g5;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb/p;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class p extends d {

    /* renamed from: u, reason: collision with root package name */
    public Order f1936u;

    /* renamed from: v, reason: collision with root package name */
    public final ab f1937v;

    /* renamed from: w, reason: collision with root package name */
    public ao f1938w;

    /* renamed from: x, reason: collision with root package name */
    public final Ca.c f1939x;

    /* renamed from: y, reason: collision with root package name */
    public final Hc.b f1940y;

    public p() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C(8, new C(7, this)));
        this.f1937v = new ab(kotlin.jvm.internal.u.alpha.bravo(OrdersViewModel.class), new l(alpha, 2), new Aa.i(22, this, alpha), new l(alpha, 3));
        this.f1939x = new Ca.c(7);
        this.f1940y = new Hc.b(2);
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void bronze() {
        int i4;
        OrdersViewModel ordersViewModel = (OrdersViewModel) this.f1937v.getValue();
        Bundle arguments = getArguments();
        if (arguments != null) {
            i4 = arguments.getInt("orderId");
        } else {
            i4 = 0;
        }
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(ordersViewModel, null, new na.l(ordersViewModel, i4, auVar, null), 1, null);
        auVar.observe(this, new Aa.f(13, new Aa.l(19, this)));
    }

    public final ao coral() {
        ao aoVar = this.f1938w;
        if (aoVar != null) {
            return aoVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void crimson() {
        List<LanguageMetaData> list;
        List list2;
        Order order = this.f1936u;
        if (order != null) {
            Hc.b bVar = this.f1940y;
            bVar.getClass();
            bVar.delta = order;
            ao coral = coral();
            ap apVar = (ap) coral;
            apVar.f356l = this.f1936u;
            synchronized (apVar) {
                apVar.f364t |= 1;
            }
            apVar.delta();
            apVar.oscar();
            RecyclerView recyclerView = coral.f352h;
            Ca.c cVar = this.f1939x;
            Order order2 = coral.f356l;
            String str = null;
            if (order2 != null) {
                list = order2.getCurrentLanguageMetaData();
            } else {
                list = null;
            }
            cVar.bravo(list);
            recyclerView.setAdapter(cVar);
            RecyclerView recyclerView2 = coral.f353i;
            Hc.b bVar2 = this.f1940y;
            Order order3 = (Order) bVar2.delta;
            if (order3 != null) {
                List<OrderTask> tasks = order3.getTasks();
                if (tasks != null) {
                    list2 = CollectionsKt.p(tasks, new Sb.k(19));
                } else {
                    list2 = null;
                }
                bVar2.bravo(list2);
                recyclerView2.setAdapter(bVar2);
                TextView textView = coral.f350f;
                Order order4 = coral.f356l;
                if (order4 != null) {
                    str = order4.getBackendNo();
                }
                textView.setText(str);
                RecyclerView pickupLocations = coral.f353i;
                Intrinsics.delta(pickupLocations, "pickupLocations");
                AbstractC2661g5.bravo(pickupLocations, R.dimen.spacing_zero, R.dimen.spacing_6);
                return;
            }
            Intrinsics.lima("order");
            throw null;
        }
        bronze();
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = ao.f349m;
        DataBinderMapperImpl dataBinderMapperImpl = z1.d.alpha;
        ao aoVar = (ao) z1.g.kilo(inflater, R.layout.dialog_order_processed_detail, viewGroup, false, null);
        Intrinsics.delta(aoVar, "inflate(...)");
        this.f1938w = aoVar;
        return coral().red;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        ao aoVar = (ao) z1.d.alpha(view);
        if (aoVar == null) {
            return;
        }
        this.f1938w = aoVar;
        ao coral = coral();
        coral.f351g.setOnClickListener(new Fb.b(this, 11));
        this.f1940y.getClass();
        bronze();
        crimson();
    }
}
