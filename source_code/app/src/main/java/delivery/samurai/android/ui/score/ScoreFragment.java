package delivery.samurai.android.ui.score;

import B9.ab;
import Ca.c;
import J2.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.au;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.base.BaseViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import h9.aq;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import n.Y;
import pc.C2301b;
import qa.j;
import qe.C2474j;
import r3.C2492a;
import t6.S3;
import xc.AbstractC3323a;
import xc.C3326d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/score/ScoreFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ScoreFragment extends AbstractC3323a {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public final c f12462f;

    /* renamed from: g, reason: collision with root package name */
    public i f12463g;

    public ScoreFragment() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C2474j(15, new C2474j(14, this)));
        this.e = new ab(u.alpha.bravo(ScoreViewModel.class), new ga.ab(alpha, 28), new j(12, this, alpha), new ga.ab(alpha, 29));
        this.f12462f = new c(20);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_score, viewGroup, false);
        int i4 = R.id.emptyView;
        LinearLayout linearLayout = (LinearLayout) S3.bravo(R.id.emptyView, inflate);
        if (linearLayout != null) {
            i4 = R.id.label;
            if (((TextView) S3.bravo(R.id.label, inflate)) != null) {
                i4 = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
                if (recyclerView != null) {
                    i4 = R.id.swipeRefresh;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.swipeRefresh, inflate);
                    if (swipeRefreshLayout != null) {
                        this.f12463g = new i((CoordinatorLayout) inflate, linearLayout, recyclerView, swipeRefreshLayout);
                        return (CoordinatorLayout) romeo().alpha;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        ((RecyclerView) romeo().red).setAdapter(this.f12462f);
        quebec();
        i romeo = romeo();
        ((SwipeRefreshLayout) romeo.silver).setOnRefreshListener(new aq(17, this));
    }

    @Override // d3.n
    public final void oscar() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void quebec() {
        ScoreViewModel scoreViewModel = (ScoreViewModel) this.e.getValue();
        ?? auVar = new au();
        auVar.postValue(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(scoreViewModel, null, new C3326d(scoreViewModel, auVar, null), 1, null);
        auVar.observe(getViewLifecycleOwner(), new C2301b(8, new Y(24, this)));
    }

    public final i romeo() {
        i iVar = this.f12463g;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
