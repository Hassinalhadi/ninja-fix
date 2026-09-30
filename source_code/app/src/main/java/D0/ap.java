package D0;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ap implements b {
    public final String alpha;

    public ap(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        if (Intrinsics.areEqual(this.alpha, ((ap) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("UrlAnnotation(url="), this.alpha, ')');
    }
}
