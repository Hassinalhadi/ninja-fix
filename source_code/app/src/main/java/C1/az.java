package C1;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class az extends Pd.i implements Xd.l {
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Pd.i(2, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((az) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return Unit.INSTANCE;
    }
}
