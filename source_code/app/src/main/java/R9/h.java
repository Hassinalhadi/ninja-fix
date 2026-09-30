package R9;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements Xd.l {
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Pd.i(2, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return Unit.INSTANCE;
    }
}
