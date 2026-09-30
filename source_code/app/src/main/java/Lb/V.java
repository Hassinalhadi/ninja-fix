package Lb;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.C0556w;
import androidx.compose.foundation.layout.InterfaceC0550p;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import i.InterfaceC1854c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes2.dex */
public final /* synthetic */ class V implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ P.d purple;

    public /* synthetic */ V(P.d dVar, int i4) {
        this.alpha = i4;
        this.purple = dVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        int i4;
        boolean z11;
        C0556w c0556w = C0556w.alpha;
        T.p pVar = T.p.alpha;
        P.d dVar = this.purple;
        boolean z12 = false;
        switch (this.alpha) {
            case 0:
                InterfaceC1854c item = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(item, "$this$item");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    dVar.invoke(c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0555v Card = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Db.d.alpha);
                    q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
                    int romeo = C0564b.romeo(c0585q2);
                    androidx.compose.runtime.I mike = c0585q2.mike();
                    T.s charlie = T.a.charlie(sierra, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, delta);
                    C0564b.blue(C2551k.echo, c0585q2, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                        ao.ad.blue(romeo, c0585q2, romeo, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie);
                    dVar.invoke(c0585q2, 0);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC0555v AppBottomSheet = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(AppBottomSheet, "$this$AppBottomSheet");
                if ((intValue3 & 17) != 16) {
                    z12 = true;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z12)) {
                    T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                    C0537c c0537c = AbstractC0542h.alpha;
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(Db.d.charlie), T.d.f2062f, c0585q3, 6);
                    int romeo2 = C0564b.romeo(c0585q3);
                    androidx.compose.runtime.I mike2 = c0585q3.mike();
                    T.s charlie3 = T.a.charlie(charlie2, c0585q3);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(c2550j2);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q3, alpha);
                    C0564b.blue(C2551k.echo, c0585q3, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo2))) {
                        ao.ad.blue(romeo2, c0585q3, romeo2, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie3);
                    dVar.invoke(c0556w, c0585q3, 6);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC0555v AppBottomSheet2 = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                Intrinsics.echo(AppBottomSheet2, "$this$AppBottomSheet");
                if ((intValue4 & 17) != 16) {
                    z12 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    T.s charlie4 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                    C0537c c0537c2 = AbstractC0542h.alpha;
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(Db.d.charlie), T.d.f2062f, c0585q4, 6);
                    int romeo3 = C0564b.romeo(c0585q4);
                    androidx.compose.runtime.I mike3 = c0585q4.mike();
                    T.s charlie5 = T.a.charlie(charlie4, c0585q4);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j3 = C2551k.bravo;
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j3);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q4, alpha2);
                    C0564b.blue(C2551k.echo, c0585q4, mike3);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo3))) {
                        ao.ad.blue(romeo3, c0585q4, romeo3, c2549i3);
                    }
                    C0564b.blue(C2551k.delta, c0585q4, charlie5);
                    dVar.invoke(c0556w, c0585q4, 6);
                    c0585q4.quebec(true);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC0555v AppBottomSheet3 = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                Intrinsics.echo(AppBottomSheet3, "$this$AppBottomSheet");
                if ((intValue5 & 6) == 0) {
                    if (((C0585q) interfaceC0581m5).golf(AppBottomSheet3)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue5 |= i4;
                }
                if ((intValue5 & 19) != 18) {
                    z12 = true;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z12)) {
                    dVar.invoke(AppBottomSheet3, c0585q5, Integer.valueOf(intValue5 & 14));
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0550p PullToRefreshBox = (InterfaceC0550p) obj;
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                Intrinsics.echo(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((intValue6 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z11)) {
                    dVar.invoke(c0585q6, 0);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
