package bv;

/* loaded from: classes3.dex */
public final class k {
    public final long alpha;

    public /* synthetic */ k(long j5) {
        this.alpha = j5;
    }

    public static long alpha(int i4, int i5) {
        return (i5 & 4294967295L) | (i4 << 32);
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
        StringBuilder sb2 = new StringBuilder("(");
        long j5 = this.alpha;
        sb2.append((int) (j5 >> 32));
        sb2.append(", ");
        return Q0.c.quebec(sb2, (int) (j5 & 4294967295L), ')');
    }
}
