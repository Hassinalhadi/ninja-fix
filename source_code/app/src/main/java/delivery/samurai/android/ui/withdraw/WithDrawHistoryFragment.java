package delivery.samurai.android.ui.withdraw;

import B2.s;
import B9.ab;
import Dc.t;
import F8.q;
import Lb.C;
import O7.j;
import O7.l;
import S5.k;
import Wc.b;
import Wc.w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.au;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.base.BaseViewModel;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import r3.C2492a;
import s6.AbstractC2661g5;
import t6.S3;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/withdraw/WithDrawHistoryFragment;", "Ld3/n;", "", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class WithDrawHistoryFragment extends b {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public ab f12541f;

    /* renamed from: g, reason: collision with root package name */
    public final Hc.b f12542g;

    /* renamed from: h, reason: collision with root package name */
    public int f12543h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12544i;

    /* renamed from: j, reason: collision with root package name */
    public final l f12545j;

    public WithDrawHistoryFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new C(23, new C(22, this)));
        this.e = new ab(u.alpha.bravo(WithDrawHistoryViewModel.class), new Qb.l(alpha, 14), new Aa.i(28, this, alpha), new Qb.l(alpha, 15));
        this.f12542g = new Hc.b(3);
        this.f12545j = new l(13, this);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.with_draw_history_fragment, viewGroup, false);
        int i4 = R.id.btnSubmitRequest;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnSubmitRequest, inflate);
        if (materialButton != null) {
            i4 = R.id.emptyView;
            CardView cardView = (CardView) S3.bravo(R.id.emptyView, inflate);
            if (cardView != null) {
                i4 = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
                if (recyclerView != null) {
                    i4 = R.id.swipeRefresh;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.swipeRefresh, inflate);
                    if (swipeRefreshLayout != null) {
                        this.f12541f = new ab((FrameLayout) inflate, materialButton, cardView, recyclerView, swipeRefreshLayout);
                        return (FrameLayout) romeo().purple;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        quebec();
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        int i4;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        ((SwipeRefreshLayout) romeo().teal).setRefreshing(true);
        RecyclerView recyclerView = (RecyclerView) romeo().white;
        Hc.b bVar = this.f12542g;
        recyclerView.setAdapter(bVar);
        AbstractC2661g5.charlie((RecyclerView) romeo().white, R.dimen.spacing_6, R.dimen.spacing_6);
        AbstractC2661g5.alpha((RecyclerView) romeo().white, R.dimen.spacing_12, R.dimen.spacing_12);
        bVar.delta = this;
        bVar.bravo = new j(14, this);
        RecyclerView recyclerView2 = (RecyclerView) romeo().white;
        if (recyclerView2.getAdapter() != null) {
            if (recyclerView2.getLayoutManager() != null) {
                new k(recyclerView2, this.f12545j, 2, false, new q(recyclerView2.getLayoutManager()));
                MaterialButton materialButton = (MaterialButton) romeo().red;
                if (E8.b.echo().charlie("should_allow_withdraw_request")) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                materialButton.setVisibility(i4);
                return;
            }
            throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
        }
        throw new IllegalStateException("Adapter needs to be set!");
    }

    @Override // d3.n
    public final void oscar() {
        ab romeo = romeo();
        ((SwipeRefreshLayout) romeo.teal).setOnRefreshListener(new s(28, this));
        ab romeo2 = romeo();
        ((MaterialButton) romeo2.red).setOnClickListener(new Fb.b(this, 22));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void quebec() {
        WithDrawHistoryViewModel withDrawHistoryViewModel = (WithDrawHistoryViewModel) this.e.getValue();
        int i4 = this.f12543h;
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(withDrawHistoryViewModel, null, new w(withDrawHistoryViewModel, i4, auVar, null), 1, null);
        auVar.observe(getViewLifecycleOwner(), new t(11, new Wc.q(this, 0)));
    }

    public final ab romeo() {
        ab abVar = this.f12541f;
        if (abVar != null) {
            return abVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
