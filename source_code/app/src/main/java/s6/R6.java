package s6;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateFormat;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.tickets.TicketResponse;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3086y3;
import zendesk.support.request.DocumentRenderer;

/* loaded from: classes2.dex */
public abstract class R6 {
    public static final void alpha(TicketResponse ticketResponse, Function0 onClick, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        int i11;
        C0585q c0585q;
        boolean z10;
        C2549i c2549i;
        String str;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(701716671);
        if (c0585q2.india(ticketResponse)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i4 | i5;
        if (c0585q2.india(onClick)) {
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
        if (c0585q2.magenta(i13 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = 16;
            float f10 = 4;
            float f11 = 8;
            T.s bravo = androidx.compose.foundation.a.bravo(t6.R3.charlie(AbstractC0538d.tango(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), f5, f10), 1, Pc.h.bravo, AbstractC2094g.bravo(f11)), Pc.h.alpha, AbstractC2094g.bravo(f11));
            if ((i13 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q2.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Bb.a(onClick, 16);
                c0585q2.f(jade);
            }
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.echo(15, bravo, null, (Function0) jade, false), f5, f5, f5, f5);
            C0537c c0537c = AbstractC0542h.alpha;
            T.i iVar = T.d.f2062f;
            C0540f hotel = AbstractC0542h.hotel(0, iVar);
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(hotel, jVar, c0585q2, 54);
            long j5 = c0585q2.magenta;
            int i14 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(victor, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i2 = C2551k.foxtrot;
            C0564b.blue(c2549i2, c0585q2, alpha);
            C2549i c2549i3 = C2551k.echo;
            C0564b.blue(c2549i3, c0585q2, mike);
            C2549i c2549i4 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i14))) {
                ao.ad.blue(i14, c0585q2, i14, c2549i4);
            }
            C2549i c2549i5 = C2551k.delta;
            C0564b.blue(c2549i5, c0585q2, charlie);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f10), iVar, c0585q2, 6);
            long j6 = c0585q2.magenta;
            int i15 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie2 = T.a.charlie(layoutWeightElement, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i2, c0585q2, alpha2);
            C0564b.blue(c2549i3, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q2, i15, c2549i4);
            }
            C0564b.blue(c2549i5, c0585q2, charlie2);
            String title = ticketResponse.getTitle();
            if (title == null) {
                title = "";
            }
            long charlie3 = AbstractC2636d7.charlie(16);
            H0.n nVar = Pc.c.alpha;
            F.G2.bravo(title, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(Pc.h.charlie, charlie3, new H0.v(HttpConstants.HTTP_INTERNAL_ERROR), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f10), jVar, c0585q2, 54);
            long j7 = c0585q2.magenta;
            int i16 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q2.mike();
            T.s charlie4 = T.a.charlie(pVar, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i2, c0585q2, alpha3);
            C0564b.blue(c2549i3, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                c2549i = c2549i4;
                ao.ad.blue(i16, c0585q2, i16, c2549i);
            } else {
                c2549i = c2549i4;
            }
            C0564b.blue(c2549i5, c0585q2, charlie4);
            String zulu = ao.ad.zulu(ticketResponse.getId(), "#");
            long charlie5 = AbstractC2636d7.charlie(12);
            H0.v vVar = new H0.v(HttpConstants.HTTP_BAD_REQUEST);
            long j10 = Pc.h.delta;
            D0.an anVar = new D0.an(j10, charlie5, vVar, null, nVar, 0L, 0, 0L, 0, 16777176);
            C2549i c2549i6 = c2549i;
            F.G2.bravo(zulu, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q2, 0, 0, 65534);
            F.G2.bravo(DocumentRenderer.Style.Li.UNICODE_BULLET, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j10, AbstractC2636d7.charlie(12), null, null, null, 0L, 0, 0L, 0, 16777212), c0585q2, 6, 0, 65534);
            Date createdAt = ticketResponse.getCreatedAt();
            if (createdAt == null || (str = DateFormat.format("dd MMM, yyyy", createdAt).toString()) == null) {
                str = "";
            }
            F.G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j10, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BAD_REQUEST), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            c0585q2.quebec(true);
            c0585q2.quebec(true);
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(pVar, Pc.h.hotel, AbstractC2094g.bravo(100)), 6, 3);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j11 = c0585q2.magenta;
            int i17 = (int) (j11 ^ (j11 >>> 32));
            androidx.compose.runtime.I mike4 = c0585q2.mike();
            T.s charlie6 = T.a.charlie(tango, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i2, c0585q2, delta);
            C0564b.blue(c2549i3, c0585q2, mike4);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q2, i17, c2549i6);
            }
            C0564b.blue(c2549i5, c0585q2, charlie6);
            F.G2.bravo(AbstractC3086y3.bravo(c0585q2, R.string.resolved), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(Pc.h.golf, AbstractC2636d7.charlie(14), new H0.v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            c0585q = c0585q2;
            i11 = 1;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            i11 = 1;
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Pc.b(ticketResponse, onClick, i4, i11);
        }
    }

    public static Object bravo(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return U0.o.bravo(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
