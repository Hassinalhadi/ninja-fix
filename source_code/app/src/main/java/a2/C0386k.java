package a2;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import ao.ad;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s.C2531j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.V2;
import u.C3130d;

/* renamed from: a2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0386k implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ C0386k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
        this.white = obj5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                Y1.l lVar = (Y1.l) this.purple;
                boolean india = c0585q2.india(lVar);
                C0389n c0389n = (C0389n) this.red;
                boolean india2 = india | c0585q2.india(c0389n);
                Object jade = c0585q2.jade();
                if (india2 || jade == C0580l.alpha) {
                    jade = new Cb.ac((SnapshotStateList) this.teal, lVar, c0389n, 11);
                    c0585q2.f(jade);
                }
                C0564b.delta(lVar, (Function1) jade, c0585q2);
                V2.alpha(lVar, (R.e) this.silver, P.e.echo(-497631156, new P0.b(1, (C0388m) this.white, lVar), c0585q2), c0585q2, 384);
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m2;
                if (c0585q3.magenta(intValue & 1, z2)) {
                    Object jade2 = c0585q3.jade();
                    if (jade2 == C0580l.alpha) {
                        jade2 = new C2531j((ax) this.red, 1);
                        c0585q3.f(jade2);
                    }
                    T.s delta = androidx.compose.ui.layout.a.delta((T.s) this.purple, (Function1) jade2);
                    ap delta2 = AbstractC0547m.delta(T.d.alpha, true);
                    long j5 = c0585q3.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q3.mike();
                    T.s charlie = T.a.charlie(delta, c0585q3);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(c2550j);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q3, delta2);
                    C0564b.blue(C2551k.echo, c0585q3, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i4))) {
                        ad.blue(i4, c0585q3, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie);
                    ((P.d) this.silver).invoke(c0585q3, 0);
                    ((C3130d) this.teal).bravo((Function0) this.white, c0585q3, 6);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
