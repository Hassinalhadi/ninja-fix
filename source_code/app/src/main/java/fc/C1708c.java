package fc;

/* renamed from: fc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1708c {
    public final boolean alpha;
    public final boolean bravo;

    public C1708c(boolean z2, boolean z10) {
        this.alpha = z2;
        this.bravo = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1708c)) {
            return false;
        }
        C1708c c1708c = (C1708c) obj;
        if (this.alpha == c1708c.alpha && this.bravo == c1708c.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = i4 * 31;
        if (this.bravo) {
            i5 = 1231;
        }
        return i10 + i5;
    }

    public final String toString() {
        return "PickupVisibilityFlags(proofAlwaysAvailable=" + this.alpha + ", itemsWithoutHandshake=" + this.bravo + ")";
    }
}
