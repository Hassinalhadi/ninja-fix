package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class l0 extends S.ad implements D0, ax, S.p {
    public k0 purple;

    @Override // S.ad, S.ac
    public final S.ae delta(S.ae aeVar, S.ae aeVar2, S.ae aeVar3) {
        if (((k0) aeVar2).charlie == ((k0) aeVar3).charlie) {
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
        return Double.valueOf(((k0) S.n.uniform(this.purple, this)).charlie);
    }

    @Override // S.ac
    public final S.ae hotel() {
        return this.purple;
    }

    @Override // S.ac
    public final void india(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.purple = (k0) aeVar;
    }

    @Override // androidx.compose.runtime.ax
    public final void setValue(Object obj) {
        S.g kilo;
        double doubleValue = ((Number) obj).doubleValue();
        k0 k0Var = (k0) S.n.india(this.purple);
        if (k0Var.charlie == doubleValue) {
            return;
        }
        k0 k0Var2 = this.purple;
        synchronized (S.n.charlie) {
            kilo = S.n.kilo();
            ((k0) S.n.papa(k0Var2, this, kilo, k0Var)).charlie = doubleValue;
        }
        S.n.oscar(kilo, this);
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((k0) S.n.india(this.purple)).charlie + ")@" + hashCode();
    }
}
