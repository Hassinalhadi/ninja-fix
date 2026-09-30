package ye;

import androidx.appcompat.widget.P0;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r {
    public final Fe.j alpha;
    public final Collection bravo;
    public final boolean charlie;

    public r(Fe.j jVar, Collection qualifierApplicabilityTypes, boolean z2) {
        Intrinsics.echo(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.alpha = jVar;
        this.bravo = qualifierApplicabilityTypes;
        this.charlie = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Intrinsics.areEqual(this.alpha, rVar.alpha) && Intrinsics.areEqual(this.bravo, rVar.bravo) && this.charlie == rVar.charlie) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        boolean z2 = this.charlie;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.alpha);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.bravo);
        sb2.append(", definitelyNotNull=");
        return P0.gray(sb2, this.charlie, ')');
    }

    public r(Fe.j jVar, Collection collection) {
        this(jVar, collection, jVar.alpha == Fe.i.red);
    }
}
