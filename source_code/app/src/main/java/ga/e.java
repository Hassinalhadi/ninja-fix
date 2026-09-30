package ga;

import F.AbstractC0141o0;
import F.G2;
import F.K1;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import g4.C1752a;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import q0.av;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.E7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.X3;

/* loaded from: classes2.dex */
public abstract class e {
    public static final long alpha = a0.ao.delta(4280756010L);
    public static final long bravo = a0.ao.delta(4285624698L);
    public static final long charlie = a0.ao.delta(4288782762L);
    public static final long delta = a0.ao.delta(4293190887L);
    public static final long echo = a0.ao.delta(4294638330L);
    public static final long foxtrot = a0.ao.delta(4294243573L);
    public static final long golf;
    public static final long hotel;

    static {
        int i4 = C0366t.lima;
        golf = C0366t.echo;
        hotel = a0.ao.delta(4292617766L);
    }

    public static final void alpha(f fVar, Function0 function0, Function0 function02, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Function0 function03;
        boolean z2;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2005590620);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(fVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            function03 = function0;
            if (c0585q.india(function03)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        } else {
            function03 = function0;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(function02)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            float f5 = 12;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(V.charlie(T.p.alpha, 1.0f), echo, a0.ao.alpha), f5, 20, f5, 24);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            delta(AbstractC3086y3.bravo(c0585q, R.string.fintechaccountId), fVar.echo, 64, fVar.foxtrot, fVar.juliet, function03, c0585q, ((i5 << 15) & 3670016) | 3120);
            hotel(fVar.golf, fVar.hotel, fVar.kilo, function02, c0585q, (i5 << 3) & 7168);
            String str = fVar.india;
            if (str != null && !StringsKt.gray(str)) {
                c0585q.purple(1074116901);
                echo(str, c0585q, 0);
            } else {
                c0585q.purple(1066785928);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(fVar, function0, function02, i4, 17);
        }
    }

