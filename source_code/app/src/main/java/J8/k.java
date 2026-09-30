package J8;

/* loaded from: classes2.dex */
public final class k {
    public final j alpha;
    public final j bravo;
    public final double charlie;

    public k(j jVar, j jVar2, double d4) {
        this.alpha = jVar;
        this.bravo = jVar2;
        this.charlie = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.alpha == kVar.alpha && this.bravo == kVar.bravo && Double.compare(this.charlie, kVar.charlie) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.charlie);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.alpha + ", crashlytics=" + this.bravo + ", sessionSamplingRate=" + this.charlie + ')';
    }
}
