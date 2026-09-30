package Se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;

/* loaded from: classes2.dex */
public final class o extends q {
    public final y alpha;

    public o(y yVar) {
        this.alpha = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && Intrinsics.areEqual(this.alpha, ((o) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.alpha + ')';
    }
}
