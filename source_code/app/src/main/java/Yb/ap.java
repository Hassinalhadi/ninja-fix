package Yb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.OrderTask;
import java.util.List;
import kotlin.Unit;
import t6.AbstractC3041p2;

/* loaded from: classes2.dex */
public final /* synthetic */ class ap implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ List purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ OrderTask silver;
    public final /* synthetic */ C0329s0 teal;

    public /* synthetic */ ap(List list, int i4, OrderTask orderTask, C0329s0 c0329s0) {
        this.alpha = 1;
        this.purple = list;
        this.red = i4;
        this.silver = orderTask;
        this.teal = c0329s0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                AbstractC3041p2.alpha(this.purple, this.red, this.silver, this.teal, (InterfaceC0581m) obj, cyan);
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
                    AbstractC3041p2.alpha(this.purple, this.red, this.silver, this.teal, c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(1);
                AbstractC3041p2.alpha(this.purple, this.red, this.silver, this.teal, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ap(List list, int i4, OrderTask orderTask, C0329s0 c0329s0, int i5, int i10) {
        this.alpha = i10;
        this.purple = list;
        this.red = i4;
        this.silver = orderTask;
        this.teal = c0329s0;
    }
}
