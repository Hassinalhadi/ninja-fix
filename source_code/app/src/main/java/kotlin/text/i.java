package kotlin.text;

import fe.C1715g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {
    public final String alpha;
    public final C1715g bravo;

    public i(C1715g c1715g, String str) {
        this.alpha = str;
        this.bravo = c1715g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.alpha, iVar.alpha) && Intrinsics.areEqual(this.bravo, iVar.bravo);
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.alpha + ", range=" + this.bravo + ')';
    }
}
