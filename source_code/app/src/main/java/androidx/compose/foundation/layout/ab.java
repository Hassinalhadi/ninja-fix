package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab implements a0 {
    public final a0 alpha;
    public final a0 bravo;

    public ab(a0 a0Var, a0 a0Var2) {
        this.alpha = a0Var;
        this.bravo = a0Var2;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int alpha(Q0.d dVar) {
        int alpha = this.alpha.alpha(dVar) - this.bravo.alpha(dVar);
        if (alpha < 0) {
            return 0;
        }
        return alpha;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int bravo(Q0.d dVar, Q0.n nVar) {
        int bravo = this.alpha.bravo(dVar, nVar) - this.bravo.bravo(dVar, nVar);
        if (bravo < 0) {
            return 0;
        }
        return bravo;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int charlie(Q0.d dVar) {
        int charlie = this.alpha.charlie(dVar) - this.bravo.charlie(dVar);
        if (charlie < 0) {
            return 0;
        }
        return charlie;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int delta(Q0.d dVar, Q0.n nVar) {
        int delta = this.alpha.delta(dVar, nVar) - this.bravo.delta(dVar, nVar);
        if (delta < 0) {
            return 0;
        }
        return delta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (Intrinsics.areEqual(abVar.alpha, this.alpha) && Intrinsics.areEqual(abVar.bravo, this.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.alpha + " - " + this.bravo + ')';
    }
}
