package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v {
    public final int alpha;
    public final Object bravo;

    public v(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.alpha == vVar.alpha && Intrinsics.areEqual(this.bravo, vVar.bravo);
    }

    public final int hashCode() {
        int i4 = this.alpha * 31;
        Object obj = this.bravo;
        return i4 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.alpha + ", value=" + this.bravo + ')';
    }
}
