package n;

import com.airbnb.lottie.compose.LottieConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;

/* loaded from: classes3.dex */
public final class ao implements q0.ab {
    public final c0 alpha;
    public final int purple;
    public final I0.ah red;
    public final Function0 silver;

    public ao(c0 c0Var, int i4, I0.ah ahVar, Function0 function0) {
        this.alpha = c0Var;
        this.purple = i4;
        this.red = ahVar;
        this.silver = function0;
    }

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    @Override // q0.ab
    public final /* synthetic */ int alpha(s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.charlie(this, atVar, interfaceC2401t, i4);
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
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (Intrinsics.areEqual(this.alpha, aoVar.alpha) && this.purple == aoVar.purple && Intrinsics.areEqual(this.red, aoVar.red) && Intrinsics.areEqual(this.silver, aoVar.silver)) {
            return true;
        }
        return false;
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
        return this.silver.hashCode() + ((this.red.hashCode() + (((this.alpha.hashCode() * 31) + this.purple) * 31)) * 31);
    }

    @Override // q0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo2measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        long j6;
        if (aoVar.romeo(Q0.a.golf(j5)) < Q0.a.hotel(j5)) {
            j6 = j5;
        } else {
            j6 = j5;
            j5 = Q0.a.alpha(j6, 0, LottieConstants.IterateForever, 0, 0, 13);
        }
        AbstractC2367C victor = aoVar.victor(j5);
        int min = Math.min(victor.alpha, Q0.a.hotel(j6));
        return arVar.papa(min, victor.purple, kotlin.collections.t.alpha, new R9.a(this, arVar, victor, min, 5));
    }

    @Override // T.s
    public final /* synthetic */ T.s then(T.s sVar) {
        return Q0.c.charlie(this, sVar);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.alpha + ", cursorOffset=" + this.purple + ", transformedText=" + this.red + ", textLayoutResultProvider=" + this.silver + ')';
    }
}
