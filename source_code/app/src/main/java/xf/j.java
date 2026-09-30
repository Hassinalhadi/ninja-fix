package xf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends k {
    public final Throwable alpha;

    public j(Throwable th) {
        this.alpha = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Intrinsics.areEqual(this.alpha, ((j) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.alpha;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // xf.k
    public final String toString() {
        return "Closed(" + this.alpha + ')';
    }
}
