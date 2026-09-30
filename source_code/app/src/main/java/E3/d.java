package E3;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] alpha;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        alpha = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            alpha[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            alpha[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
