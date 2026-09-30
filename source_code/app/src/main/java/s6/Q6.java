package s6;

import a0.C0366t;
import android.text.format.DateFormat;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.tickets.TicketResponse;
import com.app.network.network.models.tickets.TicketStatus;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import of.C2257l;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3086y3;
import zendesk.support.request.DocumentRenderer;

/* loaded from: classes2.dex */
public abstract class Q6 {
    public static final void alpha(TicketResponse ticketResponse, Function0 onClick, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        C0585q c0585q;
        int i11;
        Pc.f fVar;
        Pc.f fVar2;
        boolean z10;
        C2549i c2549i;
        C2550j c2550j;
        C2549i c2549i2;
        String str;
        String str2;
        String name;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-981383781);
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
            int i14 = Pc.h.november;
            TicketStatus status = ticketResponse.getStatus();
            if (status == null) {
                i11 = -1;
            } else {
                i11 = Pc.g.$EnumSwitchMapping$0[status.ordinal()];
            }
            String str3 = "";
            switch (i11) {
                case 1:
                    c0585q2.purple(129929215);
                    fVar = new Pc.f(Pc.h.foxtrot, Pc.h.mike, AbstractC3086y3.bravo(c0585q2, R.string.ticket_status_pending));
                    c0585q2.quebec(false);
                    fVar2 = fVar;
                    break;
                case 2:
                    c0585q2.purple(129937855);
                    fVar = new Pc.f(Pc.h.golf, Pc.h.hotel, AbstractC3086y3.bravo(c0585q2, R.string.ticket_status_assigned));
                    c0585q2.quebec(false);
                    fVar2 = fVar;
                    break;
                case 3:
                    c0585q2.purple(129946510);
                    fVar = new Pc.f(Pc.h.india, Pc.h.juliet, AbstractC3086y3.bravo(c0585q2, R.string.re_open));
                    c0585q2.quebec(false);
                    fVar2 = fVar;
                    break;
                case 4:
                    c0585q2.purple(129954623);
                    fVar = new Pc.f(Pc.h.golf, Pc.h.hotel, AbstractC3086y3.bravo(c0585q2, R.string.ticket_status_resolved));
                    c0585q2.quebec(false);
                    fVar2 = fVar;
                    break;
                case 5:
                    c0585q2.purple(129963161);
                    fVar = new Pc.f(Pc.h.kilo, Pc.h.lima, AbstractC3086y3.bravo(c0585q2, R.string.ticket_status_closed));
                    c0585q2.quebec(false);
                    fVar2 = fVar;
                    break;
                case 6:
                    c0585q2.purple(129971510);
                    c0585q2.quebec(false);
                    long j5 = C0366t.juliet;
                    fVar = new Pc.f(j5, j5, "");
                    fVar2 = fVar;
                    break;
                default:
                    c0585q2.purple(129977297);
                    c0585q2.quebec(false);
                    if (status == null || (name = status.name()) == null) {
                        str2 = "";
                    } else {
                        str2 = name;
                    }
                    fVar2 = new Pc.f(Pc.h.kilo, Pc.h.lima, str2);
                    break;
            }
            T.p pVar = T.p.alpha;
            float f5 = 16;
            float f10 = 4;
            Pc.f fVar3 = fVar2;
            float f11 = 8;
            T.s bravo = androidx.compose.foundation.a.bravo(t6.R3.charlie(AbstractC0538d.tango(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), f5, f10), 1, Pc.h.bravo, AbstractC2094g.bravo(f11)), Pc.h.alpha, AbstractC2094g.bravo(f11));
            if ((i13 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q2.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Bb.a(onClick, 15);
                c0585q2.f(jade);
            }
            T.s victor = AbstractC0538d.victor(androidx.compose.foundation.a.echo(15, bravo, null, (Function0) jade, false), f5, f5, f5, f11);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(f10), T.d.f2062f, c0585q2, 6);
            long j6 = c0585q2.magenta;
            int i15 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(victor, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j2);
            } else {
                c0585q2.i();
            }
            C2549i c2549i3 = C2551k.foxtrot;
            C0564b.blue(c2549i3, c0585q2, alpha);
            C2549i c2549i4 = C2551k.echo;
            C0564b.blue(c2549i4, c0585q2, mike);
            C2549i c2549i5 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q2, i15, c2549i5);
            }
            C2549i c2549i6 = C2551k.delta;
            C0564b.blue(c2549i6, c0585q2, charlie);
            T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            J1.e eVar = AbstractC0542h.golf;
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(eVar, jVar, c0585q2, 54);
            long j7 = c0585q2.magenta;
            int i16 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie3 = T.a.charlie(charlie2, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j2);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, alpha2);
            C0564b.blue(c2549i4, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                c2549i = c2549i5;
                ao.ad.blue(i16, c0585q2, i16, c2549i);
            } else {
                c2549i = c2549i5;
            }
            C0564b.blue(c2549i6, c0585q2, charlie3);
            String title = ticketResponse.getTitle();
            if (title == null) {
                title = "";
            }
            long charlie4 = AbstractC2636d7.charlie(16);
            H0.n nVar = Pc.c.alpha;
            D0.an anVar = new D0.an(Pc.h.charlie, charlie4, new H0.v(HttpConstants.HTTP_INTERNAL_ERROR), null, nVar, 0L, 0, 0L, 0, 16777176);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            C2549i c2549i7 = c2549i;
            F.G2.bravo(title, new LayoutWeightElement(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q2, 0, 0, 65532);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.oscar(pVar, f11), c0585q2);
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(pVar, fVar3.charlie, AbstractC2094g.bravo(100)), 6, 3);
            T.k kVar = T.d.alpha;
            q0.ap delta = AbstractC0547m.delta(kVar, false);
            long j10 = c0585q2.magenta;
            int i17 = (int) (j10 ^ (j10 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q2.mike();
            T.s charlie5 = T.a.charlie(tango, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c2550j = c2550j2;
                c0585q2.lima(c2550j);
            } else {
                c2550j = c2550j2;
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, delta);
            C0564b.blue(c2549i4, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                c2549i2 = c2549i7;
                ao.ad.blue(i17, c0585q2, i17, c2549i2);
            } else {
                c2549i2 = c2549i7;
            }
            C0564b.blue(c2549i6, c0585q2, charlie5);
            C2549i c2549i8 = c2549i2;
            C2550j c2550j3 = c2550j;
            F.G2.bravo(fVar3.alpha, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(fVar3.bravo, AbstractC2636d7.charlie(14), new H0.v(700), null, nVar, 0L, 2, 0L, 0, 16744408), c0585q2, 0, 0, 65534);
            c0585q2.quebec(true);
            c0585q2.quebec(true);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f10), jVar, c0585q2, 54);
            long j11 = c0585q2.magenta;
            int i18 = (int) (j11 ^ (j11 >>> 32));
            androidx.compose.runtime.I mike4 = c0585q2.mike();
            T.s charlie6 = T.a.charlie(pVar, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j3);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, alpha3);
            C0564b.blue(c2549i4, c0585q2, mike4);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i18))) {
                ao.ad.blue(i18, c0585q2, i18, c2549i8);
            }
            C0564b.blue(c2549i6, c0585q2, charlie6);
            String zulu = ao.ad.zulu(ticketResponse.getId(), "#");
            long charlie7 = AbstractC2636d7.charlie(12);
            H0.v vVar = new H0.v(HttpConstants.HTTP_BAD_REQUEST);
            long j12 = Pc.h.delta;
            F.G2.bravo(zulu, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j12, charlie7, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            F.G2.bravo(DocumentRenderer.Style.Li.UNICODE_BULLET, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j12, AbstractC2636d7.charlie(12), null, null, null, 0L, 0, 0L, 0, 16777212), c0585q2, 6, 0, 65534);
            Date createdAt = ticketResponse.getCreatedAt();
            if (createdAt == null || (str = DateFormat.format("dd MMM, yyyy", createdAt).toString()) == null) {
                str = "";
            }
            F.G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j12, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BAD_REQUEST), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            c0585q2.quebec(true);
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Pc.h.echo, AbstractC2094g.bravo(f11)), f11);
            q0.ap delta2 = AbstractC0547m.delta(kVar, false);
            long j13 = c0585q2.magenta;
            int i19 = (int) (j13 ^ (j13 >>> 32));
            androidx.compose.runtime.I mike5 = c0585q2.mike();
            T.s charlie8 = T.a.charlie(sierra, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j3);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, delta2);
            C0564b.blue(c2549i4, c0585q2, mike5);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i19))) {
                ao.ad.blue(i19, c0585q2, i19, c2549i8);
            }
            C0564b.blue(c2549i6, c0585q2, charlie8);
            String content = ticketResponse.getContent();
            if (content != null) {
                str3 = content;
            }
            F.G2.bravo(str3, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, new D0.an(j12, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 3120, 55294);
            c0585q = c0585q2;
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Pc.b(ticketResponse, onClick, i4, 0);
        }
    }

    public static final Collection bravo(Collection collection, Collection collection2) {
        Intrinsics.echo(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final C2257l charlie(ArrayList arrayList) {
        C2257l c2257l = new C2257l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Xe.n nVar = (Xe.n) next;
            if (nVar != null && nVar != Xe.m.bravo) {
                c2257l.add(next);
            }
        }
        return c2257l;
    }
}
