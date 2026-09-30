package d;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class al {
    public static final ak alpha = new ak(3, 0, null);
    public static final ak bravo = new ak(3, 1, null);

    public static T.s alpha(T.s sVar, aq aqVar, K k6, boolean z2, boolean z10, Xd.m mVar, boolean z11, int i4) {
        boolean z12;
        if ((i4 & 128) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        return sVar.then(new DraggableElement(aqVar, k6, z2, null, z10, alpha, mVar, z12));
    }

    public static final aq bravo(Function1 function1, InterfaceC0581m interfaceC0581m) {
        androidx.compose.runtime.ax black = C0564b.black(function1, interfaceC0581m);
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            C1539k c1539k = new C1539k(new Cb.i(black, 21));
            c0585q.f(c1539k);
            jade = c1539k;
        }
        return (aq) jade;
    }
}
