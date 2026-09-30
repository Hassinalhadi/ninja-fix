package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes3.dex */
public final class as implements PopupWindow.OnDismissListener {
    public final /* synthetic */ an alpha;
    public final /* synthetic */ at purple;

    public as(at atVar, an anVar) {
        this.purple = atVar;
        this.alpha = anVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.purple.A.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.alpha);
        }
    }
}
