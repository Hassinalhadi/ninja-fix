package delivery.samurai.android.ui.about;

import B9.ab;
import Hc.b;
import Xa.f;
import Xe.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import d3.n;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.viewmodel.TrophiesListViewModel;
import g.C1718a;
import ga.ar;
import ga.as;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import t6.S3;
import w.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/about/TrophiesListFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrophiesListFragment extends n {

    /* renamed from: b, reason: collision with root package name */
    public final ab f12111b;

    /* renamed from: c, reason: collision with root package name */
    public o f12112c;

    /* renamed from: d, reason: collision with root package name */
    public b f12113d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f12114f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12115g;

    /* renamed from: h, reason: collision with root package name */
    public final C1718a f12116h;

    public TrophiesListFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new s(25, new s(24, this)));
        this.f12111b = new ab(u.alpha.bravo(TrophiesListViewModel.class), new ga.ab(alpha, 4), new f(12, this, alpha), new ga.ab(alpha, 5));
        this.f12116h = new C1718a(2, this);
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (arguments != null && arguments.getBoolean("IS_ACTIVE_TROPHY")) {
            z2 = true;
        }
        this.e = z2;
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_trophies_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rv_trophy_milestones, inflate);
        if (recyclerView != null) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
            this.f12112c = new o(swipeRefreshLayout, recyclerView, swipeRefreshLayout, 4);
            Intrinsics.delta(swipeRefreshLayout, "getRoot(...)");
            return swipeRefreshLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.rv_trophy_milestones)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        b bVar = new b(4, new ar(this, 1));
        this.f12113d = bVar;
        o oVar = this.f12112c;
        if (oVar != null) {
            ((RecyclerView) oVar.purple).setAdapter(bVar);
            o oVar2 = this.f12112c;
            if (oVar2 != null) {
                ((RecyclerView) oVar2.purple).post(new as(0, this));
                ((TrophiesListViewModel) this.f12111b.getValue()).charlie.observe(getViewLifecycleOwner(), new Aa.f(25, new ar(this, 0)));
                oscar();
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
        o oVar = this.f12112c;
        if (oVar != null) {
            ((SwipeRefreshLayout) oVar.red).setOnRefreshListener(new a4.u(26, this));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }

    public final void papa() {
        kilo().tango();
        o oVar = this.f12112c;
        if (oVar != null) {
            ((SwipeRefreshLayout) oVar.red).setRefreshing(false);
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }
}
