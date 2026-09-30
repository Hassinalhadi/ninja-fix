package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import t6.AbstractC3050r2;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T.s purple;

    public /* synthetic */ u(T.s sVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = sVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                t.charlie(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                Sb.d.india(this.purple, interfaceC0581m, C0564b.cyan(7));
                return Unit.INSTANCE;
            default:
                AbstractC3050r2.delta(this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }
}
