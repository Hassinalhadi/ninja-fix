package g3;

/* loaded from: classes3.dex */
public final class af {
    public final long alpha;
    public final float bravo;
    public final boolean charlie;

    public af(float f5, long j5, boolean z2) {
        this.alpha = j5;
        this.bravo = f5;
        this.charlie = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if (this.alpha == afVar.alpha && Float.compare(this.bravo, afVar.bravo) == 0 && this.charlie == afVar.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        long j5 = this.alpha;
        int sierra = ao.ad.sierra(this.bravo, ((int) (j5 ^ (j5 >>> 32))) * 31, 31);
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return sierra + i4;
    }

    public final String toString() {
        return "ValidationConfig(maxAgeMs=" + this.alpha + ", maxAccuracyMeters=" + this.bravo + ", allowMock=" + this.charlie + ")";
    }
}
