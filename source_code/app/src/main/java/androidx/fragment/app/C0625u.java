package androidx.fragment.app;

import android.util.Log;
import android.view.View;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0625u implements androidx.lifecycle.A {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0627w alpha;

    public C0625u(DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w) {
        this.alpha = dialogInterfaceOnCancelListenerC0627w;
    }

    @Override // androidx.lifecycle.A
    public final void onChanged(Object obj) {
        if (((androidx.lifecycle.al) obj) != null) {
            DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w = this.alpha;
            if (dialogInterfaceOnCancelListenerC0627w.f3120a) {
                View requireView = dialogInterfaceOnCancelListenerC0627w.requireView();
                if (requireView.getParent() == null) {
                    if (dialogInterfaceOnCancelListenerC0627w.e != null) {
                        if (L.gray(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0627w.e);
                        }
                        dialogInterfaceOnCancelListenerC0627w.e.setContentView(requireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
