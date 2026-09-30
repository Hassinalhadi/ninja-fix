package Pc;

import Ec.ai;
import F.K1;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q0.C2391j;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.P6;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function0 red;

    public /* synthetic */ a(int i4, int i5, String str, Function0 function0) {
        this.alpha = i5;
        this.purple = str;
        this.red = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.getClass();
                P6.alpha(this.purple, this.red, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                num.getClass();
                Zb.d.bravo(this.purple, this.red, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    p pVar = p.alpha;
                    FillElement fillElement = V.charlie;
                    s bravo = androidx.compose.foundation.a.bravo(fillElement, C0366t.bravo, ao.alpha);
                    ap delta = AbstractC0547m.delta(T.d.alpha, false);
                    long j5 = c0585q.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q.mike();
                    s charlie = T.a.charlie(bravo, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, delta);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                        ad.blue(i4, c0585q, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    C0551q c0551q = C0551q.alpha;
                    N2.p.charlie(this.purple, null, fillElement, C2391j.bravo, c0585q, 1573296);
                    K1.foxtrot(this.red, AbstractC0538d.sierra(c0551q.alpha(pVar, T.d.red), 16), false, null, ga.g.charlie, c0585q, 196608, 28);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                num.getClass();
                ga.e.charlie(this.purple, this.red, interfaceC0581m, C0564b.cyan(49));
                return Unit.INSTANCE;
            default:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    K1.juliet(this.red, null, false, null, null, null, P.e.echo(581938312, new ai(this.purple, 6), c0585q2), c0585q2, 805306368, 510);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(String str, Function0 function0) {
        this.alpha = 2;
        this.purple = str;
        this.red = function0;
    }

    public /* synthetic */ a(Function0 function0, String str) {
        this.alpha = 4;
        this.red = function0;
        this.purple = str;
    }
}
