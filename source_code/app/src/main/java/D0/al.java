package D0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class al {
    public final af alpha;
    public final af bravo;
    public final af charlie;
    public final af delta;

    public al(af afVar, af afVar2, af afVar3, af afVar4) {
        this.alpha = afVar;
        this.bravo = afVar2;
        this.charlie = afVar3;
        this.delta = afVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (Intrinsics.areEqual(this.alpha, alVar.alpha) && Intrinsics.areEqual(this.bravo, alVar.bravo) && Intrinsics.areEqual(this.charlie, alVar.charlie) && Intrinsics.areEqual(this.delta, alVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11 = 0;
        af afVar = this.alpha;
        if (afVar != null) {
            i4 = afVar.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = i4 * 31;
        af afVar2 = this.bravo;
        if (afVar2 != null) {
            i5 = afVar2.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        af afVar3 = this.charlie;
        if (afVar3 != null) {
            i10 = afVar3.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        af afVar4 = this.delta;
        if (afVar4 != null) {
            i11 = afVar4.hashCode();
        }
        return i14 + i11;
    }
}
