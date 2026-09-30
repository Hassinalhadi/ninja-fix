package Ec;

import F.AbstractC0141o0;
import F.G1;
import F.G2;
import F.K1;
import a0.C0366t;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import h.AbstractC1797a;
import i.AbstractC1876y;
import i.C1874w;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.X3;

/* loaded from: classes2.dex */
public abstract class t {
    public static final P.d alpha = new P.d(new Ac.a(11), 1823983915, false);
    public static final P.d bravo = new P.d(new Ac.a(12), -1487679568, false);
    public static final P.d charlie = new P.d(new Ac.a(13), 6606489, false);
    public static final P.d delta = new P.d(new Ac.a(14), -1290039531, false);
    public static final P.d echo = new P.d(new Ac.a(15), -648961336, false);
    public static final P.d foxtrot = new P.d(new Ac.a(16), 1097006446, false);
    public static final P.d golf = new P.d(new Ac.a(17), 2086292124, false);
    public static final P.d hotel = new P.d(new Ac.a(18), 449414728, false);
    public static final P.d india = new P.d(new Ac.a(19), -801529579, false);
    public static final P.d juliet = new P.d(new Ac.a(20), -879716349, false);
    public static final P.d kilo = new P.d(new Ac.a(21), 199370484, false);
    public static final P.d lima = new P.d(new Ac.a(22), -220808734, false);
    public static final P.d mike = new P.d(new Ac.a(23), 912658287, false);

