package Q0;

/* loaded from: classes3.dex */
public final class r {
    public final long alpha;

    public static long alpha(float f5, float f10, int i4, long j5) {
        if ((i4 & 1) != 0) {
            f5 = Float.intBitsToFloat((int) (j5 >> 32));
        }
        if ((i4 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final float bravo(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float charlie(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final long delta(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long echo(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long foxtrot(float f5, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) * f5;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) * f5;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String golf(long j5) {
        return "(" + bravo(j5) + ", " + charlie(j5) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (this.alpha != ((r) obj).alpha) {
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
        return golf(this.alpha);
    }
}
