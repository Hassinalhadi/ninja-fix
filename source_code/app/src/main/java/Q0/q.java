package Q0;

/* loaded from: classes3.dex */
public final class q {
    public final long alpha;

    public static final boolean alpha(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static String bravo(long j5) {
        if (alpha(j5, 0L)) {
            return "Unspecified";
        }
        if (alpha(j5, 4294967296L)) {
            return "Sp";
        }
        if (alpha(j5, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (this.alpha != ((q) obj).alpha) {
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
