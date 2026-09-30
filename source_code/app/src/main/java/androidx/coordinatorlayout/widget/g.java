package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout alpha;

    public g(CoordinatorLayout coordinatorLayout) {
        this.alpha = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.alpha.onChildViewsChanged(0);
        return true;
    }
}
