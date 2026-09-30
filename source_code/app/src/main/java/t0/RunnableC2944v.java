package t0;

import android.view.MotionEvent;
import android.view.View;
import com.google.firebase.perf.metrics.AppStartTrace;
import y1.C3391d;

/* renamed from: t0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2944v implements Runnable {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ RunnableC2944v(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C2946x c2946x = (C2946x) this.purple;
                c2946x.removeCallbacks(this);
                MotionEvent motionEvent = c2946x.f13897l0;
                if (motionEvent != null) {
                    boolean z2 = false;
                    if (motionEvent.getToolType(0) == 3) {
                        z2 = true;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (z2) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i4 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i4 = 2;
                    }
                    C2946x c2946x2 = (C2946x) this.purple;
                    c2946x2.bronze(motionEvent, i4, c2946x2.f13899m0, false);
                    return;
                }
                return;
            case 1:
                AppStartTrace appStartTrace = (AppStartTrace) this.purple;
                if (appStartTrace.f8287b == null) {
                    appStartTrace.f8295k = true;
                    return;
                }
                return;
            case 2:
                ((C3391d) this.purple).papa(0);
                return;
            default:
                synchronized (this) {
                    ((z1.g) this.purple).purple = false;
                }
                do {
                } while (z1.g.f14185d.poll() != null);
                if (!((z1.g) this.purple).red.isAttachedToWindow()) {
                    View view = ((z1.g) this.purple).red;
                    com.google.android.material.internal.ac acVar = z1.g.e;
                    view.removeOnAttachStateChangeListener(acVar);
                    ((z1.g) this.purple).red.addOnAttachStateChangeListener(acVar);
                    return;
                }
                ((z1.g) this.purple).hotel();
                return;
        }
    }
}
