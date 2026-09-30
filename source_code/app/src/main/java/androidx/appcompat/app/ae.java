package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;

/* loaded from: classes3.dex */
public class ae extends DialogInterfaceOnCancelListenerC0627w {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public Dialog mike(Bundle bundle) {
        return new ad(getContext(), this.white);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final void quebec(Dialog dialog, int i4) {
        if (dialog instanceof ad) {
            ad adVar = (ad) dialog;
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            adVar.supportRequestWindowFeature(1);
            return;
        }
        super.quebec(dialog, i4);
    }
}
