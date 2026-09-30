package Xa;

import B9.ab;
import J2.n;
import Lb.C;
import O7.j;
import Qb.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import s6.AbstractC2661g5;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LXa/g;", "Lx9/a;", "<init>", "()V", "Xa/c", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class g extends i {
    public n A;
    public List B;
    public b C;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f2244u;

    /* renamed from: v, reason: collision with root package name */
    public final String f2245v;

    /* renamed from: w, reason: collision with root package name */
    public final c f2246w;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f2247x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2248y;

    /* renamed from: z, reason: collision with root package name */
    public final ab f2249z;

    public g() {
        this.f2246w = c.purple;
        this.f2248y = true;
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C(26, new C(25, this)));
        this.f2249z = new ab(u.alpha.bravo(AuthViewModel.class), new l(alpha, 16), new f(0, this, alpha), new l(alpha, 17));
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final n bronze() {
        n nVar = this.A;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        beige();
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_country_selectioin, viewGroup, false);
        int i4 = R.id.btnClose;
        if (((ImageButton) S3.bravo(R.id.btnClose, inflate)) != null) {
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
            if (recyclerView != null) {
                i4 = R.id.searchView;
                SearchView searchView = (SearchView) S3.bravo(R.id.searchView, inflate);
                if (searchView != null) {
                    i4 = R.id.title;
                    TextView textView = (TextView) S3.bravo(R.id.title, inflate);
                    if (textView != null) {
                        this.A = new n((ConstraintLayout) inflate, recyclerView, searchView, textView);
                        return (ConstraintLayout) bronze().alpha;
                    }
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
        Integer num = this.f2244u;
        String str = this.f2245v;
        c cVar = this.f2246w;
        this.C = new b(num, str, cVar);
        n bronze = bronze();
        b bVar = this.C;
        if (bVar != null) {
            ((RecyclerView) bronze.purple).setAdapter(bVar);
            AbstractC2661g5.bravo((RecyclerView) bronze().purple, R.dimen.spacing_12, R.dimen.spacing_6);
            AbstractC2661g5.alpha((RecyclerView) bronze().purple, R.dimen.spacing_12, R.dimen.spacing_12);
            if (cVar == c.alpha) {
                ((AuthViewModel) this.f2249z.getValue()).getNationalities().observe(this, new Aa.f(19, new Aa.l(29, this)));
                ((TextView) bronze().silver).setText(R.string.select_nationality);
                ((SearchView) bronze().red).setVisibility(0);
                n bronze2 = bronze();
                ((SearchView) bronze2.red).setOnQueryTextListener(new O7.l(17, this));
            }
            b bVar2 = this.C;
            if (bVar2 != null) {
                bVar2.bravo = new j(17, this);
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
    public final boolean getF2248y() {
        return this.f2248y;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Integer num, String str, c type, Function1 function1) {
        this();
        Intrinsics.echo(type, "type");
        this.f2244u = num;
        this.f2245v = str;
        this.f2246w = type;
        this.f2247x = function1;
        this.f14101q = true;
    }
}
