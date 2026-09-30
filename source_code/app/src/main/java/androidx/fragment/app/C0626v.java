package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0626v extends aq {
    public final /* synthetic */ aq alpha;
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0627w purple;

    public C0626v(DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w, aq aqVar) {
        this.purple = dialogInterfaceOnCancelListenerC0627w;
        this.alpha = aqVar;
    }

    @Override // androidx.fragment.app.aq
    public final View bravo(int i4) {
        aq aqVar = this.alpha;
        if (aqVar.charlie()) {
            return aqVar.bravo(i4);
        }
        Dialog dialog = this.purple.e;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // androidx.fragment.app.aq
    public final boolean charlie() {
        if (!this.alpha.charlie() && !this.purple.f3127i) {
            return false;
        }
        return true;
    }
}
