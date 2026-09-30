package a4;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        try {
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
