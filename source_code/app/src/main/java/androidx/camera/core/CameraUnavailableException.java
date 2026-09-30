package androidx.camera.core;

/* loaded from: classes3.dex */
public class CameraUnavailableException extends Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;
    private final int mReason;

    public CameraUnavailableException(int i4) {
        this.mReason = i4;
    }

    public int getReason() {
        return this.mReason;
    }

    public CameraUnavailableException(int i4, String str) {
        super(str);
        this.mReason = i4;
    }

    public CameraUnavailableException(int i4, String str, Throwable th) {
        super(str, th);
        this.mReason = i4;
    }

    public CameraUnavailableException(int i4, Throwable th) {
        super(th);
        this.mReason = i4;
    }
}
