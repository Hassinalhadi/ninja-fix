package B7;

/* loaded from: classes2.dex */
public final class a {
    public final long alpha;
    public final long bravo;
    public final long charlie;

    public a(long j5, long j6, long j7) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.alpha == aVar.alpha && this.bravo == aVar.bravo && this.charlie == aVar.charlie) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        long j6 = this.bravo;
        int i4 = (((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.charlie;
        return i4 ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.alpha);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.bravo);
        sb2.append(", uptimeMillis=");
        return Q0.c.mike(this.charlie, "}", sb2);
    }
}
