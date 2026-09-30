package Zb;

import A0.o;
import A0.z;
import D0.an;
import Ec.aq;
import Ec.l;
import F.AbstractC0127k2;
import F.AbstractC0141o0;
import F.G2;
import F.K1;
import F.Q1;
import F.al;
import H0.n;
import H0.v;
import Lb.ag;
import T.p;
import T.s;
import U0.t;
import Xd.m;
import Yb.C0329s0;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0550p;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import ao.ad;
import com.app.network.network.models.LanguageMetaData;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.PaymentType;
import com.app.network.network.models.TaskStatus;
import com.google.android.gms.internal.measurement.AbstractC1295b1;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2215h;
import q0.C2391j;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import s6.E7;
import s6.J4;
import t0.AbstractC2901T;
import t6.AbstractC3050r2;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.W3;
import t6.X3;
import t6.ab;
import t6.ac;
import z.ak;
import z.r;

/* loaded from: classes2.dex */
public abstract class d {
    public static final P.d alpha = new P.d(new S4.b(14), -1510445998, false);
    public static final P.d bravo = new P.d(new Vc.d(4), -1439163480, false);
    public static final P.d charlie;
    public static final P.d delta;
    public static final P.d echo;
    public static final P.d foxtrot;

    static {
        new P.d(new S4.b(15), 1739123242, false);
        charlie = new P.d(new Vc.d(5), -1235652385, false);
        new P.d(new S4.b(16), -927256445, false);
        delta = new P.d(new S4.b(17), 650430258, false);
        echo = new P.d(new S4.b(18), 1166892531, false);
        foxtrot = new P.d(new S4.b(19), -1837647393, false);
    }

