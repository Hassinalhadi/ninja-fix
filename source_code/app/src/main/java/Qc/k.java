package Qc;

/* loaded from: classes2.dex */
public final class k {
    public final int alpha;
    public final boolean bravo;
    public final boolean charlie;

    public /* synthetic */ k() {
        this(-1, false, false);
    }

    public static k alpha(k kVar, boolean z2) {
        int i4 = kVar.alpha;
        boolean z10 = kVar.bravo;
        kVar.getClass();
        return new k(i4, z10, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (this.alpha != kVar.alpha || this.bravo != kVar.bravo || this.charlie != kVar.charlie) {
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
        int i5 = this.alpha * 31;
        int i10 = 1237;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i5 + i4) * 31;
        if (this.charlie) {
            i10 = 1231;
        }
        return i11 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TicketsPaginationState(currentPage=");
        sb2.append(this.alpha);
        sb2.append(", hasLoadedAll=");
        sb2.append(this.bravo);
        sb2.append(", isLoadingMore=");
        return Q0.c.romeo(sb2, this.charlie, ")");
    }

    public k(int i4, boolean z2, boolean z10) {
        this.alpha = i4;
        this.bravo = z2;
        this.charlie = z10;
    }
}
