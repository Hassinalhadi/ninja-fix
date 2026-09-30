package Mb;

import F.C0143o2;
import T.d;
import T.p;
import T.s;
import Xd.l;
import Yb.C0329s0;
import Yb.ai;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import ao.ad;
import com.app.network.network.models.OrderTask;
import com.checkout.components.kmp.rememberme.view.otp.OTPTextFieldViewKt;
import db.n;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2760r6;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int alpha = 2;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ c(C0143o2 c0143o2, InterfaceC1673j interfaceC1673j, boolean z2, boolean z10) {
        this.purple = z2;
        this.red = z10;
        this.silver = interfaceC1673j;
        this.teal = c0143o2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Unit OTPTextFieldView$lambda$5$lambda$4;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                AbstractC2760r6.bravo(this.purple, (Function1) this.silver, (p) this.teal, this.red, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    s charlie = V.charlie(p.alpha, 1.0f);
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(12), d.f2062f, c0585q, 6);
                    long j5 = c0585q.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q.mike();
                    s charlie2 = T.a.charlie(charlie, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                        ad.blue(i4, c0585q, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie2);
                    as asVar = C0580l.alpha;
                    OrderTask orderTask = (OrderTask) this.teal;
                    boolean z10 = this.purple;
                    C0329s0 c0329s0 = (C0329s0) this.silver;
                    if (z10) {
                        c0585q.purple(-13027598);
                        boolean india = c0585q.india(c0329s0) | c0585q.india(orderTask);
                        Object jade = c0585q.jade();
                        if (india || jade == asVar) {
                            jade = new ai(c0329s0, orderTask, 4);
                            c0585q.f(jade);
                        }
                        Zb.d.hotel(0, null, c0585q, (Function0) jade);
                    } else {
                        c0585q.purple(-34889573);
                    }
                    c0585q.quebec(false);
                    if (this.red) {
                        c0585q.purple(-12830810);
                        boolean india2 = c0585q.india(c0329s0) | c0585q.india(orderTask);
                        Object jade2 = c0585q.jade();
                        if (india2 || jade2 == asVar) {
                            jade2 = new ai(c0329s0, orderTask, 5);
                            c0585q.f(jade2);
                        }
                        n.golf(0, null, c0585q, (Function0) jade2);
                    } else {
                        c0585q.purple(-34889573);
                    }
                    c0585q.quebec(false);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                OTPTextFieldView$lambda$5$lambda$4 = OTPTextFieldViewKt.OTPTextFieldView$lambda$5$lambda$4(this.purple, this.red, (InterfaceC1673j) this.silver, (C0143o2) this.teal, (InterfaceC0581m) obj, intValue2);
                return OTPTextFieldView$lambda$5$lambda$4;
        }
    }

    public /* synthetic */ c(boolean z2, C0329s0 c0329s0, OrderTask orderTask, boolean z10) {
        this.purple = z2;
        this.silver = c0329s0;
        this.teal = orderTask;
        this.red = z10;
    }

    public /* synthetic */ c(boolean z2, Function1 function1, p pVar, boolean z10, int i4) {
        this.purple = z2;
        this.silver = function1;
        this.teal = pVar;
        this.red = z10;
    }
}
