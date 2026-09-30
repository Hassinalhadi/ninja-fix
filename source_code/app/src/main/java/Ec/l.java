package Ec;

import F.K1;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import ga.AbstractC1760c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.O6;
import wc.AbstractC3255a;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;

    public /* synthetic */ l(int i4, int i5, Function0 function0) {
        this.alpha = i5;
        this.purple = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                t.bravo(this.purple, (InterfaceC0581m) obj, C0564b.cyan(1));
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
                    t.bravo(this.purple, c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                O6.alpha(this.purple, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 3:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    K1.foxtrot(this.purple, null, false, null, Qa.a.papa, c0585q2, 196608, 30);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                new Handler(Looper.getMainLooper()).post(new U0.x(this.purple, 2));
                return Unit.INSTANCE;
            case 5:
                new Handler(Looper.getMainLooper()).post(new U0.x(this.purple, 1));
                return Unit.INSTANCE;
            case 6:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    Zb.g.alpha(this.purple, c0585q3, 0);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    Zb.d.delta(this.purple, c0585q4, 0);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z13)) {
                    K1.foxtrot(this.purple, null, false, null, Zb.d.echo, c0585q5, 196608, 30);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z14)) {
                    AbstractC1760c.bravo(this.purple, c0585q6, 0);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC1760c.bravo(this.purple, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z15)) {
                    K1.foxtrot(this.purple, null, false, null, AbstractC3255a.bravo, c0585q7, 196608, 30);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Function0 function0, int i4) {
        this.alpha = i4;
        this.purple = function0;
    }
}
