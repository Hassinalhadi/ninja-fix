package Jc;

import T.s;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import t6.S2;
import ub.AbstractC3150c;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ s purple;
    public final /* synthetic */ String red;

    public /* synthetic */ k(int i4, int i5, s sVar, String str) {
        this.alpha = i5;
        this.red = str;
        this.purple = sVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                o.delta(C0564b.cyan(1), this.purple, interfaceC0581m, this.red);
                return Unit.INSTANCE;
            case 1:
                S2.alpha(C0564b.cyan(1), this.purple, interfaceC0581m, this.red);
                return Unit.INSTANCE;
            default:
                AbstractC3150c.delta(C0564b.cyan(55), this.purple, interfaceC0581m, this.red);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(s sVar, String str, int i4) {
        this.alpha = 1;
        this.purple = sVar;
        this.red = str;
    }
}
