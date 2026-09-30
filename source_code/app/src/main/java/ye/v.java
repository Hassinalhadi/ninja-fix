package ye;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v {
    public static final v delta = new v(af.STRICT, 6);
    public final af alpha;
    public final kotlin.g bravo;
    public final af charlie;

    public v(af afVar, kotlin.g gVar, af afVar2) {
        this.alpha = afVar;
        this.bravo = gVar;
        this.charlie = afVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.alpha == vVar.alpha && Intrinsics.areEqual(this.bravo, vVar.bravo) && this.charlie == vVar.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        kotlin.g gVar = this.bravo;
        if (gVar == null) {
            i4 = 0;
        } else {
            i4 = gVar.silver;
        }
        return this.charlie.hashCode() + ((hashCode + i4) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.alpha + ", sinceVersion=" + this.bravo + ", reportLevelAfter=" + this.charlie + ')';
    }

    public v(af afVar, int i4) {
        this(afVar, (i4 & 2) != 0 ? new kotlin.g(1, 0, 0) : null, afVar);
    }
}
