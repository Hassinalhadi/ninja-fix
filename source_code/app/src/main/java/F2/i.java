package F2;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class i {
    public final boolean alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;

    public i(boolean z2, boolean z10, boolean z11, boolean z12) {
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = z11;
        this.delta = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.alpha == iVar.alpha && this.bravo == iVar.bravo && this.charlie == iVar.charlie && this.delta == iVar.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = i4 * 31;
        if (this.bravo) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i13 = (i12 + i5) * 31;
        if (this.charlie) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (i13 + i10) * 31;
        if (this.delta) {
            i11 = 1231;
        }
        return i14 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.alpha);
        sb2.append(", isValidated=");
        sb2.append(this.bravo);
        sb2.append(", isMetered=");
        sb2.append(this.charlie);
        sb2.append(", isNotRoaming=");
        return P0.gray(sb2, this.delta, ')');
    }
}
