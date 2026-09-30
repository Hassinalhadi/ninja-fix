package s1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: s1.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC2589w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View alpha;
    public ViewTreeObserver purple;
    public final Runnable red;

    public ViewTreeObserverOnPreDrawListenerC2589w(View view, Runnable runnable) {
        this.alpha = view;
        this.purple = view.getViewTreeObserver();
        this.red = runnable;
    }

    public static void alpha(View view, Runnable runnable) {
        if (view != null) {
            ViewTreeObserverOnPreDrawListenerC2589w viewTreeObserverOnPreDrawListenerC2589w = new ViewTreeObserverOnPreDrawListenerC2589w(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2589w);
            view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2589w);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.purple.isAlive();
        View view = this.alpha;
        if (isAlive) {
            this.purple.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.red.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.purple = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.purple.isAlive();
        View view2 = this.alpha;
        if (isAlive) {
            this.purple.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
