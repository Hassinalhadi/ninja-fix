package kf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final Object alpha;
    public final Object bravo;

    public a(Object obj, Object obj2) {
        this.alpha = obj;
        this.bravo = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.alpha, aVar.alpha) && Intrinsics.areEqual(this.bravo, aVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Object obj = this.alpha;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i5 = hashCode * 31;
        Object obj2 = this.bravo;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.alpha + ", upper=" + this.bravo + ')';
    }
}
