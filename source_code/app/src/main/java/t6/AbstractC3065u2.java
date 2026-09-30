package t6;

import F.AbstractC0141o0;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import h.AbstractC1797a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: t6.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3065u2 {
    public static final void alpha(OrderTask orderTask, String str, T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        T.p pVar2;
        boolean z10;
        int i11;
        Context context;
        int i12;
        boolean z11;
        long j5;
        boolean z12;
        boolean z13;
        int i13;
        String str2 = str;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-871517591);
        if ((i4 & 6) == 0) {
            if (c0585q.india(orderTask)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i4 | i13;
        } else {
            i5 = i4;
        }
        if (c0585q.golf(str2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i5 | i10 | 384;
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            Context context2 = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            if (orderTask.getTaskStatus() == TaskStatus.COMPLETED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = R.color.progress_color_done;
            } else {
                i11 = R.color.progress_color_pending;
            }
            long alpha = AbstractC3071v3.alpha(c0585q, i11);
            long alpha2 = AbstractC3071v3.alpha(c0585q, R.color.white);
            T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), 0.0f, 6, 1);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2061d, c0585q, 48);
            long j6 = c0585q.magenta;
            int i15 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(uniform, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha3);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.oscar(pVar3, 4), 39), alpha, a0.ao.alpha), c0585q, 0);
            T.s bravo = androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.kilo(pVar3, 25), alpha, AbstractC2094g.alpha);
            q0.ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j7 = c0585q.magenta;
            int i16 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(bravo, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                ao.ad.blue(i16, c0585q, i16, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie2);
            if (z10) {
                c0585q.purple(856954804);
                AbstractC1680b charlie3 = AbstractC3076w3.charlie(R.drawable.ic_done_24, c0585q, 6);
                T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar3, 18);
                context = context2;
                i12 = R.color.progress_color_done;
                AbstractC0141o0.alpha(charlie3, null, kilo, alpha2, c0585q, 432, 0);
                z11 = false;
            } else {
                context = context2;
                i12 = R.color.progress_color_done;
                z11 = false;
                c0585q.purple(854557946);
            }
            c0585q.quebec(z11);
            c0585q.quebec(true);
            T.s whiskey = AbstractC0538d.whiskey(pVar3, 12, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            T.s then = whiskey.then(new LayoutWeightElement(1.0f, true));
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j10 = c0585q.magenta;
            int i17 = (int) (j10 ^ (j10 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie4 = T.a.charlie(then, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q, i17, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            String string = context.getString(R.string.order_completed);
            Intrinsics.delta(string, "getString(...)");
            androidx.compose.runtime.E0 e02 = F.T2.alpha;
            D0.an anVar = ((F.S2) c0585q.kilo(e02)).hotel;
            H0.v vVar = H0.v.f1409c;
            if (z10) {
                c0585q.purple(1993338529);
                j5 = AbstractC3071v3.alpha(c0585q, i12);
                c0585q.quebec(false);
            } else {
                c0585q.purple(1993425825);
                j5 = ((F.O) c0585q.kilo(F.Q.alpha)).sierra;
                c0585q.quebec(false);
            }
            F.G2.bravo(string, null, j5, 0L, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q, 196608, 0, 65498);
            c0585q = c0585q;
            if (str == null || StringsKt.gray(str)) {
                str2 = str;
                z12 = true;
                z13 = false;
                c0585q.purple(1990316339);
            } else {
                c0585q.purple(1993578252);
                D0.an anVar2 = ((F.S2) c0585q.kilo(e02)).lima;
                z12 = true;
                str2 = str;
                F.G2.bravo(str2, AbstractC0538d.whiskey(pVar3, 0.0f, 2, 0.0f, 0.0f, 13), ((F.O) c0585q.kilo(F.Q.alpha)).sierra, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar2, c0585q, ((i14 >> 3) & 14) | 48, 0, 65528);
                c0585q = c0585q;
                z13 = false;
            }
            c0585q.quebec(z13);
            c0585q.quebec(z12);
            c0585q.quebec(z12);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Ec.al(orderTask, str2, pVar2, i4);
        }
    }

    public static String bravo(String str, String str2) {
        return av.q.foxtrot("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }
}
