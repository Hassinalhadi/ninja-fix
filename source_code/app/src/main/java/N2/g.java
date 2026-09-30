package N2;

import f0.AbstractC1680b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends h {
    public final AbstractC1680b alpha;
    public final X2.m bravo;

    public g(AbstractC1680b abstractC1680b, X2.m mVar) {
        this.alpha = abstractC1680b;
        this.bravo = mVar;
    }

    @Override // N2.h
    public final AbstractC1680b alpha() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Intrinsics.areEqual(this.alpha, gVar.alpha) && Intrinsics.areEqual(this.bravo, gVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.alpha + ", result=" + this.bravo + ')';
    }
}
