package androidx.camera.core;

/* loaded from: classes3.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i4, String str, Throwable th) {
        super(str, th);
        this.mImageCaptureError = i4;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
