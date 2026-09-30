package Pf;

import java.util.Iterator;
import of.C2258m;
import pf.InterfaceC2358h;

/* loaded from: classes2.dex */
public final class u implements InterfaceC2358h {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ u(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object] */
    private final Iterator bravo() {
        return this.bravo;
    }

    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return bravo();
            default:
                return new C2258m(1, this.bravo);
        }
    }
}
