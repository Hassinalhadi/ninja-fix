package bz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 implements InterfaceC0798x {
    public final int alpha;
    public final int bravo;
    public final InterfaceC0799y charlie;

    public f0(int i4, InterfaceC0799y interfaceC0799y, int i5) {
        this((i5 & 1) != 0 ? 300 : i4, 0, (i5 & 4) != 0 ? AbstractC0800z.alpha : interfaceC0799y);
    }

    @Override // bz.InterfaceC0787l
    public final i0 alpha(g0 g0Var) {
        return new S5.l(this.alpha, this.bravo, this.charlie);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (f0Var.alpha == this.alpha && f0Var.bravo == this.bravo && Intrinsics.areEqual(f0Var.charlie, this.charlie)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.charlie.hashCode() + (this.alpha * 31)) * 31) + this.bravo;
    }

    @Override // bz.InterfaceC0798x, bz.InterfaceC0787l
    public final k0 alpha(g0 g0Var) {
        return new S5.l(this.alpha, this.bravo, this.charlie);
    }

    public f0(int i4, int i5, InterfaceC0799y interfaceC0799y) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = interfaceC0799y;
    }
}
