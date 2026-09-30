package bx;

import a0.C0366t;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import bz.AbstractC0782g;
import bz.g0;

/* loaded from: classes3.dex */
public abstract class F {
    public static final bz.I alpha = AbstractC0779d.juliet(0.0f, null, 7);

    public static final D0 alpha(long j5, bz.aa aaVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        String str;
        if ((i5 & 2) != 0) {
            aaVar = alpha;
        }
        bz.aa aaVar2 = aaVar;
        if ((i5 & 4) != 0) {
            str = "ColorAnimation";
        } else {
            str = "cashierGateMicrocopyColor";
        }
        String str2 = str;
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean golf = c0585q.golf(C0366t.foxtrot(j5));
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            jade = (g0) ad.alpha.invoke(C0366t.foxtrot(j5));
            c0585q.f(jade);
        }
        return AbstractC0782g.charlie(new C0366t(j5), (g0) jade, aaVar2, null, str2, c0585q, ((i4 << 3) & 896) | ((i4 << 6) & 57344), 8);
    }
}
