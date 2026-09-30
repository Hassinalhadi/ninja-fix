package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k implements Serializable {
    public final Throwable alpha;

    public k(Throwable th) {
        this.alpha = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (Intrinsics.areEqual(this.alpha, ((k) obj).alpha)) {
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
        return "Failure(" + this.alpha + ')';
    }
}
