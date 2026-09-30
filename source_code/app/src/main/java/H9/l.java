package H9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends m {
    public final Object alpha;

    public l(Object obj) {
        this.alpha = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && Intrinsics.areEqual(this.alpha, ((l) obj).alpha)) {
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
        return "Success(data=" + this.alpha + ")";
    }
}
