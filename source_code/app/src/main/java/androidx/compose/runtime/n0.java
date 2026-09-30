package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class n0 extends S.ad implements aw, S.p {
    public m0 purple;

    @Override // S.ad, S.ac
    public final S.ae delta(S.ae aeVar, S.ae aeVar2, S.ae aeVar3) {
        if (((m0) aeVar2).charlie == ((m0) aeVar3).charlie) {
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
        return Float.valueOf(juliet());
    }

    @Override // S.ac
    public final S.ae hotel() {
        return this.purple;
    }

    @Override // S.ac
    public final void india(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.purple = (m0) aeVar;
    }

    public final float juliet() {
        return ((m0) S.n.uniform(this.purple, this)).charlie;
    }

    public final void kilo(float f5) {
        S.g kilo;
        m0 m0Var = (m0) S.n.india(this.purple);
        if (m0Var.charlie == f5) {
            return;
        }
        m0 m0Var2 = this.purple;
        synchronized (S.n.charlie) {
            kilo = S.n.kilo();
            ((m0) S.n.papa(m0Var2, this, kilo, m0Var)).charlie = f5;
        }
        S.n.oscar(kilo, this);
    }

    @Override // androidx.compose.runtime.ax
    public final void setValue(Object obj) {
        kilo(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((m0) S.n.india(this.purple)).charlie + ")@" + hashCode();
    }
}
