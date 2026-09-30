package androidx.compose.foundation.layout;

/* loaded from: classes3.dex */
public final class az {
    public final int alpha;
    public final int bravo;
    public final int charlie;
    public final int delta;

    public az(int i4, int i5, int i10, int i11) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = i10;
        this.delta = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        if (this.alpha == azVar.alpha && this.bravo == azVar.bravo && this.charlie == azVar.charlie && this.delta == azVar.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.alpha * 31) + this.bravo) * 31) + this.charlie) * 31) + this.delta;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.alpha);
        sb2.append(", top=");
        sb2.append(this.bravo);
        sb2.append(", right=");
        sb2.append(this.charlie);
        sb2.append(", bottom=");
        return Q0.c.quebec(sb2, this.delta, ')');
    }
}
