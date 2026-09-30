package X2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public final Y2.i alpha;
    public final Y2.g bravo;
    public final Z2.e charlie;
    public final Y2.d delta;

    public c(Y2.i iVar, Y2.g gVar, Z2.e eVar, Y2.d dVar) {
        this.alpha = iVar;
        this.bravo = gVar;
        this.charlie = eVar;
        this.delta = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            if (Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.alpha, cVar.alpha) && this.bravo == cVar.bravo && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.charlie, cVar.charlie) && this.delta == cVar.delta && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null)) {
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
        int i11 = 0;
        Y2.i iVar = this.alpha;
        if (iVar != null) {
            i4 = iVar.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = i4 * 31;
        Y2.g gVar = this.bravo;
        if (gVar != null) {
            i5 = gVar.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 28629151;
        Z2.e eVar = this.charlie;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        Y2.d dVar = this.delta;
        if (dVar != null) {
            i11 = dVar.hashCode();
        }
        return (i14 + i11) * 887503681;
    }
}
