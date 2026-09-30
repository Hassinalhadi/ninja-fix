package H9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends j {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                ((a) obj).getClass();
                if (!Intrinsics.areEqual("All compression attempts failed", "All compression attempts failed")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -715393666;
    }

    public final String toString() {
        return "CompressionFailed(reason=All compression attempts failed)";
    }
}
