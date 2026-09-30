package Y3;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] alpha;

    static {
        Bitmap.Config config;
        int[] iArr = new int[Bitmap.Config.values().length];
        alpha = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
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
            int[] iArr2 = alpha;
            config = Bitmap.Config.RGBA_F16;
            iArr2[config.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            alpha[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
