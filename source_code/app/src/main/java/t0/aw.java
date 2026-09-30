package t0;

import android.view.Choreographer;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class aw extends Pd.i implements Xd.l {
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Pd.i(2, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aw) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return Choreographer.getInstance();
    }
}
