package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.appcompat.widget.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0446b0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractViewOnTouchListenerC0448c0 purple;

    public /* synthetic */ RunnableC0446b0(AbstractViewOnTouchListenerC0448c0 abstractViewOnTouchListenerC0448c0, int i4) {
        this.alpha = i4;
        this.purple = abstractViewOnTouchListenerC0448c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ViewParent parent = this.purple.silver.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC0448c0 abstractViewOnTouchListenerC0448c0 = this.purple;
                abstractViewOnTouchListenerC0448c0.alpha();
                View view = abstractViewOnTouchListenerC0448c0.silver;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0448c0.charlie()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0448c0.yellow = true;
                    return;
                }
                return;
        }
    }
}
