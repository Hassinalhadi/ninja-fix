package delivery.samurai.android.ui.agreement;

import B9.ab;
import Ca.c;
import F8.q;
import J2.n;
import S5.k;
import Xa.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.au;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.base.BaseViewModel;
import com.google.android.material.internal.s;
import d.C1534h0;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import g.C1718a;
import h9.aq;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import la.j;
import ma.d;
import r3.C2492a;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/agreement/AgreementFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AgreementFragment extends j {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public c f12131f;

    /* renamed from: g, reason: collision with root package name */
    public int f12132g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12133h;

    /* renamed from: i, reason: collision with root package name */
    public n f12134i;

    public AgreementFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new je.ab(15, new je.ab(14, this)));
        this.e = new ab(u.alpha.bravo(AgreementViewModel.class), new ga.ab(alpha, 10), new f(20, this, alpha), new ga.ab(alpha, 11));
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_agreement, viewGroup, false);
        int i4 = R.id.emptyView;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) S3.bravo(R.id.emptyView, inflate);
        if (linearLayoutCompat != null) {
            i4 = R.id.recycler_agreements;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recycler_agreements, inflate);
            if (recyclerView != null) {
                i4 = R.id.swipeRefreshAgreement;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.swipeRefreshAgreement, inflate);
                if (swipeRefreshLayout != null) {
                    this.f12134i = new n((LinearLayout) inflate, linearLayoutCompat, recyclerView, swipeRefreshLayout);
                    return (LinearLayout) romeo().alpha;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        c cVar = new c(14);
        cVar.bravo = new C1718a(9, this);
        this.f12131f = cVar;
        n romeo = romeo();
        getContext();
        ((RecyclerView) romeo.red).setLayoutManager(new LinearLayoutManager());
        n romeo2 = romeo();
        c cVar2 = this.f12131f;
        if (cVar2 != null) {
            ((RecyclerView) romeo2.red).setAdapter(cVar2);
            n romeo3 = romeo();
            ((SwipeRefreshLayout) romeo3.silver).setOnRefreshListener(new aq(4, this));
            n romeo4 = romeo();
            s sVar = new s(17, this);
            RecyclerView recyclerView = (RecyclerView) romeo4.red;
            if (recyclerView.getAdapter() != null) {
                if (recyclerView.getLayoutManager() != null) {
                    new k(recyclerView, sVar, 2, false, new q(recyclerView.getLayoutManager()));
                    this.f12132g = 0;
                    quebec();
                    return;
                }
                throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
            }
            throw new IllegalStateException("Adapter needs to be set!");
        }
        Intrinsics.lima("adapter");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void quebec() {
        AgreementViewModel agreementViewModel = (AgreementViewModel) this.e.getValue();
        Integer valueOf = Integer.valueOf(this.f12132g);
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(agreementViewModel, null, new d(agreementViewModel, valueOf, auVar, null), 1, null);
        auVar.observe(getViewLifecycleOwner(), new Aa.f(29, new C1534h0(27, this)));
    }

    public final n romeo() {
        n nVar = this.f12134i;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
