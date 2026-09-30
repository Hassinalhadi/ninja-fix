package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class h extends J2.l {
    @Override // J2.l
    public final int golf(ArrayList arrayList, bd.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.alpha).captureBurstRequests(arrayList, hVar, captureCallback);
    }

    @Override // J2.l
    public final int papa(CaptureRequest captureRequest, bd.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.alpha).setSingleRepeatingRequest(captureRequest, hVar, captureCallback);
    }
}
