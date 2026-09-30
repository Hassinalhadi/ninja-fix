package j;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1919b {
    public final long alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof C1919b) {
            if (this.alpha != ((C1919b) obj).alpha) {
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
        return "GridItemSpan(packedValue=" + this.alpha + ')';
    }
}
