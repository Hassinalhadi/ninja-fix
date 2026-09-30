package R7;

/* loaded from: classes2.dex */
public final class E extends i0 {
    public final F alpha;
    public final String bravo;
    public final String charlie;
    public final long delta;

    public E(F f5, String str, String str2, long j5) {
        this.alpha = f5;
        this.bravo = str;
        this.charlie = str2;
        this.delta = j5;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i0) {
                E e = (E) ((i0) obj);
                if (this.alpha.equals(e.alpha)) {
                    if (this.bravo.equals(e.bravo) && this.charlie.equals(e.charlie) && this.delta == e.delta) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003;
        long j5 = this.delta;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.alpha);
        sb2.append(", parameterKey=");
        sb2.append(this.bravo);
        sb2.append(", parameterValue=");
        sb2.append(this.charlie);
        sb2.append(", templateVersion=");
        return Q0.c.mike(this.delta, "}", sb2);
    }
}
