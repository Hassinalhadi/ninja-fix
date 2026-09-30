package K5;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class b {
    public final N5.a alpha;
    public final HashMap bravo;

    public b(N5.a aVar, HashMap hashMap) {
        this.alpha = aVar;
        this.bravo = hashMap;
    }

    public final long alpha(B5.d dVar, long j5, int i4) {
        long j6;
        long time = j5 - this.alpha.getTime();
        c cVar = (c) this.bravo.get(dVar);
        long j7 = cVar.alpha;
        int i5 = i4 - 1;
        if (j7 > 1) {
            j6 = j7;
        } else {
            j6 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i5) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j6 * i5))), time), cVar.bravo);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.alpha.equals(bVar.alpha) && this.bravo.equals(bVar.bravo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.alpha + ", values=" + this.bravo + "}";
    }
}
