package Oa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends f {
    public final List alpha;

    public e(List list) {
        this.alpha = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && Intrinsics.areEqual(this.alpha, ((e) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "Success(stores=" + this.alpha + ")";
    }
}
