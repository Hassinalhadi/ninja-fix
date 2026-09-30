package z;

import a0.C0366t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z {
    public final long alpha = C0366t.kilo;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z) {
                if (!C0366t.charlie(this.alpha, ((z) obj).alpha) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.alpha) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C0366t.india(this.alpha)) + ", rippleAlpha=null)";
    }
}
