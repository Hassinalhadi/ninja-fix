package Uc;

import D0.an;
import Db.g;
import F.AbstractC0141o0;
import F.G2;
import F.K1;
import F.al;
import H0.v;
import Lb.C0235s;
import P.e;
import T.d;
import T.p;
import T.s;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.google.android.material.datepicker.j;
import delivery.samurai.android.R;
import g0.C1726f;
import hg.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import m.AbstractC2094g;
import m.C2093f;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3086y3;

/* loaded from: classes2.dex */
public abstract class b {
    public static final long alpha = ao.delta(4281770773L);
    public static final long bravo = ao.delta(4293870660L);

    public static final void alpha(int i4, p pVar, InterfaceC0581m interfaceC0581m, Function0 onActionClick, boolean z2) {
        int i5;
        int i10;
        boolean z10;
        p pVar2;
        C1726f alpha2;
        long j5;
        int i11;
        Intrinsics.echo(onActionClick, "onActionClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1290065416);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.india(onActionClick)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10 | 384;
        if ((i13 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i13 & 1, z10)) {
            p pVar3 = p.alpha;
            s sierra = AbstractC0538d.sierra(V.charlie(pVar3, 1.0f), 24);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.echo, d.f2063g, c0585q, 54);
            long j6 = c0585q.magenta;
            int i14 = (int) (j6 ^ (j6 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha3);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            if (z2) {
                alpha2 = c.alpha();
            } else {
                alpha2 = AbstractC2056a.alpha();
            }
            long j7 = alpha;
            if (z2) {
                j5 = j7;
            } else {
                j5 = bravo;
            }
            AbstractC0141o0.bravo(alpha2, null, V.kilo(pVar3, 56), j5, c0585q, 432, 0);
            float f5 = 16;
            AbstractC0538d.echo(V.echo(pVar3, f5), c0585q);
            if (z2) {
                i11 = R.string.payment_successful;
            } else {
                i11 = R.string.settlement_payment_failed;
            }
            G2.bravo(AbstractC3086y3.bravo(c0585q, i11), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(C0366t.bravo, AbstractC2636d7.charlie(20), new v(600), null, g.alpha, 0L, 3, 0L, 0, 16744408), c0585q, 0, 0, 65534);
            s echo = V.echo(j.hotel(pVar3, f5, c0585q, pVar3, 1.0f), 47);
            C2093f bravo2 = AbstractC2094g.bravo(8);
            M m4 = al.alpha;
            if (!z2) {
                j7 = ao.delta(4279900698L);
            }
            K1.bravo(onActionClick, echo, false, bravo2, al.alpha(j7, 0L, 0L, 0L, c0585q, 14), null, null, null, e.echo(1346289378, new C0235s(1, z2), c0585q), c0585q, ((i13 >> 3) & 14) | 805306416, 484);
            c0585q = c0585q;
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a(z2, onActionClick, pVar2, i4, 0);
        }
    }
}
