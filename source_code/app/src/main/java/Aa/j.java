package Aa;

import B9.ab;
import B9.aw;
import android.content.DialogInterface;
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
import t6.S3;
import ya.C3407c;
import ya.C3408d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAa/j;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class j extends a {
    public boolean A;
    public boolean B;
    public int C;

    /* renamed from: D, reason: collision with root package name */
    public aw f37D;

    /* renamed from: E, reason: collision with root package name */
    public final Ca.c f38E;

    /* renamed from: v, reason: collision with root package name */
    public C3407c f40v;

    /* renamed from: w, reason: collision with root package name */
    public C3408d f41w;

    /* renamed from: y, reason: collision with root package name */
    public final ab f43y;

    /* renamed from: z, reason: collision with root package name */
    public int f44z;

    /* renamed from: u, reason: collision with root package name */
    public int f39u = -1;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f42x = true;

    public j() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new g(1, new g(0, this)));
        this.f43y = new ab(u.alpha.bravo(AuthViewModel.class), new h(alpha, 0), new i(0, this, alpha), new h(alpha, 1));
        this.f38E = new Ca.c(21);
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final void bronze(int i4) {
        if (!this.A && i4 <= this.C) {
            this.A = true;
            int i5 = 0;
            ((AuthViewModel) this.f43y.getValue()).getCities(this.f39u, i4).observe(getViewLifecycleOwner(), new f(i5, new d(this, i4, i5)));
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_select_city, viewGroup, false);
        int i4 = R.id.btnClose;
        if (((ImageButton) S3.bravo(R.id.btnClose, inflate)) != null) {
            i4 = R.id.rvCities;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rvCities, inflate);
            if (recyclerView != null) {
                i4 = R.id.title;
                if (((TextView) S3.bravo(R.id.title, inflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f37D = new aw(constraintLayout, recyclerView);
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
        C3408d c3408d = this.f41w;
        if (c3408d != null) {
            c3408d.invoke();
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f14101q) {
            return;
        }
        aw awVar = this.f37D;
        if (awVar != null) {
            RecyclerView recyclerView = awVar.alpha;
            Ca.c cVar = this.f38E;
            recyclerView.setAdapter(cVar);
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            aw awVar2 = this.f37D;
            if (awVar2 != null) {
                awVar2.alpha.setLayoutManager(linearLayoutManager);
                bronze(this.f44z);
                cVar.bravo = new D8.c(2, this);
                aw awVar3 = this.f37D;
                if (awVar3 != null) {
                    awVar3.alpha.addOnScrollListener(new e(0, this));
                    return;
                } else {
                    Intrinsics.lima("binding");
                    throw null;
                }
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF42x() {
        return this.f42x;
    }
}
