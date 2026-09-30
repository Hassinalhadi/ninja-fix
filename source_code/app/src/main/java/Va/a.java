package Va;

import Aa.f;
import B9.ab;
import Lb.C;
import Qb.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVa/a;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: u, reason: collision with root package name */
    public Integer f2169u;

    /* renamed from: v, reason: collision with root package name */
    public i f2170v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2171w = true;

    /* renamed from: x, reason: collision with root package name */
    public final ab f2172x;

    /* renamed from: y, reason: collision with root package name */
    public C1915c f2173y;

    /* renamed from: z, reason: collision with root package name */
    public d f2174z;

    public a() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C(17, new C(16, this)));
        this.f2172x = new ab(u.alpha.bravo(AuthViewModel.class), new l(alpha, 8), new Aa.i(25, this, alpha), new l(alpha, 9));
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final C1915c bronze() {
        C1915c c1915c = this.f2173y;
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
        this.f2173y = C1915c.sierra(inflater, viewGroup);
        return (ConstraintLayout) bronze().purple;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f14101q) {
            return;
        }
        d dVar = new d(0);
        dVar.delta = this.f2169u;
        this.f2174z = dVar;
        C1915c bronze = bronze();
        d dVar2 = this.f2174z;
        if (dVar2 != null) {
            ((RecyclerView) bronze.red).setAdapter(dVar2);
            AbstractC2661g5.bravo((RecyclerView) bronze().red, R.dimen.spacing_12, R.dimen.spacing_6);
            AbstractC2661g5.alpha((RecyclerView) bronze().red, R.dimen.spacing_12, R.dimen.spacing_12);
            ((AuthViewModel) this.f2172x.getValue()).getBanks().observe(this, new f(15, new Aa.l(24, this)));
            ((TextView) bronze().silver).setText(R.string.select_bank);
            d dVar3 = this.f2174z;
            if (dVar3 != null) {
                dVar3.bravo = new O7.l(9, this);
                return;
            } else {
                Intrinsics.lima("adapter");
                throw null;
            }
        }
        Intrinsics.lima("adapter");
        throw null;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF2171w() {
        return this.f2171w;
    }
}
