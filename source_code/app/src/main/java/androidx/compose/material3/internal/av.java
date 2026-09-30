package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public final class av implements ae {
    public final T.g alpha;

    public av(T.g gVar) {
        this.alpha = gVar;
    }

    @Override // androidx.compose.material3.internal.ae
    public final int alpha(Q0.l lVar, long j5, int i4, Q0.n nVar) {
        int i5 = (int) (j5 >> 32);
        if (i4 >= i5) {
            float f5 = (i5 - i4) / 2.0f;
            float f10 = 0.0f;
            if (nVar != Q0.n.alpha) {
                f10 = 0.0f * (-1);
            }
            return Math.round((1 + f10) * f5);
        }
        return J4.delta(this.alpha.alpha(i4, i5, nVar), 0, i5 - i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof av) {
            return Intrinsics.areEqual(this.alpha, ((av) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.alpha.alpha) * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.alpha + ", margin=0)";
    }
}
