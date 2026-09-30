package Pa;

import D0.af;
import F.G1;
import F.O;
import F.Q;
import H0.k;
import H0.r;
import H0.v;
import Lb.C0221d;
import Lb.C0222e;
import T.p;
import T.s;
import Xd.l;
import a0.ar;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import i.AbstractC1876y;
import i.C1874w;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.J4;
import t0.AbstractC2901T;

/* loaded from: classes2.dex */
public abstract class a {
    public static final P.d alpha;

    static {
        new P.d(new C0221d(5), 1524662515, false);
        new P.d(new C0221d(7), 453971235, false);
        new P.d(new C0222e(19), 1133759801, false);
        alpha = new P.d(new C0221d(6), -977994552, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r14v3, types: [P.d] */
    public static final void alpha(int i4, P.d dVar, s sVar, InterfaceC0581m interfaceC0581m, Function0 onRefresh, boolean z2) {
        int i5;
        int i10;
        int i11;
        boolean z10;
        P.d dVar2;
        boolean z11;
        Object cVar;
        float f5;
        boolean z12;
        ?? r02;
        float f10;
        boolean z13;
        boolean z14;
        Intrinsics.echo(onRefresh, "onRefresh");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1702656575);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.india(onRefresh)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q.golf(sVar)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i14 & 1, z10)) {
            p pVar = p.alpha;
            C1874w alpha2 = AbstractC1876y.alpha(c0585q);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(Float.valueOf(0.0f));
                c0585q.f(jade);
            }
            ax axVar = (ax) jade;
            Q0.d dVar3 = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
            float lavender = dVar3.lavender(80);
            float lavender2 = dVar3.lavender(150);
            int i15 = i14 & 14;
            if (i15 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object jade2 = c0585q.jade();
            if (!z11 && jade2 != asVar) {
                cVar = jade2;
                f5 = 0.0f;
            } else {
                f5 = 0.0f;
                cVar = new c(z2, alpha2, lavender2, axVar, lavender, onRefresh);
                c0585q.f(cVar);
            }
            c cVar2 = (c) cVar;
            Boolean valueOf = Boolean.valueOf(z2);
            if (i15 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object jade3 = c0585q.jade();
            if (z12 || jade3 == asVar) {
                jade3 = new b(z2, axVar, null);
                c0585q.f(jade3);
            }
            C0564b.foxtrot((l) jade3, c0585q, valueOf);
            s alpha3 = androidx.compose.ui.input.nestedscroll.a.alpha(sVar, cVar2, null);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            float f11 = f5;
            long j5 = c0585q.magenta;
            int i16 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(alpha3, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q, i16, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            ?? r14 = dVar;
            r14.invoke(alpha2, c0585q, 48);
            if (!z2 && bravo(axVar) <= f11) {
                c0585q.purple(-819227461);
                c0585q.quebec(false);
                z14 = true;
            } else {
                c0585q.purple(-815878252);
                if (bravo(axVar) > f11 && !z2) {
                    f10 = J4.charlie(((Number) axVar.getValue()).floatValue(), f11, lavender2);
                    r02 = 0;
                } else {
                    r02 = 0;
                    f10 = 0;
                }
                s quebec = AbstractC0538d.quebec(V.echo(V.charlie(pVar, 1.0f), 60), (float) r02, f10);
                ap delta2 = AbstractC0547m.delta(T.d.teal, r02);
                long j6 = c0585q.magenta;
                int i17 = (int) (j6 ^ (j6 >>> 32));
                I mike2 = c0585q.mike();
                s charlie2 = T.a.charlie(quebec, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, delta2);
                C0564b.blue(c2549i2, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                    ad.blue(i17, c0585q, i17, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie2);
                if (!z2 && ((Number) axVar.getValue()).floatValue() < lavender) {
                    c0585q.purple(47532794);
                    c0585q.quebec(false);
                    z13 = false;
                } else {
                    c0585q.purple(51430951);
                    G1.bravo(V.kilo(pVar, 24), ((O) c0585q.kilo(Q.alpha)).alpha, 0.0f, 0L, 0, c0585q, 6, 28);
                    z13 = false;
                    c0585q.quebec(false);
                }
                z14 = true;
                c0585q.quebec(true);
                c0585q.quebec(z13);
            }
            c0585q.quebec(z14);
            dVar2 = r14;
        } else {
            dVar2 = dVar;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.i(i4, dVar2, sVar, onRefresh, z2);
        }
    }

    public static final float bravo(ax axVar) {
        return ((Number) axVar.getValue()).floatValue();
    }

    public static final D0.g charlie(String text) {
        Intrinsics.echo(text, "text");
        D0.d dVar = new D0.d();
        int i4 = 0;
        for (Object obj : new Regex("<b>|</b>").hotel(text)) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if (i4 % 2 == 0) {
                dVar.bravo(str);
            } else {
                int echo = dVar.echo(new af(0L, 0L, v.f1409c, (r) null, (H0.s) null, (k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, (O0.l) null, (ar) null, 65531));
                try {
                    dVar.bravo(str);
                } finally {
                    dVar.delta(echo);
                }
            }
            i4 = i5;
        }
        return dVar.foxtrot();
    }
}
