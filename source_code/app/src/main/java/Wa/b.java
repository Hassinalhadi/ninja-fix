package Wa;

import Aa.e;
import Aa.f;
import B9.ab;
import Lb.C;
import O7.j;
import Qb.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.splash.AuthViewModel;
import id.C1915c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import s6.AbstractC2661g5;
import wa.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWa/b;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class b extends d {
    public boolean A;
    public boolean B;
    public int C;

    /* renamed from: D, reason: collision with root package name */
    public C1915c f2200D;

    /* renamed from: E, reason: collision with root package name */
    public Va.d f2201E;

    /* renamed from: v, reason: collision with root package name */
    public Integer f2203v;

    /* renamed from: w, reason: collision with root package name */
    public i f2204w;

    /* renamed from: y, reason: collision with root package name */
    public final ab f2206y;

    /* renamed from: z, reason: collision with root package name */
    public int f2207z;

    /* renamed from: u, reason: collision with root package name */
    public int f2202u = -1;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2205x = true;

    public b() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C(19, new C(18, this)));
        this.f2206y = new ab(u.alpha.bravo(AuthViewModel.class), new l(alpha, 10), new Aa.i(26, this, alpha), new l(alpha, 11));
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final void bronze(int i4) {
        if (!this.A && i4 <= this.C) {
            this.A = true;
            ((AuthViewModel) this.f2206y.getValue()).getCities(this.f2202u, i4).observe(getViewLifecycleOwner(), new f(16, new Aa.d(this, i4, 3)));
        }
    }

    public final C1915c coral() {
        C1915c c1915c = this.f2200D;
        if (c1915c != null) {
            return c1915c;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
        beige();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        this.f2200D = C1915c.sierra(inflater, viewGroup);
        return (ConstraintLayout) coral().purple;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f14101q) {
            return;
        }
        Va.d dVar = new Va.d(1);
        dVar.delta = this.f2203v;
        this.f2201E = dVar;
        C1915c coral = coral();
        Va.d dVar2 = this.f2201E;
        if (dVar2 != null) {
            ((RecyclerView) coral.red).setAdapter(dVar2);
            AbstractC2661g5.bravo((RecyclerView) coral().red, R.dimen.spacing_12, R.dimen.spacing_6);
            AbstractC2661g5.alpha((RecyclerView) coral().red, R.dimen.spacing_12, R.dimen.spacing_12);
            getContext();
            ((RecyclerView) coral().red).setLayoutManager(new LinearLayoutManager());
            bronze(this.f2207z);
            Va.d dVar3 = this.f2201E;
            if (dVar3 != null) {
                dVar3.bravo = new j(13, this);
                C1915c coral2 = coral();
                ((RecyclerView) coral2.red).addOnScrollListener(new e(3, this));
                return;
            }
            Intrinsics.lima("adapter");
            throw null;
        }
        Intrinsics.lima("adapter");
        throw null;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF2205x() {
        return this.f2205x;
    }
}
