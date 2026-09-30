package a4;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ag extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ CropOverlayView alpha;

    public ag(CropOverlayView cropOverlayView) {
        this.alpha = cropOverlayView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.echo(detector, "detector");
        CropOverlayView cropOverlayView = this.alpha;
        RectF foxtrot = cropOverlayView.yellow.foxtrot();
        float focusX = detector.getFocusX();
        float focusY = detector.getFocusY();
        float f5 = 2;
        float currentSpanY = detector.getCurrentSpanY() / f5;
        float currentSpanX = detector.getCurrentSpanX() / f5;
        float f10 = focusY - currentSpanY;
        float f11 = focusX - currentSpanX;
        float f12 = focusX + currentSpanX;
        float f13 = focusY + currentSpanY;
        if (f11 < f12 && f10 <= f13 && f11 >= 0.0f) {
            ai aiVar = cropOverlayView.yellow;
            if (f12 <= aiVar.charlie() && f10 >= 0.0f && f13 <= aiVar.bravo()) {
                foxtrot.set(f11, f10, f12, f13);
                aiVar.alpha.set(foxtrot);
                cropOverlayView.invalidate();
                return true;
            }
            return true;
        }
        return true;
    }
}
