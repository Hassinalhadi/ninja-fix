package androidx.camera.core.internal.utils;

import bi.a;

/* loaded from: classes3.dex */
public final class ImageUtil$CodecFailedException extends Exception {
    private final a mFailureType;

    public ImageUtil$CodecFailedException(String str) {
        super(str);
        this.mFailureType = a.alpha;
    }

    public a getFailureType() {
        return this.mFailureType;
    }

    public ImageUtil$CodecFailedException(String str, a aVar) {
        super(str);
        this.mFailureType = aVar;
    }
}
