package A2;

import androidx.work.CoroutineWorker;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class g extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ CoroutineWorker purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CoroutineWorker coroutineWorker, Nd.c cVar) {
        super(2, cVar);
        this.purple = coroutineWorker;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        this.alpha = 1;
        Object alpha = this.purple.alpha(this);
        if (alpha == aVar) {
            return aVar;
        }
        return alpha;
    }
}
