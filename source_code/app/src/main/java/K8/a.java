package K8;

import O7.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final Ef.c alpha;
    public i bravo = null;

    public a(Ef.c cVar) {
        this.alpha = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!Intrinsics.areEqual(this.alpha, aVar.alpha) || !Intrinsics.areEqual(this.bravo, aVar.bravo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        i iVar = this.bravo;
        if (iVar == null) {
            hashCode = 0;
        } else {
            hashCode = iVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.alpha + ", subscriber=" + this.bravo + ')';
    }
}
