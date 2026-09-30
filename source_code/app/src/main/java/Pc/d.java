package Pc;

import D0.an;
import F.AbstractC0141o0;
import F.G2;
import H0.n;
import H0.v;
import Jb.C0195c;
import Lb.af;
import T.j;
import T.p;
import T.s;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.app.network.network.models.Action;
import com.app.network.network.models.ActionType;
import com.app.network.network.models.TicketActionType;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import g0.C1726f;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.W3;

/* loaded from: classes2.dex */
public abstract class d {
    public static final long alpha = ao.delta(4294967295L);
    public static final long bravo = ao.delta(4280756010L);
    public static final long charlie = ao.delta(4280032286L);
    public static final long delta = ao.delta(4285624698L);

    public static final void alpha(String str, int i4, Function0 function0, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        boolean z10;
        int i11;
        int i12;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1424154077);
        if ((i5 & 6) == 0) {
            if (c0585q.golf(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.echo(i4)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i5 & 384) == 0) {
            if (c0585q.india(function0)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        int i14 = i10;
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f hotel = AbstractC0542h.hotel(8, T.d.f2063g);
            j jVar = T.d.f2061d;
            p pVar = p.alpha;
            s bravo2 = androidx.compose.foundation.a.bravo(V.echo(V.charlie(pVar, 1.0f), 56), bravo, AbstractC2094g.bravo(12));
            if ((i14 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Bb.a(function0, 18);
                c0585q.f(jade);
            }
            s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.echo(15, bravo2, null, (Function0) jade, false), 16, 0.0f, 2);
            S alpha2 = Q.alpha(hotel, jVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(uniform, c0585q);
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
                ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(i4, c0585q, (i14 >> 3) & 14), null, V.kilo(pVar, 24), C0366t.echo, c0585q, 3504, 0);
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(alpha, AbstractC2636d7.charlie(15), new v(700), null, c.alpha, 0L, 3, 0L, 0, 16744408), c0585q, i14 & 14, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new af(i4, i5, str, function0);
        }
    }

    public static final void bravo(ActionType type, Function0 onOpenTicketClick, Function0 onNotifyClick, Function0 onCallClick, Function0 onDeepLinkClick, Function0 onDismiss, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        Function0 function0;
        Function0 function02;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i15;
        boolean z16;
        boolean z17;
        boolean z18;
        Intrinsics.echo(type, "type");
        Intrinsics.echo(onOpenTicketClick, "onOpenTicketClick");
        Intrinsics.echo(onNotifyClick, "onNotifyClick");
        Intrinsics.echo(onCallClick, "onCallClick");
        Intrinsics.echo(onDeepLinkClick, "onDeepLinkClick");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1002212020);
        if (c0585q.india(type)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i16 = i4 | i5;
        if (c0585q.india(onOpenTicketClick)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i17 = i16 | i10;
        if (c0585q.india(onNotifyClick)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i18 = i17 | i11;
        if (c0585q.india(onCallClick)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i19 = i18 | i12;
        if (c0585q.india(onDeepLinkClick)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i20 = i19 | i13;
        if (c0585q.india(onDismiss)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i21 = i20 | i14;
        if ((74899 & i21) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i21 & 1, z2)) {
            List<Action> actions = type.getActions();
            if (actions != null && !actions.isEmpty()) {
                for (Action action : actions) {
                    if (action.getEnabled() && action.getActionType() == TicketActionType.NOTIFY) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            List<Action> actions2 = type.getActions();
            if (actions2 != null && !actions2.isEmpty()) {
                for (Action action2 : actions2) {
                    if (action2.getEnabled() && action2.getActionType() == TicketActionType.COMMENT) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            List<Action> actions3 = type.getActions();
            if (actions3 != null && !actions3.isEmpty()) {
                for (Action action3 : actions3) {
                    if (action3.getEnabled() && action3.getActionType() == TicketActionType.CALL) {
                        z12 = true;
                        break;
                    }
                }
            }
            z12 = false;
            List<Action> actions4 = type.getActions();
            if (actions4 != null && !actions4.isEmpty()) {
                for (Action action4 : actions4) {
                    if (action4.getEnabled() && action4.getActionType() == TicketActionType.DEEP_LINK) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            T.i iVar = T.d.f2063g;
            p pVar = p.alpha;
            float f5 = 16;
            s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(V.charlie(pVar, 1.0f), alpha, AbstractC2094g.delta(f5, f5)), f5);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, iVar, c0585q, 48);
            long j5 = c0585q.magenta;
            int i22 = (int) (j5 ^ (j5 >>> 32));
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
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i22))) {
                ad.blue(i22, c0585q, i22, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            s charlie3 = V.charlie(pVar, 1.0f);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            long j6 = c0585q.magenta;
            int i23 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie4 = T.a.charlie(charlie3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i23))) {
                ad.blue(i23, c0585q, i23, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            C0551q c0551q = C0551q.alpha;
            C1726f alpha3 = AbstractC2056a.alpha();
            float f10 = 24;
            s kilo = V.kilo(c0551q.alpha(pVar, T.d.red), f10);
            if ((458752 & i21) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object jade = c0585q.jade();
            if (z14 || jade == C0580l.alpha) {
                jade = new Bb.a(onDismiss, 19);
                c0585q.f(jade);
            }
            s echo = androidx.compose.foundation.a.echo(15, kilo, null, (Function0) jade, false);
            long j7 = charlie;
            AbstractC0141o0.bravo(alpha3, "Close", echo, j7, c0585q, 3120, 0);
            c0585q.quebec(true);
            float f11 = 8;
            AbstractC0538d.echo(V.echo(pVar, f11), c0585q);
            W3.alpha(AbstractC3076w3.charlie(R.drawable.ninjacustomer_service, c0585q, 6), null, V.kilo(pVar, 64), null, null, 0.0f, null, c0585q, 432, 120);
            AbstractC0538d.echo(V.echo(pVar, f5), c0585q);
            String title = type.getTitle();
            if (title == null) {
                title = "";
            }
            long charlie5 = AbstractC2636d7.charlie(22);
            n nVar = c.alpha;
            G2.bravo(title, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j7, charlie5, new v(700), null, nVar, 0L, 3, 0L, 0, 16744408), c0585q, 0, 0, 65534);
            AbstractC0538d.echo(V.echo(pVar, f11), c0585q);
            String description = type.getDescription();
            if (description == null) {
                description = "";
            }
            long charlie6 = AbstractC2636d7.charlie(14);
            v vVar = new v(HttpConstants.HTTP_BLOCKED);
            long j10 = delta;
            G2.bravo(description, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j10, charlie6, vVar, null, nVar, 0L, 3, 0L, 0, 16744408), c0585q, 0, 0, 65534);
            c0585q = c0585q;
            AbstractC0538d.echo(V.echo(pVar, f10), c0585q);
            if (z11) {
                c0585q.purple(-1401753390);
                alpha(AbstractC3086y3.bravo(c0585q, R.string.open_a_ticket), R.drawable.message_3_fill, onOpenTicketClick, c0585q, ((i21 << 3) & 896) | 48);
                AbstractC0538d.echo(V.echo(pVar, 12), c0585q);
                z15 = false;
            } else {
                z15 = false;
                c0585q.purple(-1405731496);
            }
            c0585q.quebec(z15);
            if (z10) {
                c0585q.purple(-1401456627);
                alpha(AbstractC3086y3.bravo(c0585q, R.string.notify_support), R.drawable.notification_3_fill, onNotifyClick, c0585q, (i21 & 896) | 48);
                i15 = 12;
                G2.bravo(com.google.android.material.datepicker.j.juliet(pVar, 12, c0585q, R.string.no_need_full_ticket, c0585q), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j10, AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 3, 0L, 0, 16744408), c0585q, 0, 0, 65534);
                c0585q = c0585q;
                z16 = false;
            } else {
                i15 = 12;
                z16 = false;
                c0585q.purple(-1405731496);
            }
            c0585q.quebec(z16);
            if (z12) {
                c0585q.purple(-1400800605);
                function0 = onCallClick;
                alpha(AbstractC3086y3.bravo(c0585q, R.string.call), R.drawable.ic_call_icon, function0, c0585q, ((i21 >> 3) & 896) | 48);
                AbstractC0538d.echo(V.echo(pVar, i15), c0585q);
                z17 = false;
            } else {
                function0 = onCallClick;
                z17 = false;
                c0585q.purple(-1405731496);
            }
            c0585q.quebec(z17);
            if (z13) {
                c0585q.purple(-1400530161);
                function02 = onDeepLinkClick;
                alpha(AbstractC3086y3.bravo(c0585q, R.string.action_open_screen), R.drawable.ic_open_in_new, function02, c0585q, ((i21 >> 6) & 896) | 48);
                AbstractC0538d.echo(V.echo(pVar, i15), c0585q);
                z18 = false;
            } else {
                function02 = onDeepLinkClick;
                z18 = false;
                c0585q.purple(-1405731496);
            }
            c0585q.quebec(z18);
            AbstractC0538d.echo(V.echo(pVar, f11), c0585q);
            c0585q.quebec(true);
        } else {
            function0 = onCallClick;
            function02 = onDeepLinkClick;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0195c(type, onOpenTicketClick, onNotifyClick, function0, function02, onDismiss, i4);
        }
    }
}
