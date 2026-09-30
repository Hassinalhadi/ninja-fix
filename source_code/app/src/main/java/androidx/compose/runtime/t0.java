package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class t0 extends S.ad implements S.p {
    public final u0 purple;
    public s0 red;

    public t0(Object obj, u0 u0Var) {
        this.purple = u0Var;
        S.g kilo = S.n.kilo();
        s0 s0Var = new s0(kilo.golf(), obj);
        if (!(kilo instanceof S.b)) {
            s0Var.bravo = new s0(1, obj);
        }
        this.red = s0Var;
    }

    @Override // S.ad, S.ac
    public final S.ae delta(S.ae aeVar, S.ae aeVar2, S.ae aeVar3) {
        if (this.purple.alpha(((s0) aeVar2).charlie, ((s0) aeVar3).charlie)) {
            return aeVar2;
        }
        return null;
    }

    @Override // S.p
    public final u0 foxtrot() {
        return this.purple;
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        return ((s0) S.n.uniform(this.red, this)).charlie;
    }

    @Override // S.ac
    public final S.ae hotel() {
        return this.red;
    }

    @Override // S.ac
    public final void india(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.red = (s0) aeVar;
    }

    @Override // androidx.compose.runtime.ax
    public final void setValue(Object obj) {
        S.g kilo;
        s0 s0Var = (s0) S.n.india(this.red);
        if (!this.purple.alpha(s0Var.charlie, obj)) {
            s0 s0Var2 = this.red;
            synchronized (S.n.charlie) {
                kilo = S.n.kilo();
                ((s0) S.n.papa(s0Var2, this, kilo, s0Var)).charlie = obj;
            }
            S.n.oscar(kilo, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((s0) S.n.india(this.red)).charlie + ")@" + hashCode();
    }
}