    public static final void alpha(Dc.e uiState, Xd.l onLeaveShift, Function1 onShiftLocation, Function1 onTakeBreak, Function0 onLoadMore, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        Intrinsics.echo(uiState, "uiState");
        Intrinsics.echo(onLeaveShift, "onLeaveShift");
        Intrinsics.echo(onShiftLocation, "onShiftLocation");
        Intrinsics.echo(onTakeBreak, "onTakeBreak");
        Intrinsics.echo(onLoadMore, "onLoadMore");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-511114392);
        if (c0585q.golf(uiState)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if (c0585q.india(onLeaveShift)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i14 | i10;
        if (c0585q.india(onShiftLocation)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i16 = i15 | i11;
        if (c0585q.india(onTakeBreak)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i17 = i16 | i12;
        if (c0585q.india(onLoadMore)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i18 = i17 | i13;
        if ((i18 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i18 & 1, z2)) {
            if (uiState instanceof Dc.c) {
                c0585q.purple(-949514485);
                FillElement fillElement = V.charlie;
                q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                long j5 = c0585q.magenta;
                int i19 = (int) (j5 ^ (j5 >>> 32));
                I mike2 = c0585q.mike();
                T.s charlie2 = T.a.charlie(fillElement, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, delta2);
                C0564b.blue(C2551k.echo, c0585q, mike2);
                C2549i c2549i = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                    ao.ad.blue(i19, c0585q, i19, c2549i);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie2);
                G1.bravo(null, ay.echo, 0.0f, 0L, 0, c0585q, 48, 29);
                c0585q.quebec(true);
                c0585q.quebec(false);
            } else if (uiState instanceof Dc.a) {
                c0585q.purple(-949304367);
                charlie(null, c0585q, 0);
                c0585q.quebec(false);
            } else if (uiState instanceof Dc.b) {
                c0585q.purple(-949223023);
                charlie(null, c0585q, 0);
                c0585q.quebec(false);
            } else if (uiState instanceof Dc.d) {
                c0585q.purple(-949130953);
                Dc.d dVar = (Dc.d) uiState;
                foxtrot(dVar.alpha, dVar.bravo, onLeaveShift, onShiftLocation, onTakeBreak, onLoadMore, c0585q, (i18 << 3) & 524160);
                c0585q.quebec(false);
            } else {
                throw ao.ad.black(c0585q, -1554651446, false);
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.e(uiState, onLeaveShift, onShiftLocation, onTakeBreak, onLoadMore, i4, 1);
        }
    }

    public static final void bravo(Function0 onClick, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-2056453166);
        if (c0585q2.india(onClick)) {
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
        if (c0585q2.magenta(i10 & 1, z2)) {
            float f5 = 16;
            float f10 = 0;
            C2093f charlie2 = AbstractC2094g.charlie(f5, f5, f10, f10);
            T.p pVar = T.p.alpha;
            T.s bravo2 = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(t6.ac.alpha(V.charlie(pVar, 1.0f), 8, charlie2, 0L, 0L, 28), charlie2), ay.alpha, a0.ao.alpha);
            float f11 = ay.sierra;
            T.s tango = AbstractC0538d.tango(bravo2, f11, ay.romeo);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q2.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q2.mike();
            T.s charlie3 = T.a.charlie(tango, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, delta2);
            C0564b.blue(C2551k.echo, c0585q2, mike2);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q2, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie3);
            T.s echo2 = V.echo(V.charlie(pVar, 1.0f), 56);
            C2093f bravo3 = AbstractC2094g.bravo(12);
            M m4 = F.al.alpha;
            K1.bravo(onClick, echo2, false, bravo3, F.al.alpha(ay.delta, 0L, 0L, 0L, c0585q2, 14), null, null, new M(f11, f11, f11, f11), echo, c0585q2, (i10 & 14) | 817889328, 356);
            c0585q = c0585q2;
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new l(i4, 0, onClick);
        }
    }

    public static final void charlie(T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        T.s sVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1959643083);
        int i5 = i4 | 6;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s bravo2 = X3.bravo(V.charlie, X3.alpha(c0585q), true);
            q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(bravo2, c0585q);
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
            C0564b.blue(c2549i2, c0585q, mike2);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                ao.ad.blue(i10, c0585q, i10, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.echo, T.d.f2063g, c0585q, 54);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            T.s echo2 = V.echo(V.charlie(pVar, 1.0f), 180);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new D0.z(19);
                c0585q.f(jade);
            }
            androidx.compose.ui.viewinterop.a.alpha((Function1) jade, echo2, null, c0585q, 54, 4);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.no_shifts), AbstractC0538d.whiskey(pVar, 0.0f, ay.romeo, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(ay.foxtrot, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_BLOCKED), null, ay.tango, 0L, 3, 0L, 0, 16744408), c0585q, 48, 0, 65532);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
            sVar2 = pVar;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new u(sVar2, i4, 0);
        }
    }

    public static final void delta(int i4, Function1 onSelect, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        long j5;
        H0.v vVar;
        long j6;
        Intrinsics.echo(onSelect, "onSelect");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1017650282);
        if (c0585q2.echo(i4)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i5;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i11 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s charlie2 = V.charlie(pVar, 1.0f);
            long j7 = ay.juliet;
            a0.an anVar = a0.ao.alpha;
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(charlie2, j7, anVar), ay.sierra, ay.romeo);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j10 = c0585q2.magenta;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            I mike2 = c0585q2.mike();
            T.s charlie3 = T.a.charlie(tango, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike2);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i12))) {
                ao.ad.blue(i12, c0585q2, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie3);
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.charlie(pVar, 1.0f), AbstractC2094g.bravo(10)), ay.kilo, anVar), 4);
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2060c, c0585q2, 0);
            long j11 = c0585q2.magenta;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            I mike3 = c0585q2.mike();
            T.s charlie4 = T.a.charlie(sierra, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha2);
            C0564b.blue(c2549i2, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q2, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie4);
            c0585q2.purple(1021190469);
            int i14 = 0;
            for (Object obj : CollectionsKt.listOf(AbstractC3086y3.bravo(c0585q2, R.string.active), AbstractC3086y3.bravo(c0585q2, R.string.history))) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (i4 == i14) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                T.s alpha3 = AbstractC3087z.alpha(V.echo(new LayoutWeightElement(1.0f, true), 34), AbstractC2094g.bravo(6));
                if (z10) {
                    j5 = ay.alpha;
                } else {
                    j5 = C0366t.juliet;
                }
                T.s bravo2 = androidx.compose.foundation.a.bravo(alpha3, j5, anVar);
                boolean echo2 = c0585q2.echo(i14);
                Object jade = c0585q2.jade();
                if (echo2 || jade == C0580l.alpha) {
                    jade = new aq(i14, 0, onSelect);
                    c0585q2.f(jade);
                }
                T.s echo3 = androidx.compose.foundation.a.echo(15, bravo2, null, (Function0) jade, false);
                q0.ap delta3 = AbstractC0547m.delta(T.d.teal, false);
                long j12 = c0585q2.magenta;
                int i16 = (int) (j12 ^ (j12 >>> 32));
                I mike4 = c0585q2.mike();
                T.s charlie5 = T.a.charlie(echo3, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j2);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, delta3);
                C0564b.blue(C2551k.echo, c0585q2, mike4);
                C2549i c2549i5 = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                    ao.ad.blue(i16, c0585q2, i16, c2549i5);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie5);
                long charlie6 = AbstractC2636d7.charlie(14);
                H0.n nVar = ay.tango;
                if (z10) {
                    vVar = new H0.v(700);
                } else {
                    vVar = new H0.v(HttpConstants.HTTP_BLOCKED);
                }
                if (z10) {
                    j6 = ay.echo;
                } else {
                    j6 = ay.november;
                }
                C0585q c0585q3 = c0585q2;
                G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, charlie6, vVar, null, nVar, 0L, 3, 0L, 0, 16744408), c0585q3, 0, 0, 65534);
                c0585q3.quebec(false);
                c0585q2 = c0585q3;
                i14 = i15;
                anVar = null;
            }
            c0585q = c0585q2;
            A0.z.papa(c0585q, false, true, true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(onSelect, i4, i5, 0);
        }
    }

    public static final void echo(String startTime, String endTime, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        String str;
        C2550j c2550j;
        C2549i c2549i;
        Intrinsics.echo(startTime, "startTime");
        Intrinsics.echo(endTime, "endTime");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1897732902);
        if (c0585q.golf(startTime)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if (c0585q.golf(endTime)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s charlie2 = V.charlie(pVar, 1.0f);
            C0537c c0537c = AbstractC0542h.alpha;
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(ay.papa), T.d.f2060c, c0585q, 6);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(charlie2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C2549i c2549i2 = C2551k.foxtrot;
            C0564b.blue(c2549i2, c0585q, alpha2);
            C2549i c2549i3 = C2551k.echo;
            C0564b.blue(c2549i3, c0585q, mike2);
            C2549i c2549i4 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i4);
            }
            C2549i c2549i5 = C2551k.delta;
            C0564b.blue(c2549i5, c0585q, charlie3);
            T.s maroon = P0.maroon(1.0f);
            float f5 = 1;
            long j6 = ay.bravo;
            float f10 = 12;
            T.s charlie4 = R3.charlie(maroon, f5, j6, AbstractC2094g.bravo(f10));
            float f11 = ay.romeo;
            T.s sierra = AbstractC0538d.sierra(charlie4, f11);
            float f12 = ay.oscar;
            C0540f golf2 = AbstractC0542h.golf(f12);
            T.i iVar = T.d.f2063g;
            C0554u alpha3 = AbstractC0553t.alpha(golf2, iVar, c0585q, 54);
            long j7 = c0585q.magenta;
            int i14 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie5 = T.a.charlie(sierra, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha3);
            C0564b.blue(c2549i3, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ao.ad.blue(i14, c0585q, i14, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q, charlie5);
            T.j jVar = T.d.f2061d;
            S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f12), jVar, c0585q, 54);
            long j10 = c0585q.magenta;
            int i15 = (int) (j10 ^ (j10 >>> 32));
            I mike4 = c0585q.mike();
            T.s charlie6 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha4);
            C0564b.blue(c2549i3, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q, charlie6);
            AbstractC1680b charlie7 = AbstractC3076w3.charlie(R.drawable.kronometre, c0585q, 6);
            long j11 = ay.foxtrot;
            AbstractC0141o0.alpha(charlie7, null, V.kilo(pVar, f10), j11, c0585q, 3504, 0);
            String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.shift_start);
            long charlie8 = AbstractC2636d7.charlie(12);
            H0.n nVar = ay.tango;
            G2.bravo(bravo2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, charlie8, new H0.v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q.quebec(true);
            long charlie9 = AbstractC2636d7.charlie(14);
            H0.v vVar = new H0.v(700);
            long j12 = ay.echo;
            G2.bravo(startTime, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j12, charlie9, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, i12 & 14, 0, 65534);
            c0585q.quebec(true);
            T.s sierra2 = AbstractC0538d.sierra(R3.charlie(P0.maroon(1.0f), f5, j6, AbstractC2094g.bravo(f10)), f11);
            C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.golf(f12), iVar, c0585q, 54);
            long j13 = c0585q.magenta;
            int i16 = (int) (j13 ^ (j13 >>> 32));
            I mike5 = c0585q.mike();
            T.s charlie10 = T.a.charlie(sierra2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c2550j = c2550j2;
                c0585q.lima(c2550j);
            } else {
                c2550j = c2550j2;
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha5);
            C0564b.blue(c2549i3, c0585q, mike5);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                c2549i = c2549i4;
                ao.ad.blue(i16, c0585q, i16, c2549i);
            } else {
                c2549i = c2549i4;
            }
            C0564b.blue(c2549i5, c0585q, charlie10);
            S alpha6 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f12), jVar, c0585q, 54);
            long j14 = c0585q.magenta;
            int i17 = (int) (j14 ^ (j14 >>> 32));
            I mike6 = c0585q.mike();
            T.s charlie11 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha6);
            C0564b.blue(c2549i3, c0585q, mike6);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q, i17, c2549i);
            }
            C0564b.blue(c2549i5, c0585q, charlie11);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.kronometre, c0585q, 6), null, V.kilo(pVar, f10), j11, c0585q, 3504, 0);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.shift_end), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q.quebec(true);
            str = endTime;
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j12, AbstractC2636d7.charlie(14), new H0.v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, (i12 >> 3) & 14, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            str = endTime;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Bb.d(startTime, str, i4, 2);
        }
    }

    public static final void foxtrot(List list, List list2, Xd.l lVar, Function1 function1, Function1 function12, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Xd.l lVar2;
        Function1 function13;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(640687882);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(list)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(list2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            lVar2 = lVar;
            if (c0585q2.india(lVar2)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        } else {
            lVar2 = lVar;
        }
        if ((i4 & 3072) == 0) {
            function13 = function1;
            if (c0585q2.india(function13)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        } else {
            function13 = function1;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.india(function12)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        if ((196608 & i4) == 0) {
            if (c0585q2.india(function0)) {
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
        if (c0585q2.magenta(i5 & 1, z2)) {
            C1874w alpha2 = AbstractC1876y.alpha(c0585q2);
            boolean golf2 = c0585q2.golf(alpha2);
            if ((i5 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z14 = z10 | golf2;
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (z14 || jade == asVar) {
                jade = new i(alpha2, function0, null);
                c0585q2.f(jade);
            }
            C0564b.foxtrot((Xd.l) jade, c0585q2, alpha2);
            FillElement fillElement = V.charlie;
            float f5 = ay.sierra;
            float f10 = ay.romeo;
            M m4 = new M(f5, f10, f5, f10);
            C0540f golf3 = AbstractC0542h.golf(f10);
            boolean india2 = c0585q2.india(list) | c0585q2.india(list2);
            if ((i5 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = z11 | india2;
            if ((i5 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z16 = z15 | z12;
            if ((i5 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z17 = z16 | z13;
            Object jade2 = c0585q2.jade();
            if (z17 || jade2 == asVar) {
                d dVar = new d(list, list2, function13, lVar2, function12);
                c0585q2.f(dVar);
                jade2 = dVar;
            }
            c0585q = c0585q2;
            AbstractC2616b5.alpha(fillElement, alpha2, m4, golf3, null, null, false, null, (Function1) jade2, c0585q, 24966, 488);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new e(list, list2, lVar, function1, function12, function0, i4, 0);
        }
    }
}
