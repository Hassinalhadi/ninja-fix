package c;

import D0.an;
import Ec.al;
import T.j;
import T.p;
import T.s;
import U0.ae;
import U0.l;
import Xd.m;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.C0556w;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.aa;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import n.at;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.X3;
import t6.ac;

/* loaded from: classes3.dex */
public abstract class g {
    public static final c alpha;

    static {
        ae aeVar = ae.alpha;
        aa aaVar = l.alpha;
        ae aeVar2 = ae.alpha;
        ae aeVar3 = ae.alpha;
        long j5 = C0366t.echo;
        long j6 = C0366t.bravo;
        alpha = new c(j5, j6, j6, C0366t.bravo(0.38f, j6), C0366t.bravo(0.38f, j6));
    }

    public static final void alpha(c cVar, s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(621449936);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(cVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(dVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        int i13 = i5;
        if ((i13 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            s bravo = androidx.compose.foundation.a.bravo(ac.alpha(sVar, f.delta, AbstractC2094g.bravo(f.echo), 0L, 0L, 28), cVar.alpha, ao.alpha);
            B b2 = B.alpha;
            s bravo2 = X3.bravo(AbstractC0538d.uniform(AbstractC0538d.amber(bravo), 0.0f, f.india, 1), X3.alpha(c0585q), true);
            int i14 = (i13 << 3) & 7168;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(bravo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            dVar.invoke(C0556w.alpha, c0585q, Integer.valueOf(((i14 >> 6) & 112) | 6));
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(cVar, sVar, dVar, i4);
        }
    }

    public static final void bravo(s sVar, c cVar, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1430784946);
        int i15 = i5 & 1;
        if (i15 != 0) {
            i11 = i4 | 6;
        } else {
            if (c0585q.golf(sVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i11 = i10 | i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i13 = i11 | 48;
        } else {
            if (c0585q.golf(cVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i13 = i11 | i12;
        }
        if (c0585q.india(function1)) {
            i14 = Barcode.FORMAT_QR_CODE;
        } else {
            i14 = 128;
        }
        int i17 = i13 | i14;
        if ((i17 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i17 & 1, z2)) {
            if (i15 != 0) {
                sVar = p.alpha;
            }
            if (i16 != 0) {
                cVar = alpha;
            }
            alpha(cVar, sVar, P.e.echo(860259975, new N2.ad(2, function1, cVar), c0585q), c0585q, ((i17 << 3) & 112) | ((i17 >> 3) & 14) | 384);
        } else {
            c0585q.ochre();
        }
        s sVar2 = sVar;
        c cVar2 = cVar;
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(sVar2, cVar2, function1, i4, i5);
        }
    }

    public static final void charlie(String str, c cVar, s sVar, m mVar, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1027365588);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(true)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(cVar)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.india(mVar)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.india(function0)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        if ((74899 & i5) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            p pVar = p.alpha;
            j jVar = f.foxtrot;
            C0537c c0537c = AbstractC0542h.alpha;
            float f5 = f.hotel;
            C0540f golf = AbstractC0542h.golf(f5);
            if ((i5 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i5 & 458752) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z11 | z10;
            Object jade = c0585q.jade();
            if (z12 || jade == C0580l.alpha) {
                jade = new Bb.a(function0, 26);
                c0585q.f(jade);
            }
            s charlie = V.charlie(androidx.compose.foundation.a.echo(12, sVar, str, (Function0) jade, true), 1.0f);
            float f10 = f.alpha;
            float f11 = f.bravo;
            float f12 = f.charlie;
            s uniform = AbstractC0538d.uniform(V.mike(charlie, f10, f12, f11, f12), f5, 0.0f, 2);
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(golf, jVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i16 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(uniform, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q, i16, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            if (mVar == null) {
                c0585q.purple(-1483499797);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1483499796);
                float f13 = f.juliet;
                s juliet = V.juliet(pVar, f13, 0.0f, f13, f13, 2);
                ap delta = AbstractC0547m.delta(T.d.alpha, false);
                long j6 = c0585q.magenta;
                int i17 = (int) (j6 ^ (j6 >>> 32));
                I mike2 = c0585q.mike();
                s charlie3 = T.a.charlie(juliet, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, delta);
                C0564b.blue(c2549i2, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                    ad.blue(i17, c0585q, i17, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie3);
                mVar.invoke(new C0366t(cVar.charlie), c0585q, 0);
                c0585q.quebec(true);
                c0585q.quebec(false);
            }
            an anVar = new an(cVar.bravo, f.mike, f.november, null, null, f.papa, f.golf, f.oscar, 0, 16613240);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            at.charlie(str, new LayoutWeightElement(1.0f, true), anVar, null, 0, false, 1, 0, null, c0585q, (i5 & 14) | 1572864, 952);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Ec.b(str, cVar, sVar, mVar, function0, i4);
        }
    }
}
