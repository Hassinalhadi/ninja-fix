package Ec;

import F.G2;
import a0.C0366t;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import i.InterfaceC1854c;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import t6.AbstractC3033o;
import t6.AbstractC3076w3;
import t6.W3;

/* loaded from: classes2.dex */
public final /* synthetic */ class ai implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;

    public /* synthetic */ ai(String str, int i4) {
        this.alpha = i4;
        this.purple = str;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str = this.purple;
        T.p pVar = T.p.alpha;
        boolean z15 = false;
        switch (this.alpha) {
            case 0:
                InterfaceC1854c item = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(item, "$this$item");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    ap.golf(str, c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                T Button = (T) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button, "$this$Button");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    S alpha = Q.alpha(AbstractC0542h.golf(4), T.d.f2061d, c0585q2, 54);
                    long j5 = c0585q2.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q2.mike();
                    T.s charlie = T.a.charlie(pVar, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
                    C0564b.blue(C2551k.echo, c0585q2, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i4))) {
                        ao.ad.blue(i4, c0585q2, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie);
                    z.ak.bravo(this.purple, null, C0366t.echo, AbstractC2636d7.charlie(14), H0.v.f1409c, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q2, 1772928, 0, 130450);
                    c0585q2.purple(-572792419);
                    c0585q2.quebec(false);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                T OutlinedButton = (T) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(OutlinedButton, "$this$OutlinedButton");
                if ((intValue3 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    S alpha2 = Q.alpha(AbstractC0542h.golf(4), T.d.f2061d, c0585q3, 54);
                    long j6 = c0585q3.magenta;
                    int i5 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q3.mike();
                    T.s charlie2 = T.a.charlie(pVar, c0585q3);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(c2550j2);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q3, alpha2);
                    C0564b.blue(C2551k.echo, c0585q3, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i5))) {
                        ao.ad.blue(i5, c0585q3, i5, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie2);
                    z.ak.bravo(this.purple, null, Db.c.bronze, AbstractC2636d7.charlie(14), H0.v.f1409c, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q3, 1772544, 0, 130450);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC1854c item2 = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                Intrinsics.echo(item2, "$this$item");
                if ((intValue4 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    T.s uniform = AbstractC0538d.uniform(V.charlie(pVar, 1.0f), 0.0f, 8, 1);
                    S alpha3 = Q.alpha(AbstractC0542h.alpha, T.d.f2061d, c0585q4, 48);
                    long j7 = c0585q4.magenta;
                    int i10 = (int) (j7 ^ (j7 >>> 32));
                    I mike3 = c0585q4.mike();
                    T.s charlie3 = T.a.charlie(uniform, c0585q4);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j3 = C2551k.bravo;
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j3);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q4, alpha3);
                    C0564b.blue(C2551k.echo, c0585q4, mike3);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i10))) {
                        ao.ad.blue(i10, c0585q4, i10, c2549i3);
                    }
                    C0564b.blue(C2551k.delta, c0585q4, charlie3);
                    AbstractC3033o.alpha(P0.maroon(1.0f), 0.0f, c0585q4, 0, 2);
                    G2.bravo(this.purple, AbstractC0538d.uniform(pVar, 12, 0.0f, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(Jc.o.hotel, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BLOCKED), null, Jc.o.juliet, 0L, 3, 0L, 0, 16744408), c0585q4, 48, 0, 65532);
                    AbstractC3033o.alpha(P0.maroon(1.0f), 0.0f, c0585q4, 0, 2);
                    c0585q4.quebec(true);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                T OutlinedButton2 = (T) obj;
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                Intrinsics.echo(OutlinedButton2, "$this$OutlinedButton");
                if ((intValue5 & 17) != 16) {
                    z15 = true;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z15)) {
                    G2.bravo(this.purple, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(Lb.ax.bravo, AbstractC2636d7.charlie(18), new H0.v(700), null, Db.g.alpha, 0L, 0, 0L, 0, 16777176), c0585q5, 0, 0, 65534);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                T OutlinedButton3 = (T) obj;
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                Intrinsics.echo(OutlinedButton3, "$this$OutlinedButton");
                if ((intValue6 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z13)) {
                    S alpha4 = Q.alpha(AbstractC0542h.golf(4), T.d.f2061d, c0585q6, 54);
                    long j10 = c0585q6.magenta;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    I mike4 = c0585q6.mike();
                    T.s charlie4 = T.a.charlie(pVar, c0585q6);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j4 = C2551k.bravo;
                    c0585q6.white();
                    if (c0585q6.lime) {
                        c0585q6.lima(c2550j4);
                    } else {
                        c0585q6.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q6, alpha4);
                    C0564b.blue(C2551k.echo, c0585q6, mike4);
                    C2549i c2549i4 = C2551k.golf;
                    if (c0585q6.lime || !Intrinsics.areEqual(c0585q6.jade(), Integer.valueOf(i11))) {
                        ao.ad.blue(i11, c0585q6, i11, c2549i4);
                    }
                    C0564b.blue(C2551k.delta, c0585q6, charlie4);
                    W3.alpha(AbstractC3076w3.charlie(R.drawable.ic_location_icon, c0585q6, 6), null, V.kilo(pVar, 16), null, null, 0.0f, null, c0585q6, 432, 120);
                    z.ak.bravo(this.purple, null, Db.c.bronze, AbstractC2636d7.charlie(14), H0.v.f1409c, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q6, 1772544, 0, 130450);
                    c0585q6.quebec(true);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 6:
                T TextButton = (T) obj;
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                Intrinsics.echo(TextButton, "$this$TextButton");
                if ((intValue7 & 17) != 16) {
                    z15 = true;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z15)) {
                    G2.bravo(this.purple, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q7, 0, 0, 131070);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            default:
                T TextButton2 = (T) obj;
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                Intrinsics.echo(TextButton2, "$this$TextButton");
                if ((intValue8 & 17) != 16) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue8 & 1, z14)) {
                    if (str == null) {
                        str = Q0.c.oscar(c0585q8, 641068933, R.string.ok, c0585q8, false);
                    } else {
                        c0585q8.purple(641068468);
                        c0585q8.quebec(false);
                    }
                    G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q8, 0, 0, 131070);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
