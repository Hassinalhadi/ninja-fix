package C1;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class o extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [C1.o, Pd.i, Nd.c] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? iVar = new Pd.i(2, cVar);
        iVar.alpha = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((B) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return Boolean.valueOf(!(((B) this.alpha) instanceof aq));
    }
}
