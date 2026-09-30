package y5;

import android.view.ScaleGestureDetector;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC3398a implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ C3399b alpha;

    public ScaleGestureDetectorOnScaleGestureListenerC3398a(C3399b c3399b) {
        this.alpha = c3399b;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
            this.alpha.juliet.foxtrot(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
