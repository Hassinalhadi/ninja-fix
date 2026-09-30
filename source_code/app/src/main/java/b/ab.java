package b;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab {
    public final float alpha;
    public final a0.au bravo;

    public ab(float f5, a0.au auVar) {
        this.alpha = f5;
        this.bravo = auVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ab) {
                ab abVar = (ab) obj;
                if (!Q0.g.alpha(this.alpha, abVar.alpha) || !Intrinsics.areEqual(this.bravo, abVar.bravo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (Float.floatToIntBits(this.alpha) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) Q0.g.bravo(this.alpha)) + ", brush=" + this.bravo + ')';
    }
}
