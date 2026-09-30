package Ac;

import F.G2;
import H0.v;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import s6.AbstractC2636d7;
import s6.C7;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Xd.l {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ long purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ t(T.s sVar, long j5, int i4) {
        this.red = sVar;
        this.purple = j5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    G2.bravo((String) this.red, AbstractC0538d.tango(T.p.alpha, 6, 3), this.purple, AbstractC2636d7.charlie(14), v.f1409c, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 199728, 0, 131024);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                C7.alpha(C0564b.cyan(7), this.purple, (T.s) this.red, (InterfaceC0581m) obj);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ t(String str, long j5) {
        this.red = str;
        this.purple = j5;
    }
}
