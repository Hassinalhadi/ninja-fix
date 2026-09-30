package Lb;

import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes2.dex */
public final /* synthetic */ class ap implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ Function1 red;

    public /* synthetic */ ap(int i4, Function0 function0, Function1 function1) {
        this.alpha = i4;
        this.purple = function0;
        this.red = function1;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        int i4 = this.alpha;
        InterfaceC0555v Card = (InterfaceC0555v) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i4) {
            case 0:
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    T.p pVar = T.p.alpha;
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
                    long j5 = c0585q.magenta;
                    int i5 = (int) (j5 ^ (j5 >>> 32));
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
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                        ao.ad.blue(i5, c0585q, i5, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    AbstractC0220c.oscar(null, this.purple, null, null, c0585q, 0, 13);
                    AbstractC0220c.kilo(null, true, false, false, this.red, c0585q, 0, 13);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z10)) {
                    T.p pVar2 = T.p.alpha;
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
                    long j6 = c0585q2.magenta;
                    int i10 = (int) (j6 ^ (j6 >>> 32));
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
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i10))) {
                        ao.ad.blue(i10, c0585q2, i10, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie2);
                    AbstractC0220c.bravo(null, this.purple, null, null, c0585q2, 0, 13);
                    AbstractC0220c.kilo(null, true, false, false, this.red, c0585q2, 0, 13);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
