package Gb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import delivery.samurai.android.R;
import g.C1718a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s1.b0;
import s1.d0;
import t6.AbstractC3087z;
import t6.ab;
import x9.AbstractC3309c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGb/w;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class w extends AbstractC3309c {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final Dialog mike(Bundle bundle) {
        ab b0Var;
        Dialog dialog = new Dialog(requireContext(), R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window != null) {
            AbstractC3087z.charlie(window, false);
            window.setLayout(-1, -1);
            window.setBackgroundDrawableResource(android.R.color.black);
            window.addFlags(768);
            C1718a c1718a = new C1718a(window.getDecorView());
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 35) {
                b0Var = new d0(window, c1718a);
            } else if (i4 >= 30) {
                b0Var = new d0(window, c1718a);
            } else if (i4 >= 26) {
                b0Var = new b0(window, c1718a);
            } else {
                b0Var = new b0(window, c1718a);
            }
            b0Var.alpha(1);
            b0Var.foxtrot();
        }
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new P.d(new Cb.a(2, this, dialog), -472710088, true));
        dialog.setContentView(composeView);
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
    }
}
