package Ya;

import B9.ab;
import J2.l;
import Xa.f;
import Xe.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import s6.AbstractC2661g5;
import t6.S3;
import wa.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYa/d;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: v, reason: collision with root package name */
    public i f2274v;

    /* renamed from: x, reason: collision with root package name */
    public final ab f2276x;

    /* renamed from: y, reason: collision with root package name */
    public l f2277y;

    /* renamed from: z, reason: collision with root package name */
    public Va.d f2278z;

    /* renamed from: u, reason: collision with root package name */
    public int f2273u = -1;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2275w = true;

    public d() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new s(4, new s(3, this)));
        this.f2276x = new ab(u.alpha.bravo(AuthViewModel.class), new Qb.l(alpha, 20), new f(2, this, alpha), new Qb.l(alpha, 21));
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final l bronze() {
        l lVar = this.f2277y;
        if (lVar != null) {
            return lVar;
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
        View inflate = inflater.inflate(R.layout.dialog_platform_selection, viewGroup, false);
        int i4 = R.id.btnClose;
        if (((ImageButton) S3.bravo(R.id.btnClose, inflate)) != null) {
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
            if (recyclerView != null) {
                i4 = R.id.title;
                if (((TextView) S3.bravo(R.id.title, inflate)) != null) {
                    this.f2277y = new l((ConstraintLayout) inflate, recyclerView);
                    return (ConstraintLayout) bronze().alpha;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f14101q) {
            return;
        }
        Integer valueOf = Integer.valueOf(this.f2273u);
        Va.d dVar = new Va.d(2);
        dVar.delta = valueOf;
        this.f2278z = dVar;
        l bronze = bronze();
        Va.d dVar2 = this.f2278z;
        if (dVar2 != null) {
            ((RecyclerView) bronze.purple).setAdapter(dVar2);
            AbstractC2661g5.bravo((RecyclerView) bronze().purple, R.dimen.spacing_12, R.dimen.spacing_6);
            AbstractC2661g5.alpha((RecyclerView) bronze().purple, R.dimen.spacing_12, R.dimen.spacing_12);
            getContext();
            ((RecyclerView) bronze().purple).setLayoutManager(new LinearLayoutManager());
            ((AuthViewModel) this.f2276x.getValue()).getPlatformList().observe(getViewLifecycleOwner(), new Aa.f(20, new c(0, this)));
            Va.d dVar3 = this.f2278z;
            if (dVar3 != null) {
                dVar3.bravo = new O7.l(18, this);
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
    public final boolean getF2275w() {
        return this.f2275w;
    }
}
