package G3;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] alpha;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        alpha = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            alpha[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            alpha[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            alpha[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
