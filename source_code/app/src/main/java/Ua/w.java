package Ua;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.an;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa/w;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public class w extends b {

    /* renamed from: u, reason: collision with root package name */
    public D8.c f2155u;

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        beige();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_signed_up, viewGroup, false);
        int i4 = R.id.message;
        if (((TextView) S3.bravo(R.id.message, inflate)) != null) {
            i4 = R.id.tick;
            if (((ImageView) S3.bravo(R.id.tick, inflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.f2155u = new D8.c(5, constraintLayout);
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
        an activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        D8.c cVar = this.f2155u;
        if (cVar != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat((ConstraintLayout) cVar.purple, "scaleX", 0.0f, 1.0f).setDuration(3000L);
            duration.addListener(new Object());
            duration.start();
            D8.c cVar2 = this.f2155u;
            if (cVar2 != null) {
                ObjectAnimator.ofFloat((ConstraintLayout) cVar2.purple, "scaleY", 0.0f, 1.0f).setDuration(3000L).start();
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
