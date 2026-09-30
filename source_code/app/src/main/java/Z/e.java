package Z;

import t6.G2;

/* loaded from: classes3.dex */
public final class e {
    public final long alpha;

    public static final boolean alpha(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final float bravo(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final float charlie(long j5) {
        return Math.min(Float.intBitsToFloat((int) ((j5 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j5 & 2147483647L)));
    }

    public static final float delta(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final boolean echo(long j5) {
        boolean z2;
        boolean z10;
        boolean z11 = false;
        if (j5 == 9205357640488583168L) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Float.intBitsToFloat((int) (j5 >> 32)) <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z2 | z10;
        if (Float.intBitsToFloat((int) (j5 & 4294967295L)) <= 0.0f) {
            z11 = true;
        }
        return z12 | z11;
    }

    public static String foxtrot(long j5) {
        if (j5 != 9205357640488583168L) {
            return "Size(" + G2.alpha(Float.intBitsToFloat((int) (j5 >> 32))) + ", " + G2.alpha(Float.intBitsToFloat((int) (j5 & 4294967295L))) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.alpha != ((e) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return foxtrot(this.alpha);
    }
}
