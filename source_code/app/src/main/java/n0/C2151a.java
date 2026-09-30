package n0;

import ao.ad;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2151a {
    public long alpha;
    public float bravo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2151a)) {
            return false;
        }
        C2151a c2151a = (C2151a) obj;
        if (this.alpha == c2151a.alpha && Float.compare(this.bravo, c2151a.bravo) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return Float.floatToIntBits(this.bravo) + (((int) (j5 ^ (j5 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.alpha);
        sb2.append(", dataPoint=");
        return ad.azure(sb2, this.bravo, ')');
    }
}
