package y;

/* renamed from: y.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3382v {
    public final O0.j alpha;
    public final int bravo;
    public final long charlie;

    public C3382v(O0.j jVar, int i4, long j5) {
        this.alpha = jVar;
        this.bravo = i4;
        this.charlie = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3382v)) {
            return false;
        }
        C3382v c3382v = (C3382v) obj;
        if (this.alpha == c3382v.alpha && this.bravo == c3382v.bravo && this.charlie == c3382v.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.alpha.hashCode() * 31) + this.bravo) * 31;
        long j5 = this.charlie;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.alpha + ", offset=" + this.bravo + ", selectableId=" + this.charlie + ')';
    }
}
