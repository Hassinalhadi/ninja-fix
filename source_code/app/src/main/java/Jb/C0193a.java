package Jb;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.I0;

/* renamed from: Jb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0193a implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0208p purple;

    public /* synthetic */ C0193a(C0208p c0208p, int i4) {
        this.alpha = i4;
        this.purple = c0208p;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    I0.alpha(P.e.echo(663659131, new C0193a(this.purple, 1), c0585q), c0585q, 48);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z10)) {
                    C0208p c0208p = this.purple;
                    OrdersViewModel ordersViewModel = (OrdersViewModel) c0208p.f1653g.getValue();
                    androidx.lifecycle.al viewLifecycleOwner = c0208p.getViewLifecycleOwner();
                    Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    boolean india = c0585q2.india(c0208p);
                    Object jade = c0585q2.jade();
                    Object obj3 = C0580l.alpha;
                    if (india || jade == obj3) {
                        jade = new C0199g(c0208p, 2);
                        c0585q2.f(jade);
                    }
                    Function1 function1 = (Function1) jade;
                    boolean india2 = c0585q2.india(c0208p);
                    Object jade2 = c0585q2.jade();
                    if (india2 || jade2 == obj3) {
                        jade2 = new C0200h(c0208p, 3);
                        c0585q2.f(jade2);
                    }
                    Function0 function0 = (Function0) jade2;
                    boolean india3 = c0585q2.india(c0208p);
                    Object jade3 = c0585q2.jade();
                    if (india3 || jade3 == obj3) {
                        jade3 = new C0200h(c0208p, 4);
                        c0585q2.f(jade3);
                    }
                    c0208p.quebec(ordersViewModel, viewLifecycleOwner, function1, function0, (Function0) jade3, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
