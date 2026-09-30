package Aa;

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
import java.util.ArrayList;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAa/n;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class n extends b {
    public final k9.d A;

    /* renamed from: v, reason: collision with root package name */
    public C3407c f46v;

    /* renamed from: w, reason: collision with root package name */
    public C3408d f47w;

    /* renamed from: y, reason: collision with root package name */
    public final ab f49y;

    /* renamed from: z, reason: collision with root package name */
    public av f50z;

    /* renamed from: u, reason: collision with root package name */
    public List f45u = CollectionsKt.emptyList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean f48x = true;

    public n() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new g(3, new g(2, this)));
        this.f49y = new ab(u.alpha.bravo(AuthViewModel.class), new h(alpha, 2), new i(1, this, alpha), new h(alpha, 3));
        this.A = new k9.d();
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
        View inflate = inflater.inflate(R.layout.dialog_select_country, viewGroup, false);
        int i4 = R.id.btnClose;
        if (((ImageButton) S3.bravo(R.id.btnClose, inflate)) != null) {
            i4 = R.id.rvCountries;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rvCountries, inflate);
            if (recyclerView != null) {
                i4 = R.id.tv_title;
                if (((TextView) S3.bravo(R.id.tv_title, inflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f50z = new av(constraintLayout, recyclerView);
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
        C3408d c3408d = this.f47w;
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
        av avVar = this.f50z;
        if (avVar != null) {
            RecyclerView recyclerView = avVar.alpha;
            k9.d dVar = this.A;
            recyclerView.setAdapter(dVar);
            List list = this.f45u;
            ArrayList arrayList = (ArrayList) dVar.charlie;
            arrayList.clear();
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(list);
            }
            dVar.notifyDataSetChanged();
            av avVar2 = this.f50z;
            if (avVar2 != null) {
                avVar2.alpha.addOnScrollListener(new e(1, this));
                ((AuthViewModel) this.f49y.getValue()).getCountriesLiveData().observe(getViewLifecycleOwner(), new f(1, new l(0, this)));
                dVar.delta = new m(0, this);
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF48x() {
        return this.f48x;
    }
}
