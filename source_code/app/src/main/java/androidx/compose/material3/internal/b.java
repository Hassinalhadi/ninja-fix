package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements af {
    public final T.j alpha;
    public final T.j bravo;
    public final int charlie;

    public b(T.j jVar, T.j jVar2, int i4) {
        this.alpha = jVar;
        this.bravo = jVar2;
        this.charlie = i4;
    }

    @Override // androidx.compose.material3.internal.af
    public final int alpha(Q0.l lVar, long j5, int i4) {
        int alpha = this.bravo.alpha(0, lVar.bravo());
        return lVar.bravo + alpha + (-this.alpha.alpha(0, i4)) + this.charlie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.alpha, bVar.alpha) && Intrinsics.areEqual(this.bravo, bVar.bravo) && this.charlie == bVar.charlie;
    }

    public final int hashCode() {
        return ao.ad.sierra(this.bravo.alpha, Float.floatToIntBits(this.alpha.alpha) * 31, 31) + this.charlie;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.alpha);
        sb2.append(", anchorAlignment=");
        sb2.append(this.bravo);
        sb2.append(", offset=");
        return Q0.c.quebec(sb2, this.charlie, ')');
    }
}
