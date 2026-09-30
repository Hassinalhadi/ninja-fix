package ye;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import qe.C2474j;

/* loaded from: classes2.dex */
public final class z {
    public final af alpha;
    public final af bravo;
    public final Map charlie;
    public final Lazy delta;
    public final boolean echo;

    public z(af afVar, af afVar2) {
        boolean z2;
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        this.alpha = afVar;
        this.bravo = afVar2;
        this.charlie = tVar;
        this.delta = LazyKt.lazy(new C2474j(16, this));
        af afVar3 = af.IGNORE;
        if (afVar == afVar3 && afVar2 == afVar3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.echo = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.alpha == zVar.alpha && this.bravo == zVar.bravo && Intrinsics.areEqual(this.charlie, zVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        af afVar = this.bravo;
        if (afVar == null) {
            hashCode = 0;
        } else {
            hashCode = afVar.hashCode();
        }
        return this.charlie.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.alpha + ", migrationLevel=" + this.bravo + ", userDefinedLevelForSpecificAnnotation=" + this.charlie + ')';
    }
}
