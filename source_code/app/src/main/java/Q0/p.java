package Q0;

import s6.AbstractC2636d7;

/* loaded from: classes3.dex */
public final class p {
    public static final q[] bravo = {new q(0), new q(4294967296L), new q(8589934592L)};
    public static final long charlie = AbstractC2636d7.delta(Float.NaN, 0);
    public final long alpha;

    public static final boolean alpha(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final long bravo(long j5) {
        return bravo[(int) ((j5 & 1095216660480L) >>> 32)].alpha;
    }

    public static final float charlie(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static int delta(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static String echo(long j5) {
        long bravo2 = bravo(j5);
        if (q.alpha(bravo2, 0L)) {
            return "Unspecified";
        }
        if (q.alpha(bravo2, 4294967296L)) {
            return charlie(j5) + ".sp";
        }
        if (q.alpha(bravo2, 8589934592L)) {
            return charlie(j5) + ".em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (this.alpha != ((p) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return delta(this.alpha);
    }

    public final String toString() {
        return echo(this.alpha);
    }
}
