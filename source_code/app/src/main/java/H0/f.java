package H0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {
    public final i alpha;

    public f(i iVar) {
        this.alpha = iVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                if (!Intrinsics.areEqual(this.alpha, ((f) obj).alpha) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.alpha + ", loaderKey=null)";
    }
}
