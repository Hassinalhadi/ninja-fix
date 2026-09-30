package Q0;

/* loaded from: classes3.dex */
public final class l {
    public static final l echo = new l(0, 0, 0, 0);
    public final int alpha;
    public final int bravo;
    public final int charlie;
    public final int delta;

    public l(int i4, int i5, int i10, int i11) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = i10;
        this.delta = i11;
    }

    public final long alpha() {
        return (((bravo() / 2) + this.bravo) & 4294967295L) | (((delta() / 2) + this.alpha) << 32);
    }

    public final int bravo() {
        return this.delta - this.bravo;
    }

    public final long charlie() {
        return (this.alpha << 32) | (this.bravo & 4294967295L);
    }

    public final int delta() {
        return this.charlie - this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.alpha == lVar.alpha && this.bravo == lVar.bravo && this.charlie == lVar.charlie && this.delta == lVar.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.alpha * 31) + this.bravo) * 31) + this.charlie) * 31) + this.delta;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.alpha);
        sb2.append(", ");
        sb2.append(this.bravo);
        sb2.append(", ");
        sb2.append(this.charlie);
        sb2.append(", ");
        return c.quebec(sb2, this.delta, ')');
    }
}
