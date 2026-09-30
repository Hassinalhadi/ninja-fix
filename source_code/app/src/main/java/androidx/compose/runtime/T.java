package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class T extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.T, Pd.i, Nd.c] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? iVar = new Pd.i(2, cVar);
        iVar.alpha = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((S) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (((S) this.alpha) == S.alpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
