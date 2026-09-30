package g8;

import java.util.ArrayList;

/* renamed from: g8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1757a {
    public final String alpha;
    public final ArrayList bravo;

    public C1757a(String str, ArrayList arrayList) {
        if (str != null) {
            this.alpha = str;
            this.bravo = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1757a) {
                C1757a c1757a = (C1757a) obj;
                if (this.alpha.equals(c1757a.alpha) && this.bravo.equals(c1757a.bravo)) {
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
        return "HeartBeatResult{userAgent=" + this.alpha + ", usedDates=" + this.bravo + "}";
    }
}
