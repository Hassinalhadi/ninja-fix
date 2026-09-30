package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* loaded from: classes3.dex */
public final class t extends s {
    @Override // J2.e
    public final Set D() {
        try {
            return ((CameraManager) this.purple).getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
