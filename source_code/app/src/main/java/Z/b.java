package Z;

import t6.G2;

/* loaded from: classes3.dex */
public final class b {
    public final long alpha;

    public static long alpha(float f5, int i4, long j5) {
        float f10;
        if ((i4 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j5 >> 32));
        } else {
            f10 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
    }

    public static final boolean bravo(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final float charlie(long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float delta(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static int echo(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static final long foxtrot(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long golf(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long hotel(float f5, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) * f5;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) * f5;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String india(long j5) {
        if ((9223372034707292159L & j5) != 9205357640488583168L) {
            return "Offset(" + G2.alpha(Float.intBitsToFloat((int) (j5 >> 32))) + ", " + G2.alpha(Float.intBitsToFloat((int) (j5 & 4294967295L))) + ')';
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.alpha != ((b) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return echo(this.alpha);
    }

    public final String toString() {
        return india(this.alpha);
    }
}
