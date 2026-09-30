package Ec;

import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.ShiftSummary;
import i.InterfaceC1854c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes2.dex */
public final /* synthetic */ class aj implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ShiftSummary purple;

    public /* synthetic */ aj(ShiftSummary shiftSummary, int i4) {
        this.alpha = i4;
        this.purple = shiftSummary;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
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
                    ap.kilo(this.purple, false, c0585q, 0, 2);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                bx.aa AnimatedVisibility = (bx.aa) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                ((Integer) obj3).getClass();
                Intrinsics.echo(AnimatedVisibility, "$this$AnimatedVisibility");
                C0540f golf = AbstractC0542h.golf(16);
                T.p pVar = T.p.alpha;
                C0554u alpha = AbstractC0553t.alpha(golf, T.d.f2062f, interfaceC0581m2, 6);
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                long j5 = c0585q2.magenta;
                int i4 = (int) (j5 ^ (j5 >>> 32));
                I mike = c0585q2.mike();
                T.s charlie = T.a.charlie(pVar, interfaceC0581m2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, interfaceC0581m2, alpha);
                C0564b.blue(C2551k.echo, interfaceC0581m2, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i4))) {
                    ao.ad.blue(i4, c0585q2, i4, c2549i);
                }
                C0564b.blue(C2551k.delta, interfaceC0581m2, charlie);
                ShiftSummary shiftSummary = this.purple;
                ap.papa(shiftSummary, interfaceC0581m2, 0);
                ap.charlie(shiftSummary, interfaceC0581m2, 0);
                ap.november(shiftSummary, interfaceC0581m2, 0);
                c0585q2.quebec(true);
                return Unit.INSTANCE;
        }
    }
}
