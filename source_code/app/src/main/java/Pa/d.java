package Pa;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import s6.I5;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements l {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ p red;

    public /* synthetic */ d(P.d dVar, p pVar, int i4) {
        this.purple = dVar;
        this.red = pVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                i.charlie(C0564b.cyan(49), this.purple, this.red, interfaceC0581m);
                return Unit.INSTANCE;
            default:
                I5.alpha(C0564b.cyan(7), this.purple, this.red, interfaceC0581m);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(p pVar, P.d dVar, int i4) {
        this.red = pVar;
        this.purple = dVar;
    }
}
