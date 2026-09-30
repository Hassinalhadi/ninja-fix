package bz;

/* loaded from: classes3.dex */
public final class G implements InterfaceC0798x {
    public final int alpha;

    public G(int i4) {
        this.alpha = i4;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof G) && ((G) obj).alpha == this.alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    @Override // bz.InterfaceC0787l
    public final k0 alpha(g0 g0Var) {
        return new F8.q(this.alpha);
    }
}
