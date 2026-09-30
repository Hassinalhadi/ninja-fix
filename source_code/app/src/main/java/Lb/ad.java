package Lb;

import F.AbstractC0141o0;
import F.G2;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;

/* loaded from: classes2.dex */
public abstract class ad {
    public static final long alpha = a0.ao.delta(4293870660L);

    public static final void alpha(int i4, T.p pVar, InterfaceC0581m interfaceC0581m, Function0 onClick) {
        int i5;
        boolean z2;
        T.p pVar2;
        boolean z10;
        int i10;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1424078005);
        if ((i4 & 6) == 0) {
            if (c0585q.india(onClick)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i4 | i10;
        } else {
            i5 = i4;
        }
        int i11 = i5 | 48;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            T.s bravo = androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), alpha, a0.ao.alpha);
            if ((i11 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Bb.a(onClick, 6);
                c0585q.f(jade);
            }
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.echo(15, bravo, null, (Function0) jade, false), 16, 6);
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, jVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(tango, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(8), jVar, c0585q, 54);
            long j6 = c0585q.magenta;
            int i13 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(pVar3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie2);
            AbstractC1680b charlie3 = AbstractC3076w3.charlie(R.drawable.ic_info_icon, c0585q, 6);
            long j7 = C0366t.echo;
            float f5 = 20;
            AbstractC0141o0.alpha(charlie3, null, androidx.compose.foundation.layout.V.kilo(pVar3, f5), j7, c0585q, 3504, 0);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.settle_your_wallet_banner), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j7, AbstractC2636d7.charlie(14), new H0.v(700), null, Db.g.alpha, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
            pVar2 = pVar3;
            AbstractC0141o0.bravo(B7.b.bravo(), null, androidx.compose.foundation.layout.V.kilo(pVar2, f5), j7, c0585q, 3504, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ac(onClick, pVar2, i4, 0);
        }
    }
}
