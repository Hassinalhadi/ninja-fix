package y5;

import android.widget.ImageView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] alpha;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        alpha = iArr;
        try {
            iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}
