package bz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class J implements InterfaceC0787l {
    public final aa alpha;
    public final long bravo;

    public J(aa aaVar, long j5) {
        this.alpha = aaVar;
        this.bravo = j5;
    }

    @Override // bz.InterfaceC0787l
    public final i0 alpha(g0 g0Var) {
        return new K(this.alpha.alpha(g0Var), this.bravo);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            J j5 = (J) obj;
            if (j5.bravo == this.bravo && Intrinsics.areEqual(j5.alpha, this.alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        long j5 = this.bravo;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }
}
