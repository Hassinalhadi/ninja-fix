package E0;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class j {
    public final int alpha;
    public final int bravo;
    public final boolean charlie;

    public j(int i4, int i5, boolean z2) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.alpha == jVar.alpha && this.bravo == jVar.bravo && this.charlie == jVar.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = ((this.alpha * 31) + this.bravo) * 31;
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i5 + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.alpha);
        sb2.append(", end=");
        sb2.append(this.bravo);
        sb2.append(", isRtl=");
        return P0.gray(sb2, this.charlie, ')');
    }
}
