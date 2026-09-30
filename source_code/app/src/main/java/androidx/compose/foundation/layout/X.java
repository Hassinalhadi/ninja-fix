package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class X implements a0 {
    public final a0 alpha;
    public final a0 bravo;

    public X(a0 a0Var, a0 a0Var2) {
        this.alpha = a0Var;
        this.bravo = a0Var2;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int alpha(Q0.d dVar) {
        return Math.max(this.alpha.alpha(dVar), this.bravo.alpha(dVar));
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int bravo(Q0.d dVar, Q0.n nVar) {
        return Math.max(this.alpha.bravo(dVar, nVar), this.bravo.bravo(dVar, nVar));
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int charlie(Q0.d dVar) {
        return Math.max(this.alpha.charlie(dVar), this.bravo.charlie(dVar));
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int delta(Q0.d dVar, Q0.n nVar) {
        return Math.max(this.alpha.delta(dVar, nVar), this.bravo.delta(dVar, nVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x4 = (X) obj;
        if (Intrinsics.areEqual(x4.alpha, this.alpha) && Intrinsics.areEqual(x4.bravo, this.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.bravo.hashCode() * 31) + this.alpha.hashCode();
    }

    public final String toString() {
        return "(" + this.alpha + " ∪ " + this.bravo + ')';
    }
}
