package X2;

import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {
    public static final n bravo = new n(t.alpha);
    public final Map alpha;

    public n(Map map) {
        this.alpha = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            if (Intrinsics.areEqual(this.alpha, ((n) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.alpha + ')';
    }
}
