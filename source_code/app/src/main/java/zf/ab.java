package zf;

import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class ab implements InterfaceC3440j {
    public final xf.r alpha;

    public ab(xf.r rVar) {
        this.alpha = rVar;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        Object bravo = ((xf.q) this.alpha).silver.bravo(cVar, obj);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }
}
