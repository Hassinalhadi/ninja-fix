package t0;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.VibratorManager;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class aj {
    public static /* bridge */ /* synthetic */ VibratorManager bravo(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession charlie(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget delta(C2946x c2946x, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(c2946x, rect, point, scrollCaptureCallback);
    }
}
