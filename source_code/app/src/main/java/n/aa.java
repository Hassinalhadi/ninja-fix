package n;

import androidx.compose.runtime.t0;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import q0.AbstractC2384c;
import q0.InterfaceC2402u;
import s6.J4;
import s6.X6;

/* loaded from: classes3.dex */
public final class aa implements q0.ap {
    public final /* synthetic */ ax alpha;
    public final /* synthetic */ Function1 bravo;
    public final /* synthetic */ I0.aa charlie;
    public final /* synthetic */ I0.t delta;
    public final /* synthetic */ Q0.d echo;
    public final /* synthetic */ int foxtrot;

    public aa(ax axVar, Function1 function1, I0.aa aaVar, I0.t tVar, Q0.d dVar, int i4) {
        this.alpha = axVar;
        this.bravo = function1;
        this.charlie = aaVar;
        this.delta = tVar;
        this.echo = dVar;
        this.foxtrot = i4;
    }

    @Override // q0.ap
    public final /* synthetic */ int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.mike(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.juliet(this, interfaceC2402u, list, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    @Override // q0.ap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        Function1 function1;
        D0.ak akVar;
        D0.ak akVar2;
        int hotel;
        int i4;
        ax axVar;
        e0 e0Var;
        D0.ak akVar3;
        aa aaVar;
        ax axVar2;
        int i5;
        q0.z zVar;
        ax axVar3 = this.alpha;
        S.g echo = r6.u.echo();
        if (echo != null) {
            function1 = echo.echo();
        } else {
            function1 = null;
        }
        S.g foxtrot = r6.u.foxtrot(echo);
        try {
            e0 delta = axVar3.delta();
            if (delta != null) {
                akVar = delta.alpha;
            } else {
                akVar = null;
            }
            J j6 = axVar3.alpha;
            Q0.n layoutDirection = arVar.getLayoutDirection();
            int i10 = j6.foxtrot;
            boolean z2 = j6.echo;
            int i11 = j6.charlie;
            if (akVar != null) {
                D0.o oVar = akVar.bravo;
                if (!oVar.alpha.delta()) {
                    D0.aj ajVar = akVar.alpha;
                    if (Intrinsics.areEqual(ajVar.alpha, j6.alpha) && ajVar.bravo.charlie(j6.bravo) && Intrinsics.areEqual(ajVar.charlie, j6.india) && ajVar.delta == i11 && ajVar.echo == z2 && ajVar.foxtrot == i10 && Intrinsics.areEqual(ajVar.golf, j6.golf) && ajVar.hotel == layoutDirection && Intrinsics.areEqual(ajVar.india, j6.hotel)) {
                        int juliet = Q0.a.juliet(j5);
                        long j7 = ajVar.juliet;
                        if (juliet == Q0.a.juliet(j7) && ((!z2 && i10 != 2) || (Q0.a.hotel(j5) == Q0.a.hotel(j7) && Q0.a.golf(j5) == Q0.a.golf(j7)))) {
                            akVar2 = akVar;
                            akVar3 = new D0.ak(new D0.aj(ajVar.alpha, j6.bravo, ajVar.charlie, ajVar.delta, ajVar.echo, ajVar.foxtrot, ajVar.golf, ajVar.hotel, ajVar.india, j5), oVar, Q0.b.delta(j5, (at.oscar(oVar.echo) & 4294967295L) | (at.oscar(oVar.delta) << 32)));
                            axVar = axVar3;
                            e0Var = delta;
                            long j10 = akVar3.charlie;
                            Integer valueOf = Integer.valueOf((int) (j10 >> 32));
                            Integer valueOf2 = Integer.valueOf((int) (j10 & 4294967295L));
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (Intrinsics.areEqual(akVar2, akVar3)) {
                                if (e0Var != null) {
                                    zVar = e0Var.charlie;
                                } else {
                                    zVar = null;
                                }
                                axVar2 = axVar;
                                ((t0) axVar2.india).setValue(new e0(akVar3, zVar));
                                axVar2.papa = false;
                                aaVar = this;
                                aaVar.bravo.invoke(akVar3);
                                at.victor(axVar2, aaVar.charlie, aaVar.delta);
                            } else {
                                aaVar = this;
                                axVar2 = axVar;
                            }
                            if (aaVar.foxtrot != 1) {
                                i5 = at.oscar(akVar3.bravo.bravo(0));
                            } else {
                                i5 = 0;
                            }
                            ((t0) axVar2.golf).setValue(new Q0.g(aaVar.echo.crimson(i5)));
                            return arVar.papa(intValue, intValue2, kotlin.collections.y.sierra(new Pair(AbstractC2384c.alpha, Integer.valueOf(Math.round(akVar3.delta))), new Pair(AbstractC2384c.bravo, Integer.valueOf(Math.round(akVar3.echo)))), new kd.l(12));
                        }
                    }
                }
            }
            akVar2 = akVar;
            j6.alpha(layoutDirection);
            int juliet2 = Q0.a.juliet(j5);
            if ((z2 || i10 == 2) && Q0.a.delta(j5)) {
                hotel = Q0.a.hotel(j5);
            } else {
                hotel = LottieConstants.IterateForever;
            }
            if (!z2 && i10 == 2) {
                i4 = 1;
            } else {
                i4 = i11;
            }
            if (juliet2 != hotel) {
                B9.ab abVar = j6.juliet;
                if (abVar != null) {
                    hotel = J4.delta(at.oscar(abVar.romeo()), juliet2, hotel);
                } else {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
            }
            B9.ab abVar2 = j6.juliet;
            if (abVar2 != null) {
                D0.o oVar2 = new D0.o(abVar2, X6.bravo(0, hotel, 0, Q0.a.golf(j5)), i4, j6.foxtrot);
                axVar = axVar3;
                e0Var = delta;
                akVar3 = new D0.ak(new D0.aj(j6.alpha, j6.bravo, j6.india, j6.charlie, j6.echo, j6.foxtrot, j6.golf, layoutDirection, j6.hotel, j5), oVar2, Q0.b.delta(j5, (at.oscar(oVar2.echo) & 4294967295L) | (at.oscar(oVar2.delta) << 32)));
                long j102 = akVar3.charlie;
                Integer valueOf3 = Integer.valueOf((int) (j102 >> 32));
                Integer valueOf22 = Integer.valueOf((int) (j102 & 4294967295L));
                int intValue3 = valueOf3.intValue();
                int intValue22 = valueOf22.intValue();
                if (Intrinsics.areEqual(akVar2, akVar3)) {
                }
                if (aaVar.foxtrot != 1) {
                }
                ((t0) axVar2.golf).setValue(new Q0.g(aaVar.echo.crimson(i5)));
                return arVar.papa(intValue3, intValue22, kotlin.collections.y.sierra(new Pair(AbstractC2384c.alpha, Integer.valueOf(Math.round(akVar3.delta))), new Pair(AbstractC2384c.bravo, Integer.valueOf(Math.round(akVar3.echo)))), new kd.l(12));
            }
            throw new IllegalStateException("layoutIntrinsics must be called first");
        } finally {
            r6.u.juliet(echo, foxtrot, function1);
        }
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        ax axVar = this.alpha;
        axVar.alpha.alpha(interfaceC2402u.getLayoutDirection());
        B9.ab abVar = axVar.alpha.juliet;
        if (abVar != null) {
            return at.oscar(abVar.romeo());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // q0.ap
    public final /* synthetic */ int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.delta(this, interfaceC2402u, list, i4);
    }
}
