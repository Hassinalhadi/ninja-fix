package Jc;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.ActiveSuspension;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ActiveSuspension purple;

    public /* synthetic */ j(ActiveSuspension activeSuspension, int i4, int i5) {
        this.alpha = i5;
        this.purple = activeSuspension;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                o.bravo(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                o.alpha(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }
}
