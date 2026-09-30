package Ba;

import B2.q;
import B9.ab;
import J2.t;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBa/n;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class n extends k {
    public final Ca.c A;

    /* renamed from: u, reason: collision with root package name */
    public a f740u;

    /* renamed from: v, reason: collision with root package name */
    public q f741v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f742w = true;

    /* renamed from: x, reason: collision with root package name */
    public final ab f743x;

    /* renamed from: y, reason: collision with root package name */
    public List f744y;

    /* renamed from: z, reason: collision with root package name */
    public t f745z;

    public n() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Aa.g(8, new Aa.g(7, this)));
        this.f743x = new ab(u.alpha.bravo(AuthViewModel.class), new Aa.h(alpha, 6), new Aa.i(3, this, alpha), new Aa.h(alpha, 7));
        this.A = new Ca.c(0);
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final t bronze() {
        t tVar = this.f745z;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_select_nationality, viewGroup, false);
        int i4 = R.id.btnClose;
        if (((ImageButton) S3.bravo(R.id.btnClose, inflate)) != null) {
            i4 = R.id.etSearch;
            TextInputEditText textInputEditText = (TextInputEditText) S3.bravo(R.id.etSearch, inflate);
            if (textInputEditText != null) {
                i4 = R.id.rvNationalities;
                RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rvNationalities, inflate);
                if (recyclerView != null) {
                    i4 = R.id.searchInputLayout;
                    if (((TextInputLayout) S3.bravo(R.id.searchInputLayout, inflate)) != null) {
                        i4 = R.id.title;
                        if (((TextView) S3.bravo(R.id.title, inflate)) != null) {
                            this.f745z = new t((ConstraintLayout) inflate, textInputEditText, recyclerView);
                            return (ConstraintLayout) bronze().alpha;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
        q qVar = this.f741v;
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
        RecyclerView recyclerView = (RecyclerView) bronze().red;
        Ca.c cVar = this.A;
        recyclerView.setAdapter(cVar);
        List cachedNationalities = ((AuthViewModel) this.f743x.getValue()).getCachedNationalities();
        if (cachedNationalities == null) {
            cachedNationalities = CollectionsKt.emptyList();
        }
        Intrinsics.echo(cachedNationalities, "<set-?>");
        this.f744y = cachedNationalities;
        cVar.bravo(cachedNationalities);
        ((TextInputEditText) bronze().purple).addTextChangedListener(new h(1, this));
        t bronze = bronze();
        ((TextInputEditText) bronze.purple).setOnEditorActionListener(new l(0, this));
        t bronze2 = bronze();
        ((TextInputEditText) bronze2.purple).setOnFocusChangeListener(new m(0, this));
        cVar.bravo = new Aa.m(5, this);
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF2171w() {
        return this.f742w;
    }
}
