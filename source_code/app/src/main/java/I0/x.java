package I0;

import s6.J4;

/* loaded from: classes3.dex */
public final class x implements g {
    public final int alpha;
    public final int bravo;

    public x(int i4, int i5) {
        this.alpha = i4;
        this.bravo = i5;
    }

    @Override // I0.g
    public final void alpha(i iVar) {
        if (iVar.silver != -1) {
            iVar.silver = -1;
            iVar.teal = -1;
        }
        F0.e eVar = (F0.e) iVar.white;
        int delta = J4.delta(this.alpha, 0, eVar.kilo());
        int delta2 = J4.delta(this.bravo, 0, eVar.kilo());
        if (delta != delta2) {
            if (delta < delta2) {
                iVar.echo(delta, delta2);
            } else {
                iVar.echo(delta2, delta);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.alpha == xVar.alpha && this.bravo == xVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.alpha);
        sb2.append(", end=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
