package p7;

/* loaded from: classes2.dex */
public final class o {
    public final int alpha;
    public final long bravo;

    public o(int i4, long j5) {
        this.alpha = i4;
        this.bravo = j5;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (this.alpha == oVar.alpha && this.bravo == oVar.bravo) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j5 = this.bravo;
        return ((int) (j5 ^ (j5 >>> 32))) ^ ((this.alpha ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.alpha);
        sb2.append(", eventTimestamp=");
        return Q0.c.mike(this.bravo, "}", sb2);
    }
}
