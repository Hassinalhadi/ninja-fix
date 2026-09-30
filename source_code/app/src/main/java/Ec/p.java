package Ec;

import F.AbstractC0122j1;
import F.AbstractC0141o0;
import F.C0103e2;
import F.G2;
import F.K1;
import a0.C0366t;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.r0;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;

/* loaded from: classes2.dex */
public abstract class p {
    public static final long alpha = a0.ao.delta(4280468830L);
    public static final long bravo = a0.ao.delta(4293983732L);
    public static final long charlie = a0.ao.delta(4294243573L);
    public static final /* synthetic */ int delta = 0;

    public static final void alpha(final Function0 onDismiss, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        C0585q c0585q;
        int i11;
        int i12;
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1155241033);
        if ((i5 & 6) == 0) {
            if (c0585q2.echo(i4)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i5 | i12;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q2.india(onDismiss)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i10 & 1, z2)) {
            C0103e2 foxtrot = AbstractC0122j1.foxtrot(true, c0585q2, 6, 2);
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.xray(i4 * 60);
                c0585q2.f(jade);
            }
            r0 r0Var = (r0) jade;
            Unit unit = Unit.INSTANCE;
            Object jade2 = c0585q2.jade();
            if (jade2 == asVar) {
                jade2 = new o(r0Var, null);
                c0585q2.f(jade2);
            }
            C0564b.foxtrot((Xd.l) jade2, c0585q2, unit);
            long j5 = 60;
            final int juliet = (int) (r0Var.juliet() / j5);
            final int juliet2 = (int) (r0Var.juliet() % j5);
            float f5 = 20;
            c0585q = c0585q2;
            AbstractC0122j1.alpha(onDismiss, null, foxtrot, 0.0f, AbstractC2094g.delta(f5, f5), C0366t.echo, 0L, 0.0f, 0L, null, null, null, P.e.echo(1672246932, new Xd.m() { // from class: Ec.m
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z10;
                    InterfaceC0555v ModalBottomSheet = (InterfaceC0555v) obj;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    Intrinsics.echo(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((intValue & 17) != 16) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                    if (c0585q3.magenta(intValue & 1, z10)) {
                        T.p pVar = T.p.alpha;
                        float f10 = 32;
                        T.s whiskey = AbstractC0538d.whiskey(AbstractC0538d.uniform(V.charlie(pVar, 1.0f), 20, 0.0f, 2), 0.0f, 0.0f, 0.0f, f10, 7);
                        C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q3, 48);
                        long j6 = c0585q3.magenta;
                        int i13 = (int) (j6 ^ (j6 >>> 32));
                        I mike = c0585q3.mike();
                        T.s charlie2 = T.a.charlie(whiskey, c0585q3);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j = C2551k.bravo;
                        c0585q3.white();
                        if (c0585q3.lime) {
                            c0585q3.lima(c2550j);
                        } else {
                            c0585q3.i();
                        }
                        C2549i c2549i = C2551k.foxtrot;
                        C0564b.blue(c2549i, c0585q3, alpha2);
                        C2549i c2549i2 = C2551k.echo;
                        C0564b.blue(c2549i2, c0585q3, mike);
                        C2549i c2549i3 = C2551k.golf;
                        if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i13))) {
                            ao.ad.blue(i13, c0585q3, i13, c2549i3);
                        }
                        C2549i c2549i4 = C2551k.delta;
                        C0564b.blue(c2549i4, c0585q3, charlie2);
                        T.s bravo2 = androidx.compose.foundation.a.bravo(V.kilo(pVar, 48), p.bravo, AbstractC2094g.alpha);
                        q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                        long j7 = c0585q3.magenta;
                        int i14 = (int) (j7 ^ (j7 >>> 32));
                        I mike2 = c0585q3.mike();
                        T.s charlie3 = T.a.charlie(bravo2, c0585q3);
                        c0585q3.white();
                        if (c0585q3.lime) {
                            c0585q3.lima(c2550j);
                        } else {
                            c0585q3.i();
                        }
                        C0564b.blue(c2549i, c0585q3, delta2);
                        C0564b.blue(c2549i2, c0585q3, mike2);
                        if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i14))) {
                            ao.ad.blue(i14, c0585q3, i14, c2549i3);
                        }
                        C0564b.blue(c2549i4, c0585q3, charlie3);
                        float f11 = 24;
                        AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_check_black_circle, c0585q3, 6), null, V.kilo(pVar, f11), p.alpha, c0585q3, 3504, 0);
                        c0585q3.quebec(true);
                        float f12 = 12;
                        String juliet3 = com.google.android.material.datepicker.j.juliet(pVar, f12, c0585q3, R.string.break_time_approved, c0585q3);
                        long charlie4 = AbstractC2636d7.charlie(18);
                        H0.n nVar = ay.tango;
                        H0.v vVar = new H0.v(700);
                        long j10 = ay.echo;
                        G2.bravo(juliet3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j10, charlie4, vVar, null, nVar, 0L, 3, 0L, 0, 16744408), c0585q3, 0, 0, 65534);
                        float f13 = 4;
                        String juliet4 = com.google.android.material.datepicker.j.juliet(pVar, f13, c0585q3, R.string.break_time_approved_subtitle, c0585q3);
                        long charlie5 = AbstractC2636d7.charlie(14);
                        H0.v vVar2 = new H0.v(HttpConstants.HTTP_BLOCKED);
                        long j11 = ay.foxtrot;
                        G2.bravo(juliet4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, charlie5, vVar2, null, nVar, 0L, 3, 0L, 0, 16744408), c0585q3, 0, 0, 65534);
                        AbstractC0538d.echo(V.echo(pVar, f11), c0585q3);
                        S alpha3 = Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q3, 54);
                        long j12 = c0585q3.magenta;
                        int i15 = (int) (j12 ^ (j12 >>> 32));
                        I mike3 = c0585q3.mike();
                        T.s charlie6 = T.a.charlie(pVar, c0585q3);
                        c0585q3.white();
                        if (c0585q3.lime) {
                            c0585q3.lima(c2550j);
                        } else {
                            c0585q3.i();
                        }
                        C0564b.blue(c2549i, c0585q3, alpha3);
                        C0564b.blue(c2549i2, c0585q3, mike3);
                        if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i15))) {
                            ao.ad.blue(i15, c0585q3, i15, c2549i3);
                        }
                        C0564b.blue(c2549i4, c0585q3, charlie6);
                        p.bravo(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(juliet)}, 1)), c0585q3, 0);
                        G2.bravo(":", AbstractC0538d.uniform(pVar, 8, 0.0f, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j10, AbstractC2636d7.charlie(32), new H0.v(700), null, nVar, 0L, 0, 0L, 0, 16777176), c0585q3, 54, 0, 65532);
                        p.bravo(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(juliet2)}, 1)), c0585q3, 0);
                        c0585q3.quebec(true);
                        AbstractC0538d.echo(V.echo(pVar, f13), c0585q3);
                        T.s oscar = V.oscar(pVar, 200);
                        S alpha4 = Q.alpha(AbstractC0542h.golf, T.d.f2060c, c0585q3, 6);
                        long j13 = c0585q3.magenta;
                        int i16 = (int) (j13 ^ (j13 >>> 32));
                        I mike4 = c0585q3.mike();
                        T.s charlie7 = T.a.charlie(oscar, c0585q3);
                        c0585q3.white();
                        if (c0585q3.lime) {
                            c0585q3.lima(c2550j);
                        } else {
                            c0585q3.i();
                        }
                        C0564b.blue(c2549i, c0585q3, alpha4);
                        C0564b.blue(c2549i2, c0585q3, mike4);
                        if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i16))) {
                            ao.ad.blue(i16, c0585q3, i16, c2549i3);
                        }
                        C0564b.blue(c2549i4, c0585q3, charlie7);
                        G2.bravo(AbstractC3086y3.bravo(c0585q3, R.string.mins), P0.maroon(1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 3, 0L, 0, 16744408), c0585q3, 0, 0, 65532);
                        AbstractC0538d.echo(V.oscar(pVar, f10), c0585q3);
                        G2.bravo(AbstractC3086y3.bravo(c0585q3, R.string.secs), P0.maroon(1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j11, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 3, 0L, 0, 16744408), c0585q3, 0, 0, 65532);
                        c0585q3.quebec(true);
                        AbstractC0538d.echo(V.echo(pVar, f11), c0585q3);
                        T.s echo = V.echo(V.charlie(pVar, 1.0f), 52);
                        C2093f bravo3 = AbstractC2094g.bravo(f12);
                        M m4 = F.al.alpha;
                        K1.bravo(onDismiss, echo, false, bravo3, F.al.alpha(j10, C0366t.echo, 0L, 0L, c0585q3, 12), null, null, null, t.foxtrot, c0585q3, 805306416, 484);
                        c0585q3.quebec(true);
                    } else {
                        c0585q3.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q2), c0585q, ((i10 >> 3) & 14) | 196608, 4042);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new n(i4, onDismiss, i5, 0);
        }
    }

    public static final void bravo(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1237584316);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.s bravo2 = androidx.compose.foundation.a.bravo(V.kilo(T.p.alpha, 72), charlie, AbstractC2094g.bravo(12));
            q0.ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(ay.echo, AbstractC2636d7.charlie(32), new H0.v(700), null, ay.tango, 0L, 0, 0L, 0, 16777176), c0585q, i10 & 14, 0, 65534);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.i(str, i4, 2);
        }
    }
}
