package T5;

/* loaded from: classes2.dex */
public final class i {
    public final Object alpha;
    public final String bravo;

    public i(Object obj, String str) {
        this.alpha = obj;
        this.bravo = str;
    }

    public final String alpha() {
        return this.bravo + "@" + System.identityHashCode(this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.alpha == iVar.alpha && this.bravo.equals(iVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (System.identityHashCode(this.alpha) * 31);
    }
}
