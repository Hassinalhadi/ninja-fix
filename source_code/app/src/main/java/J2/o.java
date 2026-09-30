package J2;

import A0.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o {
    public String alpha;
    public int bravo;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (!Intrinsics.areEqual(this.alpha, oVar.alpha) || this.bravo != oVar.bravo) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return av.q.mike(this.bravo) + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.alpha + ", state=" + z.romeo(this.bravo) + ')';
    }
}
