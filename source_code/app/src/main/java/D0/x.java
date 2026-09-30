package D0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x {
    public final w alpha;
    public final v bravo;

    public x(w wVar, v vVar) {
        this.alpha = wVar;
        this.bravo = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (Intrinsics.areEqual(this.bravo, xVar.bravo) && Intrinsics.areEqual(this.alpha, xVar.alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = 0;
        w wVar = this.alpha;
        if (wVar != null) {
            i4 = wVar.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        v vVar = this.bravo;
        if (vVar != null) {
            i5 = vVar.hashCode();
        }
        return i10 + i5;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.alpha + ", paragraphSyle=" + this.bravo + ')';
    }

    public x() {
        this(null, new v());
    }
}
