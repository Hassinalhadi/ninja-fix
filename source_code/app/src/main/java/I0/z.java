package I0;

import s6.J4;

/* loaded from: classes3.dex */
public final class z implements g {
    public final int alpha;
    public final int bravo;

    public z(int i4, int i5) {
        this.alpha = i4;
        this.bravo = i5;
    }

    @Override // I0.g
    public final void alpha(i iVar) {
        int delta = J4.delta(this.alpha, 0, ((F0.e) iVar.white).kilo());
        int delta2 = J4.delta(this.bravo, 0, ((F0.e) iVar.white).kilo());
        if (delta < delta2) {
            iVar.foxtrot(delta, delta2);
        } else {
            iVar.foxtrot(delta2, delta);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.alpha == zVar.alpha && this.bravo == zVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.alpha);
        sb2.append(", end=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
