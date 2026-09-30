package Q0;

/* loaded from: classes3.dex */
public final class k {
    public final long alpha;

    public /* synthetic */ k(long j5) {
        this.alpha = j5;
    }

    public static final boolean alpha(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final long bravo(long j5, long j6) {
        return ((((int) (j5 >> 32)) - ((int) (j6 >> 32))) << 32) | ((((int) (j5 & 4294967295L)) - ((int) (j6 & 4294967295L))) & 4294967295L);
    }

    public static final long charlie(long j5, long j6) {
        return ((((int) (j5 >> 32)) + ((int) (j6 >> 32))) << 32) | ((((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L))) & 4294967295L);
    }

    public static String delta(long j5) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j5 >> 32));
        sb2.append(", ");
        return c.quebec(sb2, (int) (j5 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (this.alpha != ((k) obj).alpha) {
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
