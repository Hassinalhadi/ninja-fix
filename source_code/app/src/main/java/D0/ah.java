package D0;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ah implements b {
    public final String alpha;

    public /* synthetic */ ah(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ah) {
            if (!Intrinsics.areEqual(this.alpha, ((ah) obj).alpha)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("StringAnnotation(value="), this.alpha, ')');
    }
}
