package U0;

/* loaded from: classes3.dex */
public final class ad {
    public final int alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;
    public final boolean echo;

    public ad(int i4) {
        this((i4 & 1) == 0, ae.alpha, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad) {
            ad adVar = (ad) obj;
            if (this.alpha == adVar.alpha && this.bravo == adVar.bravo && this.charlie == adVar.charlie && this.delta == adVar.delta && this.echo == adVar.echo) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11 = this.alpha * 31;
        int i12 = 1231;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i13 = (i11 + i4) * 31;
        if (this.charlie) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i14 = (i13 + i5) * 31;
        if (this.delta) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (i14 + i10) * 31;
        if (!this.echo) {
            i12 = 1237;
        }
        return ((i15 + i12) * 31) + 1237;
    }

    public ad(boolean z2, ae aeVar, boolean z10) {
        androidx.compose.runtime.aa aaVar = l.alpha;
        int i4 = !z2 ? 262152 : 262144;
        i4 = aeVar == ae.purple ? i4 | 8192 : i4;
        i4 = z10 ? i4 : i4 | 512;
        boolean z11 = aeVar == ae.alpha;
        this.alpha = i4;
        this.bravo = z11;
        this.charlie = true;
        this.delta = true;
        this.echo = true;
    }
}
