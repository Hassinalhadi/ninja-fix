package Ec;

import F.AbstractC0141o0;
import F.G2;
import F.K1;
import Lb.AbstractC0220c;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
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

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Xd.m {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ String red;

    public /* synthetic */ q(String str, Function0 function0) {
        this.red = str;
        this.purple = function0;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        T.p pVar = T.p.alpha;
        switch (this.alpha) {
            case 0:
                InterfaceC0555v ModalBottomSheet = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    T.s whiskey = AbstractC0538d.whiskey(AbstractC0538d.uniform(V.charlie(pVar, 1.0f), 20, 0.0f, 2), 0.0f, 0.0f, 0.0f, 32, 7);
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q, 48);
                    long j5 = c0585q.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(whiskey, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C2549i c2549i = C2551k.foxtrot;
                    C0564b.blue(c2549i, c0585q, alpha);
                    C2549i c2549i2 = C2551k.echo;
                    C0564b.blue(c2549i2, c0585q, mike);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                        ao.ad.blue(i4, c0585q, i4, c2549i3);
                    }
                    C2549i c2549i4 = C2551k.delta;
                    C0564b.blue(c2549i4, c0585q, charlie);
                    T.s bravo = androidx.compose.foundation.a.bravo(V.kilo(pVar, 48), s.alpha, AbstractC2094g.alpha);
                    q0.ap delta = AbstractC0547m.delta(T.d.teal, false);
                    long j6 = c0585q.magenta;
                    int i5 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q.mike();
                    T.s charlie2 = T.a.charlie(bravo, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, delta);
                    C0564b.blue(c2549i2, c0585q, mike2);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                        ao.ad.blue(i5, c0585q, i5, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie2);
                    float f5 = 24;
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_close_red_circle, c0585q, 6), null, V.kilo(pVar, f5), C0366t.kilo, c0585q, 3504, 0);
                    c0585q.quebec(true);
                    float f10 = 12;
                    String juliet = com.google.android.material.datepicker.j.juliet(pVar, f10, c0585q, R.string.break_time_rejected, c0585q);
                    long charlie3 = AbstractC2636d7.charlie(18);
                    H0.n nVar = ay.tango;
                    H0.v vVar = new H0.v(700);
                    long j7 = ay.echo;
                    G2.bravo(juliet, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j7, charlie3, vVar, null, nVar, 0L, 3, 0L, 0, 16744408), c0585q, 0, 0, 65534);
                    AbstractC0538d.echo(V.echo(pVar, 4), c0585q);
                    G2.bravo(this.red, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(ay.foxtrot, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 3, 0L, 0, 16744408), c0585q, 0, 0, 65534);
                    T.s echo = V.echo(com.google.android.material.datepicker.j.hotel(pVar, f5, c0585q, pVar, 1.0f), 52);
                    C2093f bravo2 = AbstractC2094g.bravo(f10);
                    M m4 = F.al.alpha;
                    K1.bravo(this.purple, echo, false, bravo2, F.al.alpha(j7, C0366t.echo, 0L, 0L, c0585q, 12), null, null, null, t.golf, c0585q, 805306416, 484);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0555v Card = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
                    long j10 = c0585q2.magenta;
                    int i10 = (int) (j10 ^ (j10 >>> 32));
                    I mike3 = c0585q2.mike();
                    T.s charlie4 = T.a.charlie(pVar, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j2);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, alpha2);
                    C0564b.blue(C2551k.echo, c0585q2, mike3);
                    C2549i c2549i5 = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i10))) {
                        ao.ad.blue(i10, c0585q2, i10, c2549i5);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie4);
                    AbstractC0220c.beige(0, null, c0585q2, this.purple);
                    AbstractC0220c.black(null, this.red, c0585q2, 0, 1);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(Function0 function0, String str) {
        this.purple = function0;
        this.red = str;
    }
}
