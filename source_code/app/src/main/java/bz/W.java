package bz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class W implements V {
    public final Object alpha;
    public final Object bravo;

    public W(Object obj, Object obj2) {
        this.alpha = obj;
        this.bravo = obj2;
    }

    @Override // bz.V
    public final Object alpha() {
        return this.alpha;
    }

    @Override // bz.V
    public final boolean bravo(Object obj, Object obj2) {
        if (Intrinsics.areEqual(obj, alpha()) && Intrinsics.areEqual(obj2, charlie())) {
            return true;
        }
        return false;
    }

    @Override // bz.V
    public final Object charlie() {
        return this.bravo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof V) {
            V v4 = (V) obj;
            if (Intrinsics.areEqual(this.alpha, v4.alpha())) {
                if (Intrinsics.areEqual(this.bravo, v4.charlie())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = 0;
        Object obj = this.alpha;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        Object obj2 = this.bravo;
        if (obj2 != null) {
            i5 = obj2.hashCode();
        }
        return i10 + i5;
    }
}
