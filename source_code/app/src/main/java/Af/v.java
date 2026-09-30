package Af;

import Cb.y;
import F.AbstractC0141o0;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import com.clevertap.android.sdk.network.NetworkRepo;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2726n7;
import s6.AbstractC2744p7;
import sb.AbstractC2845d;
import t6.AbstractC3086y3;
import t6.W3;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Xd.l {
    public final /* synthetic */ int alpha;

    public /* synthetic */ v(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i4;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        int i5 = 4;
        int i10 = 5;
        T.p pVar = T.p.alpha;
        as asVar = C0580l.alpha;
        int i11 = 3;
        switch (this.alpha) {
            case 0:
                Nd.f fVar = (Nd.f) obj2;
                if (!(fVar instanceof Df.a)) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 1;
                }
                if (i4 == 0) {
                    return fVar;
                }
                return Integer.valueOf(i4 + 1);
            case 1:
                Df.a aVar = (Df.a) obj;
                Nd.f fVar2 = (Nd.f) obj2;
                if (aVar != null) {
                    return aVar;
                }
                if (!(fVar2 instanceof Df.a)) {
                    return null;
                }
                return (Df.a) fVar2;
            case 2:
                x xVar = (x) obj;
                Nd.f fVar3 = (Nd.f) obj2;
                if (fVar3 instanceof Df.a) {
                    Df.a aVar2 = (Df.a) fVar3;
                    Object indigo = aVar2.indigo(xVar.alpha);
                    int i12 = xVar.delta;
                    xVar.bravo[i12] = indigo;
                    xVar.delta = i12 + 1;
                    xVar.charlie[i12] = aVar2;
                }
                return xVar;
            case 3:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    Object jade = c0585q.jade();
                    if (jade == asVar) {
                        jade = new Cb.s(18);
                        c0585q.f(jade);
                    }
                    AbstractC2726n7.alpha("Primary Button", (Function0) jade, false, null, null, c0585q, 54, 28);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    W3.charlie("Shift Status", "Upcoming", "Shift Starts Time", "8:30PM", "Shift Date", "29 JAN 2026", V.charlie(pVar, 1.0f), null, 0L, 0L, 0L, 0.0f, 0L, null, 0L, null, 0L, null, 0L, c0585q2, 1797558, 524160);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    Object jade2 = c0585q3.jade();
                    if (jade2 == asVar) {
                        jade2 = new Cb.s(2);
                        c0585q3.f(jade2);
                    }
                    Sb.d.echo((Function0) jade2, 1, c0585q3, 54);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    Object jade3 = c0585q4.jade();
                    if (jade3 == asVar) {
                        jade3 = new Cb.s(16);
                        c0585q4.f(jade3);
                    }
                    Sb.d.echo((Function0) jade3, 5, c0585q4, 54);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z13)) {
                    Object jade4 = c0585q5.jade();
                    if (jade4 == asVar) {
                        jade4 = new Cb.s(24);
                        c0585q5.f(jade4);
                    }
                    Sb.d.echo((Function0) jade4, 12, c0585q5, 54);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z14)) {
                    Object jade5 = c0585q6.jade();
                    if (jade5 == asVar) {
                        jade5 = new Bd.b(i10);
                        c0585q6.f(jade5);
                    }
                    Sb.d.juliet((Function0) jade5, 1, c0585q6, 54);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z15)) {
                    Object jade6 = c0585q7.jade();
                    if (jade6 == asVar) {
                        jade6 = new Bd.b(21);
                        c0585q7.f(jade6);
                    }
                    Sb.d.juliet((Function0) jade6, 4, c0585q7, 54);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue8 & 1, z16)) {
                    Object jade7 = c0585q8.jade();
                    if (jade7 == asVar) {
                        jade7 = new Cb.s(11);
                        c0585q8.f(jade7);
                    }
                    Sb.d.juliet((Function0) jade7, 10, c0585q8, 54);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 11:
                InterfaceC0581m interfaceC0581m9 = (InterfaceC0581m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                C0585q c0585q9 = (C0585q) interfaceC0581m9;
                if (c0585q9.magenta(intValue9 & 1, z17)) {
                    Sb.e eVar = new Sb.e("Please update your profile information to continue receiving orders.", "Update Profile", null);
                    Object jade8 = c0585q9.jade();
                    if (jade8 == asVar) {
                        jade8 = new Bd.b(i5);
                        c0585q9.f(jade8);
                    }
                    Sb.d.golf(eVar, (Function0) jade8, c0585q9, 48);
                } else {
                    c0585q9.ochre();
                }
                return Unit.INSTANCE;
            case 12:
                InterfaceC0581m interfaceC0581m10 = (InterfaceC0581m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                C0585q c0585q10 = (C0585q) interfaceC0581m10;
                if (c0585q10.magenta(intValue10 & 1, z18)) {
                    Sb.e eVar2 = new Sb.e("Your account requires verification. Please complete the verification process to continue using all features of the application. This may take a few minutes.", "Verify Now", null);
                    Object jade9 = c0585q10.jade();
                    if (jade9 == asVar) {
                        jade9 = new Cb.s(10);
                        c0585q10.f(jade9);
                    }
                    Sb.d.golf(eVar2, (Function0) jade9, c0585q10, 48);
                } else {
                    c0585q10.ochre();
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC0581m interfaceC0581m11 = (InterfaceC0581m) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                C0585q c0585q11 = (C0585q) interfaceC0581m11;
                if (c0585q11.magenta(intValue11 & 1, z19)) {
                    Sb.e eVar3 = new Sb.e("System maintenance scheduled for tonight. Please save your work.", "Learn More", null);
                    Object jade10 = c0585q11.jade();
                    if (jade10 == asVar) {
                        jade10 = new Cb.s(20);
                        c0585q11.f(jade10);
                    }
                    Sb.d.golf(eVar3, (Function0) jade10, c0585q11, 48);
                } else {
                    c0585q11.ochre();
                }
                return Unit.INSTANCE;
            case 14:
                InterfaceC0581m interfaceC0581m12 = (InterfaceC0581m) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                C0585q c0585q12 = (C0585q) interfaceC0581m12;
                if (c0585q12.magenta(intValue12 & 1, z20)) {
                    Object jade11 = c0585q12.jade();
                    if (jade11 == asVar) {
                        jade11 = C0564b.zulu(Boolean.FALSE);
                        c0585q12.f(jade11);
                    }
                    ax axVar = (ax) jade11;
                    Object jade12 = c0585q12.jade();
                    if (jade12 == asVar) {
                        jade12 = new Ac.o(axVar, 25);
                        c0585q12.f(jade12);
                    }
                    C0585q c0585q13 = c0585q12;
                    AbstractC2726n7.alpha("Show Confirmation Dialog", (Function0) jade12, false, null, null, c0585q13, 54, 28);
                    if (((Boolean) axVar.getValue()).booleanValue()) {
                        c0585q13.purple(209923038);
                        Object jade13 = c0585q13.jade();
                        if (jade13 == asVar) {
                            jade13 = new Ac.o(axVar, 26);
                            c0585q13.f(jade13);
                        }
                        Function0 function0 = (Function0) jade13;
                        Object jade14 = c0585q13.jade();
                        if (jade14 == asVar) {
                            jade14 = new Ac.o(axVar, 27);
                            c0585q13.f(jade14);
                        }
                        AbstractC2845d.delta("Confirm Action", "Are you sure you want to proceed?", function0, (Function0) jade14, c0585q13, 3510);
                        c0585q13 = c0585q13;
                        z21 = false;
                    } else {
                        z21 = false;
                        c0585q13.purple(137009271);
                    }
                    c0585q13.quebec(z21);
                } else {
                    c0585q12.ochre();
                }
                return Unit.INSTANCE;
            case 15:
                InterfaceC0581m interfaceC0581m13 = (InterfaceC0581m) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                C0585q c0585q14 = (C0585q) interfaceC0581m13;
                if (c0585q14.magenta(intValue13 & 1, z22)) {
                    Object jade15 = c0585q14.jade();
                    if (jade15 == asVar) {
                        jade15 = new Bd.b(16);
                        c0585q14.f(jade15);
                    }
                    AbstractC2726n7.alpha("Primary Button with Icon", (Function0) jade15, false, null, y.charlie, c0585q14, 24630, 12);
                } else {
                    c0585q14.ochre();
                }
                return Unit.INSTANCE;
            case 16:
                InterfaceC0581m interfaceC0581m14 = (InterfaceC0581m) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                C0585q c0585q15 = (C0585q) interfaceC0581m14;
                if (c0585q15.magenta(intValue14 & 1, z23)) {
                    Sb.c cVar = new Sb.c("05323", new Sb.h(AbstractC3086y3.bravo(c0585q15, R.string.task_type_pick_up), "(1/3)", "Collecting the order from the store...", "Task time", R.drawable.pickup, null, null, null, false, 2016), R.drawable.orders);
                    Object jade16 = c0585q15.jade();
                    if (jade16 == asVar) {
                        jade16 = new Bd.b(13);
                        c0585q15.f(jade16);
                    }
                    Sb.d.alpha(cVar, (Function0) jade16, V.charlie(pVar, 1.0f), c0585q15, 432);
                } else {
                    c0585q15.ochre();
                }
                return Unit.INSTANCE;
            case 17:
                InterfaceC0581m interfaceC0581m15 = (InterfaceC0581m) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                C0585q c0585q16 = (C0585q) interfaceC0581m15;
                if (c0585q16.magenta(intValue15 & 1, z24)) {
                    Sb.c cVar2 = new Sb.c("05324", new Sb.h(AbstractC3086y3.bravo(c0585q16, R.string.task_type_delivery), "(2/3)", "Delivering order to customer...", "Task time", R.drawable.pickup, null, null, null, false, 1792), R.drawable.orders);
                    Object jade17 = c0585q16.jade();
                    if (jade17 == asVar) {
                        jade17 = new Bd.b(i11);
                        c0585q16.f(jade17);
                    }
                    Sb.d.alpha(cVar2, (Function0) jade17, V.charlie(pVar, 1.0f), c0585q16, 432);
                } else {
                    c0585q16.ochre();
                }
                return Unit.INSTANCE;
            case 18:
                InterfaceC0581m interfaceC0581m16 = (InterfaceC0581m) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                C0585q c0585q17 = (C0585q) interfaceC0581m16;
                if (c0585q17.magenta(intValue16 & 1, z25)) {
                    Sb.c cVar3 = new Sb.c("05325", new Sb.h(AbstractC3086y3.bravo(c0585q17, R.string.task_type_return), "(3/3)", "Returning to area...", "Task time", R.drawable.pickup, null, null, null, false, 2016), R.drawable.orders);
                    Object jade18 = c0585q17.jade();
                    if (jade18 == asVar) {
                        jade18 = new Bd.b(14);
                        c0585q17.f(jade18);
                    }
                    Sb.d.alpha(cVar3, (Function0) jade18, V.charlie(pVar, 1.0f), c0585q17, 432);
                } else {
                    c0585q17.ochre();
                }
                return Unit.INSTANCE;
            case 19:
                InterfaceC0581m interfaceC0581m17 = (InterfaceC0581m) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                C0585q c0585q18 = (C0585q) interfaceC0581m17;
                if (c0585q18.magenta(intValue17 & 1, z26)) {
                    Sb.c cVar4 = new Sb.c("07890", new Sb.h(AbstractC3086y3.bravo(c0585q18, R.string.task_type_pick_up), "(1/3)", "Collecting the order from the store...", "Task time", R.drawable.pickup, null, null, null, false, 2016), R.drawable.orders);
                    Object jade19 = c0585q18.jade();
                    if (jade19 == asVar) {
                        jade19 = new Bd.b(6);
                        c0585q18.f(jade19);
                    }
                    Sb.d.alpha(cVar4, (Function0) jade19, V.charlie(pVar, 1.0f), c0585q18, 432);
                } else {
                    c0585q18.ochre();
                }
                return Unit.INSTANCE;
            case 20:
                InterfaceC0581m interfaceC0581m18 = (InterfaceC0581m) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                C0585q c0585q19 = (C0585q) interfaceC0581m18;
                if (c0585q19.magenta(intValue18 & 1, z27)) {
                    Sb.c cVar5 = new Sb.c("05326", new Sb.h(AbstractC3086y3.bravo(c0585q19, R.string.task_type_pick_up), "(1/3)", "Collecting the order from the store...", "Task time", R.drawable.pickup, new Date(System.currentTimeMillis() - 300000), 900, null, true, 1248), R.drawable.orders);
                    Object jade20 = c0585q19.jade();
                    if (jade20 == asVar) {
                        jade20 = new Cb.s(3);
                        c0585q19.f(jade20);
                    }
                    Sb.d.alpha(cVar5, (Function0) jade20, V.charlie(pVar, 1.0f), c0585q19, 432);
                } else {
                    c0585q19.ochre();
                }
                return Unit.INSTANCE;
            case 21:
                InterfaceC0581m interfaceC0581m19 = (InterfaceC0581m) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                C0585q c0585q20 = (C0585q) interfaceC0581m19;
                if (c0585q20.magenta(intValue19 & 1, z28)) {
                    Sb.c cVar6 = new Sb.c("05327", new Sb.h(AbstractC3086y3.bravo(c0585q20, R.string.task_type_delivery), "(2/3)", "Delivering order to customer...", "Task time", R.drawable.pickup, new Date(System.currentTimeMillis() - NetworkRepo.MAX_DELAY_FREQUENCY), 1200, null, true, Barcode.FORMAT_UPC_E), R.drawable.orders);
                    Object jade21 = c0585q20.jade();
                    if (jade21 == asVar) {
                        jade21 = new Cb.s(12);
                        c0585q20.f(jade21);
                    }
                    Sb.d.alpha(cVar6, (Function0) jade21, V.charlie(pVar, 1.0f), c0585q20, 432);
                } else {
                    c0585q20.ochre();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC0581m interfaceC0581m20 = (InterfaceC0581m) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                C0585q c0585q21 = (C0585q) interfaceC0581m20;
                if (c0585q21.magenta(intValue20 & 1, z29)) {
                    Sb.c cVar7 = new Sb.c("05328", new Sb.h(AbstractC3086y3.bravo(c0585q21, R.string.task_type_pick_up), "(1/3)", "Collecting the order from the store...", "Task time", R.drawable.pickup, new Date(System.currentTimeMillis() - 1800000), 900, null, true, 1248), R.drawable.orders);
                    Object jade22 = c0585q21.jade();
                    if (jade22 == asVar) {
                        jade22 = new Bd.b(17);
                        c0585q21.f(jade22);
                    }
                    Sb.d.alpha(cVar7, (Function0) jade22, V.charlie(pVar, 1.0f), c0585q21, 432);
                } else {
                    c0585q21.ochre();
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC0581m interfaceC0581m21 = (InterfaceC0581m) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z30 = true;
                } else {
                    z30 = false;
                }
                C0585q c0585q22 = (C0585q) interfaceC0581m21;
                if (c0585q22.magenta(intValue21 & 1, z30)) {
                    Sb.c cVar8 = new Sb.c("05329", new Sb.h(AbstractC3086y3.bravo(c0585q22, R.string.task_type_delivery), "(2/3)", "Delivering order to customer...", "Task time", R.drawable.pickup, new Date(System.currentTimeMillis() - 900000), 1200, null, true, 1248), R.drawable.orders);
                    Object jade23 = c0585q22.jade();
                    if (jade23 == asVar) {
                        jade23 = new Bd.b(26);
                        c0585q22.f(jade23);
                    }
                    Sb.d.alpha(cVar8, (Function0) jade23, V.charlie(pVar, 1.0f), c0585q22, 432);
                } else {
                    c0585q22.ochre();
                }
                return Unit.INSTANCE;
            case 24:
                InterfaceC0581m interfaceC0581m22 = (InterfaceC0581m) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z31 = true;
                } else {
                    z31 = false;
                }
                C0585q c0585q23 = (C0585q) interfaceC0581m22;
                if (c0585q23.magenta(intValue22 & 1, z31)) {
                    Sb.d.foxtrot(c0585q23, 0);
                } else {
                    c0585q23.ochre();
                }
                return Unit.INSTANCE;
            case 25:
                InterfaceC0581m interfaceC0581m23 = (InterfaceC0581m) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if ((intValue23 & 3) != 2) {
                    z32 = true;
                } else {
                    z32 = false;
                }
                C0585q c0585q24 = (C0585q) interfaceC0581m23;
                if (c0585q24.magenta(intValue23 & 1, z32)) {
                    AbstractC0141o0.bravo(i6.d.alpha(), null, null, 0L, c0585q24, 48, 12);
                } else {
                    c0585q24.ochre();
                }
                return Unit.INSTANCE;
            case 26:
                InterfaceC0581m interfaceC0581m24 = (InterfaceC0581m) obj;
                int intValue24 = ((Integer) obj2).intValue();
                if ((intValue24 & 3) != 2) {
                    z33 = true;
                } else {
                    z33 = false;
                }
                C0585q c0585q25 = (C0585q) interfaceC0581m24;
                if (c0585q25.magenta(intValue24 & 1, z33)) {
                    Sb.d.bravo(CollectionsKt.listOf(new Sb.g(3, AbstractC3086y3.bravo(c0585q25, R.string.tasks_label)), new Sb.g(15, AbstractC3086y3.bravo(c0585q25, R.string.bags)), new Sb.g(2, AbstractC3086y3.bravo(c0585q25, R.string.cartons)), new Sb.g(1, AbstractC3086y3.bravo(c0585q25, R.string.assets))), V.charlie(pVar, 1.0f), c0585q25, 48);
                } else {
                    c0585q25.ochre();
                }
                return Unit.INSTANCE;
            case 27:
                InterfaceC0581m interfaceC0581m25 = (InterfaceC0581m) obj;
                int intValue25 = ((Integer) obj2).intValue();
                if ((intValue25 & 3) != 2) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                C0585q c0585q26 = (C0585q) interfaceC0581m25;
                if (c0585q26.magenta(intValue25 & 1, z34)) {
                    Object jade24 = c0585q26.jade();
                    if (jade24 == asVar) {
                        jade24 = new Bd.b(11);
                        c0585q26.f(jade24);
                    }
                    AbstractC2744p7.alpha("Secondary Button", (Function0) jade24, false, null, null, c0585q26, 54, 28);
                } else {
                    c0585q26.ochre();
                }
                return Unit.INSTANCE;
            case 28:
                InterfaceC0581m interfaceC0581m26 = (InterfaceC0581m) obj;
                int intValue26 = ((Integer) obj2).intValue();
                if ((intValue26 & 3) != 2) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                C0585q c0585q27 = (C0585q) interfaceC0581m26;
                if (c0585q27.magenta(intValue26 & 1, z35)) {
                    Sb.d.bravo(CollectionsKt.listOf(new Sb.g(5, AbstractC3086y3.bravo(c0585q27, R.string.tasks_label)), new Sb.g(8, AbstractC3086y3.bravo(c0585q27, R.string.bags))), V.charlie(pVar, 1.0f), c0585q27, 48);
                } else {
                    c0585q27.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m27 = (InterfaceC0581m) obj;
                int intValue27 = ((Integer) obj2).intValue();
                if ((intValue27 & 3) != 2) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                C0585q c0585q28 = (C0585q) interfaceC0581m27;
                if (c0585q28.magenta(intValue27 & 1, z36)) {
                    Sb.d.bravo(CollectionsKt.listOf(new Sb.g(10, AbstractC3086y3.bravo(c0585q28, R.string.tasks_label)), new Sb.g(25, AbstractC3086y3.bravo(c0585q28, R.string.bags)), new Sb.g(5, AbstractC3086y3.bravo(c0585q28, R.string.cartons)), new Sb.g(3, AbstractC3086y3.bravo(c0585q28, R.string.assets))), V.charlie(pVar, 1.0f), c0585q28, 48);
                } else {
                    c0585q28.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
