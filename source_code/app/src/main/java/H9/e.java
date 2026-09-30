package H9;

/* loaded from: classes2.dex */
public final class e extends j {
    public final long alpha;

    public e(long j5) {
        this.alpha = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            if (this.alpha == ((e) obj).alpha) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) 665600);
    }

    public final String toString() {
        return Q0.c.mike(this.alpha, ", maxBytes=665600)", new StringBuilder("FileTooLarge(sizeBytes="));
    }
}
