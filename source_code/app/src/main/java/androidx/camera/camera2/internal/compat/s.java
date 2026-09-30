package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;

/* loaded from: classes3.dex */
public class s extends r {
    @Override // androidx.camera.camera2.internal.compat.r, J2.e
    public final CameraCharacteristics C(String str) {
        try {
            return ((CameraManager) this.purple).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.r, J2.e
    public final void G(String str, bd.h hVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.purple).openCamera(str, hVar, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
