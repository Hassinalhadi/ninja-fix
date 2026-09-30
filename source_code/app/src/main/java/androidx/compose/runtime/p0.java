package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p0 extends S.ad implements S.p, ax, D0 {
    public o0 purple;

    @Override // S.ad, S.ac
    public final S.ae delta(S.ae aeVar, S.ae aeVar2, S.ae aeVar3) {
        if (((o0) aeVar2).charlie == ((o0) aeVar3).charlie) {
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
        return Integer.valueOf(juliet());
    }

    @Override // S.ac
    public final S.ae hotel() {
        return this.purple;
    }

    @Override // S.ac
    public final void india(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.purple = (o0) aeVar;
    }

    public final int juliet() {
        return ((o0) S.n.uniform(this.purple, this)).charlie;
    }

    public final void kilo(int i4) {
        S.g kilo;
        o0 o0Var = (o0) S.n.india(this.purple);
        if (o0Var.charlie != i4) {
            o0 o0Var2 = this.purple;
            synchronized (S.n.charlie) {
                kilo = S.n.kilo();
                ((o0) S.n.papa(o0Var2, this, kilo, o0Var)).charlie = i4;
            }
            S.n.oscar(kilo, this);
        }
    }

    @Override // androidx.compose.runtime.ax
    public final void setValue(Object obj) {
        kilo(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((o0) S.n.india(this.purple)).charlie + ")@" + hashCode();
    }
}