    public static final void bravo(f state, Function0 onEditStcPay, Function0 onEditUrPay, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        T.s sVar2;
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onEditStcPay, "onEditStcPay");
        Intrinsics.echo(onEditUrPay, "onEditUrPay");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(629101173);
        if (c0585q.golf(state)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.india(onEditStcPay)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c0585q.india(onEditUrPay)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11 | 3072;
        if ((i14 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s bravo2 = X3.bravo(androidx.compose.foundation.a.bravo(V.charlie, echo, a0.ao.alpha), X3.alpha(c0585q), true);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
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
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            foxtrot(state, c0585q, i14 & 14);
            alpha(state, onEditStcPay, onEditUrPay, c0585q, i14 & 1022);
            c0585q.quebec(true);
            sVar2 = pVar;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.h(state, onEditStcPay, onEditUrPay, sVar2, i4, 8);
        }
    }

    public static final void charlie(String str, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Function0 function02;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-24710872);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            function02 = function0;
            E7.alpha(function02, new U0.t(3, false), P.e.echo(-611281473, new Pc.a(str, function0), c0585q), c0585q, 438, 0);
        } else {
            function02 = function0;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Pc.a(i4, 3, str, function02);
        }
    }

    public static final void delta(final String str, final String str2, final float f5, final boolean z2, final boolean z10, final Function0 function0, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1983330683);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.echo(R.drawable.smartphone_line_new)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(str2)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.delta(f5)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.hotel(z2)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i5 |= i12;
        }
        if ((i4 & 196608) == 0) {
            if (c0585q.hotel(z10)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.india(function0)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i5 |= i10;
        }
        if ((599187 & i5) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0585q.magenta(i5 & 1, z11)) {
            T.p pVar = T.p.alpha;
            float f10 = 8;
            float f11 = 12;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(R3.charlie(V.golf(V.charlie(pVar, 1.0f), f5, 0.0f, 2), 1, foxtrot, AbstractC2094g.bravo(f10)), golf, AbstractC2094g.bravo(f10)), f11, f10, f11, f10);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q.magenta;
            int i17 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            int i18 = i5;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q, i17, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0551q c0551q = C0551q.alpha;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f10), T.d.f2062f, c0585q, 6);
            long j6 = c0585q.magenta;
            int i19 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                ao.ad.blue(i19, c0585q, i19, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            long charlie4 = AbstractC2636d7.charlie(12);
            H0.n nVar = Db.g.alpha;
            G2.bravo(str, null, bravo, charlie4, new H0.v(HttpConstants.HTTP_BLOCKED), nVar, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, (i18 & 14) | 200064, 0, 130962);
            T.s charlie5 = V.charlie(pVar, 1.0f);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2061d, c0585q, 48);
            long j7 = c0585q.magenta;
            int i20 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie6 = T.a.charlie(charlie5, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                ao.ad.blue(i20, c0585q, i20, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.smartphone_line_new, c0585q, (i18 >> 3) & 14), null, V.kilo(pVar, 20), charlie, c0585q, 3504, 0);
            long charlie7 = AbstractC2636d7.charlie(16);
            H0.v vVar = new H0.v(HttpConstants.HTTP_INTERNAL_ERROR);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.bravo(str2, AbstractC0538d.whiskey(new LayoutWeightElement(1.0f, true), f10, 0.0f, 0.0f, 0.0f, 14), alpha, charlie7, vVar, nVar, 0L, null, 0L, 2, false, 1, 0, null, null, c0585q, ((i18 >> 6) & 14) | 200064, 3120, 120720);
            c0585q = c0585q;
            if (z10) {
                c0585q.purple(951816594);
                z12 = false;
                golf(c0585q, 0);
            } else {
                z12 = false;
                c0585q.purple(942705415);
            }
            c0585q.quebec(z12);
            c0585q.quebec(true);
            c0585q.quebec(true);
            if (z2) {
                c0585q.purple(1800370123);
                K1.foxtrot(function0, V.kilo(c0551q.alpha(pVar, T.d.red), 40), false, null, g.delta, c0585q, ((i18 >> 18) & 14) | 196608, 28);
                z13 = false;
            } else {
                z13 = false;
                c0585q.purple(1791145825);
            }
            c0585q.quebec(z13);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: ga.d
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str3 = str2;
                    boolean z14 = z10;
                    Function0 function02 = function0;
                    e.delta(str, str3, f5, z2, z14, function02, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void echo(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1010223784);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            float f5 = 8;
            float f10 = 12;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(R3.charlie(V.charlie(T.p.alpha, 1.0f), 1, foxtrot, AbstractC2094g.bravo(f5)), echo, AbstractC2094g.bravo(f5)), f10, f5, f10, f5);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.naql_blocked);
            long charlie3 = AbstractC2636d7.charlie(12);
            H0.n nVar = Db.g.alpha;
            G2.bravo(bravo2, null, bravo, charlie3, new H0.v(HttpConstants.HTTP_BLOCKED), nVar, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 130962);
            G2.bravo(str, null, alpha, AbstractC2636d7.charlie(16), null, nVar, 0L, null, AbstractC2636d7.charlie(20), 0, false, 0, 0, null, null, c0585q, (i10 & 14) | 3456, 6, 129970);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.i(str, i4, 11);
        }
    }

    public static final void foxtrot(f fVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        int i10;
        f fVar2 = fVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1166299469);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(fVar2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i4 | i10;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(Boolean.FALSE);
                c0585q.f(jade);
            }
            ax axVar = (ax) jade;
            T.p pVar = T.p.alpha;
            a0.an anVar = a0.ao.alpha;
            T.s bravo2 = androidx.compose.foundation.a.bravo(R3.charlie(V.charlie(pVar, 1.0f), (float) 0.5d, foxtrot, anVar), golf, anVar);
            float f5 = 12;
            float f10 = 24;
            T.s victor = AbstractC0538d.victor(bravo2, f5, f10, f5, f10);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(8), T.d.f2063g, c0585q, 54);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            String str = fVar2.alpha;
            av avVar = C2391j.alpha;
            AbstractC1680b charlie3 = AbstractC3076w3.charlie(R.drawable.account_circle_fill, c0585q, 6);
            AbstractC1680b charlie4 = AbstractC3076w3.charlie(R.drawable.account_circle_fill, c0585q, 6);
            T.s kilo = V.kilo(pVar, 136);
            C2093f c2093f = AbstractC2094g.alpha;
            T.s charlie5 = R3.charlie(AbstractC3087z.alpha(kilo, c2093f), 1, delta, c2093f);
            String str2 = fVar2.alpha;
            if (str2 != null && !StringsKt.gray(str2)) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean z12 = !z10;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new Cb.u(axVar, 21);
                c0585q.f(jade2);
            }
            N2.p.bravo(str, null, androidx.compose.foundation.a.echo(14, charlie5, null, (Function0) jade2, z12), charlie3, charlie4, avVar, c0585q, 48, 64480);
            long charlie6 = AbstractC2636d7.charlie(14);
            H0.n nVar = Db.g.alpha;
            H0.v vVar = new H0.v(HttpConstants.HTTP_BLOCKED);
            T.s charlie7 = V.charlie(pVar, 1.0f);
            O0.k kVar = new O0.k(3);
            String str3 = fVar2.bravo;
            long j6 = alpha;
            G2.bravo(str3, charlie7, j6, charlie6, vVar, nVar, 0L, kVar, 0L, 2, false, 1, 0, null, null, c0585q, 200112, 3120, 120208);
            G2.bravo(fVar.charlie, V.charlie(pVar, 1.0f), j6, AbstractC2636d7.charlie(16), new H0.v(HttpConstants.HTTP_INTERNAL_ERROR), nVar, 0L, new O0.k(3), 0L, 2, false, 1, 0, null, null, c0585q, 200112, 3120, 120208);
            fVar2 = fVar;
            G2.bravo(fVar2.delta, V.charlie(pVar, 1.0f), charlie, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_INTERNAL_ERROR), nVar, 0L, new O0.k(3), 0L, 2, false, 1, 0, null, null, c0585q, 200112, 3120, 120208);
            c0585q = c0585q;
            c0585q.quebec(true);
            if (((Boolean) axVar.getValue()).booleanValue()) {
                c0585q.purple(1060216800);
                Object jade3 = c0585q.jade();
                if (jade3 == asVar) {
                    jade3 = new Cb.u(axVar, 22);
                    c0585q.f(jade3);
                }
                charlie(str2, (Function0) jade3, c0585q, 48);
                z11 = false;
            } else {
                z11 = false;
                c0585q.purple(1055052975);
            }
            c0585q.quebec(z11);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.ar(fVar2, i4, 9);
        }
    }

    public static final void golf(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1219462552);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i4 & 1, z2)) {
            c0585q = c0585q2;
            G2.bravo(AbstractC3086y3.bravo(c0585q2, R.string.update), AbstractC0538d.whiskey(T.p.alpha, 8, 0.0f, 0.0f, 0.0f, 14), hotel, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_INTERNAL_ERROR), Db.g.alpha, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200112, 0, 130960);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C1752a(i4, 1);
        }
    }

    public static final void hotel(String str, String str2, boolean z2, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1099069018);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.hotel(z2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(function0)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            T.p pVar = T.p.alpha;
            float f5 = 8;
            float f10 = 12;
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(R3.charlie(V.golf(V.charlie(pVar, 1.0f), 92, 0.0f, 2), 1, foxtrot, AbstractC2094g.bravo(f5)), golf, AbstractC2094g.bravo(f5)), f10, f5, f10, f5);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q.magenta;
            int i14 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(victor, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ao.ad.blue(i14, c0585q, i14, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0551q c0551q = C0551q.alpha;
            int i15 = i5;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2062f, c0585q, 6);
            long j6 = c0585q.magenta;
            int i16 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ao.ad.blue(i16, c0585q, i16, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.urpay_label_simple);
            long charlie4 = AbstractC2636d7.charlie(12);
            H0.n nVar = Db.g.alpha;
            G2.bravo(bravo2, null, bravo, charlie4, new H0.v(HttpConstants.HTTP_BLOCKED), nVar, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 130962);
            T.j jVar = T.d.f2061d;
            C0537c c0537c = AbstractC0542h.alpha;
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(c0537c, jVar, c0585q, 48);
            long j7 = c0585q.magenta;
            int i17 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie5 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q, i17, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            AbstractC1680b charlie6 = AbstractC3076w3.charlie(R.drawable.pass_valid_line, c0585q, 6);
            float f11 = 20;
            T.s kilo = V.kilo(pVar, f11);
            long j10 = charlie;
            AbstractC0141o0.alpha(charlie6, null, kilo, j10, c0585q, 3504, 0);
            long charlie7 = AbstractC2636d7.charlie(16);
            H0.v vVar = new H0.v(HttpConstants.HTTP_INTERNAL_ERROR);
            long j11 = alpha;
            G2.bravo(str, AbstractC0538d.whiskey(pVar, f5, 0.0f, 0.0f, 0.0f, 14), j11, charlie7, vVar, nVar, 0L, null, 0L, 2, false, 1, 0, null, null, c0585q, (i15 & 14) | 200112, 3120, 120720);
            c0585q.quebec(true);
            T.s charlie8 = V.charlie(pVar, 1.0f);
            S alpha4 = androidx.compose.foundation.layout.Q.alpha(c0537c, jVar, c0585q, 48);
            long j12 = c0585q.magenta;
            int i18 = (int) (j12 ^ (j12 >>> 32));
            I mike4 = c0585q.mike();
            T.s charlie9 = T.a.charlie(charlie8, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i18))) {
                ao.ad.blue(i18, c0585q, i18, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie9);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.cash_line, c0585q, 6), null, V.kilo(pVar, f11), j10, c0585q, 3504, 0);
            long charlie10 = AbstractC2636d7.charlie(16);
            H0.v vVar2 = new H0.v(HttpConstants.HTTP_INTERNAL_ERROR);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.bravo(str2, AbstractC0538d.whiskey(new LayoutWeightElement(1.0f, true), f5, 0.0f, 0.0f, 0.0f, 14), j11, charlie10, vVar2, nVar, 0L, null, 0L, 2, false, 1, 0, null, null, c0585q, ((i15 >> 3) & 14) | 200064, 3120, 120720);
            c0585q = c0585q;
            if (z2) {
                c0585q.purple(-1581944438);
                z11 = false;
                golf(c0585q, 0);
            } else {
                z11 = false;
                c0585q.purple(-1594107009);
            }
            c0585q.quebec(z11);
            c0585q.quebec(true);
            c0585q.quebec(true);
            K1.foxtrot(function0, V.kilo(c0551q.alpha(pVar, T.d.red), 40), false, null, g.echo, c0585q, ((i15 >> 9) & 14) | 196608, 28);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.z(str, str2, z2, function0, i4);
        }
    }
}
