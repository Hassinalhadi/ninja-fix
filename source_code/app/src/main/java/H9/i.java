package H9;

/* loaded from: classes2.dex */
public final class i extends j {
    public final long alpha;

    public i(long j5) {
        this.alpha = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            if (this.alpha == ((i) obj).alpha) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) 10485760);
    }

    public final String toString() {
        return Q0.c.mike(this.alpha, ", maxBytes=10485760)", new StringBuilder("TotalPayloadTooLarge(totalBytes="));
    }
}
