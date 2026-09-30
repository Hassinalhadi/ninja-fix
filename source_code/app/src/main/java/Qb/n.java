package Qb;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb/n;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class n extends c {

    /* renamed from: t, reason: collision with root package name */
    public w.o f1935t;

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        xray();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_prepared_order, viewGroup, false);
        int i4 = R.id.btnOk;
        Button button = (Button) S3.bravo(R.id.btnOk, inflate);
        if (button != null) {
            i4 = R.id.info;
            TextView textView = (TextView) S3.bravo(R.id.info, inflate);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.f1935t = new w.o(constraintLayout, button, textView, 3);
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        w.o oVar = this.f1935t;
        String str = null;
        if (oVar != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("backendId");
            }
            if (str == null) {
                str = "";
            }
            ((TextView) oVar.red).setText(getString(R.string.order_prepared_message, str));
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
        w.o oVar = this.f1935t;
        if (oVar != null) {
            ((Button) oVar.purple).setOnClickListener(new Fb.b(this, 10));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }
}
