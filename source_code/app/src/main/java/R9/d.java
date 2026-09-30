package R9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements e {
    public final f alpha;

    public d(f fVar) {
        this.alpha = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && Intrinsics.areEqual(this.alpha, ((d) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        f fVar = this.alpha;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "Terminal(staleHint=" + this.alpha + ")";
    }
}
