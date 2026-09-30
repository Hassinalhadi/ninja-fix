package Yb;

/* loaded from: classes2.dex */
public final class F0 {
    public final boolean alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;
    public final boolean echo;

    public F0(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = z11;
        this.delta = z12;
        this.echo = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (this.alpha == f02.alpha && this.bravo == f02.bravo && this.charlie == f02.charlie && this.delta == f02.delta && this.echo == f02.echo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i13 = i4 * 31;
        if (this.bravo) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i14 = (i13 + i5) * 31;
        if (this.charlie) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (i14 + i10) * 31;
        if (this.delta) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (i15 + i11) * 31;
        if (this.echo) {
            i12 = 1231;
        }
        return i16 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PickupUploadVisibility(showUploadInvoiceAndProofRow=");
        sb2.append(this.alpha);
        sb2.append(", showUploadInvoiceInRow=");
        sb2.append(this.bravo);
        sb2.append(", showProofOfPickupInRow=");
        sb2.append(this.charlie);
        sb2.append(", hasInvoiceAttached=");
        sb2.append(this.delta);
        sb2.append(", hasProofAttached=");
        return Q0.c.romeo(sb2, this.echo, ")");
    }
}
