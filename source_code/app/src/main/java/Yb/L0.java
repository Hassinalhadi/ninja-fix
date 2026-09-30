package Yb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import id.C1915c;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2661g5;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/L0;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class L0 extends B {

    /* renamed from: u, reason: collision with root package name */
    public List f2334u = CollectionsKt.emptyList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2335v = true;

    /* renamed from: w, reason: collision with root package name */
    public final Ca.c f2336w = new Ca.c(12);

    /* renamed from: x, reason: collision with root package name */
    public C1915c f2337x;

    public L0() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Xe.s(8, new Xe.s(7, this)));
        new B9.ab(kotlin.jvm.internal.u.alpha.bravo(OrdersViewModel.class), new Qb.l(alpha, 24), new Xa.f(4, this, alpha), new Qb.l(alpha, 25));
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
        C1915c c1915c = this.f2337x;
        if (c1915c != null) {
            ((ImageButton) c1915c.red).setOnClickListener(new Fb.b(this, 27));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.f14101q) {
            return;
        }
        if (this.f2334u.size() < 3) {
            beige();
        }
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        C1915c tango = C1915c.tango(inflater, viewGroup);
        this.f2337x = tango;
        return (ConstraintLayout) tango.purple;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f14101q) {
            return;
        }
        List list = this.f2334u;
        Ca.c cVar = this.f2336w;
        cVar.bravo(list);
        C1915c c1915c = this.f2337x;
        if (c1915c != null) {
            AbstractC2661g5.bravo((RecyclerView) c1915c.silver, R.dimen.spacing_6, R.dimen.spacing_12);
            C1915c c1915c2 = this.f2337x;
            if (c1915c2 != null) {
                ((RecyclerView) c1915c2.silver).setAdapter(cVar);
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF2335v() {
        return this.f2335v;
    }
}
