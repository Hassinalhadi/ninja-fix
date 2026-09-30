package db;

import A0.z;
import D0.an;
import F.AbstractC0141o0;
import F.G2;
import F.K1;
import F.ak;
import F.al;
import H0.v;
import a0.C0366t;
import a0.ao;
import a0.au;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import ao.ad;
import delivery.samurai.android.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import n.AbstractC2134i;
import n.aw;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;

/* loaded from: classes2.dex */
public abstract class q {
    public static final long alpha = ao.delta(4280756010L);
    public static final long bravo = ao.delta(4292138200L);
    public static final long charlie = ao.delta(4280756010L);
    public static final long delta = ao.delta(4280756010L);

    public static final void alpha(String str, Function1 function1, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        Function1 onSubmit = function1;
        Intrinsics.echo(onSubmit, "onSubmit");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2028659086);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i4 | i11;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onSubmit)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            T.p pVar = T.p.alpha;
            Object[] objArr = {str};
            if ((i5 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            Object obj = C0580l.alpha;
            if (z10 || jade == obj) {
                jade = new androidx.navigation.internal.i(str, 1);
                c0585q.f(jade);
            }
            ax axVar = (ax) R.l.echo(objArr, (Function0) jade, c0585q, 0);
            String e = StringsKt.e(StringsKt.b((String) axVar.getValue()).toString(), '.');
            Float sierra = kotlin.text.r.sierra(e);
            if (sierra != null && sierra.floatValue() > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = i5;
            T.s bravo2 = androidx.compose.foundation.a.bravo(V.charlie(sVar, 1.0f), C0366t.echo, ao.alpha);
            C0537c c0537c = AbstractC0542h.charlie;
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
            int romeo = C0564b.romeo(c0585q);
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
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            float f5 = 16;
            T.s romeo2 = AbstractC0538d.romeo(V.charlie(pVar, 1.0f), new M(f5, 24, f5, f5));
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf(32), iVar, c0585q, 6);
            int romeo3 = C0564b.romeo(c0585q);
            I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(romeo2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                ad.blue(romeo3, c0585q, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            String bravo3 = AbstractC3086y3.bravo(c0585q, R.string.please_enter_invoice_total_price);
            long charlie4 = AbstractC2636d7.charlie(18);
            long charlie5 = AbstractC2636d7.charlie(23);
            boolean z13 = z11;
            v vVar = v.f1409c;
            long j5 = alpha;
            G2.bravo(bravo3, null, j5, charlie4, vVar, null, 0L, null, charlie5, 0, false, 0, 0, null, null, c0585q, 200064, 6, 130002);
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), iVar, c0585q, 6);
            int romeo4 = C0564b.romeo(c0585q);
            I mike3 = c0585q.mike();
            T.s charlie6 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo4))) {
                ad.blue(romeo4, c0585q, romeo4, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.required_invoice_price), null, j5, AbstractC2636d7.charlie(18), vVar, null, 0L, null, AbstractC2636d7.charlie(23), 0, false, 0, 0, null, null, c0585q, 200064, 6, 130002);
            String str2 = (String) axVar.getValue();
            boolean golf = c0585q.golf(axVar);
            Object jade2 = c0585q.jade();
            if (golf || jade2 == obj) {
                jade2 = new Cb.i(axVar, 23);
                c0585q.f(jade2);
            }
            bravo(str2, (Function1) jade2, c0585q, 0);
            c0585q.quebec(true);
            c0585q.quebec(true);
            T.s charlie7 = V.charlie(pVar, 1.0f);
            C0554u alpha5 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
            int romeo5 = C0564b.romeo(c0585q);
            I mike4 = c0585q.mike();
            T.s charlie8 = T.a.charlie(charlie7, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha5);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo5))) {
                ad.blue(romeo5, c0585q, romeo5, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie8);
            K1.delta(null, 1, bravo, c0585q, 432, 1);
            T.s sierra2 = AbstractC0538d.sierra(V.charlie(pVar, 1.0f), f5);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            int romeo6 = C0564b.romeo(c0585q);
            I mike5 = c0585q.mike();
            T.s charlie9 = T.a.charlie(sierra2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta2);
            C0564b.blue(c2549i2, c0585q, mike5);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo6))) {
                ad.blue(romeo6, c0585q, romeo6, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie9);
            C2093f bravo4 = AbstractC2094g.bravo(12);
            M m4 = al.alpha;
            ak alpha6 = al.alpha(delta, 0L, 0L, 0L, c0585q, 14);
            M bravo5 = AbstractC0538d.bravo(1, 0.0f, f5);
            T.s charlie10 = V.charlie(pVar, 1.0f);
            boolean hotel = c0585q.hotel(z13);
            if ((i12 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean golf2 = hotel | z12 | c0585q.golf(e);
            Object jade3 = c0585q.jade();
            if (!golf2 && jade3 != obj) {
                onSubmit = function1;
            } else {
                onSubmit = function1;
                jade3 = new p(z13, onSubmit, e);
                c0585q.f(jade3);
            }
            K1.bravo((Function0) jade3, charlie10, z13, bravo4, alpha6, null, null, bravo5, n.bravo, c0585q, 817889328, 352);
            c0585q = c0585q;
            z.papa(c0585q, true, true, true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(str, onSubmit, sVar, i4, 16);
        }
    }

    public static final void bravo(String str, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2055387813);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if (c0585q.india(function1)) {
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
            T.k kVar = T.d.alpha;
            ap delta2 = AbstractC0547m.delta(kVar, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie3 = T.a.charlie(charlie2, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie3);
            C0551q c0551q = C0551q.alpha;
            float f5 = 8;
            T.s uniform = AbstractC0538d.uniform(R3.charlie(AbstractC3087z.alpha(V.echo(V.charlie(pVar, 1.0f), 56), AbstractC2094g.bravo(f5)), 1, bravo, AbstractC2094g.bravo(f5)), 16, 0.0f, 2);
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2061d, c0585q, 48);
            int romeo2 = C0564b.romeo(c0585q);
            I mike2 = c0585q.mike();
            T.s charlie4 = T.a.charlie(uniform, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.cash_line, c0585q, 0), null, V.kilo(pVar, 20), C0366t.kilo, c0585q, 3504, 0);
            AbstractC0538d.echo(V.oscar(pVar, f5), c0585q);
            aw awVar = new aw(9, 0, 123);
            long charlie5 = AbstractC2636d7.charlie(16);
            long charlie6 = AbstractC2636d7.charlie(20);
            long j5 = charlie;
            AbstractC2134i.alpha(str, function1, V.charlie(pVar, 1.0f), false, false, new an(j5, charlie5, null, null, null, 0L, 0, charlie6, 0, 16646140), awVar, null, true, 0, 0, null, null, null, new au(j5), null, c0585q, (i12 & 14) | 102236544 | (i12 & 112), 24576, 48792);
            c0585q.quebec(true);
            T.s uniform2 = AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(AbstractC0538d.quebec(AbstractC0538d.whiskey(c0551q.alpha(pVar, kVar), 12, 0.0f, 0.0f, 0.0f, 14), 0, -8), C0366t.echo, ao.alpha), 4, 0.0f, 2);
            ap delta3 = AbstractC0547m.delta(kVar, false);
            int romeo3 = C0564b.romeo(c0585q);
            I mike3 = c0585q.mike();
            T.s charlie7 = T.a.charlie(uniform2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta3);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                ad.blue(romeo3, c0585q, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie7);
            G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.invoice_price), null, alpha, AbstractC2636d7.charlie(12), v.yellow, null, 0L, null, AbstractC2636d7.charlie(16), 0, false, 0, 0, null, null, c0585q, 200064, 6, 130002);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform3 = c0585q.uniform();
        if (uniform3 != null) {
            uniform3.delta = new Cb.a(i4, 26, str, function1);
        }
    }
}
