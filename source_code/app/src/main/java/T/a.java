package T;

import F.C0088b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import t0.C2932p;

/* loaded from: classes3.dex */
public abstract class a {
    public static final h alpha = new h(-1.0f);
    public static final h bravo = new h(1.0f);
    public static final g charlie = new g(-1.0f);
    public static final g delta = new g(1.0f);

    public static final s alpha(s sVar, C2932p c2932p, Xd.m mVar) {
        return sVar.then(new n(c2932p, mVar));
    }

    public static final s bravo(s sVar, InterfaceC0581m interfaceC0581m) {
        if (sVar.all(o.alpha)) {
            return sVar;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(1219399079);
        s sVar2 = (s) sVar.foldIn(p.alpha, new C0088b(3, c0585q));
        c0585q.quebec(false);
        return sVar2;
    }

    public static final s charlie(s sVar, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.purple(439770924);
        s bravo2 = bravo(sVar, c0585q);
        c0585q.quebec(false);
        return bravo2;
    }
}
