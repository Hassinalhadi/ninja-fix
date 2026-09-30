package N2;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b.D;
import b.E;
import b.F;
import bz.C0778c;
import bz.C0788m;
import bz.M;
import f.InterfaceC1673j;
import k4.C2007a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n.X;
import y.ak;
import y.al;

/* loaded from: classes3.dex */
public final class ad implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ ad(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        boolean z2;
        switch (this.alpha) {
            case 0:
                aa aaVar = (aa) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 14) == 0) {
                    if (((C0585q) interfaceC0581m).golf(aaVar)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue |= i4;
                }
                if ((intValue & 91) == 18) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                h hVar = (h) ((t0) aaVar.bravo.f1864g).getValue();
                boolean z10 = true;
                if (hVar instanceof f) {
                    C0585q c0585q2 = (C0585q) interfaceC0581m;
                    c0585q2.red(1739512213);
                    Xd.n nVar = (Xd.n) this.purple;
                    if (nVar != null) {
                        nVar.invoke(aaVar, hVar, c0585q2, Integer.valueOf((intValue & 14) | 64));
                        z10 = false;
                    }
                    c0585q2.quebec(false);
                } else if (hVar instanceof g) {
                    C0585q c0585q3 = (C0585q) interfaceC0581m;
                    c0585q3.red(1739605461);
                    c0585q3.quebec(false);
                } else if (hVar instanceof e) {
                    C0585q c0585q4 = (C0585q) interfaceC0581m;
                    c0585q4.red(1739696601);
                    Xd.n nVar2 = (Xd.n) this.red;
                    if (nVar2 != null) {
                        nVar2.invoke(aaVar, hVar, c0585q4, Integer.valueOf((intValue & 14) | 64));
                        z10 = false;
                    }
                    c0585q4.quebec(false);
                } else if (hVar instanceof d) {
                    C0585q c0585q5 = (C0585q) interfaceC0581m;
                    c0585q5.red(1739782316);
                    c0585q5.quebec(false);
                } else {
                    C0585q c0585q6 = (C0585q) interfaceC0581m;
                    c0585q6.red(-82435959);
                    c0585q6.quebec(false);
                    throw new NoWhenBranchMatchedException();
                }
                if (z10) {
                    p.golf(aaVar, null, null, null, null, null, 0.0f, false, interfaceC0581m, intValue & 14);
                }
                return Unit.INSTANCE;
            case 1:
                ((Number) obj3).intValue();
                C0585q c0585q7 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q7.purple(-353972293);
                E bravo = ((D) this.purple).bravo((InterfaceC1673j) this.red, c0585q7);
                boolean golf = c0585q7.golf(bravo);
                Object jade = c0585q7.jade();
                if (golf || jade == C0580l.alpha) {
                    jade = new F(bravo);
                    c0585q7.f(jade);
                }
                F f5 = (F) jade;
                c0585q7.quebec(false);
                return f5;
            case 2:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m2;
                if (c0585q8.magenta(intValue2 & 1, z2)) {
                    Object jade2 = c0585q8.jade();
                    if (jade2 == C0580l.alpha) {
                        jade2 = new c.e();
                        c0585q8.f(jade2);
                    }
                    c.e eVar = (c.e) jade2;
                    eVar.alpha.clear();
                    ((Function1) this.purple).invoke(eVar);
                    eVar.alpha((c.c) this.red, c0585q8, 0);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                ((Number) obj3).intValue();
                C0585q c0585q9 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q9.purple(-102778667);
                Object jade3 = c0585q9.jade();
                as asVar = C0580l.alpha;
                if (jade3 == asVar) {
                    jade3 = C0564b.november(c0585q9);
                    c0585q9.f(jade3);
                }
                vf.ab abVar = (vf.ab) jade3;
                Object jade4 = c0585q9.jade();
                if (jade4 == asVar) {
                    jade4 = C0564b.zulu(null);
                    c0585q9.f(jade4);
                }
                ax axVar = (ax) jade4;
                ax black = C0564b.black((Function1) this.purple, c0585q9);
                InterfaceC1673j interfaceC1673j = (InterfaceC1673j) this.red;
                boolean golf2 = c0585q9.golf(interfaceC1673j);
                Object jade5 = c0585q9.jade();
                if (golf2 || jade5 == asVar) {
                    jade5 = new C2007a(2, axVar, interfaceC1673j);
                    c0585q9.f(jade5);
                }
                C0564b.delta(interfaceC1673j, (Function1) jade5, c0585q9);
                boolean india = c0585q9.india(abVar) | c0585q9.golf(interfaceC1673j) | c0585q9.golf(black);
                Object jade6 = c0585q9.jade();
                if (india || jade6 == asVar) {
                    jade6 = new X(abVar, axVar, interfaceC1673j, black);
                    c0585q9.f(jade6);
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(interfaceC1673j, null, (PointerInputEventHandler) jade6, 6);
                c0585q9.quebec(false);
                return suspendPointerInputElement;
            default:
                ((Number) obj3).intValue();
                C0585q c0585q10 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q10.purple(759876635);
                Object jade7 = c0585q10.jade();
                as asVar2 = C0580l.alpha;
                if (jade7 == asVar2) {
                    jade7 = C0564b.quebec((Function0) this.purple);
                    c0585q10.f(jade7);
                }
                D0 d02 = (D0) jade7;
                Object jade8 = c0585q10.jade();
                if (jade8 == asVar2) {
                    jade8 = new C0778c(new Z.b(((Z.b) d02.getValue()).alpha), al.bravo, new Z.b(al.charlie), 8);
                    c0585q10.f(jade8);
                }
                C0778c c0778c = (C0778c) jade8;
                Unit unit = Unit.INSTANCE;
                boolean india2 = c0585q10.india(c0778c);
                Object jade9 = c0585q10.jade();
                if (india2 || jade9 == asVar2) {
                    jade9 = new ak(d02, c0778c, null);
                    c0585q10.f(jade9);
                }
                C0564b.foxtrot((Xd.l) jade9, c0585q10, unit);
                C0788m c0788m = c0778c.charlie;
                boolean golf3 = c0585q10.golf(c0788m);
                Object jade10 = c0585q10.jade();
                if (golf3 || jade10 == asVar2) {
                    jade10 = new M(2, c0788m);
                    c0585q10.f(jade10);
                }
                T.s sVar = (T.s) ((Function1) this.red).invoke((Function0) jade10);
                c0585q10.quebec(false);
                return sVar;
        }
    }
}
