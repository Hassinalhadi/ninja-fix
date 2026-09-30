package ga;

import F.G2;
import F.K1;
import F.Q1;
import a0.C0366t;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import delivery.samurai.android.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3086y3;

/* renamed from: ga.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1760c {
    public static final long alpha = a0.ao.delta(4280756010L);
    public static final long bravo = a0.ao.delta(4285624698L);
    public static final long charlie = a0.ao.delta(4294638330L);
    public static final long delta;
    public static final float echo;

    static {
        a0.ao.delta(4292138200L);
        int i4 = C0366t.lima;
        delta = C0366t.echo;
        echo = 56;
    }

    public static final void alpha(Bitmap bitmap, Function0 onBack, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        int i10;
        int i11;
        Intrinsics.echo(onBack, "onBack");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-830838277);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(bitmap)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onBack)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i5 & 1, z2)) {
            c0585q = c0585q2;
            Q1.alpha(null, P.e.echo(1476863935, new Ec.l(onBack, 9), c0585q2), g.alpha, null, null, 0, charlie, 0L, null, P.e.echo(-2097433782, new Cb.d(17, bitmap), c0585q2), c0585q, 806879664, 441);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.aa(i4, 18, bitmap, onBack);
        }
    }

    public static final void bravo(Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1109868392);
        if (c0585q.india(function0)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s bravo2 = androidx.compose.foundation.a.bravo(V.echo(V.charlie(pVar, 1.0f), echo), C0366t.bravo, a0.ao.alpha);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(bravo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            C0551q c0551q = C0551q.alpha;
            K1.foxtrot(function0, c0551q.alpha(pVar, T.d.silver), false, null, g.bravo, c0585q, (i10 & 14) | 196608, 28);
            String bravo3 = AbstractC3086y3.bravo(c0585q, R.string.qr_code_title);
            long charlie3 = AbstractC2636d7.charlie(18);
            H0.n nVar = Db.g.alpha;
            G2.bravo(bravo3, c0551q.alpha(pVar, T.d.teal), C0366t.echo, charlie3, H0.v.f1407a, nVar, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 130960);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.l(i4, 10, function0);
        }
    }
}
