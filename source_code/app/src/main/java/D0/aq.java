package D0;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aq implements b {
    public final String alpha;

    public aq(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        if (Intrinsics.areEqual(this.alpha, ((aq) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.alpha, ')');
    }
}
