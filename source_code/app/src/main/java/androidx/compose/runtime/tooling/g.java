package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public final int alpha;
    public final Integer bravo;

    public g(int i4, Integer num) {
        this.alpha = i4;
        this.bravo = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.alpha == gVar.alpha && Intrinsics.areEqual(this.bravo, gVar.bravo);
    }

    public final int hashCode() {
        int i4 = this.alpha * 31;
        Integer num = this.bravo;
        return i4 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.alpha + ", dataOffset=" + this.bravo + ')';
    }
}
