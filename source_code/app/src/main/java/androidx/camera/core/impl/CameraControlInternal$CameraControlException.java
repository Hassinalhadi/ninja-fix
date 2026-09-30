package androidx.camera.core.impl;

/* loaded from: classes3.dex */
public final class CameraControlInternal$CameraControlException extends Exception {
    private C0515m mCameraCaptureFailure;

    public CameraControlInternal$CameraControlException(C0515m c0515m) {
        this.mCameraCaptureFailure = c0515m;
    }

    public C0515m getCameraCaptureFailure() {
        return this.mCameraCaptureFailure;
    }

    public CameraControlInternal$CameraControlException(C0515m c0515m, Throwable th) {
        super(th);
        this.mCameraCaptureFailure = c0515m;
    }
}
