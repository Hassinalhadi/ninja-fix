package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: androidx.appcompat.widget.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC0464k0 implements View.OnTouchListener {
    public final /* synthetic */ C0466l0 alpha;

    public ViewOnTouchListenerC0464k0(C0466l0 c0466l0) {
        this.alpha = c0466l0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        af afVar;
        int action = motionEvent.getAction();
        int x4 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        C0466l0 c0466l0 = this.alpha;
        if (action == 0 && (afVar = c0466l0.f2900s) != null && afVar.isShowing() && x4 >= 0 && x4 < c0466l0.f2900s.getWidth() && y10 >= 0 && y10 < c0466l0.f2900s.getHeight()) {
            c0466l0.f2896o.postDelayed(c0466l0.f2892k, 250L);
            return false;
        }
        if (action == 1) {
            c0466l0.f2896o.removeCallbacks(c0466l0.f2892k);
            return false;
        }
        return false;
    }
}
