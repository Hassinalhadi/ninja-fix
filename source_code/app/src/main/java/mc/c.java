package mc;

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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmc/c;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class c extends AbstractC2111a {

    /* renamed from: u, reason: collision with root package name */
    public List f12971u = CollectionsKt.emptyList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean f12972v = true;

    /* renamed from: w, reason: collision with root package name */
    public J2.e f12973w;

    @Override // x9.AbstractC3307a
    public final void azure() {
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
        View inflate = inflater.inflate(R.layout.bottom_sheet_pointing_rules, viewGroup, false);
        int i4 = R.id.btn_close;
        ImageButton imageButton = (ImageButton) S3.bravo(R.id.btn_close, inflate);
        if (imageButton != null) {
            i4 = R.id.rv_rules;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rv_rules, inflate);
            if (recyclerView != null) {
                i4 = R.id.tv_title;
                if (((TextView) S3.bravo(R.id.tv_title, inflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f12973w = new J2.e(constraintLayout, imageButton, recyclerView, 2);
                    Intrinsics.delta(constraintLayout, "getRoot(...)");
                    return constraintLayout;
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
        Ca.c cVar = new Ca.c(15);
        J2.e eVar = this.f12973w;
        if (eVar != null) {
            ((RecyclerView) eVar.red).setAdapter(cVar);
            cVar.alpha(this.f12971u);
            J2.e eVar2 = this.f12973w;
            if (eVar2 != null) {
                ((ImageButton) eVar2.purple).setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(9, this));
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
    public final int whiskey() {
        return 2;
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF12972v() {
        return this.f12972v;
    }
}
