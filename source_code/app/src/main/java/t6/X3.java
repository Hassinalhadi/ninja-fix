package t6;

import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class X3 {
    public static final /* synthetic */ int alpha = 0;

    public static final b.g0 alpha(InterfaceC0581m interfaceC0581m) {
        Object[] objArr = new Object[0];
        J2.l lVar = b.g0.india;
        boolean echo = ((C0585q) interfaceC0581m).echo(0);
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (echo || jade == C0580l.alpha) {
            jade = new b.c0(0);
            c0585q.f(jade);
        }
        return (b.g0) R.l.charlie(objArr, lVar, (Function0) jade, c0585q, 0);
    }

    public static T.s bravo(T.s sVar, b.g0 g0Var, boolean z2) {
        d.K k6;
        if (z2) {
            k6 = d.K.alpha;
        } else {
            k6 = d.K.purple;
        }
        return androidx.compose.foundation.a.juliet(sVar, g0Var, k6, true, null, g0Var.charlie, true, null).then(new ScrollingLayoutElement(g0Var, z2));
    }
}
