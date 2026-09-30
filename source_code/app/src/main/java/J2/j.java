package J2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {
    public final String alpha;
    public final int bravo;

    public j(String workSpecId, int i4) {
        Intrinsics.echo(workSpecId, "workSpecId");
        this.alpha = workSpecId;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Intrinsics.areEqual(this.alpha, jVar.alpha) && this.bravo == jVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.alpha);
        sb2.append(", generation=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
