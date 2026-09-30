package delivery.samurai.android.ui.orders;

import Aa.f;
import B2.s;
import B9.ab;
import Ca.c;
import F8.q;
import Lb.C;
import O7.j;
import O7.l;
import Qb.b;
import S5.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.fragment.app.ai;
import androidx.lifecycle.al;
import androidx.lifecycle.au;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.base.BaseViewModel;
import com.google.firebase.messaging.o;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import na.p;
import r3.C2492a;
import s6.AbstractC2634d5;
import s6.AbstractC2661g5;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/orders/OrderHistoryFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class OrderHistoryFragment extends b {
    public final Date e;

    /* renamed from: f, reason: collision with root package name */
    public Date f12338f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f12339g;

    /* renamed from: h, reason: collision with root package name */
    public Date f12340h;

    /* renamed from: i, reason: collision with root package name */
    public final ab f12341i;

    /* renamed from: j, reason: collision with root package name */
    public int f12342j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12343k;

    /* renamed from: l, reason: collision with root package name */
    public o f12344l;

    /* renamed from: m, reason: collision with root package name */
    public final c f12345m;

    /* renamed from: n, reason: collision with root package name */
    public final l f12346n;

    public OrderHistoryFragment() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -7);
        Date time = calendar.getTime();
        Intrinsics.delta(time, "getTime(...)");
        this.e = time;
        this.f12338f = time;
        Date time2 = Calendar.getInstance().getTime();
        Intrinsics.delta(time2, "getTime(...)");
        this.f12339g = time2;
        this.f12340h = time2;
        Lazy alpha = LazyKt.alpha(i.purple, new C(6, new C(5, this)));
        this.f12341i = new ab(u.alpha.bravo(OrdersViewModel.class), new Qb.l(alpha, 0), new Aa.i(21, this, alpha), new Qb.l(alpha, 1));
        this.f12345m = new c(8);
        this.f12346n = new l(4, this);
    }

    @Override // Qb.b, d3.n, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        Intrinsics.echo(context, "context");
        super.onAttach(context);
        ImageButton imageButton = (ImageButton) requireActivity().findViewById(R.id.btnSelectDate);
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_order_history, viewGroup, false);
        int i4 = R.id.empty;
        LinearLayout linearLayout = (LinearLayout) S3.bravo(R.id.empty, inflate);
        if (linearLayout != null) {
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                this.f12344l = new o(swipeRefreshLayout, linearLayout, recyclerView, swipeRefreshLayout);
                return (SwipeRefreshLayout) romeo().alpha;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.ai
    public final void onDetach() {
        ImageButton imageButton;
        super.onDetach();
        List foxtrot = getParentFragmentManager().charlie.foxtrot();
        Intrinsics.delta(foxtrot, "getFragments(...)");
        boolean z2 = false;
        if (!foxtrot.isEmpty()) {
            Iterator it = foxtrot.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ai) it.next()) instanceof OrderHistoryFragment) {
                    z2 = true;
                    break;
                }
            }
        }
        if (!z2 && (imageButton = (ImageButton) requireActivity().findViewById(R.id.btnSelectDate)) != null) {
            imageButton.setVisibility(8);
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        ((SwipeRefreshLayout) romeo().delta).setRefreshing(true);
        this.f12342j = 0;
        quebec();
        AbstractC2661g5.alpha((RecyclerView) romeo().charlie, R.dimen.spacing_12, R.dimen.spacing_12);
        AbstractC2661g5.charlie((RecyclerView) romeo().charlie, R.dimen.spacing_6, R.dimen.spacing_6);
        RecyclerView recyclerView = (RecyclerView) romeo().charlie;
        c cVar = this.f12345m;
        recyclerView.setAdapter(cVar);
        o romeo = romeo();
        ((SwipeRefreshLayout) romeo.delta).setOnRefreshListener(new s(22, this));
        RecyclerView recyclerView2 = (RecyclerView) romeo().charlie;
        if (recyclerView2.getAdapter() != null) {
            if (recyclerView2.getLayoutManager() != null) {
                new k(recyclerView2, this.f12346n, 2, false, new q(recyclerView2.getLayoutManager()));
                cVar.bravo = new j(4, this);
                return;
            }
            throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
        }
        throw new IllegalStateException("Adapter needs to be set!");
    }

    @Override // d3.n
    public final void oscar() {
        ImageButton imageButton = (ImageButton) requireActivity().findViewById(R.id.btnSelectDate);
        if (imageButton != null) {
            imageButton.setOnClickListener(new Fb.b(this, 9));
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void quebec() {
        al alVar = (al) getViewLifecycleOwnerLiveData().getValue();
        if (alVar == null) {
            return;
        }
        OrdersViewModel ordersViewModel = (OrdersViewModel) this.f12341i.getValue();
        String charlie = AbstractC2634d5.charlie(this.f12338f);
        String charlie2 = AbstractC2634d5.charlie(this.f12340h);
        int i4 = this.f12342j;
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(ordersViewModel, null, new p(ordersViewModel, charlie, charlie2, i4, auVar, null), 1, null);
        auVar.observe(alVar, new f(12, new Aa.l(18, this)));
    }

    public final o romeo() {
        o oVar = this.f12344l;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
