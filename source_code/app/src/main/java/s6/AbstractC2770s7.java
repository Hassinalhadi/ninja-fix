package s6;

import pf.C2359i;

/* renamed from: s6.s7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2770s7 {
    public static final int alpha(int i4, int i5, int i10) {
        if (i10 > 0) {
            if (i4 < i5) {
                int i11 = i5 % i10;
                if (i11 < 0) {
                    i11 += i10;
                }
                int i12 = i4 % i10;
                if (i12 < 0) {
                    i12 += i10;
                }
                int i13 = (i11 - i12) % i10;
                if (i13 < 0) {
                    i13 += i10;
                }
                return i5 - i13;
            }
        } else if (i10 < 0) {
            if (i4 > i5) {
                int i14 = -i10;
                int i15 = i4 % i14;
                if (i15 < 0) {
                    i15 += i14;
                }
                int i16 = i5 % i14;
                if (i16 < 0) {
                    i16 += i14;
                }
                int i17 = (i15 - i16) % i14;
                if (i17 < 0) {
                    i17 += i14;
                }
                return i17 + i5;
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.i, java.lang.Object, Nd.c] */
    public static C2359i bravo(Xd.l lVar) {
        ?? obj = new Object();
        obj.silver = J6.alpha(obj, obj, lVar);
        return obj;
    }
}
