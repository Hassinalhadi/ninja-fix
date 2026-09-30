package Lb;

import F.G1;
import F.G2;
import a0.C0366t;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2636d7;
import t6.AbstractC3086y3;

/* renamed from: Lb.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0235s implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;

    public /* synthetic */ C0235s(int i4, boolean z2) {
        this.alpha = i4;
        this.purple = z2;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        int i4;
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
                        c0585q.purple(-1490718663);
                        G1.bravo(androidx.compose.foundation.layout.V.kilo(T.p.alpha, 20), C0366t.echo, 2, 0L, 0, c0585q, 438, 24);
                        c0585q.quebec(false);
                    } else {
                        c0585q.purple(-1490475592);
                        G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.urpay_btn_submit), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(C0366t.echo, AbstractC2636d7.charlie(16), new H0.v(700), null, Db.g.alpha, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                        c0585q.quebec(false);
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                androidx.compose.foundation.layout.T Button2 = (androidx.compose.foundation.layout.T) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(Button2, "$this$Button");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    if (this.purple) {
                        i4 = R.string.start_delivering;
                    } else {
                        i4 = android.R.string.ok;
                    }
                    G2.bravo(AbstractC3086y3.bravo(c0585q2, i4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(C0366t.echo, AbstractC2636d7.charlie(16), new H0.v(600), null, Db.g.alpha, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
