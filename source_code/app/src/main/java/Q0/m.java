package Q0;

/* loaded from: classes3.dex */
public final class m {
    public final long alpha;

    public static final boolean alpha(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static String bravo(long j5) {
        return ((int) (j5 >> 32)) + " x " + ((int) (j5 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (this.alpha != ((m) obj).alpha) {
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
        return bravo(this.alpha);
    }
}
