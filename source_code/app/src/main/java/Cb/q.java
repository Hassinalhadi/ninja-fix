package Cb;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import com.app.network.network.models.UserInfo;
import i.InterfaceC1854c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2726n7;
import s6.AbstractC2744p7;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ax purple;

    public /* synthetic */ q(ax axVar, int i4) {
        this.alpha = i4;
        this.purple = axVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        boolean z11;
        switch (this.alpha) {
            case 0:
                T CustomDialog = (T) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(CustomDialog, "$this$CustomDialog");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    Object jade = c0585q.jade();
                    as asVar = C0580l.alpha;
                    ax axVar = this.purple;
                    if (jade == asVar) {
                        jade = new Ac.o(axVar, 28);
                        c0585q.f(jade);
                    }
                    AbstractC2744p7.alpha("Cancel", (Function0) jade, false, null, null, c0585q, 54, 28);
                    AbstractC0538d.echo(V.oscar(T.p.alpha, 8), c0585q);
                    Object jade2 = c0585q.jade();
                    if (jade2 == asVar) {
                        jade2 = new Ac.o(axVar, 29);
                        c0585q.f(jade2);
                    }
                    AbstractC2726n7.alpha("Confirm", (Function0) jade2, false, null, null, c0585q, 54, 28);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
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
                    UserInfo userInfo = (UserInfo) this.purple.getValue();
                    if (userInfo != null) {
                        z11 = Intrinsics.areEqual(userInfo.getAwaitingOrders(), Boolean.TRUE);
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        c0585q2.purple(1932297053);
                        Sb.d.foxtrot(c0585q2, 0);
                    } else {
                        c0585q2.purple(1913347869);
                    }
                    c0585q2.quebec(false);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
