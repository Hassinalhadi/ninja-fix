package y5;

import android.widget.ImageView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] alpha;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        alpha = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            alpha[ImageView.ScaleType.FIT_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            alpha[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            alpha[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
