package t0;

import android.view.View;

/* loaded from: classes3.dex */
public final class J0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View alpha;
    public final /* synthetic */ androidx.compose.runtime.Y purple;

    public J0(View view, androidx.compose.runtime.Y y10) {
        this.alpha = view;
        this.purple = y10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.alpha.removeOnAttachStateChangeListener(this);
        this.purple.amber();
    }
}
