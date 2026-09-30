package Fe;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {
    public final i alpha;
    public final boolean bravo;

    public j(i iVar) {
        this.alpha = iVar;
        this.bravo = false;
    }

    public static j alpha(j jVar, i qualifier, boolean z2, int i4) {
        if ((i4 & 1) != 0) {
            qualifier = jVar.alpha;
        }
        if ((i4 & 2) != 0) {
            z2 = jVar.bravo;
        }
        jVar.getClass();
        Intrinsics.echo(qualifier, "qualifier");
        return new j(qualifier, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.alpha == jVar.alpha && this.bravo == jVar.bravo) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        boolean z2 = this.bravo;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.alpha);
        sb2.append(", isForWarningOnly=");
        return P0.gray(sb2, this.bravo, ')');
    }

    public j(i iVar, boolean z2) {
        this.alpha = iVar;
        this.bravo = z2;
    }
}
