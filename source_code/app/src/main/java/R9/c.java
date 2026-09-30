package R9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements e {
    public final f alpha;
    public final boolean bravo;

    public c(f fVar, boolean z2) {
        this.alpha = fVar;
        this.bravo = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Intrinsics.areEqual(this.alpha, cVar.alpha) && this.bravo == cVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4;
        f fVar = this.alpha;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i5 = hashCode * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i5 + i4;
    }

    public final String toString() {
        return "Retry(staleHint=" + this.alpha + ", needsStompReconnect=" + this.bravo + ")";
    }
}
