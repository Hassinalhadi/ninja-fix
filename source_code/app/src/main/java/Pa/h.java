package Pa;

import Cb.y;
import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import db.n;
import kotlin.Unit;
import s6.AbstractC2824y7;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ p purple;

    public /* synthetic */ h(p pVar, int i4) {
        this.alpha = 2;
        P.d dVar = y.alpha;
        this.purple = pVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        p pVar = this.purple;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                i.echo(pVar, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                n.echo(pVar, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                int cyan = C0564b.cyan(49);
                P.d dVar = y.alpha;
                AbstractC2824y7.alpha(pVar, interfaceC0581m, cyan);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(p pVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = pVar;
    }
}
