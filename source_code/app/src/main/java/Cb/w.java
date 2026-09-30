package Cb;

import F.AbstractC0141o0;
import F.G2;
import F.S2;
import F.T2;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qb.AbstractC2448o;
import qb.C2445l;
import qb.EnumC2443j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2726n7;
import s6.AbstractC2815x7;
import s6.AbstractC2824y7;
import s6.AbstractC2833z7;
import s6.D7;
import sb.AbstractC2845d;
import t6.AbstractC3036o2;
import t6.AbstractC3086y3;
import t6.U3;
import t6.V3;
import xb.AbstractC3318b;
import xb.C3321e;
import zb.AbstractC3498a;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Xd.l {
    public final /* synthetic */ int alpha;

    public /* synthetic */ w(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i4 = 7;
        as asVar = C0580l.alpha;
        T.p pVar = T.p.alpha;
        int i5 = 3;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        boolean z30 = false;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    AbstractC3318b.golf(CollectionsKt.listOf(new C3321e("25", "Total Orders"), new C3321e("1,200", "Revenue"), new C3321e("98%", "Rating")), null, V.charlie(pVar, 1.0f), null, 0L, 0L, 0L, 0L, 0L, 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0.0f, c0585q, 438, 0, 32760);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    AbstractC3318b.golf(CollectionsKt.listOf(new C3321e("42", "Active Users"), new C3321e("1.2K", "Total Views")), Float.valueOf(0.5f), V.charlie(pVar, 1.0f), null, 0L, 0L, 0L, 0L, 0L, 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0.0f, c0585q2, 438, 0, 32760);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    T.s sierra = AbstractC0538d.sierra(pVar, 16);
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q3, 0);
                    long j5 = c0585q3.magenta;
                    int i10 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q3.mike();
                    T.s charlie = T.a.charlie(sierra, c0585q3);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(c2550j);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q3, alpha);
                    C0564b.blue(C2551k.echo, c0585q3, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i10))) {
                        ao.ad.blue(i10, c0585q3, i10, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie);
                    G2.bravo("Pull down to refresh", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 6, 0, 131070);
                    G2.bravo("Content here", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 6, 0, 131070);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z15 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z15)) {
                    Object jade = c0585q4.jade();
                    if (jade == asVar) {
                        jade = C0564b.zulu(Boolean.FALSE);
                        c0585q4.f(jade);
                    }
                    ax axVar = (ax) jade;
                    Object jade2 = c0585q4.jade();
                    if (jade2 == asVar) {
                        jade2 = C0564b.november(c0585q4);
                        c0585q4.f(jade2);
                    }
                    vf.ab abVar = (vf.ab) jade2;
                    boolean booleanValue = ((Boolean) axVar.getValue()).booleanValue();
                    boolean india = c0585q4.india(abVar);
                    Object jade3 = c0585q4.jade();
                    if (india || jade3 == asVar) {
                        jade3 = new Ac.g(i5, abVar, axVar);
                        c0585q4.f(jade3);
                    }
                    AbstractC3036o2.alpha(booleanValue, (Function0) jade3, null, y.f878l1, c0585q4, 3072, 4);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z30 = true;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z30)) {
                    C2445l c2445l = AbstractC2448o.alpha;
                    Object jade4 = c0585q5.jade();
                    if (jade4 == asVar) {
                        jade4 = new s(23);
                        c0585q5.f(jade4);
                    }
                    AbstractC2833z7.alpha(c2445l, (Function0) jade4, V.charlie(pVar, 1.0f), null, 0L, 0L, 0L, 0L, false, c0585q5, 438);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z12)) {
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q6, 0);
                    long j6 = c0585q6.magenta;
                    int i11 = (int) ((j6 >>> 32) ^ j6);
                    I mike2 = c0585q6.mike();
                    T.s charlie2 = T.a.charlie(pVar, c0585q6);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q6.white();
                    if (c0585q6.lime) {
                        c0585q6.lima(c2550j2);
                    } else {
                        c0585q6.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q6, alpha2);
                    C0564b.blue(C2551k.echo, c0585q6, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (c0585q6.lime || !Intrinsics.areEqual(c0585q6.jade(), Integer.valueOf(i11))) {
                        ao.ad.blue(i11, c0585q6, i11, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q6, charlie2);
                    E0 e02 = T2.alpha;
                    G2.bravo("Clickable Card", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q6.kilo(e02)).hotel, c0585q6, 6, 0, 65534);
                    G2.bravo("Tap to interact", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q6.kilo(e02)).kilo, c0585q6, 6, 0, 65534);
                    c0585q6.quebec(true);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z29 = true;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z29)) {
                    Object jade5 = c0585q7.jade();
                    if (jade5 == asVar) {
                        jade5 = new Bd.b(i4);
                        c0585q7.f(jade5);
                    }
                    P.d dVar = y.alpha;
                    AbstractC2815x7.alpha(390, null, c0585q7, (Function0) jade5);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z28 = true;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue8 & 1, z28)) {
                    Object jade6 = c0585q8.jade();
                    if (jade6 == asVar) {
                        jade6 = new Bd.b(28);
                        c0585q8.f(jade6);
                    }
                    AbstractC2726n7.alpha("Primary Button Disabled", (Function0) jade6, false, null, null, c0585q8, 438, 24);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC0581m interfaceC0581m9 = (InterfaceC0581m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q9 = (C0585q) interfaceC0581m9;
                if (c0585q9.magenta(intValue9 & 1, z13)) {
                    C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q9, 0);
                    long j7 = c0585q9.magenta;
                    int i12 = (int) ((j7 >>> 32) ^ j7);
                    I mike3 = c0585q9.mike();
                    T.s charlie3 = T.a.charlie(pVar, c0585q9);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j3 = C2551k.bravo;
                    c0585q9.white();
                    if (c0585q9.lime) {
                        c0585q9.lima(c2550j3);
                    } else {
                        c0585q9.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q9, alpha3);
                    C0564b.blue(C2551k.echo, c0585q9, mike3);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q9.lime || !Intrinsics.areEqual(c0585q9.jade(), Integer.valueOf(i12))) {
                        ao.ad.blue(i12, c0585q9, i12, c2549i3);
                    }
                    C0564b.blue(C2551k.delta, c0585q9, charlie3);
                    E0 e03 = T2.alpha;
                    G2.bravo("Information", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q9.kilo(e03)).hotel, c0585q9, 6, 0, 65534);
                    G2.bravo("This is an info card with blue background", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q9.kilo(e03)).kilo, c0585q9, 6, 0, 65534);
                    c0585q9.quebec(true);
                } else {
                    c0585q9.ochre();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC0581m interfaceC0581m10 = (InterfaceC0581m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z27 = true;
                }
                C0585q c0585q10 = (C0585q) interfaceC0581m10;
                if (c0585q10.magenta(intValue10 & 1, z27)) {
                    AbstractC0141o0.bravo(i6.d.alpha(), null, V.kilo(pVar, 32), 0L, c0585q10, 432, 8);
                } else {
                    c0585q10.ochre();
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC0581m interfaceC0581m11 = (InterfaceC0581m) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z26 = true;
                }
                C0585q c0585q11 = (C0585q) interfaceC0581m11;
                if (c0585q11.magenta(intValue11 & 1, z26)) {
                    P.d dVar2 = y.alpha;
                    AbstractC2824y7.alpha(null, c0585q11, 48);
                } else {
                    c0585q11.ochre();
                }
                return Unit.INSTANCE;
            case 11:
                InterfaceC0581m interfaceC0581m12 = (InterfaceC0581m) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z25 = true;
                }
                C0585q c0585q12 = (C0585q) interfaceC0581m12;
                if (c0585q12.magenta(intValue12 & 1, z25)) {
                    G2.bravo("Active Status", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q12.kilo(T2.alpha)).juliet, c0585q12, 6, 0, 65534);
                } else {
                    c0585q12.ochre();
                }
                return Unit.INSTANCE;
            case 12:
                InterfaceC0581m interfaceC0581m13 = (InterfaceC0581m) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z24 = true;
                }
                C0585q c0585q13 = (C0585q) interfaceC0581m13;
                if (c0585q13.magenta(intValue13 & 1, z24)) {
                    D7.bravo(EnumC2443j.alpha, y.whiskey, c0585q13, 438);
                } else {
                    c0585q13.ochre();
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC0581m interfaceC0581m14 = (InterfaceC0581m) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z23 = true;
                }
                C0585q c0585q14 = (C0585q) interfaceC0581m14;
                if (c0585q14.magenta(intValue14 & 1, z23)) {
                    G2.bravo("Inactive Status", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q14.kilo(T2.alpha)).juliet, c0585q14, 6, 0, 65534);
                } else {
                    c0585q14.ochre();
                }
                return Unit.INSTANCE;
            case 14:
                InterfaceC0581m interfaceC0581m15 = (InterfaceC0581m) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z22 = true;
                }
                C0585q c0585q15 = (C0585q) interfaceC0581m15;
                if (c0585q15.magenta(intValue15 & 1, z22)) {
                    D7.bravo(EnumC2443j.purple, y.yankee, c0585q15, 438);
                } else {
                    c0585q15.ochre();
                }
                return Unit.INSTANCE;
            case 15:
                InterfaceC0581m interfaceC0581m16 = (InterfaceC0581m) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z21 = true;
                }
                C0585q c0585q16 = (C0585q) interfaceC0581m16;
                if (c0585q16.magenta(intValue16 & 1, z21)) {
                    G2.bravo("Warning Status", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q16.kilo(T2.alpha)).juliet, c0585q16, 6, 0, 65534);
                } else {
                    c0585q16.ochre();
                }
                return Unit.INSTANCE;
            case 16:
                InterfaceC0581m interfaceC0581m17 = (InterfaceC0581m) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z20 = true;
                }
                C0585q c0585q17 = (C0585q) interfaceC0581m17;
                if (c0585q17.magenta(intValue17 & 1, z20)) {
                    D7.bravo(EnumC2443j.red, y.amber, c0585q17, 438);
                } else {
                    c0585q17.ochre();
                }
                return Unit.INSTANCE;
            case 17:
                InterfaceC0581m interfaceC0581m18 = (InterfaceC0581m) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z19 = true;
                }
                C0585q c0585q18 = (C0585q) interfaceC0581m18;
                if (c0585q18.magenta(intValue18 & 1, z19)) {
                    U3.alpha("Active shift", AbstractC3498a.alpha, V.charlie(pVar, 1.0f), null, 0L, 0L, null, 0L, 0L, 0L, 0L, 0.0f, 0L, c0585q18, 390, 8184);
                } else {
                    c0585q18.ochre();
                }
                return Unit.INSTANCE;
            case 18:
                InterfaceC0581m interfaceC0581m19 = (InterfaceC0581m) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z18 = true;
                }
                C0585q c0585q19 = (C0585q) interfaceC0581m19;
                if (c0585q19.magenta(intValue19 & 1, z18)) {
                    V3.alpha(AbstractC3498a.bravo, V.charlie(pVar, 1.0f), null, 0L, 0L, 0L, 0L, 0L, 0.0f, 0L, c0585q19, 48, 1020);
                } else {
                    c0585q19.ochre();
                }
                return Unit.INSTANCE;
            case 19:
                InterfaceC0581m interfaceC0581m20 = (InterfaceC0581m) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z17 = true;
                }
                C0585q c0585q20 = (C0585q) interfaceC0581m20;
                if (c0585q20.magenta(intValue20 & 1, z17)) {
                    AbstractC0141o0.bravo(i6.d.alpha(), null, null, 0L, c0585q20, 48, 12);
                } else {
                    c0585q20.ochre();
                }
                return Unit.INSTANCE;
            case 20:
                InterfaceC0581m interfaceC0581m21 = (InterfaceC0581m) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q21 = (C0585q) interfaceC0581m21;
                if (c0585q21.magenta(intValue21 & 1, z14)) {
                    Object jade7 = c0585q21.jade();
                    if (jade7 == asVar) {
                        jade7 = C0564b.zulu(Boolean.FALSE);
                        c0585q21.f(jade7);
                    }
                    ax axVar2 = (ax) jade7;
                    Object jade8 = c0585q21.jade();
                    if (jade8 == asVar) {
                        jade8 = new Ac.o(axVar2, 6);
                        c0585q21.f(jade8);
                    }
                    AbstractC2726n7.alpha("Show Dialog with Icon", (Function0) jade8, false, null, null, c0585q21, 54, 28);
                    if (((Boolean) axVar2.getValue()).booleanValue()) {
                        c0585q21.purple(-1982593359);
                        Object jade9 = c0585q21.jade();
                        if (jade9 == asVar) {
                            jade9 = new Ac.o(axVar2, 7);
                            c0585q21.f(jade9);
                        }
                        Function0 function0 = (Function0) jade9;
                        Object jade10 = c0585q21.jade();
                        if (jade10 == asVar) {
                            jade10 = new Ac.o(axVar2, 8);
                            c0585q21.f(jade10);
                        }
                        AbstractC2845d.charlie(function0, "Custom Icon Dialog", "This dialog has a custom icon", "OK", "Cancel", (Function0) jade10, y.f835V, c0585q21, 1797558, 0);
                    } else {
                        c0585q21.purple(-2054199050);
                    }
                    c0585q21.quebec(false);
                } else {
                    c0585q21.ochre();
                }
                return Unit.INSTANCE;
            case 21:
                InterfaceC0581m interfaceC0581m22 = (InterfaceC0581m) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z16 = true;
                }
                C0585q c0585q22 = (C0585q) interfaceC0581m22;
                if (c0585q22.magenta(intValue22 & 1, z16)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q22, R.string.showcase_filter_all), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q22, 0, 0, 131070);
                } else {
                    c0585q22.ochre();
                }
                return Unit.INSTANCE;
            case 22:
                D0.g gVar = (D0.g) obj2;
                return CollectionsKt.azure(gVar.purple, D0.ad.alpha(gVar.alpha, D0.ad.alpha, (R.b) obj));
            case 23:
                return Integer.valueOf(((O0.l) obj2).alpha);
            case 24:
                O0.p pVar2 = (O0.p) obj2;
                return CollectionsKt.azure(Float.valueOf(pVar2.alpha), Float.valueOf(pVar2.bravo));
            case 25:
                R.b bVar = (R.b) obj;
                O0.q qVar = (O0.q) obj2;
                Q0.p pVar3 = new Q0.p(qVar.alpha);
                D0.ac acVar = D0.ad.quebec;
                return CollectionsKt.azure(D0.ad.alpha(pVar3, acVar, bVar), D0.ad.alpha(new Q0.p(qVar.bravo), acVar, bVar));
            case 26:
                return Integer.valueOf(((H0.v) obj2).alpha);
            case 27:
                D0.l lVar = (D0.l) obj2;
                return CollectionsKt.azure(lVar.alpha, D0.ad.alpha(lVar.bravo, D0.ad.india, (R.b) obj));
            case 28:
                return Float.valueOf(((O0.a) obj2).alpha);
            default:
                R.b bVar2 = (R.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList.add(D0.ad.alpha((D0.e) list.get(i13), D0.ad.bravo, bVar2));
                }
                return arrayList;
        }
    }
}