    public static final void alpha(Function0 onCall, Function0 onSkip, p pVar, boolean z2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z10;
        C0585q c0585q;
        p pVar2;
        H0.k kVar;
        Intrinsics.echo(onCall, "onCall");
        Intrinsics.echo(onSkip, "onSkip");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-346080401);
        if (c0585q2.india(onCall)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q2.india(onSkip)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10 | 384;
        if (c0585q2.hotel(z2)) {
            i11 = 2048;
        } else {
            i11 = Barcode.FORMAT_UPC_E;
        }
        int i14 = i13 | i11;
        if ((i14 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i14 & 1, z10)) {
            p pVar3 = p.alpha;
            try {
                kVar = new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)}));
            } catch (Exception unused) {
                kVar = H0.k.alpha;
            }
            float f5 = 20;
            c0585q = c0585q2;
            AbstractC0127k2.alpha(V.charlie(pVar3, 1.0f), AbstractC2094g.delta(f5, f5), C0366t.echo, 0L, 0.0f, 0.0f, null, P.e.echo(-153047926, new Gb.i(kVar, z2, onCall, onSkip), c0585q2), c0585q, 12583296, 120);
            pVar2 = pVar3;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.i(onCall, onSkip, pVar2, z2, i4);
        }
    }

    public static final void bravo(String str, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        int i11;
        boolean z10;
        float f5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1680058983);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if ((i13 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i13 & 1, z2)) {
            p pVar = p.alpha;
            float f10 = 12;
            s bravo2 = androidx.compose.foundation.a.bravo(R3.charlie(V.echo(V.charlie(pVar, 1.0f), 60), 1, ao.delta(4292138200L), AbstractC2094g.bravo(f10)), ao.delta(4294967295L), AbstractC2094g.bravo(f10));
            if ((i13 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Bb.a(function0, 23);
                c0585q.f(jade);
            }
            float f11 = 16;
            s victor = AbstractC0538d.victor(androidx.compose.foundation.a.echo(15, bravo2, null, (Function0) jade, false), f11, f11, f11, f11);
            J1.e eVar = AbstractC0542h.golf;
            T.j jVar = T.d.f2061d;
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(eVar, jVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i14 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(victor, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.hotel(8, T.d.f2063g), jVar, c0585q, 54);
            long j6 = c0585q.magenta;
            int i15 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie3 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q, i15, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            z.s.alpha(AbstractC3076w3.charlie(R.drawable.ticket, c0585q, 6), null, V.kilo(pVar, 20), ao.delta(4280756010L), c0585q, 3504, 0);
            ak.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4280756010L), AbstractC2636d7.charlie(16), new v(700), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, i13 & 14, 0, 65534);
            c0585q = c0585q;
            i11 = 1;
            c0585q.quebec(true);
            if (((Q0.n) c0585q.kilo(AbstractC2901T.november)) == Q0.n.purple) {
                f5 = -1.0f;
            } else {
                f5 = 1.0f;
            }
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.forward, c0585q, 6), null, ab.charlie(V.kilo(pVar, f11), f5), ao.delta(4287532691L), c0585q, 3120, 0);
            c0585q.quebec(true);
        } else {
            i11 = 1;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Pc.a(i4, i11, str, function0);
        }
    }

    public static final void charlie(List orderIds, Map map, Function1 onOrderSelected, Function0 onDismiss, s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        s sVar2;
        boolean z10;
        Intrinsics.echo(orderIds, "orderIds");
        Intrinsics.echo(onOrderSelected, "onOrderSelected");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-678904568);
        if (c0585q.india(orderIds)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q.india(map)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.india(onOrderSelected)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.india(onDismiss)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12 | 24576;
        if ((i16 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            p pVar = p.alpha;
            float f5 = 24;
            float f10 = 0;
            float f11 = 16;
            float f12 = 12;
            s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(V.romeo(pVar), ao.delta(4294967295L), AbstractC2094g.charlie(f5, f5, f10, f10)), f11, f12, f11, f5);
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f india = AbstractC0542h.india(f5, T.d.f2060c);
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(india, iVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i17 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(victor, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ad.blue(i17, c0585q, i17, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            s charlie3 = V.charlie(pVar, 1.0f);
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q, 54);
            long j6 = c0585q.magenta;
            int i18 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie4 = T.a.charlie(charlie3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i18))) {
                ad.blue(i18, c0585q, i18, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            ak.bravo(AbstractC3086y3.bravo(c0585q, R.string.choose_order), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4280756010L), AbstractC2636d7.charlie(18), new v(900), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q = c0585q;
            r.alpha(((i16 >> 9) & 14) | 24624, alpha, V.kilo(pVar, f5), c0585q, onDismiss, false);
            c0585q.quebec(true);
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(f12), iVar, c0585q, 6);
            long j7 = c0585q.magenta;
            int i19 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            s charlie5 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                ad.blue(i19, c0585q, i19, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            c0585q.purple(1586015071);
            Iterator it = orderIds.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                String str = (String) map.get(Integer.valueOf(intValue));
                if (str == null) {
                    str = String.valueOf(intValue);
                }
                if ((i16 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean echo2 = c0585q.echo(intValue) | z10;
                Object jade = c0585q.jade();
                if (echo2 || jade == C0580l.alpha) {
                    jade = new aq(intValue, 1, onOrderSelected);
                    c0585q.f(jade);
                }
                bravo(str, (Function0) jade, c0585q, 0);
            }
            z.papa(c0585q, false, true, true);
            sVar2 = pVar;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.e(orderIds, map, onOrderSelected, onDismiss, sVar2, i4, 3);
        }
    }

    public static final void delta(Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1221306637);
        if ((i4 & 6) == 0) {
            if (c0585q.india(function0)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            p pVar = p.alpha;
            float f5 = 16;
            s uniform = AbstractC0538d.uniform(V.charlie(pVar, 1.0f), f5, 0.0f, 2);
            long j5 = C0366t.echo;
            s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(uniform, j5, AbstractC2094g.bravo(24)), f5);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j6 = c0585q.magenta;
            int i12 = (int) (j6 ^ (j6 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(sierra, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f india = AbstractC0542h.india(f5, T.d.f2060c);
            T.i iVar = T.d.f2063g;
            s charlie3 = V.charlie(pVar, 1.0f);
            C0554u alpha2 = AbstractC0553t.alpha(india, iVar, c0585q, 54);
            long j7 = c0585q.magenta;
            int i13 = (int) (j7 ^ (j7 >>> 32));
            I mike2 = c0585q.mike();
            s charlie4 = T.a.charlie(charlie3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            W3.alpha(AbstractC3076w3.charlie(R.drawable.ic_pin_distance, c0585q, 6), null, V.kilo(pVar, 48), null, C2391j.bravo, 0.0f, null, c0585q, 25008, 104);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.multi_pickup_title), V.charlie(pVar, 1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4278190080L), AbstractC2636d7.charlie(18), new v(700), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, 48, 0, 65532);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.multi_pickup_info), V.charlie(pVar, 1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4283585115L), AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BLOCKED), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, 48, 0, 65532);
            float f10 = 12;
            i10 = 2;
            W3.alpha(AbstractC3076w3.charlie(R.drawable.img_multi_pickup_map, c0585q, 6), null, AbstractC3087z.alpha(V.charlie(pVar, 1.0f), AbstractC2094g.bravo(f10)), null, C2391j.charlie, 0.0f, null, c0585q, 24624, 104);
            s echo2 = V.echo(V.charlie(pVar, 1.0f), 56);
            C2093f bravo2 = AbstractC2094g.bravo(f10);
            M m4 = al.alpha;
            F.ak alpha3 = al.alpha(ao.delta(4278190080L), j5, 0L, 0L, c0585q, 12);
            c0585q = c0585q;
            K1.bravo(function0, echo2, false, bravo2, alpha3, null, null, null, charlie, c0585q, (i5 & 14) | 805306416, 484);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            i10 = 2;
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Cb.h(i4, i10, function0);
        }
    }

    public static final void echo(boolean z2, Function0 function0, Function0 function02, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        boolean z10;
        Function0 function03;
        Function0 function04;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(67398092);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i5 | i4;
        if (c0585q.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.india(function02)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i15 & 1, z10)) {
            if (!z2) {
                Q uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new f(z2, function0, function02, i4, 2);
                    return;
                }
                return;
            }
            function03 = function0;
            function04 = function02;
            i12 = i4;
            E7.alpha(function03, new t(3, false), P.e.echo(-1881974443, new l(function04, 7), c0585q), c0585q, ((i15 >> 3) & 14) | 432, 0);
        } else {
            function03 = function0;
            function04 = function02;
            i12 = i4;
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new f(z2, function03, function04, i12, 3);
        }
    }

    public static final void foxtrot(final ax orderState, final ax isRefreshingState, final Function0 onRefresh, final Function0 onBack, final boolean z2, final Function0 onCallSupport, final Map notesByTaskId, final Map expandedByTaskId, Map map, final ax timerTextState, final ax timerLabelState, final C0329s0 orderTasksEvents, final Function1 onCallCustomer, final Set checkedItemIds, final Xd.l onItemCheckedChange, final Function1 onUploadInvoice, final Function1 onProofOfPickup, final D0 d02, final ax attachmentUpdateTriggerState, final Function0 function0, final Function0 function02, final D0 d03, final D0 d04, final D0 d05, InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10, final int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        C0585q c0585q;
        final Map map2;
        Intrinsics.echo(orderState, "orderState");
        Intrinsics.echo(isRefreshingState, "isRefreshingState");
        Intrinsics.echo(onRefresh, "onRefresh");
        Intrinsics.echo(onBack, "onBack");
        Intrinsics.echo(onCallSupport, "onCallSupport");
        Intrinsics.echo(notesByTaskId, "notesByTaskId");
        Intrinsics.echo(expandedByTaskId, "expandedByTaskId");
        Intrinsics.echo(timerTextState, "timerTextState");
        Intrinsics.echo(timerLabelState, "timerLabelState");
        Intrinsics.echo(orderTasksEvents, "orderTasksEvents");
        Intrinsics.echo(onCallCustomer, "onCallCustomer");
        Intrinsics.echo(checkedItemIds, "checkedItemIds");
        Intrinsics.echo(onItemCheckedChange, "onItemCheckedChange");
        Intrinsics.echo(onUploadInvoice, "onUploadInvoice");
        Intrinsics.echo(onProofOfPickup, "onProofOfPickup");
        Intrinsics.echo(attachmentUpdateTriggerState, "attachmentUpdateTriggerState");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-884188101);
        if ((i4 & 6) == 0) {
            i12 = i4 | (c0585q2.golf(orderState) ? 4 : 2);
        } else {
            i12 = i4;
        }
        if ((i4 & 48) == 0) {
            i12 |= c0585q2.golf(isRefreshingState) ? 32 : 16;
        }
        int i16 = i4 & 384;
        int i17 = Barcode.FORMAT_QR_CODE;
        if (i16 == 0) {
            i12 |= c0585q2.india(onRefresh) ? 256 : 128;
        }
        int i18 = i4 & 3072;
        int i19 = Barcode.FORMAT_UPC_E;
        if (i18 == 0) {
            i12 |= c0585q2.india(onBack) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            z10 = z2;
            i12 |= c0585q2.hotel(z10) ? 16384 : 8192;
        } else {
            z10 = z2;
        }
        if ((i4 & 196608) == 0) {
            i12 |= c0585q2.india(onCallSupport) ? 131072 : 65536;
        }
        int i20 = i12 | (c0585q2.india(notesByTaskId) ? 1048576 : 524288);
        if ((i4 & 12582912) == 0) {
            i20 |= c0585q2.india(expandedByTaskId) ? 8388608 : 4194304;
        }
        int i21 = i11 & Barcode.FORMAT_QR_CODE;
        if (i21 != 0) {
            i13 = i20 | 100663296;
        } else {
            i13 = i20 | (c0585q2.india(map) ? 67108864 : 33554432);
        }
        if ((i4 & 805306368) == 0) {
            i13 |= c0585q2.golf(timerTextState) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i14 = i5 | (c0585q2.golf(timerLabelState) ? 4 : 2);
        } else {
            i14 = i5;
        }
        int i22 = i14 | (c0585q2.golf(orderTasksEvents) ? 32 : 16);
        if ((i5 & 384) == 0) {
            i22 |= c0585q2.india(onCallCustomer) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i22 |= c0585q2.india(checkedItemIds) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i22 |= c0585q2.india(onItemCheckedChange) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i22 |= c0585q2.india(onUploadInvoice) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i22 |= c0585q2.india(onProofOfPickup) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i22 |= c0585q2.golf(d02) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i22 |= c0585q2.golf(attachmentUpdateTriggerState) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i22 |= c0585q2.india(function0) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i15 = i10 | (c0585q2.india(function02) ? 4 : 2);
        } else {
            i15 = i10;
        }
        if ((i10 & 48) == 0) {
            i15 |= c0585q2.golf(d03) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            if (!c0585q2.golf(d04)) {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (c0585q2.golf(d05)) {
                i19 = 2048;
            }
            i15 |= i19;
        }
        if (c0585q2.magenta(i13 & 1, ((i13 & 306783379) == 306783378 && (i22 & 306783379) == 306783378 && (i15 & 1171) == 1170) ? false : true)) {
            final Map map3 = i21 != 0 ? kotlin.collections.t.alpha : map;
            c0585q = c0585q2;
            Q1.alpha(null, P.e.echo(223344631, new f(onBack, z10, onCallSupport), c0585q2), null, null, null, 0, Db.c.indigo, 0L, null, P.e.echo(234701964, new m() { // from class: Zb.h
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z11;
                    int i23;
                    L paddingValues = (L) obj;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    Intrinsics.echo(paddingValues, "paddingValues");
                    if ((intValue & 6) == 0) {
                        if (((C0585q) interfaceC0581m2).golf(paddingValues)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        intValue |= i23;
                    }
                    if ((intValue & 19) != 18) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                    if (c0585q3.magenta(intValue & 1, z11)) {
                        boolean booleanValue = ((Boolean) isRefreshingState.getValue()).booleanValue();
                        s romeo = AbstractC0538d.romeo(V.charlie, paddingValues);
                        final D0 d06 = d02;
                        final D0 d07 = d03;
                        final D0 d08 = d04;
                        final D0 d09 = d05;
                        final ax axVar = orderState;
                        final ax axVar2 = attachmentUpdateTriggerState;
                        final Map map4 = notesByTaskId;
                        final Map map5 = expandedByTaskId;
                        final Map map6 = map3;
                        final ax axVar3 = timerTextState;
                        final ax axVar4 = timerLabelState;
                        final C0329s0 c0329s0 = orderTasksEvents;
                        final Function1 function1 = onCallCustomer;
                        final Set set = checkedItemIds;
                        final Xd.l lVar = onItemCheckedChange;
                        final Function1 function12 = onUploadInvoice;
                        final Function1 function13 = onProofOfPickup;
                        final Function0 function03 = function0;
                        final Function0 function04 = function02;
                        G.l.alpha(booleanValue, Function0.this, romeo, null, null, null, P.e.echo(437291494, new m() { // from class: Zb.j
                            /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x0192  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x019e  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
                            /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
                            /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
                            /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
                            @Override // Xd.m
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                boolean z12;
                                int size;
                                Integer valueOf;
                                int i24;
                                PaymentType paymentType;
                                Integer num;
                                String bravo2;
                                boolean z13 = false;
                                InterfaceC0550p PullToRefreshBox = (InterfaceC0550p) obj4;
                                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                Intrinsics.echo(PullToRefreshBox, "$this$PullToRefreshBox");
                                if ((intValue2 & 17) != 16) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                C0585q c0585q4 = (C0585q) interfaceC0581m3;
                                if (c0585q4.magenta(intValue2 & 1, z12)) {
                                    p pVar = p.alpha;
                                    s bravo3 = androidx.compose.foundation.a.bravo(X3.bravo(V.charlie(pVar, 1.0f), X3.alpha(c0585q4), true), Db.c.indigo, ao.alpha);
                                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q4, 0);
                                    long j5 = c0585q4.magenta;
                                    int i25 = (int) (j5 ^ (j5 >>> 32));
                                    I mike = c0585q4.mike();
                                    s charlie2 = T.a.charlie(bravo3, c0585q4);
                                    InterfaceC2552l.maroon.getClass();
                                    C2550j c2550j = C2551k.bravo;
                                    c0585q4.white();
                                    if (c0585q4.lime) {
                                        c0585q4.lima(c2550j);
                                    } else {
                                        c0585q4.i();
                                    }
                                    C0564b.blue(C2551k.foxtrot, c0585q4, alpha2);
                                    C0564b.blue(C2551k.echo, c0585q4, mike);
                                    C2549i c2549i = C2551k.golf;
                                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i25))) {
                                        ad.blue(i25, c0585q4, i25, c2549i);
                                    }
                                    C0564b.blue(C2551k.delta, c0585q4, charlie2);
                                    AbstractC0538d.echo(V.echo(pVar, 24), c0585q4);
                                    Order order = (Order) axVar.getValue();
                                    if (order != null) {
                                        c0585q4.purple(-1754146880);
                                        List<OrderTask> tasks = order.getTasks();
                                        if (tasks == null) {
                                            tasks = CollectionsKt.emptyList();
                                        }
                                        Integer totalTasks = order.getTotalTasks();
                                        String str = null;
                                        if (totalTasks != null) {
                                            if (totalTasks.intValue() <= 0) {
                                                totalTasks = null;
                                            }
                                            if (totalTasks != null) {
                                                size = totalTasks.intValue();
                                                int i26 = size;
                                                Intrinsics.echo(tasks, "tasks");
                                                if (!tasks.isEmpty()) {
                                                    valueOf = null;
                                                } else {
                                                    List p4 = CollectionsKt.p(tasks, new Sb.k(10));
                                                    Iterator it = p4.iterator();
                                                    int i27 = 0;
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            OrderTask orderTask = (OrderTask) it.next();
                                                            if (orderTask.getTaskStatus() != TaskStatus.COMPLETED && orderTask.getTaskStatus() != TaskStatus.CANCELLED) {
                                                                break;
                                                            }
                                                            i27++;
                                                        } else {
                                                            i27 = -1;
                                                            break;
                                                        }
                                                    }
                                                    if (i27 < 0) {
                                                        i27 = p4.size();
                                                    }
                                                    int i28 = i27 + 1;
                                                    int size2 = p4.size();
                                                    if (i28 > size2) {
                                                        i28 = size2;
                                                    }
                                                    valueOf = Integer.valueOf(i28);
                                                }
                                                if (valueOf == null) {
                                                    i24 = J4.delta(valueOf.intValue() - 1, 0, i26);
                                                } else if (tasks.isEmpty()) {
                                                    i24 = 0;
                                                } else {
                                                    Iterator<T> it2 = tasks.iterator();
                                                    int i29 = 0;
                                                    while (it2.hasNext()) {
                                                        if (((OrderTask) it2.next()).getTaskStatus() == TaskStatus.COMPLETED && (i29 = i29 + 1) < 0) {
                                                            CollectionsKt.t();
                                                            throw null;
                                                        }
                                                    }
                                                    i24 = i29;
                                                }
                                                paymentType = order.getPaymentType();
                                                if (paymentType == null) {
                                                    num = Integer.valueOf(paymentType.getType());
                                                } else {
                                                    num = null;
                                                }
                                                if (num != null) {
                                                    c0585q4.purple(-1753710153);
                                                    c0585q4.quebec(false);
                                                    bravo2 = null;
                                                } else {
                                                    c0585q4.purple(-1753710152);
                                                    bravo2 = AbstractC3086y3.bravo(c0585q4, num.intValue());
                                                    c0585q4.quebec(false);
                                                }
                                                if (bravo2 != null) {
                                                    c0585q4.purple(-1753656833);
                                                } else {
                                                    c0585q4.purple(-1753656832);
                                                    str = AbstractC3086y3.alpha(R.string.paymentMethod, new Object[]{bravo2}, c0585q4);
                                                }
                                                c0585q4.quebec(false);
                                                AbstractC3050r2.bravo(order, map4, map5, map6, axVar3, axVar4, i24, i26, valueOf, c0329s0, function1, str, null, set, lVar, function12, function13, d06, ((Number) axVar2.getValue()).intValue(), function03, function04, d07, d08, d09, null, c0585q4, 0);
                                                z13 = false;
                                            }
                                        }
                                        size = tasks.size();
                                        if (size < 1) {
                                            size = 1;
                                        }
                                        int i262 = size;
                                        Intrinsics.echo(tasks, "tasks");
                                        if (!tasks.isEmpty()) {
                                        }
                                        if (valueOf == null) {
                                        }
                                        paymentType = order.getPaymentType();
                                        if (paymentType == null) {
                                        }
                                        if (num != null) {
                                        }
                                        if (bravo2 != null) {
                                        }
                                        c0585q4.quebec(false);
                                        AbstractC3050r2.bravo(order, map4, map5, map6, axVar3, axVar4, i24, i262, valueOf, c0329s0, function1, str, null, set, lVar, function12, function13, d06, ((Number) axVar2.getValue()).intValue(), function03, function04, d07, d08, d09, null, c0585q4, 0);
                                        z13 = false;
                                    } else {
                                        c0585q4.purple(-1759828622);
                                    }
                                    c0585q4.quebec(z13);
                                    c0585q4.quebec(true);
                                } else {
                                    c0585q4.ochre();
                                }
                                return Unit.INSTANCE;
                            }
                        }, c0585q3), c0585q3, 1572864);
                    } else {
                        c0585q3.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q), c0585q, 805306416, 445);
            map2 = map3;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            map2 = map;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Zb.i
                /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map, java.lang.Object] */
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    int cyan2 = C0564b.cyan(i5);
                    int cyan3 = C0564b.cyan(i10);
                    ?? r92 = map2;
                    D0 d06 = d02;
                    D0 d07 = d03;
                    D0 d08 = d04;
                    D0 d09 = d05;
                    int i23 = i11;
                    d.foxtrot(ax.this, isRefreshingState, onRefresh, onBack, z2, onCallSupport, notesByTaskId, expandedByTaskId, r92, timerTextState, timerLabelState, orderTasksEvents, onCallCustomer, checkedItemIds, onItemCheckedChange, onUploadInvoice, onProofOfPickup, d06, attachmentUpdateTriggerState, function0, function02, d07, d08, d09, (InterfaceC0581m) obj, cyan, cyan2, cyan3, i23);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static final void golf(List metadata, s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        s sVar2;
        Intrinsics.echo(metadata, "metadata");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1655876831);
        int i10 = 2;
        if (c0585q2.india(metadata)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4 | 48;
        boolean z10 = 1;
        boolean z11 = false;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i11 & 1, z2)) {
            p pVar = p.alpha;
            if (metadata.isEmpty()) {
                Q uniform = c0585q2.uniform();
                if (uniform != null) {
                    uniform.delta = new k(i4, metadata);
                    return;
                }
                return;
            }
            C2093f bravo2 = AbstractC2094g.bravo(AbstractC2215h.bravo);
            float f5 = 1.0f;
            s charlie2 = V.charlie(pVar, 1.0f);
            float f10 = AbstractC2215h.golf;
            long j5 = AbstractC2215h.hotel;
            float f11 = 0.0f;
            s bravo3 = X3.bravo(V.golf(AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(ac.alpha(charlie2, f10, bravo2, j5, j5, 4), bravo2), AbstractC2215h.alpha, ao.alpha), AbstractC2215h.charlie), 0.0f, 92, 1), X3.alpha(c0585q2), true);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            long j6 = c0585q2.magenta;
            int i12 = (int) (j6 ^ (j6 >>> 32));
            I mike = c0585q2.mike();
            s charlie3 = T.a.charlie(bravo3, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q2, i12, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie3);
            c0585q2.purple(-1805833735);
            Iterator it = metadata.iterator();
            while (it.hasNext()) {
                LanguageMetaData languageMetaData = (LanguageMetaData) it.next();
                float f12 = i10;
                s uniform2 = AbstractC0538d.uniform(V.charlie(pVar, f5), f11, f12, z10);
                S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2060c, c0585q2, 6);
                long j7 = c0585q2.magenta;
                int i13 = (int) (j7 ^ (j7 >>> 32));
                I mike2 = c0585q2.mike();
                s charlie4 = T.a.charlie(uniform2, c0585q2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j2);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q2, alpha3);
                C0564b.blue(C2551k.echo, c0585q2, mike2);
                C2549i c2549i2 = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i13))) {
                    ad.blue(i13, c0585q2, i13, c2549i2);
                }
                C0564b.blue(C2551k.delta, c0585q2, charlie4);
                String label = languageMetaData.getLabel();
                String str = "";
                if (label == null) {
                    label = "";
                }
                long j10 = AbstractC2215h.delta;
                long j11 = AbstractC2215h.echo;
                v vVar = AbstractC2215h.foxtrot;
                s whiskey = AbstractC0538d.whiskey(pVar, 0.0f, 0.0f, f12, 0.0f, 11);
                p pVar2 = pVar;
                int i14 = i10;
                float f13 = f11;
                float f14 = f5;
                boolean z12 = z10;
                C0585q c0585q3 = c0585q2;
                G2.bravo(label, whiskey, j10, j11, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 48, 0, 131024);
                G2.bravo(":", null, j10, j11, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 6, 0, 131026);
                String data = languageMetaData.getData();
                if (data != null) {
                    str = data;
                }
                G2.bravo(str, AbstractC0538d.whiskey(pVar2, Db.f.charlie, 0.0f, 0.0f, 0.0f, 14), j10, j11, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 0, 0, 131024);
                c0585q3.quebec(z12);
                z10 = z12;
                c0585q2 = c0585q3;
                pVar = pVar2;
                i10 = i14;
                f5 = f14;
                f11 = f13;
                z11 = false;
            }
            c0585q = c0585q2;
            c0585q.quebec(z11);
            c0585q.quebec(z10);
            sVar2 = pVar;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform3 = c0585q.uniform();
        if (uniform3 != null) {
            uniform3.delta = new Sb.a(metadata, sVar2, i4, 3);
        }
    }

    public static final void hotel(int i4, p pVar, InterfaceC0581m interfaceC0581m, Function0 onClick) {
        int i5;
        boolean z2;
        p pVar2;
        int i10 = 1;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-249670905);
        if (c0585q.india(onClick)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4 | 48;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            pVar2 = p.alpha;
            float f5 = 12;
            s alpha2 = AbstractC1295b1.alpha(androidx.compose.foundation.a.bravo(R3.charlie(V.echo(V.charlie(pVar2, 1.0f), 88), 1, ao.delta(4292138200L), AbstractC2094g.bravo(f5)), ao.delta(4294967295L), AbstractC2094g.bravo(f5)), onClick, c0585q);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new X9.i(22);
                c0585q.f(jade);
            }
            s tango = AbstractC0538d.tango(o.bravo(alpha2, false, (Function1) jade), 22, 8);
            T.k kVar = T.d.teal;
            ap delta2 = AbstractC0547m.delta(kVar, false);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(tango, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.india(4, T.d.f2061d), T.d.f2063g, c0585q, 54);
            long j6 = c0585q.magenta;
            int i13 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie3 = T.a.charlie(pVar2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            long delta3 = ao.delta(4294243573L);
            C2093f c2093f = AbstractC2094g.alpha;
            s bravo2 = androidx.compose.foundation.a.bravo(R3.charlie(V.kilo(pVar2, 44), 2, delta3, c2093f), ao.delta(4294638330L), c2093f);
            ap delta4 = AbstractC0547m.delta(kVar, false);
            long j7 = c0585q.magenta;
            int i14 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            s charlie4 = T.a.charlie(bravo2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            z.s.alpha(AbstractC3076w3.charlie(R.drawable.qr_code_fill, c0585q, 6), null, V.kilo(pVar2, 24), ao.delta(4285624698L), c0585q, 3504, 0);
            c0585q.quebec(true);
            ak.bravo(AbstractC3086y3.bravo(c0585q, R.string.scan_qr_code), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4285624698L), AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BLOCKED), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q = c0585q;
            i10 = 1;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ag(onClick, pVar2, i4, i10);
        }
    }
}
