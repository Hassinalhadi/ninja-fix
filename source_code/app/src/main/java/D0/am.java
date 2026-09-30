package D0;

/* loaded from: classes3.dex */
public final class am {
    public static final long bravo = ae.bravo(0, 0);
    public static final /* synthetic */ int charlie = 0;
    public final long alpha;

    public /* synthetic */ am(long j5) {
        this.alpha = j5;
    }

    public static boolean alpha(long j5, Object obj) {
        if (!(obj instanceof am) || j5 != ((am) obj).alpha) {
            return false;
        }
        return true;
    }

    public static final boolean bravo(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final boolean charlie(long j5) {
        if (((int) (j5 >> 32)) == ((int) (j5 & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static final int delta(long j5) {
        return echo(j5) - foxtrot(j5);
    }

    public static final int echo(long j5) {
        return Math.max((int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    public static final int foxtrot(long j5) {
        return Math.min((int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    public static final boolean golf(long j5) {
        if (((int) (j5 >> 32)) > ((int) (j5 & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static String hotel(long j5) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j5 >> 32));
        sb2.append(", ");
        return Q0.c.quebec(sb2, (int) (j5 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return alpha(this.alpha, obj);
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return hotel(this.alpha);
    }
}
