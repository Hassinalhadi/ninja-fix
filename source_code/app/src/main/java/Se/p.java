package Se;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends q {
    public final f alpha;

    public p(f fVar) {
        this.alpha = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && Intrinsics.areEqual(this.alpha, ((p) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.alpha + ')';
    }
}
