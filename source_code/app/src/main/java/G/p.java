package G;

import androidx.compose.runtime.n0;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class p extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ t purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = tVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new p(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            t tVar = this.purple;
            v vVar = tVar.white;
            float juliet = ((n0) tVar.f1348b).juliet() / tVar.h();
            this.alpha = 1;
            if (vVar.alpha(juliet, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
