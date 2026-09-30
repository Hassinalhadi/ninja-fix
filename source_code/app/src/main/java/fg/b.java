package fg;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                ((b) obj).getClass();
                if (!Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Callbacks(onClose=null)";
    }
}
