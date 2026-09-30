package o3;

/* loaded from: classes3.dex */
public final class a {
    public final int alpha;
    public final int bravo;
    public final long charlie;

    public /* synthetic */ a() {
        this(0, 0, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.alpha == aVar.alpha && this.bravo == aVar.bravo && this.charlie == aVar.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = ((this.alpha * 31) + this.bravo) * 31;
        long j5 = this.charlie;
        return i4 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GnssState(satellitesInUse=");
        sb2.append(this.alpha);
        sb2.append(", satellitesInView=");
        sb2.append(this.bravo);
        sb2.append(", lastFixTimestamp=");
        return Q0.c.mike(this.charlie, ")", sb2);
    }

    public a(int i4, int i5, long j5) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = j5;
    }
}
