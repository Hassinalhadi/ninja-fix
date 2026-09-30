package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class CameraAccessExceptionCompat extends Exception {
    public static final int CAMERA_DEPRECATED_HAL = 1000;
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int MAX_CAMERAS_IN_USE = 5;
    private final CameraAccessException mCameraAccessException;
    private final int mReason;
    static final Set<Integer> PLATFORM_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 10001;
    public static final int CAMERA_CHARACTERISTICS_CREATION_ERROR = 10002;
    static final Set<Integer> COMPAT_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf(CAMERA_UNAVAILABLE_DO_NOT_DISTURB), Integer.valueOf(CAMERA_CHARACTERISTICS_CREATION_ERROR))));

    public CameraAccessExceptionCompat(int i4) {
        super(getDefaultMessage(i4));
        this.mReason = i4;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i4)) ? new CameraAccessException(i4) : null;
    }

    private static String getCombinedMessage(int i4, String str) {
        return String.format("%s (%d): %s", getProblemString(i4), Integer.valueOf(i4), str);
    }

    private static String getDefaultMessage(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            if (i4 != 10001) {
                                if (i4 != 10002) {
                                    return null;
                                }
                                return "Failed to create CameraCharacteristics.";
                            }
                            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
                        }
                        return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
                    }
                    return "The camera device is in use already";
                }
                return "The camera device is currently in the error state; no further calls to it will succeed.";
            }
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        return "The camera is disabled due to a device policy, and cannot be opened.";
    }

    private static String getProblemString(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            if (i4 != 1000) {
                                if (i4 != 10001) {
                                    if (i4 != 10002) {
                                        return "<UNKNOWN ERROR>";
                                    }
                                    return "CAMERA_CHARACTERISTICS_CREATION_ERROR";
                                }
                                return "CAMERA_UNAVAILABLE_DO_NOT_DISTURB";
                            }
                            return "CAMERA_DEPRECATED_HAL";
                        }
                        return "MAX_CAMERAS_IN_USE";
                    }
                    return "CAMERA_IN_USE";
                }
                return "CAMERA_ERROR";
            }
            return "CAMERA_DISCONNECTED";
        }
        return "CAMERA_DISABLED";
    }

    public static CameraAccessExceptionCompat toCameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int getReason() {
        return this.mReason;
    }

    public CameraAccessException toCameraAccessException() {
        return this.mCameraAccessException;
    }

    public CameraAccessExceptionCompat(int i4, String str) {
        super(getCombinedMessage(i4, str));
        this.mReason = i4;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i4)) ? new CameraAccessException(i4, str) : null;
    }

    public CameraAccessExceptionCompat(int i4, String str, Throwable th) {
        super(getCombinedMessage(i4, str), th);
        this.mReason = i4;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i4)) ? new CameraAccessException(i4, str, th) : null;
    }

    public CameraAccessExceptionCompat(int i4, Throwable th) {
        super(getDefaultMessage(i4), th);
        this.mReason = i4;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i4)) ? new CameraAccessException(i4, null, th) : null;
    }

    private CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }
}
