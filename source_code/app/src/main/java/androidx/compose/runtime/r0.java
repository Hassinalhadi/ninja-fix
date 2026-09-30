package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class r0 extends S.ad implements S.p, ax, D0 {
    public q0 purple;

    @Override // S.ad, S.ac
    public final S.ae delta(S.ae aeVar, S.ae aeVar2, S.ae aeVar3) {
        if (((q0) aeVar2).charlie == ((q0) aeVar3).charlie) {
            return aeVar2;
        }
        return null;
    }

    @Override // S.p
    public final u0 foxtrot() {
        return as.white;
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        return Long.valueOf(juliet());
    }

    @Override // S.ac
    public final S.ae hotel() {
        return this.purple;
    }

    @Override // S.ac
    public final void india(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.purple = (q0) aeVar;
    }

    public final long juliet() {
        return ((q0) S.n.uniform(this.purple, this)).charlie;
    }

    public final void kilo(long j5) {
        S.g kilo;
        q0 q0Var = (q0) S.n.india(this.purple);
        if (q0Var.charlie != j5) {
            q0 q0Var2 = this.purple;
            synchronized (S.n.charlie) {
                kilo = S.n.kilo();
                ((q0) S.n.papa(q0Var2, this, kilo, q0Var)).charlie = j5;
            }
            S.n.oscar(kilo, this);
        }
    }

    @Override // androidx.compose.runtime.ax
    public final void setValue(Object obj) {
        kilo(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((q0) S.n.india(this.purple)).charlie + ")@" + hashCode();
    }
}
