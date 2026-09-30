package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements ae {
    public final T.i alpha;
    public final T.i bravo;
    public final int charlie;

    public a(T.i iVar, T.i iVar2, int i4) {
        this.alpha = iVar;
        this.bravo = iVar2;
        this.charlie = i4;
    }

    @Override // androidx.compose.material3.internal.ae
    public final int alpha(Q0.l lVar, long j5, int i4, Q0.n nVar) {
        int alpha = this.bravo.alpha(0, lVar.delta(), nVar);
        int i5 = -this.alpha.alpha(0, i4, nVar);
        Q0.n nVar2 = Q0.n.alpha;
        int i10 = this.charlie;
        if (nVar != nVar2) {
            i10 = -i10;
        }
        return lVar.alpha + alpha + i5 + i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.alpha, aVar.alpha) && Intrinsics.areEqual(this.bravo, aVar.bravo) && this.charlie == aVar.charlie;
    }

    public final int hashCode() {
        return ao.ad.sierra(this.bravo.alpha, Float.floatToIntBits(this.alpha.alpha) * 31, 31) + this.charlie;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
        sb2.append(this.alpha);
        sb2.append(", anchorAlignment=");
        sb2.append(this.bravo);
        sb2.append(", offset=");
        return Q0.c.quebec(sb2, this.charlie, ')');
    }
}
