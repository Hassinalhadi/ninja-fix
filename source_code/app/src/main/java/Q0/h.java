package Q0;

/* loaded from: classes3.dex */
public final class h {
    public final long alpha;

    public static String alpha(long j5) {
        if (j5 != 9205357640488583168L) {
            return "(" + ((Object) g.bravo(Float.intBitsToFloat((int) (j5 >> 32)))) + ", " + ((Object) g.bravo(Float.intBitsToFloat((int) (j5 & 4294967295L)))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.alpha != ((h) obj).alpha) {
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
        return alpha(this.alpha);
    }
}
