package xf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {
    public static final k bravo = new Object();
    public final Object alpha;

    public static final Object alpha(Object obj) {
        if (!(obj instanceof k)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!Intrinsics.areEqual(this.alpha, ((l) obj).alpha)) {
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
        Object obj = this.alpha;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
