package Jc;

import F.AbstractC0141o0;
import F.O;
import F.Q;
import T.s;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2656g0;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ float purple;

    public /* synthetic */ h(float f5, int i4) {
        this.alpha = 0;
        this.purple = f5;
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
                o.charlie(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    T.p pVar = T.p.alpha;
                    FillElement fillElement = V.charlie;
                    E0 e02 = Q.alpha;
                    s bravo = androidx.compose.foundation.a.bravo(fillElement, ((O) c0585q.kilo(e02)).romeo, ao.alpha);
                    ap delta = AbstractC0547m.delta(T.d.teal, false);
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
                    AbstractC0141o0.bravo(AbstractC2656g0.alpha(), null, V.kilo(pVar, this.purple / 2), ((O) c0585q.kilo(e02)).sierra, c0585q, 48, 0);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
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
                    T.p pVar2 = T.p.alpha;
                    FillElement fillElement2 = V.charlie;
                    E0 e03 = Q.alpha;
                    s bravo2 = androidx.compose.foundation.a.bravo(fillElement2, ((O) c0585q2.kilo(e03)).yankee, ao.alpha);
                    ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                    long j6 = c0585q2.magenta;
                    int i5 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q2.mike();
                    s charlie2 = T.a.charlie(bravo2, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j2);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, delta2);
                    C0564b.blue(C2551k.echo, c0585q2, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i5))) {
                        ad.blue(i5, c0585q2, i5, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie2);
                    AbstractC0141o0.bravo(AbstractC2656g0.alpha(), null, V.kilo(pVar2, this.purple / 2), ((O) c0585q2.kilo(e03)).zulu, c0585q2, 48, 0);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(float f5, int i4, byte b2) {
        this.alpha = i4;
        this.purple = f5;
    }
}
