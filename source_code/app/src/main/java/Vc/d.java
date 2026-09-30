package Vc;

import Cb.y;
import F.G2;
import F.S2;
import F.T2;
import H0.v;
import T.s;
import Wb.ab;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import ao.ad;
import com.checkout.components.kmp.rememberme.view.dialog.ComposableSingletons$InfoDialogViewKt;
import com.checkout.components.ui.utils.extensions.ModifierExtensionsKt;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import h5.C1809a;
import i.InterfaceC1854c;
import kb.AbstractC2030f;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import ob.AbstractC2210c;
import ob.C2209b;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import s6.AbstractC2726n7;
import s6.AbstractC2744p7;
import sb.C2844c;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.R3;
import t6.W3;
import z.ak;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Xd.m {
    public final /* synthetic */ int alpha;

    public /* synthetic */ d(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i4;
        boolean z15;
        int i5;
        boolean z16;
        int i10;
        T.p pVar = T.p.alpha;
        boolean z17 = false;
        switch (this.alpha) {
            case 0:
                InterfaceC1854c item = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(item, "$this$item");
                if ((intValue & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z17)) {
                    AbstractC0538d.echo(V.echo(pVar, 24), c0585q);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                return ComposableSingletons$InfoDialogViewKt.alpha((InterfaceC1854c) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 2:
                T Button = (T) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button, "$this$Button");
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z2)) {
                    S alpha = Q.alpha(AbstractC0542h.golf(8), T.d.f2061d, c0585q2, 54);
                    long j5 = c0585q2.magenta;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q2.mike();
                    s charlie = T.a.charlie(pVar, c0585q2);
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
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i11))) {
                        ad.blue(i11, c0585q2, i11, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie);
                    W3.alpha(AbstractC3076w3.charlie(R.drawable.ic_checked_icon_white, c0585q2, 6), null, V.kilo(pVar, 20), null, null, 0.0f, null, c0585q2, 432, 120);
                    ak.bravo(AbstractC3086y3.bravo(c0585q2, R.string.use_this_photo), null, C0366t.echo, AbstractC2636d7.charlie(14), new v(HttpConstants.HTTP_INTERNAL_ERROR), new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, 1772928, 0, 130962);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                T OutlinedButton = (T) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(OutlinedButton, "$this$OutlinedButton");
                if ((intValue3 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z10)) {
                    S alpha2 = Q.alpha(AbstractC0542h.golf(8), T.d.f2061d, c0585q3, 54);
                    long j6 = c0585q3.magenta;
                    int i12 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q3.mike();
                    s charlie2 = T.a.charlie(pVar, c0585q3);
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
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i12))) {
                        ad.blue(i12, c0585q3, i12, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie2);
                    AbstractC1680b charlie3 = AbstractC3076w3.charlie(R.drawable.ic_camera, c0585q3, 6);
                    long j7 = ab.delta;
                    z.s.alpha(charlie3, null, V.kilo(pVar, 20), j7, c0585q3, 3504, 0);
                    ak.bravo(AbstractC3086y3.bravo(c0585q3, R.string.retake_photo), null, j7, AbstractC2636d7.charlie(14), v.f1409c, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, null, 0L, 0, false, 0, 0, null, null, c0585q3, 1772928, 0, 130962);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                T Button2 = (T) obj;
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button2, "$this$Button");
                if ((intValue4 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z17)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q4, R.string.multi_orders_ok), null, 0L, AbstractC2636d7.charlie(18), new v(600), null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q4, 199680, 0, 131030);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                T Button3 = (T) obj;
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button3, "$this$Button");
                if ((intValue5 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z17)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q5, R.string.multi_pickup_confirm), null, 0L, AbstractC2636d7.charlie(18), new v(600), null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q5, 199680, 0, 131030);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 6:
                return ModifierExtensionsKt.bravo((s) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 7:
                T Button4 = (T) obj;
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button4, "$this$Button");
                if ((intValue6 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z17)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q6, R.string.submit_invoice_price), null, C0366t.echo, AbstractC2636d7.charlie(18), v.f1409c, null, 0L, null, AbstractC2636d7.charlie(23), 0, false, 0, 0, null, null, c0585q6, 200064, 6, 130002);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC1854c item2 = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                Intrinsics.echo(item2, "$this$item");
                if ((intValue7 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z11)) {
                    s kilo = V.kilo(pVar, AbstractC2030f.delta);
                    float f5 = C2209b.alpha;
                    long j10 = AbstractC2210c.bravo;
                    float f10 = AbstractC2030f.echo;
                    s sierra = AbstractC0538d.sierra(R3.charlie(androidx.compose.foundation.a.bravo(kilo, j10, AbstractC2094g.bravo(f10)), 1, AbstractC2210c.delta, AbstractC2094g.bravo(f10)), AbstractC2030f.foxtrot);
                    ap delta = AbstractC0547m.delta(T.d.teal, false);
                    int romeo = C0564b.romeo(c0585q7);
                    I mike3 = c0585q7.mike();
                    s charlie4 = T.a.charlie(sierra, c0585q7);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j3 = C2551k.bravo;
                    c0585q7.white();
                    if (c0585q7.lime) {
                        c0585q7.lima(c2550j3);
                    } else {
                        c0585q7.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q7, delta);
                    C0564b.blue(C2551k.echo, c0585q7, mike3);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q7.lime || !Intrinsics.areEqual(c0585q7.jade(), Integer.valueOf(romeo))) {
                        ad.blue(romeo, c0585q7, romeo, c2549i3);
                    }
                    C0564b.blue(C2551k.delta, c0585q7, charlie4);
                    W3.alpha(AbstractC3076w3.charlie(R.drawable.sidebarimage, c0585q7, 0), AbstractC3086y3.bravo(c0585q7, R.string.handshake_cabinets), V.charlie, null, null, 0.0f, null, c0585q7, 384, 120);
                    c0585q7.quebec(true);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC0555v Card = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue8 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue8 & 1, z12)) {
                    s sierra2 = AbstractC0538d.sierra(V.charlie(pVar, 1.0f), Db.d.alpha);
                    ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
                    int romeo2 = C0564b.romeo(c0585q8);
                    I mike4 = c0585q8.mike();
                    s charlie5 = T.a.charlie(sierra2, c0585q8);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j4 = C2551k.bravo;
                    c0585q8.white();
                    if (c0585q8.lime) {
                        c0585q8.lima(c2550j4);
                    } else {
                        c0585q8.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q8, delta2);
                    C0564b.blue(C2551k.echo, c0585q8, mike4);
                    C2549i c2549i4 = C2551k.golf;
                    if (c0585q8.lime || !Intrinsics.areEqual(c0585q8.jade(), Integer.valueOf(romeo2))) {
                        ad.blue(romeo2, c0585q8, romeo2, c2549i4);
                    }
                    C0564b.blue(C2551k.delta, c0585q8, charlie5);
                    y.sierra.invoke(c0585q8, 0);
                    c0585q8.quebec(true);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC0555v CustomDialog = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m9 = (InterfaceC0581m) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                Intrinsics.echo(CustomDialog, "$this$CustomDialog");
                if ((intValue9 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q9 = (C0585q) interfaceC0581m9;
                if (c0585q9.magenta(intValue9 & 1, z17)) {
                    G2.bravo("How was your delivery experience?", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q9.kilo(T2.alpha)).kilo, c0585q9, 6, 0, 65534);
                    AbstractC0538d.echo(V.echo(pVar, 8), c0585q9);
                } else {
                    c0585q9.ochre();
                }
                return Unit.INSTANCE;
            case 11:
                T CustomDialog2 = (T) obj;
                InterfaceC0581m interfaceC0581m10 = (InterfaceC0581m) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                Intrinsics.echo(CustomDialog2, "$this$CustomDialog");
                if ((intValue10 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q10 = (C0585q) interfaceC0581m10;
                if (c0585q10.magenta(intValue10 & 1, z13)) {
                    String bravo = AbstractC3086y3.bravo(c0585q10, R.string.cancel);
                    Object jade = c0585q10.jade();
                    as asVar = C0580l.alpha;
                    if (jade == asVar) {
                        jade = new C1809a(29);
                        c0585q10.f(jade);
                    }
                    AbstractC2744p7.alpha(bravo, (Function0) jade, false, null, null, c0585q10, 48, 28);
                    AbstractC0538d.echo(V.oscar(pVar, 8), c0585q10);
                    String bravo2 = AbstractC3086y3.bravo(c0585q10, R.string.confirm);
                    Object jade2 = c0585q10.jade();
                    if (jade2 == asVar) {
                        jade2 = new C2844c(0);
                        c0585q10.f(jade2);
                    }
                    AbstractC2726n7.alpha(bravo2, (Function0) jade2, false, null, null, c0585q10, 48, 28);
                } else {
                    c0585q10.ochre();
                }
                return Unit.INSTANCE;
            case 12:
                T TextButton = (T) obj;
                InterfaceC0581m interfaceC0581m11 = (InterfaceC0581m) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                Intrinsics.echo(TextButton, "$this$TextButton");
                if ((intValue11 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q11 = (C0585q) interfaceC0581m11;
                if (c0585q11.magenta(intValue11 & 1, z17)) {
                    G2.bravo("?", null, C0366t.echo, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q11.kilo(T2.alpha)).oscar, c0585q11, 390, 0, 65530);
                } else {
                    c0585q11.ochre();
                }
                return Unit.INSTANCE;
            case 13:
                T TextButton2 = (T) obj;
                InterfaceC0581m interfaceC0581m12 = (InterfaceC0581m) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                Intrinsics.echo(TextButton2, "$this$TextButton");
                if ((intValue12 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q12 = (C0585q) interfaceC0581m12;
                if (c0585q12.magenta(intValue12 & 1, z17)) {
                    G2.bravo("Fix", null, C0366t.echo, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q12.kilo(T2.alpha)).oscar, c0585q12, 390, 0, 65530);
                } else {
                    c0585q12.ochre();
                }
                return Unit.INSTANCE;
            case 14:
                T Button5 = (T) obj;
                InterfaceC0581m interfaceC0581m13 = (InterfaceC0581m) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button5, "$this$Button");
                if ((intValue13 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q13 = (C0585q) interfaceC0581m13;
                if (c0585q13.magenta(intValue13 & 1, z17)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q13, R.string.grant_camera_permission), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q13, 0, 0, 131070);
                } else {
                    c0585q13.ochre();
                }
                return Unit.INSTANCE;
            case 15:
                T TextButton3 = (T) obj;
                InterfaceC0581m interfaceC0581m14 = (InterfaceC0581m) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                Intrinsics.echo(TextButton3, "$this$TextButton");
                if ((intValue14 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q14 = (C0585q) interfaceC0581m14;
                if (c0585q14.magenta(intValue14 & 1, z17)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q14, R.string.open_settings), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q14, 0, 0, 131070);
                } else {
                    c0585q14.ochre();
                }
                return Unit.INSTANCE;
            case 16:
                T TextButton4 = (T) obj;
                InterfaceC0581m interfaceC0581m15 = (InterfaceC0581m) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                Intrinsics.echo(TextButton4, "$this$TextButton");
                if ((intValue15 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q15 = (C0585q) interfaceC0581m15;
                if (c0585q15.magenta(intValue15 & 1, z17)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q15, R.string.cancel), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q15, 0, 0, 131070);
                } else {
                    c0585q15.ochre();
                }
                return Unit.INSTANCE;
            case 17:
                L paddingValues = (L) obj;
                InterfaceC0581m interfaceC0581m16 = (InterfaceC0581m) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                Intrinsics.echo(paddingValues, "paddingValues");
                if ((intValue16 & 6) == 0) {
                    if (((C0585q) interfaceC0581m16).golf(paddingValues)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue16 |= i4;
                }
                if ((intValue16 & 19) != 18) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q16 = (C0585q) interfaceC0581m16;
                if (c0585q16.magenta(intValue16 & 1, z14)) {
                    s sierra3 = AbstractC0538d.sierra(AbstractC0538d.romeo(V.charlie, paddingValues), 16);
                    C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q16, 0);
                    int romeo3 = C0564b.romeo(c0585q16);
                    I mike5 = c0585q16.mike();
                    s charlie6 = T.a.charlie(sierra3, c0585q16);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j5 = C2551k.bravo;
                    c0585q16.white();
                    if (c0585q16.lime) {
                        c0585q16.lima(c2550j5);
                    } else {
                        c0585q16.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q16, alpha3);
                    C0564b.blue(C2551k.echo, c0585q16, mike5);
                    C2549i c2549i5 = C2551k.golf;
                    if (c0585q16.lime || !Intrinsics.areEqual(c0585q16.jade(), Integer.valueOf(romeo3))) {
                        ad.blue(romeo3, c0585q16, romeo3, c2549i5);
                    }
                    C0564b.blue(C2551k.delta, c0585q16, charlie6);
                    G2.bravo("Centered title content", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q16, 6, 0, 131070);
                    c0585q16.quebec(true);
                } else {
                    c0585q16.ochre();
                }
                return Unit.INSTANCE;
            case 18:
                InterfaceC0581m interfaceC0581m17 = (InterfaceC0581m) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                Intrinsics.echo((T) obj, "<this>");
                if ((intValue17 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q17 = (C0585q) interfaceC0581m17;
                if (!c0585q17.magenta(intValue17 & 1, z17)) {
                    c0585q17.ochre();
                }
                return Unit.INSTANCE;
            case 19:
                InterfaceC0581m interfaceC0581m18 = (InterfaceC0581m) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                Intrinsics.echo((T) obj, "<this>");
                if ((intValue18 & 17) != 16) {
                    z17 = true;
                }
                C0585q c0585q18 = (C0585q) interfaceC0581m18;
                if (!c0585q18.magenta(intValue18 & 1, z17)) {
                    c0585q18.ochre();
                }
                return Unit.INSTANCE;
            case 20:
                L paddingValues2 = (L) obj;
                InterfaceC0581m interfaceC0581m19 = (InterfaceC0581m) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                Intrinsics.echo(paddingValues2, "paddingValues");
                if ((intValue19 & 6) == 0) {
                    if (((C0585q) interfaceC0581m19).golf(paddingValues2)) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                    intValue19 |= i5;
                }
                if ((intValue19 & 19) != 18) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                C0585q c0585q19 = (C0585q) interfaceC0581m19;
                if (c0585q19.magenta(intValue19 & 1, z15)) {
                    s romeo4 = AbstractC0538d.romeo(V.charlie, paddingValues2);
                    ap delta3 = AbstractC0547m.delta(T.d.teal, false);
                    int romeo5 = C0564b.romeo(c0585q19);
                    I mike6 = c0585q19.mike();
                    s charlie7 = T.a.charlie(romeo4, c0585q19);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j6 = C2551k.bravo;
                    c0585q19.white();
                    if (c0585q19.lime) {
                        c0585q19.lima(c2550j6);
                    } else {
                        c0585q19.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q19, delta3);
                    C0564b.blue(C2551k.echo, c0585q19, mike6);
                    C2549i c2549i6 = C2551k.golf;
                    if (c0585q19.lime || !Intrinsics.areEqual(c0585q19.jade(), Integer.valueOf(romeo5))) {
                        ad.blue(romeo5, c0585q19, romeo5, c2549i6);
                    }
                    C0564b.blue(C2551k.delta, c0585q19, charlie7);
                    G2.bravo("Content Area", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q19, 6, 0, 131070);
                    c0585q19.quebec(true);
                } else {
                    c0585q19.ochre();
                }
                return Unit.INSTANCE;
            default:
                L paddingValues3 = (L) obj;
                InterfaceC0581m interfaceC0581m20 = (InterfaceC0581m) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                Intrinsics.echo(paddingValues3, "paddingValues");
                if ((intValue20 & 6) == 0) {
                    if (((C0585q) interfaceC0581m20).golf(paddingValues3)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue20 |= i10;
                }
                if ((intValue20 & 19) != 18) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C0585q c0585q20 = (C0585q) interfaceC0581m20;
                if (c0585q20.magenta(intValue20 & 1, z16)) {
                    s sierra4 = AbstractC0538d.sierra(AbstractC0538d.romeo(V.charlie, paddingValues3), 16);
                    C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q20, 0);
                    int romeo6 = C0564b.romeo(c0585q20);
                    I mike7 = c0585q20.mike();
                    s charlie8 = T.a.charlie(sierra4, c0585q20);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j7 = C2551k.bravo;
                    c0585q20.white();
                    if (c0585q20.lime) {
                        c0585q20.lima(c2550j7);
                    } else {
                        c0585q20.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q20, alpha4);
                    C0564b.blue(C2551k.echo, c0585q20, mike7);
                    C2549i c2549i7 = C2551k.golf;
                    if (c0585q20.lime || !Intrinsics.areEqual(c0585q20.jade(), Integer.valueOf(romeo6))) {
                        ad.blue(romeo6, c0585q20, romeo6, c2549i7);
                    }
                    C0564b.blue(C2551k.delta, c0585q20, charlie8);
                    G2.bravo("Main content area", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q20, 6, 0, 131070);
                    c0585q20.quebec(true);
                } else {
                    c0585q20.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
