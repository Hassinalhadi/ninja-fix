package Yb;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.OrderTask;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class aj implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ OrderTask purple;
    public final /* synthetic */ Long red;

    public /* synthetic */ aj(OrderTask orderTask, Long l10, int i4) {
        this.alpha = i4;
        this.purple = orderTask;
        this.red = l10;
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
                    V0.alpha(this.purple, null, this.red, c0585q, 0);
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
                    V0.alpha(this.purple, null, this.red, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
