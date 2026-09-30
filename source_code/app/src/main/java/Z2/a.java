package Z2;

import N2.o;
import X2.i;
import X2.m;

/* loaded from: classes3.dex */
public final class a implements e {
    public final int bravo;

    public a(int i4) {
        this.bravo = i4;
        if (i4 > 0) {
        } else {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // Z2.e
    public final f alpha(o oVar, i iVar) {
        if (!(iVar instanceof m)) {
            return new d(oVar, iVar);
        }
        if (((m) iVar).charlie == O2.f.alpha) {
            return new d(oVar, iVar);
        }
        return new b(oVar, iVar, this.bravo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.bravo == ((a) obj).bravo) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.bravo * 31) + 1237;
    }
}
