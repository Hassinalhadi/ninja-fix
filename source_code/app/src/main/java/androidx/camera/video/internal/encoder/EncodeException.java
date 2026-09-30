package androidx.camera.video.internal.encoder;

/* loaded from: classes3.dex */
public class EncodeException extends Exception {
    public static final int ERROR_CODEC = 1;
    public static final int ERROR_UNKNOWN = 0;
    private final int mErrorType;

    public EncodeException(int i4, String str, Throwable th) {
        super(str, th);
        this.mErrorType = i4;
    }

    public int getErrorType() {
        return this.mErrorType;
    }
}
