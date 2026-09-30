package a0;

/* loaded from: classes3.dex */
public final class aw {
    public static final long bravo = ao.hotel(0.5f, 0.5f);
    public static final /* synthetic */ int charlie = 0;
    public final long alpha;

    public static final boolean alpha(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final float bravo(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float charlie(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static String delta(long j5) {
        return "TransformOrigin(packedValue=" + j5 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aw) {
            if (this.alpha != ((aw) obj).alpha) {
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
        return delta(this.alpha);
    }
}
