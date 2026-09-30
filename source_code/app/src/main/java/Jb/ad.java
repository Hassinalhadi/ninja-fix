package Jb;

import F.AbstractC0127k2;
import F.G2;
import F.K1;
import a0.C0346af;
import a0.C0366t;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import q0.C2391j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3071v3;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.S3;
import t6.W3;

/* loaded from: classes2.dex */
public abstract class ad {
    public static final long alpha = a0.ao.delta(4280756010L);
    public static final long bravo = a0.ao.delta(4285624698L);
    public static final long charlie = a0.ao.delta(4288782762L);
    public static final long delta = a0.ao.delta(4293190887L);
    public static final long echo = a0.ao.delta(4292138200L);

    public static final void alpha(r rVar, Ld.c quickActions, Function0 onCloseDrawer, Function0 onProfileClick, T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        Function0 function0;
        Ld.c cVar;
        T.p pVar2;
        C2550j c2550j;
        Intrinsics.echo(quickActions, "quickActions");
        Intrinsics.echo(onCloseDrawer, "onCloseDrawer");
        Intrinsics.echo(onProfileClick, "onProfileClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(495405957);
        if (c0585q.golf(rVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q.india(quickActions)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.india(onCloseDrawer)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.india(onProfileClick)) {
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
            T.p pVar3 = T.p.alpha;
            T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f);
            float f5 = 16;
            C0540f golf = AbstractC0542h.golf(f5);
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(golf, iVar, c0585q, 6);
            long j5 = c0585q.magenta;
            int i17 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie3 = T.a.charlie(charlie2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q, i17, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie3);
            float f10 = 12;
            T.s whiskey = AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), f5, f5, f10, 0.0f, 8);
            T.j jVar = T.d.f2060c;
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            long j6 = c0585q.magenta;
            int i18 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie4 = T.a.charlie(whiskey, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i18))) {
                ao.ad.blue(i18, c0585q, i18, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            T.s maroon = P0.maroon(1.0f);
            C0537c c0537c = AbstractC0542h.charlie;
            C0554u alpha4 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
            long j7 = c0585q.magenta;
            int i19 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie5 = T.a.charlie(maroon, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j2);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                ao.ad.blue(i19, c0585q, i19, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            W3.alpha(AbstractC3076w3.charlie(R.drawable.ic_stat_name, c0585q, 6), AbstractC3086y3.bravo(c0585q, R.string.app_name), androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.oscar(pVar3, 108), 21), null, C2391j.foxtrot, 0.0f, null, c0585q, 24960, 104);
            long charlie6 = AbstractC2636d7.charlie(12);
            H0.n nVar = Db.g.alpha;
            G2.bravo(rVar.echo, AbstractC0538d.whiskey(pVar3, 0.0f, 3, 0.0f, 0.0f, 13), bravo, charlie6, new H0.v(HttpConstants.HTTP_BLOCKED), nVar, 0L, null, AbstractC2636d7.charlie(15), 0, false, 1, 0, null, null, c0585q, 200112, 3078, 121744);
            c0585q.quebec(true);
            K1.foxtrot(onCloseDrawer, androidx.compose.foundation.layout.V.kilo(pVar3, 20), false, null, AbstractC0210s.delta, c0585q, ((i16 >> 6) & 14) | 196656, 28);
            c0585q.quebec(true);
            function0 = onProfileClick;
            T.s echo2 = androidx.compose.foundation.a.echo(15, AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), f5, 0.0f, 2), null, function0, false);
            androidx.compose.foundation.layout.S alpha5 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f10), jVar, c0585q, 54);
            long j10 = c0585q.magenta;
            int i20 = (int) (j10 ^ (j10 >>> 32));
            androidx.compose.runtime.I mike4 = c0585q.mike();
            T.s charlie7 = T.a.charlie(echo2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c2550j = c2550j2;
                c0585q.lima(c2550j);
            } else {
                c2550j = c2550j2;
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha5);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                ao.ad.blue(i20, c0585q, i20, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie7);
            q0.av avVar = C2391j.alpha;
            AbstractC1680b charlie8 = AbstractC3076w3.charlie(R.drawable.account_circle_fill, c0585q, 6);
            AbstractC1680b charlie9 = AbstractC3076w3.charlie(R.drawable.account_circle_fill, c0585q, 6);
            T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar3, 48);
            C2093f c2093f = AbstractC2094g.alpha;
            float f11 = 1;
            N2.p.bravo(rVar.delta, null, R3.charlie(AbstractC3087z.alpha(kilo, c2093f), f11, delta, c2093f), charlie8, charlie9, avVar, c0585q, 48, 64480);
            T.s maroon2 = P0.maroon(1.0f);
            C0554u alpha6 = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
            long j11 = c0585q.magenta;
            int i21 = (int) (j11 ^ (j11 >>> 32));
            androidx.compose.runtime.I mike5 = c0585q.mike();
            T.s charlie10 = T.a.charlie(maroon2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha6);
            C0564b.blue(c2549i2, c0585q, mike5);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                ao.ad.blue(i21, c0585q, i21, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie10);
            long charlie11 = AbstractC2636d7.charlie(14);
            H0.v vVar = new H0.v(HttpConstants.HTTP_BLOCKED);
            long charlie12 = AbstractC2636d7.charlie(18);
            String str = rVar.alpha;
            long j12 = alpha;
            G2.bravo(str, null, j12, charlie11, vVar, nVar, 0L, null, charlie12, 0, false, 1, 0, null, null, c0585q, 200064, 3078, 121746);
            float f12 = 2;
            G2.bravo(rVar.bravo, AbstractC0538d.whiskey(pVar3, 0.0f, f12, 0.0f, 0.0f, 13), j12, AbstractC2636d7.charlie(16), new H0.v(HttpConstants.HTTP_INTERNAL_ERROR), nVar, 0L, null, AbstractC2636d7.charlie(20), 2, false, 1, 0, null, null, c0585q, 200112, 3126, 119696);
            G2.bravo(rVar.charlie, AbstractC0538d.whiskey(pVar3, 0.0f, f12, 0.0f, 0.0f, 13), charlie, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_INTERNAL_ERROR), nVar, 0L, null, AbstractC2636d7.charlie(18), 2, false, 1, 0, null, null, c0585q, 200112, 3126, 119696);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
            K1.delta(null, f11, AbstractC3071v3.alpha(c0585q, R.color.nav_divider_color), c0585q, 48, 1);
            int i22 = ((i16 >> 3) & 14) | 48;
            cVar = quickActions;
            charlie(cVar, AbstractC0538d.uniform(pVar3, f5, 0.0f, 2), c0585q, i22);
            AbstractC0547m.alpha(androidx.compose.foundation.a.alpha(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 8), new C0346af(CollectionsKt.listOf(new C0366t(a0.ao.charlie(268435456)), new C0366t(a0.ao.charlie(134217728)), new C0366t(C0366t.juliet)), null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L), 0)), c0585q, 6);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            function0 = onProfileClick;
            cVar = quickActions;
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.e(rVar, cVar, onCloseDrawer, function0, pVar2, i4, 2);
        }
    }

    public static final void bravo(g0 g0Var, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        T.s sVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1837399935);
        if (c0585q.golf(g0Var)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4 | 48;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            Function0 function0 = g0Var.charlie;
            AbstractC0127k2.bravo(0.0f, 100687872, 740, C0366t.echo, 0L, P.e.echo(578820170, new Ac.k(8, g0Var), c0585q), androidx.compose.foundation.layout.V.lima(pVar, 124, 70), AbstractC2094g.bravo(12), c0585q, S3.alpha(1, echo), null, function0, false);
            sVar2 = pVar;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 5, g0Var, sVar2);
        }
    }

    public static final void charlie(Ld.c cVar, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1820469889);
        int i13 = 2;
        if ((i4 & 6) == 0) {
            if (c0585q.india(cVar)) {
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
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 8;
            int i14 = 6;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f5), T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sVar, c0585q);
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
            c0585q.purple(-1360094398);
            Intrinsics.echo(cVar, "<this>");
            kotlin.collections.ab.echo(2);
            int alpha3 = cVar.alpha();
            int i16 = alpha3 / 2;
            if (alpha3 % 2 == 0) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            ArrayList<List> arrayList = new ArrayList(i16 + i10);
            int i17 = 0;
            while (i17 >= 0 && i17 < alpha3) {
                int i18 = alpha3 - i17;
                if (i13 <= i18) {
                    i18 = i13;
                }
                ArrayList arrayList2 = new ArrayList(i18);
                for (int i19 = 0; i19 < i18; i19++) {
                    arrayList2.add(cVar.get(i19 + i17));
                }
                arrayList.add(arrayList2);
                i17 += 2;
                i13 = 2;
            }
            for (List list : arrayList) {
                androidx.compose.foundation.layout.S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f5), T.d.f2060c, c0585q, i14);
                long j6 = c0585q.magenta;
                int i20 = (int) (j6 ^ (j6 >>> 32));
                androidx.compose.runtime.I mike2 = c0585q.mike();
                T.s charlie3 = T.a.charlie(pVar, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j2);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, alpha4);
                C0564b.blue(C2551k.echo, c0585q, mike2);
                C2549i c2549i2 = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                    ao.ad.blue(i20, c0585q, i20, c2549i2);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie3);
                c0585q.purple(1528961834);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bravo((g0) it.next(), null, c0585q, 0);
                }
                c0585q.quebec(false);
                c0585q.quebec(true);
                i14 = 6;
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.aa(cVar, sVar, i4, 1);
        }
    }
}
