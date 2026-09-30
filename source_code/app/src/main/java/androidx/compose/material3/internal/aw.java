package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public final class aw implements af {
    public final T.j alpha;
    public final int bravo;

    public aw(T.j jVar, int i4) {
        this.alpha = jVar;
        this.bravo = i4;
    }

    @Override // androidx.compose.material3.internal.af
    public final int alpha(Q0.l lVar, long j5, int i4) {
        int i5 = (int) (j5 & 4294967295L);
        int i10 = this.bravo;
        if (i4 >= i5 - (i10 * 2)) {
            return Math.round((1 + 0.0f) * ((i5 - i4) / 2.0f));
        }
        return J4.delta(this.alpha.alpha(i4, i5), i10, (i5 - i10) - i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        return Intrinsics.areEqual(this.alpha, awVar.alpha) && this.bravo == awVar.bravo;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.alpha.alpha) * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.alpha);
        sb2.append(", margin=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
