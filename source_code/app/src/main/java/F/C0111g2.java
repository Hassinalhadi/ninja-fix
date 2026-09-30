package F;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: F.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0111g2 extends Pd.i implements Xd.l {
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Pd.i(2, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0111g2) create((m0.u) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return Unit.INSTANCE;
    }
}
