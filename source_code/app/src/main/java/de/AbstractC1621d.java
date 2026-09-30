package de;

import s6.AbstractC2808x0;

/* renamed from: de.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1621d {
    public static final AbstractC1618a alpha;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [de.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        ?? r02;
        Integer num = Td.a.alpha;
        if (num != null && num.intValue() < 34) {
            r02 = new C1619b();
        } else {
            r02 = new Object();
        }
        alpha = r02;
    }

    public abstract int alpha(int i4);

    public abstract int bravo();

    public int charlie(int i4, int i5) {
        int bravo;
        int i10;
        int i11;
        if (i5 > i4) {
            int i12 = i5 - i4;
            if (i12 > 0 || i12 == Integer.MIN_VALUE) {
                if (((-i12) & i12) == i12) {
                    i11 = alpha(31 - Integer.numberOfLeadingZeros(i12));
                    return i4 + i11;
                }
                do {
                    bravo = bravo() >>> 1;
                    i10 = bravo % i12;
                } while ((i12 - 1) + (bravo - i10) < 0);
                i11 = i10;
                return i4 + i11;
            }
            while (true) {
                int bravo2 = bravo();
                if (i4 <= bravo2 && bravo2 < i5) {
                    return bravo2;
                }
            }
        } else {
            throw new IllegalArgumentException(AbstractC2808x0.bravo(Integer.valueOf(i4), Integer.valueOf(i5)).toString());
        }
    }

    public abstract long delta();

    public long echo(long j5) {
        long delta;
        long j6;
        if (j5 > 0) {
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i4 = (int) j5;
                    int i5 = (int) (j5 >>> 32);
                    if (i4 != 0) {
                        return alpha(31 - Integer.numberOfLeadingZeros(i4)) & 4294967295L;
                    }
                    if (i5 == 1) {
                        return bravo() & 4294967295L;
                    }
                    return (alpha(31 - Integer.numberOfLeadingZeros(i5)) << 32) + (bravo() & 4294967295L);
                }
                do {
                    delta = delta() >>> 1;
                    j6 = delta % j5;
                } while ((j5 - 1) + (delta - j6) < 0);
                return j6;
            }
            while (true) {
                long delta2 = delta();
                if (0 <= delta2 && delta2 < j5) {
                    return delta2;
                }
            }
        } else {
            throw new IllegalArgumentException(AbstractC2808x0.bravo(0L, Long.valueOf(j5)).toString());
        }
    }
}
