package Q0;

/* loaded from: classes3.dex */
public final class i {
    public final long alpha;

    public static final float alpha(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final float bravo(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (this.alpha != ((i) obj).alpha) {
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
        long j5 = this.alpha;
        if (j5 != 9205357640488583168L) {
            return ((Object) g.bravo(bravo(j5))) + " x " + ((Object) g.bravo(alpha(j5)));
        }
        return "DpSize.Unspecified";
    }
}
