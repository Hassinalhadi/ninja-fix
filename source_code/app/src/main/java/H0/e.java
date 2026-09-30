package H0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {
    public final Object alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!Intrinsics.areEqual(this.alpha, ((e) obj).alpha)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.alpha;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.alpha + ')';
    }
}
