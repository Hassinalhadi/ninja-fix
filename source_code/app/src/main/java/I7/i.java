package I7;

/* loaded from: classes2.dex */
public final class i {
    public final p alpha;
    public final boolean bravo;

    public i(p pVar, boolean z2) {
        this.alpha = pVar;
        this.bravo = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.alpha.equals(this.alpha) && iVar.bravo == this.bravo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.bravo).hashCode();
    }
}
