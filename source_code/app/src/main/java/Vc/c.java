package Vc;

import D0.an;
import Ec.x;
import F.AbstractC0141o0;
import F.G2;
import F.K1;
import H0.v;
import Lb.C0221d;
import T.s;
import U0.t;
import a0.C0366t;
import a0.ao;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.ad;
import com.app.network.network.models.Payment;
import com.app.network.network.models.PaymentSession;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.E7;
import t6.AbstractC3017k3;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.X3;

/* loaded from: classes2.dex */
public abstract class c {
    public static final P.d alpha = new P.d(new S4.b(6), -292092588, false);
    public static final P.d bravo = new P.d(new C0221d(24), 1602012597, false);
    public static final P.d charlie = new P.d(new C0221d(25), -1567875938, false);
    public static final P.d delta = new P.d(new C0221d(26), -1253903702, false);
    public static final P.d echo = new P.d(new C0221d(27), -1369007906, false);
    public static final P.d foxtrot = new P.d(new C0221d(28), 341237762, false);
    public static final P.d golf = new P.d(new C0221d(29), 603687225, false);
    public static final P.d hotel = new P.d(new d(0), -1311025633, false);

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final String text, final an anVar, s sVar, final long j5, int i4, int i5, InterfaceC0581m interfaceC0581m, final int i10, final int i11) {
        int i12;
        Object obj;
        s sVar2;
        int i13;
        int i14;
        boolean z2;
        C0585q c0585q;
        final int i15;
        final int i16;
        final s sVar3;
        Q uniform;
        s sVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i17;
        int i18;
        int i19;
        Intrinsics.echo(text, "text");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1132743625);
        if ((i10 & 6) == 0) {
            if (c0585q2.golf(text)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            obj = anVar;
            if (c0585q2.golf(obj)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        } else {
            obj = anVar;
        }
        int i20 = i11 & 4;
        if (i20 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) == 0) {
                if (c0585q2.foxtrot(j5)) {
                    i17 = 2048;
                } else {
                    i17 = Barcode.FORMAT_UPC_E;
                }
                i12 |= i17;
            }
            i14 = i12 | 221184;
            if ((74899 & i14) == 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q2.magenta(i14 & 1, z2)) {
                if (i20 != 0) {
                    sVar4 = T.p.alpha;
                } else {
                    sVar4 = sVar2;
                }
                int i21 = i14 & 14;
                if (i21 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i22 = i14 & 112;
                if (i22 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z15 = z10 | z11;
                Object jade = c0585q2.jade();
                Object obj2 = C0580l.alpha;
                if (z15 || jade == obj2) {
                    jade = C0564b.zulu(Boolean.FALSE);
                    c0585q2.f(jade);
                }
                ax axVar = (ax) jade;
                if (i21 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i22 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z16 = z12 | z13;
                Object jade2 = c0585q2.jade();
                if (z16 || jade2 == obj2) {
                    jade2 = C0564b.zulu(obj);
                    c0585q2.f(jade2);
                }
                ax axVar2 = (ax) jade2;
                an anVar2 = (an) axVar2.getValue();
                boolean golf2 = c0585q2.golf(axVar);
                Object jade3 = c0585q2.jade();
                if (golf2 || jade3 == obj2) {
                    jade3 = new Cb.i(axVar, 19);
                    c0585q2.f(jade3);
                }
                s charlie2 = androidx.compose.ui.draw.a.charlie(sVar4, (Function1) jade3);
                boolean golf3 = c0585q2.golf(axVar2);
                if ((i14 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean golf4 = golf3 | z14 | c0585q2.golf(axVar);
                Object jade4 = c0585q2.jade();
                if (golf4 || jade4 == obj2) {
                    Object aVar = new a(j5, axVar2, axVar, 0);
                    c0585q2.f(aVar);
                    jade4 = aVar;
                }
                c0585q = c0585q2;
                s sVar5 = sVar4;
                G2.bravo(text, charlie2, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) jade4, anVar2, c0585q, i21, ((i14 >> 12) & 112) | 384 | ((i14 >> 3) & 7168), 18428);
                i16 = 2;
                i15 = 1;
                sVar3 = sVar5;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                i15 = i4;
                i16 = i5;
                sVar3 = sVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Xd.l() { // from class: Vc.b
                    @Override // Xd.l
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int cyan = C0564b.cyan(i10 | 1);
                        an anVar3 = anVar;
                        int i23 = i16;
                        c.alpha(text, anVar3, sVar3, j5, i15, i23, (InterfaceC0581m) obj3, cyan, i11);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i10 & 3072) == 0) {
        }
        i14 = i12 | 221184;
        if ((74899 & i14) == 74898) {
        }
        if (!c0585q2.magenta(i14 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(final PaymentSession paymentSession, final long j5, final String str, final String str2, final Function0 onPaymentSuccess, final Function0 onPaymentError, final Function0 onDismiss, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        boolean z11;
        ax axVar;
        boolean z12;
        boolean z13;
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(onPaymentSuccess, "onPaymentSuccess");
        Intrinsics.echo(onPaymentError, "onPaymentError");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-959696277);
        if (c0585q2.india(paymentSession)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if (c0585q2.golf(str)) {
            i10 = Barcode.FORMAT_QR_CODE;
        } else {
            i10 = 128;
        }
        int i15 = i14 | i10;
        if (c0585q2.india(onPaymentSuccess)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i16 = i15 | i11;
        if (c0585q2.india(onPaymentError)) {
            i12 = 131072;
        } else {
            i12 = 65536;
        }
        int i17 = i16 | i12;
        if (c0585q2.india(onDismiss)) {
            i13 = 1048576;
        } else {
            i13 = 524288;
        }
        int i18 = i17 | i13;
        if ((i18 & 598147) != 598146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i18 & 1, z2)) {
            Context context = (Context) c0585q2.kilo(AndroidCompositionLocals_androidKt.bravo);
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = L9.d.papa(context);
                c0585q2.f(jade);
            }
            Payment payment = (Payment) jade;
            Object jade2 = c0585q2.jade();
            if (jade2 == asVar) {
                jade2 = C0564b.zulu(null);
                c0585q2.f(jade2);
            }
            ax axVar2 = (ax) jade2;
            boolean india = c0585q2.india(paymentSession) | c0585q2.india(payment);
            if ((i18 & 57344) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z14 = india | z10;
            if ((i18 & 458752) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean india2 = z14 | z11 | c0585q2.india(context);
            Object jade3 = c0585q2.jade();
            if (!india2 && jade3 != asVar) {
                axVar = axVar2;
            } else {
                f fVar = new f(paymentSession, payment, context, onPaymentError, onPaymentSuccess, axVar2, null);
                axVar = axVar2;
                c0585q2.f(fVar);
                jade3 = fVar;
            }
            C0564b.foxtrot((Xd.l) jade3, c0585q2, paymentSession);
            if ((i18 & 3670016) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object jade4 = c0585q2.jade();
            if (z12 || jade4 == asVar) {
                jade4 = new Bb.a(onDismiss, 21);
                c0585q2.f(jade4);
            }
            AbstractC3017k3.alpha(false, (Function0) jade4, c0585q2, 0);
            T.p pVar = T.p.alpha;
            float f5 = 24;
            s uniform = AbstractC0538d.uniform(X3.bravo(androidx.compose.foundation.a.bravo(V.charlie, C0366t.echo, ao.alpha), X3.alpha(c0585q2), true), f5, 0.0f, 2);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            long j6 = c0585q2.magenta;
            int i19 = (int) (j6 ^ (j6 >>> 32));
            I mike = c0585q2.mike();
            s charlie2 = T.a.charlie(uniform, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i19))) {
                ad.blue(i19, c0585q2, i19, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie2);
            float f10 = 16;
            s hotel2 = com.google.android.material.datepicker.j.hotel(pVar, f10, c0585q2, pVar, 1.0f);
            T.j jVar = T.d.f2061d;
            S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q2, 48);
            long j7 = c0585q2.magenta;
            int i20 = (int) (j7 ^ (j7 >>> 32));
            I mike2 = c0585q2.mike();
            s charlie3 = T.a.charlie(hotel2, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i20))) {
                ad.blue(i20, c0585q2, i20, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie3);
            String bravo2 = AbstractC3086y3.bravo(c0585q2, R.string.settle_outstanding_balance);
            long charlie4 = AbstractC2636d7.charlie(18);
            H0.n nVar = Db.g.alpha;
            an anVar = new an(ao.delta(4280756010L), charlie4, v.e, null, nVar, 0L, 0, 0L, 0, 16777176);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.bravo(bravo2, new LayoutWeightElement(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q2, 0, 0, 65532);
            K1.foxtrot(onDismiss, null, false, null, alpha, c0585q2, ((i18 >> 18) & 14) | 196608, 30);
            c0585q2.quebec(true);
            AbstractC0538d.echo(V.echo(pVar, f5), c0585q2);
            String bravo3 = AbstractC3086y3.bravo(c0585q2, R.string.outstanding_amount);
            long charlie5 = AbstractC2636d7.charlie(18);
            v vVar = v.f1409c;
            G2.bravo(bravo3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4280756010L), charlie5, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            AbstractC0538d.echo(V.echo(pVar, f10), c0585q2);
            S alpha4 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(8), jVar, c0585q2, 54);
            long j10 = c0585q2.magenta;
            int i21 = (int) (j10 ^ (j10 >>> 32));
            I mike3 = c0585q2.mike();
            s charlie6 = T.a.charlie(pVar, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha4);
            C0564b.blue(c2549i2, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i21))) {
                ad.blue(i21, c0585q2, i21, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie6);
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_cash_on_delivery, c0585q2, 6), null, V.kilo(pVar, f5), C0366t.kilo, c0585q2, 3504, 0);
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(C0366t.bravo, AbstractC2636d7.charlie(32), vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, (i18 >> 6) & 14, 0, 65534);
            c0585q2.quebec(true);
            AbstractC0538d.echo(V.echo(pVar, f5), c0585q2);
            K1.delta(null, 1, ao.delta(4293190887L), c0585q2, 432, 1);
            G2.bravo(com.google.android.material.datepicker.j.juliet(pVar, f5, c0585q2, R.string.card_details, c0585q2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ao.delta(4280756010L), AbstractC2636d7.charlie(18), vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
            c0585q = c0585q2;
            AbstractC0538d.echo(V.echo(pVar, f10), c0585q);
            Xd.l lVar = (Xd.l) axVar.getValue();
            if (lVar == null) {
                c0585q.purple(1086986084);
                z13 = false;
            } else {
                z13 = false;
                c0585q.purple(1974726717);
                lVar.invoke(c0585q, 0);
            }
            c0585q.quebec(z13);
            AbstractC0538d.echo(V.echo(pVar, f5), c0585q);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Xd.l(j5, str, str2, onPaymentSuccess, onPaymentError, onDismiss, i4) { // from class: Vc.e
                public final /* synthetic */ long purple;
                public final /* synthetic */ String red;
                public final /* synthetic */ String silver;
                public final /* synthetic */ Function0 teal;
                public final /* synthetic */ Function0 white;
                public final /* synthetic */ Function0 yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    String str3 = this.red;
                    String str4 = this.silver;
                    Function0 function0 = this.white;
                    Function0 function02 = this.yellow;
                    c.bravo(PaymentSession.this, this.purple, str3, str4, this.teal, function0, function02, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void charlie(boolean z2, Function0 onAction, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        Function0 function0;
        Intrinsics.echo(onAction, "onAction");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(277504671);
        if (c0585q.india(onAction)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i10 = i5 | i4;
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i10 & 1, z10)) {
            function0 = onAction;
            E7.alpha(function0, new t(4, false), P.e.echo(763993832, new x(z2, onAction, 1), c0585q), c0585q, ((i10 >> 3) & 14) | 432, 0);
        } else {
            function0 = onAction;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new x(z2, function0, i4, 2);
        }
    }
}
