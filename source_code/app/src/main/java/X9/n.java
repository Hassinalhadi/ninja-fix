package X9;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {
    public final Object alpha;
    public final boolean bravo;

    public n(Map map, boolean z2) {
        this.alpha = map;
        this.bravo = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (!Intrinsics.areEqual(this.alpha, nVar.alpha) || this.bravo != nVar.bravo) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildResult(headers=");
        sb2.append(this.alpha);
        sb2.append(", isError=");
        return Q0.c.romeo(sb2, this.bravo, ")");
    }
}
