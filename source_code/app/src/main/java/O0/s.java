package O0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s {
    public static final s charlie = new s(2, false);
    public static final s delta = new s(1, true);
    public final int alpha;
    public final boolean bravo;

    public s(int i4, boolean z2) {
        this.alpha = i4;
        this.bravo = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (this.alpha == sVar.alpha && this.bravo == sVar.bravo) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5 = this.alpha * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i5 + i4;
    }

    public final String toString() {
        if (Intrinsics.areEqual(this, charlie)) {
            return "TextMotion.Static";
        }
        if (Intrinsics.areEqual(this, delta)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
