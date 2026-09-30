package ge;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z {
    public static final z charlie = new z(null, null);
    public final aa alpha;
    public final w bravo;

    public z(aa aaVar, w wVar) {
        boolean z2;
        String str;
        this.alpha = aaVar;
        this.bravo = wVar;
        if (aaVar == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == (wVar == null)) {
            return;
        }
        if (aaVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + aaVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.alpha == zVar.alpha && Intrinsics.areEqual(this.bravo, zVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        aa aaVar = this.alpha;
        if (aaVar == null) {
            hashCode = 0;
        } else {
            hashCode = aaVar.hashCode();
        }
        int i5 = hashCode * 31;
        w wVar = this.bravo;
        if (wVar != null) {
            i4 = wVar.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        int i4;
        aa aaVar = this.alpha;
        if (aaVar == null) {
            i4 = -1;
        } else {
            i4 = y.$EnumSwitchMapping$0[aaVar.ordinal()];
        }
        if (i4 != -1) {
            w wVar = this.bravo;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return "out " + wVar;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "in " + wVar;
            }
            return String.valueOf(wVar);
        }
        return "*";
    }
}
