package Lb;

import F.G1;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2760r6;

/* loaded from: classes2.dex */
public final /* synthetic */ class av implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Function1 red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ boolean teal;

    public /* synthetic */ av(int i4, Function1 function1, boolean z2, boolean z10, boolean z11) {
        this.alpha = i4;
        this.purple = z2;
        this.red = function1;
        this.silver = z10;
        this.teal = z11;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    T.j jVar = T.d.f2061d;
                    T.p pVar = T.p.alpha;
                    androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
                    long j5 = c0585q.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    androidx.compose.runtime.I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(pVar, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                        ao.ad.blue(i4, c0585q, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    AbstractC2760r6.bravo(this.purple, this.red, null, this.silver, c0585q, 0);
                    if (this.teal) {
                        c0585q.purple(199286629);
                        G1.bravo(AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.kilo(pVar, 24), 4, 0.0f, 0.0f, 0.0f, 14), 0L, 0.0f, 0L, 0, c0585q, 6, 30);
                    } else {
                        c0585q.purple(193823499);
                    }
                    c0585q.quebec(false);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    T.j jVar2 = T.d.f2061d;
                    T.p pVar2 = T.p.alpha;
                    androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar2, c0585q2, 48);
                    long j6 = c0585q2.magenta;
                    int i5 = (int) (j6 ^ (j6 >>> 32));
                    androidx.compose.runtime.I mike2 = c0585q2.mike();
                    T.s charlie2 = T.a.charlie(pVar2, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j2);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                    C0564b.blue(C2551k.echo, c0585q2, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i5))) {
                        ao.ad.blue(i5, c0585q2, i5, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie2);
                    AbstractC2760r6.alpha(this.purple, this.red, null, this.silver, c0585q2, 0);
                    if (this.teal) {
                        c0585q2.purple(1583102775);
                        G1.bravo(AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.kilo(pVar2, 24), 4, 0.0f, 0.0f, 0.0f, 14), 0L, 0.0f, 0L, 0, c0585q2, 6, 30);
                    } else {
                        c0585q2.purple(1579911325);
                    }
                    c0585q2.quebec(false);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
