package Ea;

import Aa.l;
import B2.q;
import B9.ab;
import B9.av;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEa/g;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class g extends f {

    /* renamed from: u, reason: collision with root package name */
    public b f979u;

    /* renamed from: v, reason: collision with root package name */
    public q f980v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f981w = true;

    /* renamed from: x, reason: collision with root package name */
    public final ab f982x;

    /* renamed from: y, reason: collision with root package name */
    public av f983y;

    /* renamed from: z, reason: collision with root package name */
    public final Ca.c f984z;

    public g() {
        Lazy alpha = LazyKt.alpha(i.purple, new Aa.g(13, new Aa.g(12, this)));
        this.f982x = new ab(u.alpha.bravo(AuthViewModel.class), new Aa.h(alpha, 12), new Aa.i(8, this, alpha), new Aa.h(alpha, 13));
        this.f984z = new Ca.c(1);
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
        View inflate = inflater.inflate(R.layout.dialog_select_bank, viewGroup, false);
        int i4 = R.id.btnClose;
        if (((ImageButton) S3.bravo(R.id.btnClose, inflate)) != null) {
            i4 = R.id.rvBanks;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rvBanks, inflate);
            if (recyclerView != null) {
                i4 = R.id.title;
                if (((TextView) S3.bravo(R.id.title, inflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f983y = new av(constraintLayout, recyclerView);
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
        q qVar = this.f980v;
        if (qVar != null) {
            qVar.invoke();
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f14101q) {
            return;
        }
        av avVar = this.f983y;
        if (avVar != null) {
            RecyclerView recyclerView = avVar.alpha;
            Ca.c cVar = this.f984z;
            recyclerView.setAdapter(cVar);
            ((AuthViewModel) this.f982x.getValue()).getBanks().observe(this, new Aa.f(4, new l(5, this)));
            cVar.bravo = new D8.c(10, this);
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF981w() {
        return this.f981w;
    }
}
