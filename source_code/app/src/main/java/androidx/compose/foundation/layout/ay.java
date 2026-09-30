package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ay implements L {
    public final a0 alpha;
    public final Q0.d bravo;

    public ay(a0 a0Var, Q0.d dVar) {
        this.alpha = a0Var;
        this.bravo = dVar;
    }

    @Override // androidx.compose.foundation.layout.L
    public final float alpha() {
        a0 a0Var = this.alpha;
        Q0.d dVar = this.bravo;
        return dVar.crimson(a0Var.charlie(dVar));
    }

    @Override // androidx.compose.foundation.layout.L
    public final float bravo(Q0.n nVar) {
        a0 a0Var = this.alpha;
        Q0.d dVar = this.bravo;
        return dVar.crimson(a0Var.bravo(dVar, nVar));
    }

    @Override // androidx.compose.foundation.layout.L
    public final float charlie() {
        a0 a0Var = this.alpha;
        Q0.d dVar = this.bravo;
        return dVar.crimson(a0Var.alpha(dVar));
    }

    @Override // androidx.compose.foundation.layout.L
    public final float delta(Q0.n nVar) {
        a0 a0Var = this.alpha;
        Q0.d dVar = this.bravo;
        return dVar.crimson(a0Var.delta(dVar, nVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        if (Intrinsics.areEqual(this.alpha, ayVar.alpha) && Intrinsics.areEqual(this.bravo, ayVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.alpha + ", density=" + this.bravo + ')';
    }
}
