package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC0624t implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0627w alpha;

    public DialogInterfaceOnDismissListenerC0624t(DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w) {
        this.alpha = dialogInterfaceOnCancelListenerC0627w;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w = this.alpha;
        Dialog dialog = dialogInterfaceOnCancelListenerC0627w.e;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0627w.onDismiss(dialog);
        }
    }
}
