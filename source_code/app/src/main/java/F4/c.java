package F4;

import F.AbstractC0149q0;
import Xd.l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.core.ui.FlowComponentViewKt;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ PaymentMethodComponent purple;

    public /* synthetic */ c(PaymentMethodComponent paymentMethodComponent, int i4) {
        this.alpha = i4;
        this.purple = paymentMethodComponent;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit a6;
        boolean z2;
        boolean z10;
        boolean z11;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                a6 = FlowComponentViewKt.a(this.purple, interfaceC0581m, intValue);
                return a6;
            case 1:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    this.purple.Render(c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z10)) {
                    AbstractC0149q0.alpha(null, null, null, P.e.echo(862941823, new c(this.purple, 3), c0585q2), c0585q2, 3072, 7);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m;
                if (c0585q3.magenta(intValue & 1, z11)) {
                    this.purple.Render(c0585q3, 0);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
