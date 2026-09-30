package H9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends m {
    public final j alpha;

    public k(j jVar) {
        this.alpha = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && Intrinsics.areEqual(this.alpha, ((k) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.alpha + ")";
    }
}
