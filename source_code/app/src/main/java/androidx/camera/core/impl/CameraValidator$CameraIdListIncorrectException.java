package androidx.camera.core.impl;

/* loaded from: classes3.dex */
public class CameraValidator$CameraIdListIncorrectException extends Exception {
    private int mAvailableCameraCount;

    public CameraValidator$CameraIdListIncorrectException(String str, int i4, Throwable th) {
        super(str, th);
        this.mAvailableCameraCount = i4;
    }

    public int getAvailableCameraCount() {
        return this.mAvailableCameraCount;
    }
}
