package G1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {
    public final String alpha;

    public f(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Intrinsics.areEqual(this.alpha, ((f) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha;
    }
}
