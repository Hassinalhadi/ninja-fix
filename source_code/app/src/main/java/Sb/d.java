package Sb;

import D0.an;
import Ec.aa;
import Ec.al;
import Ec.u;
import F.G2;
import H0.n;
import H0.v;
import Lb.C0221d;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import a0.ao;
import android.content.Context;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import bz.AbstractC0779d;
import bz.AbstractC0800z;
import bz.aj;
import bz.at;
import bz.f0;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import f.InterfaceC1673j;
import f0.AbstractC1680b;
import h.AbstractC1797a;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import q0.C2391j;
import q0.C2394m;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import s6.J4;
import t6.AbstractC3071v3;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.M3;
import t6.R3;
import t6.W3;
import t6.ac;
import z.ak;

/* loaded from: classes2.dex */
public abstract class d {
    public static final P.d alpha = new P.d(new C0221d(21), 259912234, false);
    public static final P.d bravo = new P.d(new C0221d(22), -2121567798, false);

    public static final void alpha(c cVar, Function0 onClick, s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        int i10;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-741663672);
        if (c0585q.india(cVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if ((i4 & 48) == 0) {
            if (c0585q.india(onClick)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i11 |= i10;
        }
        if ((i11 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            p pVar = p.alpha;
            s charlie = V.charlie(sVar, 1.0f);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = ad.xray(c0585q);
            }
            InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade;
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade2 = c0585q.jade();
            if (z10 || jade2 == asVar) {
                jade2 = new Bb.a(onClick, 20);
                c0585q.f(jade2);
            }
            float f5 = 16;
            s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(R3.charlie(androidx.compose.foundation.a.charlie(charlie, interfaceC1673j, null, false, null, (Function0) jade2, 28), 5, Db.c.emerald, AbstractC2094g.bravo(f5)), Db.c.jade, AbstractC2094g.bravo(f5)), 0.0f, f5, 1);
            float f10 = 12;
            s uniform2 = AbstractC0538d.uniform(uniform, f10, 0.0f, 2);
            C0540f golf = AbstractC0542h.golf(14);
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(golf, iVar, c0585q, 6);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(uniform2, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            s charlie3 = V.charlie(pVar, 1.0f);
            S alpha3 = Q.alpha(AbstractC0542h.alpha, T.d.f2060c, c0585q, 48);
            long j6 = c0585q.magenta;
            int i13 = (int) (j6 ^ (j6 >>> 32));
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            s sierra = AbstractC0538d.sierra(R3.charlie(V.kilo(pVar, 42), 1, Db.c.lavender, AbstractC2094g.bravo(8)), 4);
            ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j7 = c0585q.magenta;
            int i14 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            s charlie5 = T.a.charlie(sierra, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q, i14, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie5);
            W3.alpha(AbstractC3076w3.charlie(cVar.charlie, c0585q, 0), null, AbstractC3087z.alpha(V.kilo(pVar, 36), AbstractC2094g.bravo(6)), null, C2391j.bravo, 0.0f, null, c0585q, 24624, 104);
            c0585q.quebec(true);
            AbstractC0538d.echo(V.oscar(pVar, f10), c0585q);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(2), iVar, c0585q, 6);
            long j10 = c0585q.magenta;
            int i15 = (int) (j10 ^ (j10 >>> 32));
            I mike4 = c0585q.mike();
            s charlie6 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q, i15, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie6);
            ak.bravo(cVar.alpha, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, new an(Db.c.lime, AbstractC2636d7.charlie(22), new v(700), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 3120, 55294);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
            delta(cVar.bravo, V.charlie(pVar, 1.0f), c0585q, 48);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform3 = c0585q.uniform();
        if (uniform3 != null) {
            uniform3.delta = new al(cVar, onClick, sVar, i4, 5);
        }
    }

    public static final void bravo(List items, s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Intrinsics.echo(items, "items");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1800023358);
        if (c0585q.india(items)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        boolean z10 = false;
        boolean z11 = true;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            p pVar = p.alpha;
            s charlie = V.charlie(sVar, 1.0f);
            int i11 = 12;
            C0540f golf = AbstractC0542h.golf(12);
            T.j jVar = T.d.f2061d;
            int i12 = 54;
            S alpha2 = Q.alpha(golf, jVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(charlie, c0585q);
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
                ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            c0585q.purple(1435922612);
            Iterator it = items.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                S alpha3 = Q.alpha(AbstractC0542h.golf(6), jVar, c0585q, i12);
                long j6 = c0585q.magenta;
                int i14 = (int) (j6 ^ (j6 >>> 32));
                I mike2 = c0585q.mike();
                s charlie3 = T.a.charlie(pVar, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q.white();
                int i15 = i11;
                if (c0585q.lime) {
                    c0585q.lima(c2550j2);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, alpha3);
                C0564b.blue(C2551k.echo, c0585q, mike2);
                C2549i c2549i2 = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                    ad.blue(i14, c0585q, i14, c2549i2);
                }
                C0564b.blue(C2551k.delta, c0585q, charlie3);
                C0585q c0585q2 = c0585q;
                ak.bravo(String.valueOf(gVar.alpha), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(Db.c.lime, AbstractC2636d7.charlie(i15), new v(700), null, null, 0L, 0, 0L, 0, 16777208), c0585q2, 0, 0, 65534);
                ak.bravo(gVar.bravo, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(Db.c.black, AbstractC2636d7.charlie(i15), new v(HttpConstants.HTTP_BLOCKED), null, null, 0L, 0, 0L, 0, 16777208), c0585q2, 0, 0, 65534);
                c0585q = c0585q2;
                c0585q.quebec(true);
                z11 = true;
                i11 = i15;
                pVar = pVar;
                i12 = i12;
                jVar = jVar;
                z10 = false;
            }
            c0585q.quebec(z10);
            c0585q.quebec(z11);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a(items, sVar, i4, 0);
        }
    }

    public static final void charlie(float f5, s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-61580282);
        if (c0585q.delta(f5)) {
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
            float f10 = 100;
            s alpha2 = AbstractC3087z.alpha(V.echo(sVar, 6), AbstractC2094g.bravo(f10));
            long j5 = Db.c.azure;
            a0.an anVar = ao.alpha;
            s bravo2 = androidx.compose.foundation.a.bravo(alpha2, j5, anVar);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
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
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(V.charlie(V.bravo, J4.charlie(f5, 0.0f, 1.0f)), AbstractC2094g.bravo(f10)), ao.delta(4283215696L), anVar), c0585q, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b(f5, i4, 0, sVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0278, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14.jade(), java.lang.Integer.valueOf(r8)) == false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void delta(h hVar, s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        boolean z10;
        int i11;
        Triple triple;
        float f5;
        boolean z11;
        boolean z12;
        C2549i c2549i;
        long j5;
        String str;
        Integer num;
        int i12;
        float f10;
        long currentTimeMillis;
        int i13;
        long j6;
        Object valueOf;
        float charlie;
        boolean z13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1783581351);
        if (c0585q.india(hVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if ((i14 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            p pVar = p.alpha;
            boolean z14 = hVar.lima;
            if (z14) {
                c0585q.purple(1631785372);
                Date date = hVar.india;
                boolean golf = c0585q.golf(date);
                Integer num2 = hVar.juliet;
                boolean golf2 = golf | c0585q.golf(num2);
                i10 = 1;
                Integer num3 = hVar.kilo;
                boolean golf3 = golf2 | c0585q.golf(num3);
                i11 = 2;
                Object jade = c0585q.jade();
                as asVar = C0580l.alpha;
                if (golf3 || jade == asVar) {
                    if (num2 != null) {
                        i12 = num2.intValue();
                    } else if (num3 != null) {
                        i12 = num3.intValue();
                    } else {
                        i12 = 0;
                    }
                    long j7 = i12;
                    if (j7 < 0) {
                        j7 = 0;
                    }
                    jade = Long.valueOf(j7);
                    c0585q.f(jade);
                }
                long longValue = ((Number) jade).longValue();
                boolean golf4 = c0585q.golf(date) | c0585q.golf(num2) | c0585q.golf(num3);
                Object jade2 = c0585q.jade();
                if (!golf4 && jade2 != asVar) {
                    z10 = z14;
                    valueOf = jade2;
                    f10 = 1.0f;
                } else {
                    if (num3 != null) {
                        f10 = 1.0f;
                        j6 = (num3.intValue() * 1000) + System.currentTimeMillis();
                        z10 = z14;
                    } else {
                        f10 = 1.0f;
                        if (date != null) {
                            currentTimeMillis = date.getTime();
                        } else {
                            currentTimeMillis = System.currentTimeMillis();
                        }
                        if (num2 != null) {
                            i13 = num2.intValue();
                        } else {
                            i13 = 0;
                        }
                        z10 = z14;
                        j6 = currentTimeMillis + (i13 * 1000);
                    }
                    valueOf = Long.valueOf(j6);
                    c0585q.f(valueOf);
                }
                long longValue2 = ((Number) valueOf).longValue();
                boolean foxtrot = c0585q.foxtrot(longValue2);
                Object jade3 = c0585q.jade();
                if (foxtrot || jade3 == asVar) {
                    jade3 = C0564b.zulu(0L);
                    c0585q.f(jade3);
                }
                ax axVar = (ax) jade3;
                Long valueOf2 = Long.valueOf(longValue2);
                boolean foxtrot2 = c0585q.foxtrot(longValue2) | c0585q.golf(axVar);
                Object jade4 = c0585q.jade();
                if (foxtrot2 || jade4 == asVar) {
                    jade4 = new i(longValue2, axVar, null);
                    c0585q.f(jade4);
                }
                C0564b.foxtrot((l) jade4, c0585q, valueOf2);
                boolean foxtrot3 = c0585q.foxtrot(((Number) axVar.getValue()).longValue()) | c0585q.foxtrot(longValue);
                Object jade5 = c0585q.jade();
                if (foxtrot3 || jade5 == asVar) {
                    if (longValue <= 0) {
                        charlie = f10;
                    } else {
                        charlie = J4.charlie(f10 - (((float) ((Number) axVar.getValue()).longValue()) / ((float) longValue)), 0.0f, f10);
                    }
                    jade5 = Float.valueOf(charlie);
                    c0585q.f(jade5);
                }
                float floatValue = ((Number) jade5).floatValue();
                if (((Number) axVar.getValue()).longValue() <= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                long longValue3 = ((Number) axVar.getValue()).longValue();
                long j10 = 3600;
                long j11 = 60;
                triple = new Triple(String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(longValue3 / j10), Long.valueOf((longValue3 % j10) / j11), Long.valueOf(longValue3 % j11)}, 3)), Float.valueOf(floatValue), Boolean.valueOf(z13));
                c0585q.quebec(false);
            } else {
                i10 = 1;
                z10 = z14;
                i11 = 2;
                c0585q.purple(1632007022);
                c0585q.quebec(false);
                triple = new Triple("", Float.valueOf(0.0f), Boolean.FALSE);
            }
            String str2 = (String) triple.first;
            float floatValue2 = ((Number) triple.second).floatValue();
            boolean booleanValue = ((Boolean) triple.third).booleanValue();
            float f11 = 16;
            float f12 = 12;
            s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(R3.charlie(V.golf(V.charlie(sVar, 1.0f), 90, 0.0f, i11), i10, Db.c.magenta, AbstractC2094g.bravo(f11)), Db.c.emerald, AbstractC2094g.bravo(f11)), f11, f12, f11, f12);
            T.j jVar = T.d.f2061d;
            S alpha2 = Q.alpha(AbstractC0542h.golf, jVar, c0585q, 54);
            long j12 = c0585q.magenta;
            int i15 = (int) (j12 ^ (j12 >>> 32));
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
            C2549i c2549i2 = C2551k.foxtrot;
            C0564b.blue(c2549i2, c0585q, alpha2);
            C2549i c2549i3 = C2551k.echo;
            C0564b.blue(c2549i3, c0585q, mike);
            C2549i c2549i4 = C2551k.golf;
            if (!c0585q.lime) {
                f5 = f11;
            } else {
                f5 = f11;
            }
            ad.blue(i15, c0585q, i15, c2549i4);
            C2549i c2549i5 = C2551k.delta;
            C0564b.blue(c2549i5, c0585q, charlie2);
            boolean z15 = z10;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            float f13 = 6;
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf(f13), T.d.f2062f, c0585q, 6);
            long j13 = c0585q.magenta;
            int i16 = (int) (j13 ^ (j13 >>> 32));
            I mike2 = c0585q.mike();
            s charlie3 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha3);
            C0564b.blue(c2549i3, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q, i16, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q, charlie3);
            S alpha4 = Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            long j14 = c0585q.magenta;
            int i17 = (int) (j14 ^ (j14 >>> 32));
            I mike3 = c0585q.mike();
            s charlie4 = T.a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i2, c0585q, alpha4);
            C0564b.blue(c2549i3, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ad.blue(i17, c0585q, i17, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q, charlie4);
            AbstractC1680b charlie5 = AbstractC3076w3.charlie(hVar.echo, c0585q, 0);
            s kilo = V.kilo(pVar, 24);
            C2394m c2394m = C2391j.echo;
            float f14 = f5;
            W3.alpha(charlie5, null, kilo, null, c2394m, 0.0f, null, c0585q, 25008, 104);
            AbstractC0538d.echo(V.oscar(pVar, f12), c0585q);
            ak.bravo(hVar.alpha, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, new an(Db.c.lime, AbstractC2636d7.charlie(22), new v(700), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 3120, 55294);
            float f15 = 8;
            AbstractC0538d.echo(V.oscar(pVar, f15), c0585q);
            long charlie6 = AbstractC2636d7.charlie(16);
            n nVar = new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)}));
            v vVar = new v(700);
            long j15 = Db.c.blue;
            ak.bravo(hVar.bravo, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j15, charlie6, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            c0585q.quebec(true);
            ak.bravo(hVar.charlie, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, new an(j15, AbstractC2636d7.charlie(12), new v(HttpConstants.HTTP_INTERNAL_ERROR), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 3120, 55294);
            c0585q = c0585q;
            c0585q.quebec(true);
            if (z15) {
                c0585q.purple(-936236164);
                s oscar = V.oscar(pVar, 100);
                C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2064h, c0585q, 48);
                long j16 = c0585q.magenta;
                int i18 = (int) (j16 ^ (j16 >>> 32));
                I mike4 = c0585q.mike();
                s charlie7 = T.a.charlie(oscar, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i2, c0585q, alpha5);
                C0564b.blue(c2549i3, c0585q, mike4);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i18))) {
                    c2549i = c2549i4;
                    ad.blue(i18, c0585q, i18, c2549i);
                } else {
                    c2549i = c2549i4;
                }
                C0564b.blue(c2549i5, c0585q, charlie7);
                charlie(floatValue2, V.echo(V.oscar(pVar, 65), f15), c0585q, 48);
                long charlie8 = AbstractC2636d7.charlie(16);
                n nVar2 = new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)}));
                v vVar2 = new v(900);
                if (booleanValue) {
                    j5 = C0366t.foxtrot;
                } else {
                    j5 = Db.c.november;
                }
                C2549i c2549i6 = c2549i;
                ak.bravo(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j5, charlie8, vVar2, null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                String str3 = hVar.foxtrot;
                if (str3 != null && !StringsKt.gray(str3) && (str = hVar.golf) != null && !StringsKt.gray(str) && (num = hVar.hotel) != null) {
                    c0585q.purple(487303613);
                    S alpha6 = Q.alpha(AbstractC0542h.golf(2), jVar, c0585q, 54);
                    long j17 = c0585q.magenta;
                    int i19 = (int) (j17 ^ (j17 >>> 32));
                    I mike5 = c0585q.mike();
                    s charlie9 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i2, c0585q, alpha6);
                    C0564b.blue(c2549i3, c0585q, mike5);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                        ad.blue(i19, c0585q, i19, c2549i6);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie9);
                    ak.bravo(hVar.foxtrot, AbstractC0538d.whiskey(pVar, 0.0f, 4, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, new an(Db.c.maroon, AbstractC2636d7.charlie(6), new v(900), null, null, 0L, 2, 0L, 0, 16744440), c0585q, 48, 3120, 55292);
                    ak.bravo(hVar.golf, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4283215696L), AbstractC2636d7.charlie(12), new v(800), null, null, 0L, 0, 0L, 0, 16777208), c0585q, 0, 0, 65534);
                    c0585q = c0585q;
                    W3.alpha(AbstractC3076w3.charlie(num.intValue(), c0585q, 0), null, V.kilo(pVar, f15), null, C2391j.bravo, 0.0f, null, c0585q, 25008, 104);
                    c0585q.quebec(true);
                    c0585q.quebec(false);
                    z11 = false;
                    z12 = true;
                } else {
                    c0585q.purple(488773912);
                    S alpha7 = Q.alpha(AbstractC0542h.golf(f13), jVar, c0585q, 54);
                    long j18 = c0585q.magenta;
                    int i20 = (int) (j18 ^ (j18 >>> 32));
                    I mike6 = c0585q.mike();
                    s charlie10 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i2, c0585q, alpha7);
                    C0564b.blue(c2549i3, c0585q, mike6);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                        ad.blue(i20, c0585q, i20, c2549i6);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie10);
                    ak.bravo(hVar.delta, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(Db.c.black, AbstractC2636d7.charlie(10), new v(900), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                    c0585q = c0585q;
                    W3.alpha(AbstractC3076w3.charlie(R.drawable.timer_flash_fill, c0585q, 6), null, V.kilo(pVar, f14), null, c2394m, 0.0f, null, c0585q, 25008, 104);
                    z12 = true;
                    c0585q.quebec(true);
                    z11 = false;
                    c0585q.quebec(false);
                }
                c0585q.quebec(z12);
            } else {
                z11 = false;
                z12 = true;
                c0585q.purple(-941250817);
            }
            c0585q.quebec(z11);
            c0585q.quebec(z12);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 13, hVar, sVar);
        }
    }

    public static final void echo(Function0 function0, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        C0585q c0585q;
        int i11;
        int i12;
        int i13;
        Function0 onButtonClick = function0;
        int i14 = i4;
        Intrinsics.echo(onButtonClick, "onButtonClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1201163212);
        if ((i5 & 6) == 0) {
            if (c0585q2.echo(i14)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i5 | i13;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q2.india(onButtonClick)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i10 & 1, z2)) {
            p pVar = p.alpha;
            float f5 = 1;
            float f10 = 16;
            float f11 = 12;
            s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(R3.charlie(V.golf(V.charlie(pVar, 1.0f), 80, 0.0f, 2), f5, Db.c.green, AbstractC2094g.alpha(16)), Db.c.emerald, AbstractC2094g.alpha(16)), f10, f11, f10, f11);
            S alpha2 = Q.alpha(AbstractC0542h.alpha, T.d.f2060c, c0585q2, 48);
            long j5 = c0585q2.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q2.mike();
            s charlie = T.a.charlie(victor, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q2, i15, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie);
            s kilo = V.kilo(pVar, 56);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j6 = c0585q2.magenta;
            int i16 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q2.mike();
            s charlie2 = T.a.charlie(kilo, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, delta);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q2, i16, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie2);
            C0551q c0551q = C0551q.alpha;
            s bravo2 = c0551q.bravo();
            long j7 = Db.c.fuchsia;
            C2093f c2093f = AbstractC2094g.alpha;
            s bravo3 = androidx.compose.foundation.a.bravo(R3.charlie(bravo2, f5, j7, c2093f), Db.c.indigo, c2093f);
            T.k kVar = T.d.teal;
            ap delta2 = AbstractC0547m.delta(kVar, false);
            long j10 = c0585q2.magenta;
            int i17 = (int) (j10 ^ (j10 >>> 32));
            I mike3 = c0585q2.mike();
            s charlie3 = T.a.charlie(bravo3, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, delta2);
            C0564b.blue(c2549i2, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                ad.blue(i17, c0585q2, i17, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie3);
            W3.alpha(AbstractC3076w3.charlie(R.drawable.box_3_line, c0585q2, 6), null, V.kilo(pVar, 40), null, C2391j.bravo, 0.0f, null, c0585q2, 25008, 104);
            c0585q2.quebec(true);
            float f12 = 2;
            s charlie4 = R3.charlie(V.kilo(AbstractC0538d.quebec(c0551q.alpha(pVar, T.d.f2059b), f12, f12), 32), f5, j7, c2093f);
            long j11 = Db.c.ivory;
            s bravo4 = androidx.compose.foundation.a.bravo(charlie4, j11, c2093f);
            ap delta3 = AbstractC0547m.delta(kVar, false);
            long j12 = c0585q2.magenta;
            int i18 = (int) (j12 ^ (j12 >>> 32));
            I mike4 = c0585q2.mike();
            s charlie5 = T.a.charlie(bravo4, c0585q2);
            c0585q2.white();
            int i19 = i10;
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, delta3);
            C0564b.blue(c2549i2, c0585q2, mike4);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i18))) {
                ad.blue(i18, c0585q2, i18, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie5);
            ak.bravo("x" + i4, null, C0366t.echo, AbstractC2636d7.charlie(14), v.f1409c, null, 0L, null, 0L, 2, false, 1, 0, null, null, c0585q2, 200064, 3120, 120786);
            c0585q2.quebec(true);
            c0585q2.quebec(true);
            AbstractC0538d.echo(V.oscar(pVar, f11), c0585q2);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            long j13 = c0585q2.magenta;
            int i20 = (int) (j13 ^ (j13 >>> 32));
            I mike5 = c0585q2.mike();
            s charlie6 = T.a.charlie(layoutWeightElement, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike5);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i20))) {
                ad.blue(i20, c0585q2, i20, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie6);
            ak.bravo(AbstractC3086y3.bravo(c0585q2, R.string.assets_pending), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, new an(Db.c.juliet, AbstractC2636d7.charlie(18), new v(700), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q2, 0, 3120, 55294);
            ak.bravo(com.google.android.material.datepicker.j.juliet(pVar, f12, c0585q2, R.string.pending_assets_new, c0585q2), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, new an(Db.c.blue, AbstractC2636d7.charlie(16), new v(HttpConstants.HTTP_INTERNAL_ERROR), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q2, 0, 3120, 55294);
            c0585q = c0585q2;
            c0585q.quebec(true);
            float f13 = 48;
            s november = V.november(pVar, f13, f13, 0.0f, 12);
            ap delta4 = AbstractC0547m.delta(kVar, false);
            long j14 = c0585q.magenta;
            int i21 = (int) (j14 ^ (j14 >>> 32));
            I mike6 = c0585q.mike();
            s charlie7 = T.a.charlie(november, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta4);
            C0564b.blue(c2549i2, c0585q, mike6);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                ad.blue(i21, c0585q, i21, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie7);
            float f14 = 8;
            float f15 = 0;
            onButtonClick = function0;
            i14 = i4;
            M3.charlie(onButtonClick, AbstractC0538d.victor(androidx.compose.foundation.a.bravo(V.golf(V.oscar(pVar, 94), 28, 0.0f, 2), j11, AbstractC2094g.bravo(f14)), f14, f12, f14, f12), null, new M(f15, f15, f15, f15), alpha, c0585q, ((i19 >> 3) & 14) | 905969664, 252);
            i11 = 1;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            i11 = 1;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.n(i14, onButtonClick, i5, i11);
        }
    }

    public static final void foxtrot(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        int i5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(781947917);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            p pVar = p.alpha;
            float f5 = 8;
            float f10 = 24;
            s whiskey = AbstractC0538d.whiskey(AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(V.charlie(pVar, 1.0f), C0366t.juliet, ao.alpha), f5, 0.0f, 2), 0.0f, 0.0f, 0.0f, f10, 7);
            T.i iVar = T.d.f2063g;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, iVar, c0585q, 48);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(whiskey, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                ad.blue(i10, c0585q, i10, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            float f11 = 16;
            s bravo2 = androidx.compose.foundation.a.bravo(ac.alpha(V.charlie(pVar, 1.0f), 44, AbstractC2094g.bravo(f11), Db.c.gray, Db.c.gold, 4), Db.c.emerald, AbstractC2094g.bravo(f11));
            float f12 = 1;
            s victor = AbstractC0538d.victor(R3.charlie(bravo2, f12, Db.c.fuchsia, AbstractC2094g.bravo(f11)), f10, f11, f10, f11);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.echo, iVar, c0585q, 54);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie2 = T.a.charlie(victor, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q, i11, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie2);
            india(AbstractC0538d.sierra(V.kilo(pVar, 56), f12), c0585q, 6);
            float f13 = 4;
            ak.bravo(com.google.android.material.datepicker.j.juliet(pVar, f13, c0585q, R.string.awaiting_orders_heading, c0585q), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, new an(AbstractC3071v3.alpha(c0585q, R.color.colorPrimary), AbstractC2636d7.charlie(22), new v(700), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, 0, 3120, 55294);
            ak.bravo(com.google.android.material.datepicker.j.juliet(pVar, f13, c0585q, R.string.awaiting_orders_description, c0585q), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, null, new an(Db.c.blue, AbstractC2636d7.charlie(12), new v(HttpConstants.HTTP_BLOCKED), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, 0, 3120, 55294);
            c0585q = c0585q;
            AbstractC0538d.echo(V.echo(pVar, f5), c0585q);
            i5 = 1;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            i5 = 1;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new S4.b(i4, i5);
        }
    }

    public static final void golf(e ui, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        Function0 onActionClick = function0;
        Intrinsics.echo(ui, "ui");
        Intrinsics.echo(onActionClick, "onActionClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1229251086);
        if (c0585q.golf(ui)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5;
        if ((i4 & 48) == 0) {
            if (c0585q.india(onActionClick)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i11 |= i10;
        }
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            p pVar = p.alpha;
            float f5 = 8;
            s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(V.charlie(pVar, 1.0f), C0366t.juliet, ao.alpha), f5, 0.0f, 2);
            T.i iVar = T.d.f2063g;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, iVar, c0585q, 48);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(uniform, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            float f10 = 16;
            s victor = AbstractC0538d.victor(R3.charlie(androidx.compose.foundation.a.bravo(ac.alpha(V.charlie(pVar, 1.0f), 44, AbstractC2094g.bravo(f10), Db.c.gray, Db.c.gold, 4), Db.c.emerald, AbstractC2094g.bravo(f10)), 1, Db.c.fuchsia, AbstractC2094g.bravo(f10)), f10, f10, f10, f10);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.echo, iVar, c0585q, 54);
            long j6 = c0585q.magenta;
            int i13 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie2 = T.a.charlie(victor, c0585q);
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
            C0564b.blue(c2549i4, c0585q, charlie2);
            ak.bravo(AbstractC3086y3.bravo(c0585q, R.string.system_message), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(Db.c.lime, AbstractC2636d7.charlie(18), new v(700), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            AbstractC0538d.echo(V.echo(pVar, f5), c0585q);
            W3.alpha(AbstractC3076w3.charlie(R.drawable.warning, c0585q, 6), AbstractC3086y3.bravo(c0585q, R.string.warning), V.kilo(pVar, 28), null, C2391j.bravo, 0.0f, null, c0585q, 24960, 104);
            AbstractC0538d.echo(V.echo(pVar, 12), c0585q);
            ak.bravo(ui.alpha, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 5, 0, null, new an(Db.c.blue, AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BLOCKED), null, null, 0L, 3, 0L, 0, 16744440), c0585q, 0, 3120, 55294);
            onActionClick = function0;
            Pa.i.foxtrot(ui.bravo, onActionClick, false, V.golf(com.google.android.material.datepicker.j.hotel(pVar, f10, c0585q, pVar, 1.0f), 56, 0.0f, 2), null, null, c0585q, (i11 & 112) | 3072, 116);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new aa(i4, 5, ui, onActionClick);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.jade(), java.lang.Integer.valueOf(r10)) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void hotel(Function0 onButtonClick, s sVar, long j5, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        long j6;
        int i10;
        Intrinsics.echo(onButtonClick, "onButtonClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1183594729);
        if (c0585q2.india(onButtonClick)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5 | 384;
        if ((i11 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i11 & 1, z2)) {
            p pVar = p.alpha;
            long j7 = C0366t.juliet;
            s whiskey = AbstractC0538d.whiskey(androidx.compose.foundation.a.bravo(V.charlie(sVar, 1.0f), j7, ao.alpha), 0.0f, 0.0f, 0.0f, 24, 7);
            T.i iVar = T.d.f2063g;
            C0537c c0537c = AbstractC0542h.charlie;
            C0554u alpha2 = AbstractC0553t.alpha(c0537c, iVar, c0585q2, 48);
            long j10 = c0585q2.magenta;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            I mike = c0585q2.mike();
            s charlie = T.a.charlie(whiskey, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q2.lime) {
                i10 = i11;
            } else {
                i10 = i11;
            }
            ad.blue(i12, c0585q2, i12, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie);
            float f5 = 16;
            s sierra = AbstractC0538d.sierra(R3.charlie(androidx.compose.foundation.a.bravo(ac.alpha(AbstractC0538d.uniform(com.google.android.material.datepicker.j.hotel(pVar, 22, c0585q2, pVar, 1.0f), f5, 0.0f, 2), 44, AbstractC2094g.bravo(f5), Db.c.gray, Db.c.gold, 4), Db.c.emerald, AbstractC2094g.bravo(f5)), 1, Db.c.green, AbstractC2094g.bravo(f5)), f5);
            C0554u alpha3 = AbstractC0553t.alpha(c0537c, iVar, c0585q2, 48);
            long j11 = c0585q2.magenta;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            I mike2 = c0585q2.mike();
            s charlie2 = T.a.charlie(sierra, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q2, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie2);
            z.s.alpha(AbstractC3076w3.charlie(R.drawable.imagecontainer, c0585q2, 6), null, V.kilo(pVar, 56), C0366t.kilo, c0585q2, 3504, 0);
            float f10 = 4;
            G2.bravo(com.google.android.material.datepicker.j.juliet(pVar, f10, c0585q2, R.string.not_receiving_orders, c0585q2), null, AbstractC3071v3.alpha(c0585q2, R.color.colorPrimary), AbstractC2636d7.charlie(22), v.f1409c, null, 0L, new O0.k(3), 0L, 2, false, 2, 0, null, null, c0585q2, 199680, 3120, 120274);
            G2.bravo(com.google.android.material.datepicker.j.juliet(pVar, f10, c0585q2, R.string.low_demand_message, c0585q2), null, Db.c.blue, AbstractC2636d7.charlie(12), v.yellow, null, 0L, new O0.k(3), 0L, 2, false, 3, 0, null, null, c0585q2, 199680, 3120, 120274);
            Pa.i.foxtrot(com.google.android.material.datepicker.j.juliet(pVar, f5, c0585q2, R.string.view_high_demand_area, c0585q2), onButtonClick, false, V.golf(V.charlie(pVar, 1.0f), 50, 0.0f, 2), null, null, c0585q2, ((i10 << 3) & 112) | 3072, 116);
            c0585q = c0585q2;
            c0585q.quebec(true);
            c0585q.quebec(true);
            j6 = j7;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            j6 = j5;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new f(onButtonClick, sVar, j6, i4, 0);
        }
    }

    public static final void india(s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(409163062);
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            aj india = AbstractC0779d.india("loader", c0585q, 0);
            f0 kilo = AbstractC0779d.kilo(1000, 0, AbstractC0800z.delta, 2);
            at atVar = at.alpha;
            W3.alpha(AbstractC3076w3.charlie(R.drawable.slo_mo, c0585q, 6), AbstractC3086y3.bravo(c0585q, R.string.loading), t6.aa.bravo(sVar, ((Number) AbstractC0779d.charlie(india, 360.0f, AbstractC0779d.golf(kilo, 4), "rotation", c0585q, 29112, 0).getValue()).floatValue()), null, C2391j.bravo, 0.0f, null, c0585q, 24576, 104);
            c0585q = c0585q;
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new u(sVar, i4, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0228, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.jade(), java.lang.Integer.valueOf(r5)) == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void juliet(Function0 function0, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        C0585q c0585q;
        int i11;
        C2549i c2549i;
        float f5;
        C2549i c2549i2;
        int i12;
        int i13;
        Function0 onCheckRequestsClick = function0;
        Intrinsics.echo(onCheckRequestsClick, "onCheckRequestsClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1180316820);
        if ((i5 & 6) == 0) {
            if (c0585q2.echo(i4)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i5 | i13;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q2.india(onCheckRequestsClick)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i10 & 1, z2)) {
            p pVar = p.alpha;
            float f10 = 1;
            float f11 = 16;
            float f12 = 12;
            s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(R3.charlie(V.golf(V.charlie(pVar, 1.0f), 80, 0.0f, 2), f10, Db.c.green, AbstractC2094g.bravo(f11)), Db.c.emerald, AbstractC2094g.bravo(f11)), f11, f12, f11, f12);
            S alpha2 = Q.alpha(AbstractC0542h.alpha, T.d.f2060c, c0585q2, 48);
            long j5 = c0585q2.magenta;
            int i14 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q2.mike();
            s charlie = T.a.charlie(victor, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i3 = C2551k.foxtrot;
            C0564b.blue(c2549i3, c0585q2, alpha2);
            C2549i c2549i4 = C2551k.echo;
            C0564b.blue(c2549i4, c0585q2, mike);
            C2549i c2549i5 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q2, i14, c2549i5);
            }
            C2549i c2549i6 = C2551k.delta;
            C0564b.blue(c2549i6, c0585q2, charlie);
            s kilo = V.kilo(pVar, 56);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j6 = c0585q2.magenta;
            int i15 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q2.mike();
            s charlie2 = T.a.charlie(kilo, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, delta);
            C0564b.blue(c2549i4, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                ad.blue(i15, c0585q2, i15, c2549i5);
            }
            C0564b.blue(c2549i6, c0585q2, charlie2);
            C0551q c0551q = C0551q.alpha;
            s bravo2 = c0551q.bravo();
            long j7 = Db.c.fuchsia;
            C2093f c2093f = AbstractC2094g.alpha;
            s bravo3 = androidx.compose.foundation.a.bravo(R3.charlie(bravo2, f10, j7, c2093f), Db.c.indigo, c2093f);
            T.k kVar = T.d.teal;
            int i16 = i10;
            ap delta2 = AbstractC0547m.delta(kVar, false);
            long j10 = c0585q2.magenta;
            int i17 = (int) (j10 ^ (j10 >>> 32));
            I mike3 = c0585q2.mike();
            s charlie3 = T.a.charlie(bravo3, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, delta2);
            C0564b.blue(c2549i4, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                c2549i = c2549i5;
                ad.blue(i17, c0585q2, i17, c2549i);
            } else {
                c2549i = c2549i5;
            }
            C0564b.blue(c2549i6, c0585q2, charlie3);
            float f13 = 28;
            C2549i c2549i7 = c2549i;
            W3.alpha(AbstractC3076w3.charlie(R.drawable.arrows_shuffle, c0585q2, 6), null, V.kilo(pVar, f13), null, C2391j.bravo, 0.0f, null, c0585q2, 25008, 104);
            c0585q2.quebec(true);
            s charlie4 = R3.charlie(V.kilo(c0551q.alpha(pVar, T.d.f2059b), 32), f10, j7, c2093f);
            long j11 = Db.c.ivory;
            s bravo4 = androidx.compose.foundation.a.bravo(charlie4, j11, c2093f);
            ap delta3 = AbstractC0547m.delta(kVar, false);
            long j12 = c0585q2.magenta;
            int i18 = (int) (j12 ^ (j12 >>> 32));
            I mike4 = c0585q2.mike();
            s charlie5 = T.a.charlie(bravo4, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, delta3);
            C0564b.blue(c2549i4, c0585q2, mike4);
            if (!c0585q2.lime) {
                f5 = f13;
                c2549i2 = c2549i7;
            } else {
                f5 = f13;
                c2549i2 = c2549i7;
            }
            ad.blue(i18, c0585q2, i18, c2549i2);
            C0564b.blue(c2549i6, c0585q2, charlie5);
            ak.bravo("x" + i4, null, C0366t.echo, AbstractC2636d7.charlie(14), v.f1409c, null, 0L, null, 0L, 2, false, 1, 0, null, null, c0585q2, 200064, 3120, 120786);
            c0585q2.quebec(true);
            c0585q2.quebec(true);
            AbstractC0538d.echo(V.oscar(pVar, f12), c0585q2);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            long j13 = c0585q2.magenta;
            int i19 = (int) (j13 ^ (j13 >>> 32));
            I mike5 = c0585q2.mike();
            s charlie6 = T.a.charlie(layoutWeightElement, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, alpha3);
            C0564b.blue(c2549i4, c0585q2, mike5);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i19))) {
                ad.blue(i19, c0585q2, i19, c2549i2);
            }
            C0564b.blue(c2549i6, c0585q2, charlie6);
            ak.bravo(AbstractC3086y3.bravo(c0585q2, R.string.shift_transfer), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, new an(Db.c.juliet, AbstractC2636d7.charlie(18), new v(700), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q2, 0, 3120, 55294);
            ak.bravo(com.google.android.material.datepicker.j.juliet(pVar, 2, c0585q2, R.string.live_transfer_cards, c0585q2), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, new an(Db.c.blue, AbstractC2636d7.charlie(16), new v(HttpConstants.HTTP_INTERNAL_ERROR), null, new n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q2, 0, 3120, 55294);
            c0585q = c0585q2;
            c0585q.quebec(true);
            float f14 = 48;
            s november = V.november(pVar, f14, f14, 0.0f, 12);
            ap delta4 = AbstractC0547m.delta(kVar, false);
            long j14 = c0585q.magenta;
            int i20 = (int) (j14 ^ (j14 >>> 32));
            I mike6 = c0585q.mike();
            s charlie7 = T.a.charlie(november, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i3, c0585q, delta4);
            C0564b.blue(c2549i4, c0585q, mike6);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                ad.blue(i20, c0585q, i20, c2549i2);
            }
            C0564b.blue(c2549i6, c0585q, charlie7);
            i11 = 2;
            float f15 = 8;
            float f16 = 0;
            onCheckRequestsClick = function0;
            M3.charlie(onCheckRequestsClick, AbstractC0538d.uniform(androidx.compose.foundation.a.bravo(V.golf(pVar, f5, 0.0f, 2), j11, AbstractC2094g.bravo(f15)), f15, 0.0f, 2), null, new M(f16, f16, f16, f16), bravo, c0585q, ((i16 >> 3) & 14) | 905969664, 252);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            i11 = 2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.n(i4, onCheckRequestsClick, i5, i11);
        }
    }

    public static final c kilo(Order order, Context context) {
        List list;
        int i4;
        int i5;
        TaskType taskType;
        String string;
        String str;
        Date date;
        Integer num;
        boolean z2;
        String localizedDescription;
        TaskType taskType2;
        Intrinsics.echo(order, "<this>");
        Intrinsics.echo(context, "context");
        List<OrderTask> tasks = order.getTasks();
        Integer num2 = null;
        if (tasks != null) {
            list = CollectionsKt.p(tasks, new k(0));
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            i4 = -1;
            if (it.hasNext()) {
                if (((OrderTask) it.next()).getTaskStatus() != TaskStatus.COMPLETED) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i10);
        if (i10 < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i5 = valueOf.intValue();
        } else {
            i5 = 0;
        }
        OrderTask orderTask = (OrderTask) CollectionsKt.jade(i5, list);
        String azure = P0.azure(i5 + 1, list.size(), "(", "/", ")");
        if (orderTask != null) {
            taskType = orderTask.getTaskType();
        } else {
            taskType = null;
        }
        if (taskType != null) {
            i4 = j.$EnumSwitchMapping$0[taskType.ordinal()];
        }
        int i11 = R.drawable.pickup;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                }
            } else {
                i11 = R.drawable.icondev;
            }
        }
        int i12 = i11;
        if (orderTask == null || (taskType2 = orderTask.getTaskType()) == null || (string = context.getString(taskType2.getStringRes())) == null) {
            string = context.getString(R.string.pick_up);
            Intrinsics.delta(string, "getString(...)");
        }
        String str2 = string;
        String str3 = "";
        if (orderTask == null || (localizedDescription = orderTask.getLocalizedDescription()) == null) {
            str = "";
        } else {
            str = localizedDescription;
        }
        String backendNo = order.getBackendNo();
        if (backendNo == null) {
            String backendId = order.getBackendId();
            if (backendId != null) {
                str3 = backendId;
            }
        } else {
            str3 = backendNo;
        }
        String string2 = context.getString(R.string.task_time);
        Intrinsics.delta(string2, "getString(...)");
        if (orderTask != null) {
            date = orderTask.getStartedAt();
        } else {
            date = null;
        }
        if (orderTask != null) {
            num = orderTask.getEtaInSeconds();
        } else {
            num = null;
        }
        if (orderTask != null) {
            num2 = orderTask.getRemainingHandShakeSeconds();
        }
        Integer num3 = num2;
        if (orderTask != null && orderTask.showTimer()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new c(str3, new h(str2, azure, str, string2, i12, date, num, num3, z2, 224), R.drawable.bag);
    }
}
