package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;

/* loaded from: classes3.dex */
public class r extends J2.e {
    public static boolean O(RuntimeException runtimeException) {
        boolean z2;
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if (runtimeException.getClass().equals(RuntimeException.class) && (stackTrace = runtimeException.getStackTrace()) != null && stackTrace.length >= 0) {
                z2 = "_enableShutterSound".equals(stackTrace[0].getMethodName());
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Override // J2.e
    public CameraCharacteristics C(String str) {
        try {
            return super.C(str);
        } catch (RuntimeException e) {
            if (O(e)) {
                throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB, e);
            }
            throw e;
        }
    }

    @Override // J2.e
    public void G(String str, bd.h hVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.purple).openCamera(str, hVar, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e4) {
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e10) {
            if (O(e10)) {
                throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB, e10);
            }
            throw e10;
        }
    }

    @Override // J2.e
    public final void I(bd.h hVar, av.o oVar) {
        ((CameraManager) this.purple).registerAvailabilityCallback(hVar, oVar);
    }

    @Override // J2.e
    public final void M(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.purple).unregisterAvailabilityCallback(availabilityCallback);
    }
}
