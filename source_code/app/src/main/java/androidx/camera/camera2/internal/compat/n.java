package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import aw.v;

/* loaded from: classes3.dex */
public final class n extends m {
    @Override // androidx.camera.camera2.internal.compat.m, w.o
    public final void romeo(v vVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) vVar.alpha.alpha();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.purple).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
