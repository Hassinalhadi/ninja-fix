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
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import t6.S3;
import ya.C3407c;
import ya.C3408d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAa/p;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class p extends c {

    /* renamed from: v, reason: collision with root package name */
    public C3407c f52v;

    /* renamed from: w, reason: collision with root package name */
    public C3408d f53w;

    /* renamed from: y, reason: collision with root package name */
    public aw f55y;

    /* renamed from: z, reason: collision with root package name */
    public final Ca.c f56z;

    /* renamed from: u, reason: collision with root package name */
    public List f51u = CollectionsKt.emptyList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean f54x = true;

    public p() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new g(5, new g(4, this)));
        new ab(u.alpha.bravo(AuthViewModel.class), new h(alpha, 4), new i(2, this, alpha), new h(alpha, 5));
        this.f56z = new Ca.c(22);
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_select_platform, viewGroup, false);
        int i4 = R.id.btnClose;
        if (((ImageButton) S3.bravo(R.id.btnClose, inflate)) != null) {
            i4 = R.id.rvPlatforms;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rvPlatforms, inflate);
            if (recyclerView != null) {
                i4 = R.id.tv_title;
                if (((TextView) S3.bravo(R.id.tv_title, inflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f55y = new aw(constraintLayout, recyclerView);
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
        C3408d c3408d = this.f53w;
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
        aw awVar = this.f55y;
        if (awVar != null) {
            RecyclerView recyclerView = awVar.alpha;
            Ca.c cVar = this.f56z;
            recyclerView.setAdapter(cVar);
            cVar.bravo(this.f51u);
            cVar.bravo = new D8.c(3, this);
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF54x() {
        return this.f54x;
    }
}
