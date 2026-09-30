package Yb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/q;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: Yb.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0325q extends av {

    /* renamed from: u, reason: collision with root package name */
    public C0312j0 f2433u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2434v = true;

    /* renamed from: w, reason: collision with root package name */
    public J2.t f2435w;

    @Override // x9.AbstractC3307a
    public final void azure() {
        J2.t tVar = this.f2435w;
        if (tVar != null) {
            ((ImageButton) tVar.purple).setOnClickListener(new ViewOnClickListenerC0323p(this, 2));
        } else {
            Intrinsics.lima("binding");
            throw null;
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
        View inflate = inflater.inflate(R.layout.dialog_confirm_order_cod_delivery_v2, viewGroup, false);
        int i4 = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnCancel, inflate);
        if (materialButton != null) {
            i4 = R.id.btnClose;
            ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnClose, inflate);
            if (imageButton != null) {
                i4 = R.id.btnNext;
                MaterialButton materialButton2 = (MaterialButton) S3.bravo(R.id.btnNext, inflate);
                if (materialButton2 != null) {
                    i4 = R.id.tvTitle;
                    if (((TextView) S3.bravo(R.id.tvTitle, inflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        this.f2435w = new J2.t(constraintLayout, materialButton, imageButton, materialButton2);
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        J2.t tVar = this.f2435w;
        if (tVar != null) {
            ((MaterialButton) tVar.red).setOnClickListener(new ViewOnClickListenerC0323p(this, 0));
            J2.t tVar2 = this.f2435w;
            if (tVar2 != null) {
                ((MaterialButton) tVar2.alpha).setOnClickListener(new ViewOnClickListenerC0323p(this, 1));
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
    public final boolean getF2437v() {
        return this.f2434v;
    }
}
