package Yb;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/W;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class W extends az {

    /* renamed from: u, reason: collision with root package name */
    public Ac.l f2343u;

    /* renamed from: w, reason: collision with root package name */
    public J2.t f2345w;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2344v = true;

    /* renamed from: x, reason: collision with root package name */
    public final V f2346x = new V(this);

    @Override // x9.AbstractC3307a
    public final void azure() {
        J2.t bronze = bronze();
        ((Button) bronze.purple).setOnClickListener(new Fb.b(this, 26));
    }

    public final J2.t bronze() {
        J2.t tVar = this.f2345w;
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
        View inflate = inflater.inflate(R.layout.dialog_order_complete_v2, viewGroup, false);
        int i4 = R.id.button;
        Button button = (Button) S3.bravo(R.id.button, inflate);
        if (button != null) {
            i4 = R.id.progress;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) S3.bravo(R.id.progress, inflate);
            if (circularProgressIndicator != null) {
                i4 = R.id.textView11;
                if (((TextView) S3.bravo(R.id.textView11, inflate)) != null) {
                    this.f2345w = new J2.t((ConstraintLayout) inflate, button, circularProgressIndicator);
                    return (ConstraintLayout) bronze().alpha;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
        this.f2346x.cancel();
        Ac.l lVar = this.f2343u;
        if (lVar != null) {
            lVar.invoke();
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onPause() {
        super.onPause();
        this.f2346x.cancel();
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        if (!this.f14101q) {
            return;
        }
        this.f2346x.start();
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF2434v() {
        return this.f2344v;
    }
}
