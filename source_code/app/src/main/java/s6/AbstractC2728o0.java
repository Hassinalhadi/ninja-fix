package s6;

import android.graphics.Typeface;

/* renamed from: s6.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2728o0 {
    public static final int alpha(float[] fArr) {
        int i4;
        int i5 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        if (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i5 = 1;
        }
        return (i4 << 1) | i5;
    }

    public abstract void bravo(int i4);

    public abstract void charlie(Typeface typeface, boolean z2);
}
