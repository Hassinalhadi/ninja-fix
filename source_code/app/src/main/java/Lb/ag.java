package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2815x7;

/* loaded from: classes2.dex */
public final /* synthetic */ class ag implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.p red;

    public /* synthetic */ ag(T.p pVar, Function0 function0, int i4) {
        this.alpha = 0;
        this.red = pVar;
        this.purple = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        T.p pVar = this.red;
        Function0 function0 = this.purple;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                AbstractC0220c.beige(C0564b.cyan(1), pVar, interfaceC0581m, function0);
                return Unit.INSTANCE;
            case 1:
                Zb.d.hotel(C0564b.cyan(1), pVar, interfaceC0581m, function0);
                return Unit.INSTANCE;
            case 2:
                db.n.golf(C0564b.cyan(1), pVar, interfaceC0581m, function0);
                return Unit.INSTANCE;
            default:
                int cyan = C0564b.cyan(391);
                P.d dVar = Cb.y.alpha;
                AbstractC2815x7.alpha(cyan, pVar, interfaceC0581m, function0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ag(Function0 function0, T.p pVar, int i4) {
        this.alpha = 3;
        P.d dVar = Cb.y.alpha;
        this.purple = function0;
        this.red = pVar;
    }

    public /* synthetic */ ag(Function0 function0, T.p pVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = function0;
        this.red = pVar;
    }
}
