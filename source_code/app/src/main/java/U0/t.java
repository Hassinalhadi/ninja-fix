package U0;

/* loaded from: classes3.dex */
public final class t {
    public final boolean alpha;
    public final boolean bravo;
    public final ae charlie;
    public final boolean delta;
    public final boolean echo;
    public final String foxtrot;

    public /* synthetic */ t(int i4, boolean z2) {
        this(true, (i4 & 2) != 0 ? true : z2, (i4 & 4) != 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.alpha != tVar.alpha || this.bravo != tVar.bravo || this.charlie != tVar.charlie || this.delta != tVar.delta || this.echo != tVar.echo) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = i4 * 31;
        if (this.bravo) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int hashCode = (this.charlie.hashCode() + ((i12 + i5) * 31)) * 31;
        if (this.delta) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = (hashCode + i10) * 31;
        if (this.echo) {
            i11 = 1231;
        }
        return i13 + i11;
    }

    public t(boolean z2, boolean z10, boolean z11) {
        ae aeVar = ae.alpha;
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = aeVar;
        this.delta = z11;
        this.echo = true;
        this.foxtrot = "";
    }
}
