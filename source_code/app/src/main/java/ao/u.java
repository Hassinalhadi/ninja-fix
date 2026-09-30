package ao;

import android.widget.PopupWindow;

/* loaded from: classes3.dex */
public final class u implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v alpha;

    public u(v vVar) {
        this.alpha = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.alpha.charlie();
    }
}
