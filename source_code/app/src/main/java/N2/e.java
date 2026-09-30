package N2;

import f0.AbstractC1680b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends h {
    public final AbstractC1680b alpha;
    public final X2.d bravo;

    public e(AbstractC1680b abstractC1680b, X2.d dVar) {
        this.alpha = abstractC1680b;
        this.bravo = dVar;
    }

    @Override // N2.h
    public final AbstractC1680b alpha() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.alpha, eVar.alpha) && Intrinsics.areEqual(this.bravo, eVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        AbstractC1680b abstractC1680b = this.alpha;
        if (abstractC1680b == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC1680b.hashCode();
        }
        return this.bravo.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.alpha + ", result=" + this.bravo + ')';
    }
}
