package tc;

/* renamed from: tc.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3107l extends AbstractC3112q {
    public final long alpha;

    public C3107l(long j5) {
        this.alpha = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3107l) && this.alpha == ((C3107l) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return Q0.c.mike(this.alpha, ")", new StringBuilder("Accepted(orderId="));
    }
}
