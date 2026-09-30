package av;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC0512j;

/* loaded from: classes3.dex */
public final class ae extends AbstractC0512j {
    public final CameraCaptureSession.CaptureCallback alpha;

    public ae(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.alpha = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
