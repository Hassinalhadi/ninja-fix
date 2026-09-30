package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogInterfaceOnCancelListenerC0623s implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0627w alpha;

    public DialogInterfaceOnCancelListenerC0623s(DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w) {
        this.alpha = dialogInterfaceOnCancelListenerC0627w;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w = this.alpha;
        Dialog dialog = dialogInterfaceOnCancelListenerC0627w.e;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0627w.onCancel(dialog);
        }
    }
}
