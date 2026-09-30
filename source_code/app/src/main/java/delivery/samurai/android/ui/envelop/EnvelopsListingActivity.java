package delivery.samurai.android.ui.envelop;

import Aa.f;
import Aa.l;
import Aa.m;
import B2.s;
import B9.C0036e;
import B9.ab;
import Ca.c;
import Eb.b;
import Fb.h;
import Fb.n;
import Fb.p;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.au;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.base.BaseViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import r3.C2492a;
import s6.AbstractC2661g5;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/envelop/EnvelopsListingActivity;", "Ld3/k;", "<init>", "()V", "W8/a", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class EnvelopsListingActivity extends p {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f12251M = 0;

    /* renamed from: J, reason: collision with root package name */
    public final ab f12252J;

    /* renamed from: K, reason: collision with root package name */
    public C0036e f12253K;

    /* renamed from: L, reason: collision with root package name */
    public final c f12254L;

    public EnvelopsListingActivity() {
        super(0);
        this.f1294I = false;
        addOnContextAvailableListener(new b(this, 2));
        this.f12252J = new ab(u.alpha.bravo(EnvelopsViewModel.class), new h(this, 1), new h(this, 0), new h(this, 2));
        this.f12254L = new c(2);
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (EnvelopsViewModel) this.f12252J.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void gold() {
        EnvelopsViewModel envelopsViewModel = (EnvelopsViewModel) this.f12252J.getValue();
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(envelopsViewModel, null, new n(envelopsViewModel, auVar, null), 1, null);
        auVar.observe(this, new f(6, new l(7, this)));
    }

    public final C0036e gray() {
        C0036e c0036e = this.f12253K;
        if (c0036e != null) {
            return c0036e;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_envelops_listing, (ViewGroup) null, false);
        int i4 = R.id.emptyView;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) S3.bravo(R.id.emptyView, inflate);
        if (linearLayoutCompat != null) {
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
            if (recyclerView != null) {
                i4 = R.id.swipeRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.swipeRefresh, inflate);
                if (swipeRefreshLayout != null) {
                    i4 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) S3.bravo(R.id.toolbar, inflate);
                    if (toolbar != null) {
                        this.f12253K = new C0036e((ConstraintLayout) inflate, linearLayoutCompat, recyclerView, swipeRefreshLayout, toolbar);
                        setContentView(gray().alpha);
                        gold();
                        RecyclerView recyclerView2 = gray().charlie;
                        c cVar = this.f12254L;
                        recyclerView2.setAdapter(cVar);
                        AbstractC2661g5.charlie(gray().charlie, R.dimen.spacing_zero, R.dimen.spacing_12);
                        AbstractC2661g5.alpha(gray().charlie, R.dimen.spacing_12, R.dimen.spacing_12);
                        C0036e gray = gray();
                        gray.delta.setOnRefreshListener(new s(3, this));
                        C0036e gray2 = gray();
                        gray2.echo.setNavigationOnClickListener(new Fb.b(this, 1));
                        cVar.bravo = new m(8, this);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }
}
