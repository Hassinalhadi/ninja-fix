package s6;

import g0.C1726f;

/* renamed from: s6.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2674i0 {
    public static C1726f alpha;

    public static String alpha(int i4, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder("$");
        for (int i5 = 0; i5 < i4; i5++) {
            int i10 = iArr[i5];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    sb2.append('.');
                    String str = strArr[i5];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i5]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }
}
