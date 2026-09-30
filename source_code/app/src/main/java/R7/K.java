package R7;

/* loaded from: classes2.dex */
public final class K {
    public final L alpha;
    public final N bravo;
    public final M charlie;

    public K(L l10, N n5, M m4) {
        this.alpha = l10;
        this.bravo = n5;
        this.charlie = m4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k6 = (K) obj;
            if (this.alpha.equals(k6.alpha) && this.bravo.equals(k6.bravo) && this.charlie.equals(k6.charlie)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.alpha + ", osData=" + this.bravo + ", deviceData=" + this.charlie + "}";
    }
}
