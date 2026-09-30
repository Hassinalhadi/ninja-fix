package bk;

/* loaded from: classes3.dex */
public final class a {
    public final bl.b alpha;
    public final bl.b bravo;

    public a(bl.b bVar, bl.b bVar2) {
        this.alpha = bVar;
        this.bravo = bVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.alpha.equals(aVar.alpha) && this.bravo.equals(aVar.bravo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.alpha + ", secondaryOutConfig=" + this.bravo + "}";
    }
}
