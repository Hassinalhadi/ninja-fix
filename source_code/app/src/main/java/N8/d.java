package N8;

import android.util.Log;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [N8.d, Pd.i, Nd.c] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? iVar = new Pd.i(2, cVar);
        iVar.alpha = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((String) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.alpha));
        return Unit.INSTANCE;
    }
}
