package db;

import F.AbstractC0141o0;
import F.G2;
import H0.v;
import a0.C0366t;
import a0.an;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f.InterfaceC1673j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
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
public abstract class o {
    public static final long alpha = ao.delta(4292138200L);
    public static final long bravo = ao.delta(4294638330L);
    public static final long charlie = ao.delta(4294243573L);
    public static final long delta = ao.delta(4285624698L);
    public static final long echo = ao.delta(4280756010L);
    public static final long foxtrot = ao.delta(4279673674L);

    public static final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1220226359);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.s bravo2 = androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.kilo(pVar, 18), AbstractC2094g.alpha), foxtrot, ao.alpha);
            ap delta2 = AbstractC0547m.delta(T.d.teal, false);
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
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            AbstractC0141o0.bravo(i6.d.alpha(), null, V.kilo(pVar, 11), C0366t.echo, c0585q, 3504, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.kmp.rememberme.di.b(i4, 24);
        }
    }

    public static final void bravo(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String str, Function0 onClick) {
        int i5;
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q;
        C0585q c0585q2;
        int i12;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(41950347);
        if (c0585q3.india(onClick)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q3.golf(sVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q3.golf(str)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if ((i15 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q3.magenta(i15 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 12;
            C2093f bravo2 = AbstractC2094g.bravo(f5);
            Object jade = c0585q3.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = ad.xray(c0585q3);
            }
            T.s alpha2 = AbstractC3087z.alpha(V.echo(V.charlie(sVar, 1.0f), 82), bravo2);
            long j5 = C0366t.echo;
            an anVar = ao.alpha;
            T.s charlie2 = androidx.compose.foundation.a.charlie(R3.charlie(androidx.compose.foundation.a.bravo(alpha2, j5, anVar), 1, alpha, bravo2), (InterfaceC1673j) jade, null, false, null, onClick, 28);
            Object jade2 = c0585q3.jade();
            if (jade2 == asVar) {
                jade2 = new com.clevertap.android.sdk.inapp.images.preload.a(10);
                c0585q3.f(jade2);
            }
            T.s bravo3 = A0.o.bravo(charlie2, false, (Function1) jade2);
            float f10 = 8;
            T.s tango = AbstractC0538d.tango(bravo3, f10, f10);
            T.k kVar = T.d.teal;
            ap delta2 = AbstractC0547m.delta(kVar, false);
            int romeo = C0564b.romeo(c0585q3);
            I mike = c0585q3.mike();
            T.s charlie3 = T.a.charlie(tango, c0585q3);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j);
            } else {
                c0585q3.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q3, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q3, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q3, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q3, charlie3);
            T.i iVar = T.d.f2063g;
            C0537c c0537c = AbstractC0542h.alpha;
            T.j jVar = T.d.f2061d;
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.india(4, jVar), iVar, c0585q3, 54);
            int romeo2 = C0564b.romeo(c0585q3);
            I mike2 = c0585q3.mike();
            T.s charlie4 = T.a.charlie(pVar, c0585q3);
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i, c0585q3, alpha3);
            C0564b.blue(c2549i2, c0585q3, mike2);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q3, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q3, charlie4);
            long j6 = bravo;
            long j7 = charlie;
            if (str != null) {
                c0585q3.purple(2045376541);
                C2093f c2093f = AbstractC2094g.alpha;
                T.s tango2 = AbstractC0538d.tango(R3.charlie(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(pVar, c2093f), j6, anVar), 2, j7, c2093f), 16, f5);
                S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f10), jVar, c0585q3, 54);
                int romeo3 = C0564b.romeo(c0585q3);
                I mike3 = c0585q3.mike();
                T.s charlie5 = T.a.charlie(tango2, c0585q3);
                c0585q3.white();
                if (c0585q3.lime) {
                    c0585q3.lima(c2550j);
                } else {
                    c0585q3.i();
                }
                C0564b.blue(c2549i, c0585q3, alpha4);
                C0564b.blue(c2549i2, c0585q3, mike3);
                if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo3))) {
                    ad.blue(romeo3, c0585q3, romeo3, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q3, charlie5);
                G2.bravo(str, null, echo, AbstractC2636d7.charlie(16), v.f1409c, null, 0L, null, AbstractC2636d7.charlie(20), 0, false, 0, 0, null, null, c0585q3, ((i15 >> 6) & 14) | 200064, 6, 130002);
                c0585q2 = c0585q3;
                alpha(c0585q2, 0);
                c0585q2.quebec(true);
                c0585q2.quebec(false);
            } else {
                c0585q3.purple(2046161740);
                T.s kilo = V.kilo(pVar, 44);
                C2093f c2093f2 = AbstractC2094g.alpha;
                T.s charlie6 = R3.charlie(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(kilo, c2093f2), j6, anVar), 2, j7, c2093f2);
                ap delta3 = AbstractC0547m.delta(kVar, false);
                int romeo4 = C0564b.romeo(c0585q3);
                I mike4 = c0585q3.mike();
                T.s charlie7 = T.a.charlie(charlie6, c0585q3);
                c0585q3.white();
                if (c0585q3.lime) {
                    c0585q3.lima(c2550j);
                } else {
                    c0585q3.i();
                }
                C0564b.blue(c2549i, c0585q3, delta3);
                C0564b.blue(c2549i2, c0585q3, mike4);
                if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo4))) {
                    ad.blue(romeo4, c0585q3, romeo4, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q3, charlie7);
                AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_edit_pencil, c0585q3, 0), null, V.kilo(pVar, 24), C0366t.kilo, c0585q3, 3504, 0);
                c0585q2 = c0585q3;
                c0585q2.quebec(true);
                c0585q2.quebec(false);
            }
            if (str != null) {
                i12 = R.string.invoice_total_price;
            } else {
                i12 = R.string.enter_invoice_total_price;
            }
            C0585q c0585q4 = c0585q2;
            G2.bravo(AbstractC3086y3.bravo(c0585q2, i12), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new D0.an(delta, AbstractC2636d7.charlie(14), v.yellow, null, null, 0L, 3, AbstractC2636d7.charlie(18), 0, 16613368), c0585q4, 0, 3072, 57342);
            c0585q = c0585q4;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q3;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.n(onClick, sVar, str, i4, 12);
        }
    }
}
