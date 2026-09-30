package A0;

import fe.C1712d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public static final g charlie = new g(0.0f, new C1712d(0.0f));
    public final float alpha;
    public final C1712d bravo;

    public g(float f5, C1712d c1712d) {
        this.alpha = f5;
        this.bravo = c1712d;
        if (!Float.isNaN(f5)) {
        } else {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.alpha == gVar.alpha && Intrinsics.areEqual(this.bravo, gVar.bravo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.bravo.hashCode() + (Float.floatToIntBits(this.alpha) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.alpha + ", range=" + this.bravo + ", steps=0)";
    }
}
