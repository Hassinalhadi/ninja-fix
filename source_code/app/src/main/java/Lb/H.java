package Lb;

import F.AbstractC0141o0;
import F.G1;
import F.G2;
import F.K1;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.UserInfo;
import delivery.samurai.android.R;
import g0.C1726f;
import i.InterfaceC1854c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2665h0;
import t6.AbstractC3086y3;

/* loaded from: classes2.dex */
public final /* synthetic */ class H implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ H(UserInfo userInfo, boolean z2) {
        this.alpha = 1;
        this.red = userInfo;
        this.purple = z2;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.alpha) {
            case 0:
                androidx.compose.foundation.layout.T Button = (androidx.compose.foundation.layout.T) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(Button, "$this$Button");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    if (this.purple) {
                        c0585q.purple(2012006947);
                        G1.bravo(androidx.compose.foundation.layout.V.kilo(T.p.alpha, 20), C0366t.echo, 2, 0L, 0, c0585q, 438, 24);
                        c0585q.quebec(false);
                    } else {
                        c0585q.purple(2012249088);
                        G2.bravo((String) this.red, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(C0366t.echo, AbstractC2636d7.charlie(16), new H0.v(700), null, Db.g.alpha, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                        c0585q.quebec(false);
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC1854c item = (InterfaceC1854c) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(item, "$this$item");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    AbstractC0220c.india((UserInfo) this.red, this.purple, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                androidx.compose.foundation.layout.T Button2 = (androidx.compose.foundation.layout.T) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button2, "$this$Button");
                if ((intValue3 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    T.p pVar = T.p.alpha;
                    if (this.purple) {
                        c0585q3.purple(172530232);
                        G1.bravo(androidx.compose.foundation.layout.V.kilo(pVar, 16), C0366t.echo, 2, 0L, 0, c0585q3, 438, 24);
                        c0585q3.quebec(false);
                    } else {
                        c0585q3.purple(172813727);
                        androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(4), T.d.f2061d, c0585q3, 54);
                        long j5 = c0585q3.magenta;
                        int i4 = (int) (j5 ^ (j5 >>> 32));
                        androidx.compose.runtime.I mike = c0585q3.mike();
                        T.s charlie = T.a.charlie(pVar, c0585q3);
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
                        if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i4))) {
                            ao.ad.blue(i4, c0585q3, i4, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q3, charlie);
                        C1726f alpha2 = AbstractC2665h0.alpha();
                        T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar, 16);
                        long j6 = C0366t.echo;
                        AbstractC0141o0.bravo(alpha2, null, kilo, j6, c0585q3, 3504, 0);
                        G2.bravo(AbstractC3086y3.bravo(c0585q3, R.string.call), null, j6, AbstractC2636d7.charlie(14), H0.v.f1409c, (H0.k) this.red, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, null, c0585q3, 200064, 0, 130450);
                        c0585q3.quebec(true);
                        c0585q3.quebec(false);
                    }
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            default:
                androidx.compose.foundation.layout.T CenterAlignedTopAppBar = (androidx.compose.foundation.layout.T) obj;
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                Intrinsics.echo(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
                if ((intValue4 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    if (this.purple) {
                        c0585q4.purple(1629431289);
                        K1.foxtrot((Function0) this.red, null, false, null, Zb.d.foxtrot, c0585q4, 196608, 30);
                    } else {
                        c0585q4.purple(1625204315);
                    }
                    c0585q4.quebec(false);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ H(Object obj, int i4, boolean z2) {
        this.alpha = i4;
        this.purple = z2;
        this.red = obj;
    }
}
