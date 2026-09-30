package bv;

import kotlin.collections.ArraysKt;

/* loaded from: classes3.dex */
public abstract class i {
    public static final float[] alpha;

    static {
        int i4;
        long[] jArr = au.alpha;
        int delta = au.delta(0);
        if (delta > 0) {
            i4 = Math.max(7, au.charlie(delta));
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            jArr = new long[((i4 + 15) & (-8)) >> 3];
            ArraysKt.cyan(jArr, -9187201950435737472L);
        }
        int i5 = i4 >> 3;
        long j5 = 255 << ((i4 & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        float[] fArr = new float[i4];
        alpha = new float[0];
    }
}
