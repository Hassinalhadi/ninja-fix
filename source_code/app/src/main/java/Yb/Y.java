package Yb;

import F.AbstractC0141o0;
import F.G2;
import F.S2;
import F.T2;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.airbnb.lottie.compose.LottieConstants;
import com.app.network.network.models.LanguageMetaData;
import com.app.network.network.models.OrderTask;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.G5;
import s6.I5;
import s6.N6;
import t6.AbstractC3076w3;

/* loaded from: classes2.dex */
public final /* synthetic */ class Y implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ Y(boolean z2, C0329s0 c0329s0, OrderTask orderTask, boolean z10, Context context, int i4) {
        this.alpha = i4;
        this.purple = z2;
        this.red = c0329s0;
        this.silver = orderTask;
        this.teal = z10;
        this.white = context;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        OrderTask orderTask;
        float f5;
        boolean z10;
        int i4;
        boolean z11;
        int i5;
        T.s sVar;
        boolean z12;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z13 = false;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    T.s sVar2 = T.p.alpha;
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    OrderTask orderTask2 = (OrderTask) this.silver;
                    boolean z14 = this.purple;
                    if (z14) {
                        c0585q.purple(-1987795423);
                        T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar2, 1.0f);
                        C0329s0 c0329s0 = (C0329s0) this.red;
                        boolean india = c0585q.india(c0329s0) | c0585q.india(orderTask2);
                        Object jade = c0585q.jade();
                        if (india || jade == asVar) {
                            jade = new ai(c0329s0, orderTask2, 8);
                            c0585q.f(jade);
                        }
                        T.s echo = androidx.compose.foundation.a.echo(15, charlie, null, (Function0) jade, false);
                        Object jade2 = c0585q.jade();
                        if (jade2 == asVar) {
                            jade2 = new X9.i(15);
                            c0585q.f(jade2);
                        }
                        T.s bravo = A0.o.bravo(echo, false, (Function1) jade2);
                        T.j jVar = T.d.f2061d;
                        androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, jVar, c0585q, 54);
                        long j5 = c0585q.magenta;
                        int i10 = (int) (j5 ^ (j5 >>> 32));
                        androidx.compose.runtime.I mike = c0585q.mike();
                        T.s charlie2 = T.a.charlie(bravo, c0585q);
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
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                            ao.ad.blue(i10, c0585q, i10, c2549i3);
                        }
                        C2549i c2549i4 = C2551k.delta;
                        C0564b.blue(c2549i4, c0585q, charlie2);
                        androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(8), jVar, c0585q, 54);
                        long j6 = c0585q.magenta;
                        int i11 = (int) (j6 ^ (j6 >>> 32));
                        androidx.compose.runtime.I mike2 = c0585q.mike();
                        T.s charlie3 = T.a.charlie(sVar2, c0585q);
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(c2549i, c0585q, alpha2);
                        C0564b.blue(c2549i2, c0585q, mike2);
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                            ao.ad.blue(i11, c0585q, i11, c2549i3);
                        }
                        C0564b.blue(c2549i4, c0585q, charlie3);
                        AbstractC1680b charlie4 = AbstractC3076w3.charlie(R.drawable.ic_baseline_receipt_24, c0585q, 6);
                        float f10 = 24;
                        T.s kilo = androidx.compose.foundation.layout.V.kilo(sVar2, f10);
                        androidx.compose.runtime.E0 e02 = F.Q.alpha;
                        z10 = z14;
                        AbstractC0141o0.alpha(charlie4, null, kilo, ((F.O) c0585q.kilo(e02)).quebec, c0585q, 432, 0);
                        String string = ((Context) this.white).getString(R.string.invoice);
                        Intrinsics.delta(string, "getString(...)");
                        orderTask = orderTask2;
                        i4 = -1998144680;
                        f5 = 1.0f;
                        G2.bravo(string, null, ((F.O) c0585q.kilo(e02)).quebec, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q.kilo(T2.alpha)).lima, c0585q, 0, 0, 65530);
                        c0585q = c0585q;
                        c0585q.quebec(true);
                        AbstractC0141o0.bravo(B7.b.bravo(), null, androidx.compose.foundation.layout.V.kilo(sVar2, f10), ((F.O) c0585q.kilo(e02)).sierra, c0585q, 432, 0);
                        c0585q.quebec(true);
                        z13 = false;
                    } else {
                        orderTask = orderTask2;
                        f5 = 1.0f;
                        z10 = z14;
                        i4 = -1998144680;
                        c0585q.purple(-1998144680);
                    }
                    c0585q.quebec(z13);
                    if (this.teal) {
                        c0585q.purple(-1985448692);
                        LanguageMetaData metaData = orderTask.getMetaData();
                        Intrinsics.checkNotNull(metaData);
                        boolean golf = c0585q.golf(orderTask.getId());
                        Object jade3 = c0585q.jade();
                        if (golf || jade3 == asVar) {
                            jade3 = C0564b.zulu(Boolean.FALSE);
                            c0585q.f(jade3);
                        }
                        androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade3;
                        if (((Boolean) axVar.getValue()).booleanValue()) {
                            i5 = LottieConstants.IterateForever;
                        } else {
                            i5 = 2;
                        }
                        T.s charlie5 = androidx.compose.foundation.layout.V.charlie(sVar2, f5);
                        if (z10) {
                            sVar2 = AbstractC0538d.whiskey(sVar2, 0.0f, 12, 0.0f, 0.0f, 13);
                            sVar = sVar2;
                        } else {
                            sVar = sVar2;
                        }
                        T.s then = charlie5.then(sVar2);
                        boolean golf2 = c0585q.golf(axVar);
                        Object jade4 = c0585q.jade();
                        if (golf2 || jade4 == asVar) {
                            jade4 = new Cb.u(axVar, 6);
                            c0585q.f(jade4);
                        }
                        T.s echo2 = androidx.compose.foundation.a.echo(15, then, null, (Function0) jade4, false);
                        Object jade5 = c0585q.jade();
                        if (jade5 == asVar) {
                            jade5 = new X9.i(16);
                            c0585q.f(jade5);
                        }
                        T.s bravo2 = A0.o.bravo(echo2, false, (Function1) jade5);
                        C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
                        long j7 = c0585q.magenta;
                        int i12 = (int) (j7 ^ (j7 >>> 32));
                        androidx.compose.runtime.I mike3 = c0585q.mike();
                        T.s charlie6 = T.a.charlie(bravo2, c0585q);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j2 = C2551k.bravo;
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j2);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q, alpha3);
                        C0564b.blue(C2551k.echo, c0585q, mike3);
                        C2549i c2549i5 = C2551k.golf;
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                            ao.ad.blue(i12, c0585q, i12, c2549i5);
                        }
                        C0564b.blue(C2551k.delta, c0585q, charlie6);
                        String label = metaData.getLabel();
                        if (label == null) {
                            label = "";
                        }
                        String str = label;
                        D0.an anVar = ((S2) c0585q.kilo(T2.alpha)).lima;
                        H0.v vVar = H0.v.f1408b;
                        androidx.compose.runtime.E0 e03 = F.Q.alpha;
                        C0585q c0585q2 = c0585q;
                        G2.bravo(str, null, ((F.O) c0585q.kilo(e03)).quebec, 0L, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q2, 196608, 0, 65498);
                        c0585q = c0585q2;
                        String metaHtml = metaData.getMetaHtml();
                        if (metaHtml == null || StringsKt.gray(metaHtml)) {
                            z11 = false;
                            c0585q.purple(462269872);
                        } else {
                            c0585q.purple(476280911);
                            G5.alpha(metaHtml, AbstractC0538d.whiskey(sVar, 0.0f, 4, 0.0f, 0.0f, 13), ((F.O) c0585q.kilo(e03)).sierra, i5, c0585q, 48);
                            z11 = false;
                        }
                        c0585q.quebec(z11);
                        c0585q.quebec(true);
                    } else {
                        z11 = false;
                        c0585q.purple(i4);
                    }
                    c0585q.quebec(z11);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m2;
                if (c0585q3.magenta(intValue2 & 1, z12)) {
                    I5.alpha(6, P.e.echo(-757535702, new Y(this.purple, (C0329s0) this.red, (OrderTask) this.silver, this.teal, (Context) this.white, 0), c0585q3), null, c0585q3);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                N6.bravo(this.purple, this.teal, (Function0) this.red, (Function0) this.silver, (Function0) this.white, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Y(boolean z2, boolean z10, Function0 function0, Function0 function02, Function0 function03, int i4) {
        this.alpha = 2;
        this.purple = z2;
        this.teal = z10;
        this.red = function0;
        this.silver = function02;
        this.white = function03;
    }
}
