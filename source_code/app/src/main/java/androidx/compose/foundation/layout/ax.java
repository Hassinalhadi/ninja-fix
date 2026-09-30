package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import r0.InterfaceC2481c;

/* loaded from: classes3.dex */
public final class ax implements q0.ab, InterfaceC2481c, T.q {
    public final a0 alpha;
    public final androidx.compose.runtime.ax purple;
    public final androidx.compose.runtime.ax red;

    public ax(a0 a0Var) {
        this.alpha = a0Var;
        this.purple = C0564b.zulu(a0Var);
        this.red = C0564b.zulu(a0Var);
    }

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    @Override // q0.ab
    public final /* synthetic */ int alpha(s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.charlie(this, atVar, interfaceC2401t, i4);
    }

    @Override // r0.InterfaceC2481c
    public final void bravo(r0.f fVar) {
        a0 a0Var = (a0) fVar.coral(AbstractC0538d.charlie);
        a0 a0Var2 = this.alpha;
        ((t0) this.purple).setValue(new ab(a0Var2, a0Var));
        ((t0) this.red).setValue(new X(a0Var, a0Var2));
    }

    @Override // q0.ab
    public final /* synthetic */ int charlie(s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.lima(this, atVar, interfaceC2401t, i4);
    }

    @Override // q0.ab
    public final /* synthetic */ int echo(s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.foxtrot(this, atVar, interfaceC2401t, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        return Intrinsics.areEqual(((ax) obj).alpha, this.alpha);
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // q0.ab
    public final /* synthetic */ int golf(s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.india(this, atVar, interfaceC2401t, i4);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // q0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo2measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        androidx.compose.runtime.ax axVar = this.purple;
        int bravo = ((a0) ((t0) axVar).getValue()).bravo(arVar, arVar.getLayoutDirection());
        int alpha = ((a0) ((t0) axVar).getValue()).alpha(arVar);
        int delta = ((a0) ((t0) axVar).getValue()).delta(arVar, arVar.getLayoutDirection()) + bravo;
        int charlie = ((a0) ((t0) axVar).getValue()).charlie(arVar) + alpha;
        AbstractC2367C victor = aoVar.victor(Q0.b.india(-delta, -charlie, j5));
        return arVar.papa(Q0.b.golf(victor.alpha + delta, j5), Q0.b.foxtrot(victor.purple + charlie, j5), kotlin.collections.t.alpha, new aw(victor, bravo, alpha, 0));
    }

    @Override // T.s
    public final /* synthetic */ T.s then(T.s sVar) {
        return Q0.c.charlie(this, sVar);
    }
}
