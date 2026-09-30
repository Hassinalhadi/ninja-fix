package O0;

import A0.z;
import a0.AbstractC0362p;
import a0.C0366t;
import a0.aq;
import ao.ad;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements o {
    public final aq alpha;
    public final float bravo;

    public b(aq aqVar, float f5) {
        this.alpha = aqVar;
        this.bravo = f5;
    }

    @Override // O0.o
    public final float alpha() {
        return this.bravo;
    }

    @Override // O0.o
    public final long bravo() {
        int i4 = C0366t.lima;
        return C0366t.kilo;
    }

    @Override // O0.o
    public final o charlie(Function0 function0) {
        if (!Intrinsics.areEqual(this, n.alpha)) {
            return this;
        }
        return (o) function0.invoke();
    }

    @Override // O0.o
    public final /* synthetic */ o delta(o oVar) {
        return z.alpha(this, oVar);
    }

    @Override // O0.o
    public final AbstractC0362p echo() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Intrinsics.areEqual(this.alpha, bVar.alpha) && Float.compare(this.bravo, bVar.bravo) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.bravo) + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.alpha);
        sb2.append(", alpha=");
        return ad.azure(sb2, this.bravo, ')');
    }
}
