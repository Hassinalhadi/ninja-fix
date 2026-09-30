package F;

/* renamed from: F.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0126k1 {
    public final U0.ae alpha = U0.ae.alpha;
    public final boolean bravo = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0126k1)) {
            return false;
        }
        if (this.alpha == ((C0126k1) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }
}
