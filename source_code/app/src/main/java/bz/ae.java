package bz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ae implements InterfaceC0787l {
    public final InterfaceC0798x alpha;
    public final at bravo;
    public final long charlie;

    public ae(InterfaceC0798x interfaceC0798x, at atVar, long j5) {
        this.alpha = interfaceC0798x;
        this.bravo = atVar;
        this.charlie = j5;
    }

    @Override // bz.InterfaceC0787l
    public final i0 alpha(g0 g0Var) {
        return new m0(this.alpha.alpha(g0Var), this.bravo, this.charlie);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ae) {
            ae aeVar = (ae) obj;
            if (Intrinsics.areEqual(aeVar.alpha, this.alpha) && aeVar.bravo == this.bravo && aeVar.charlie == this.charlie) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        long j5 = this.charlie;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }
}
