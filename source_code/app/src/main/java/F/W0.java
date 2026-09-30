package F;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class W0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0103e2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(C0103e2 c0103e2, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0103e2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new W0(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((W0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            this.alpha = 1;
            if (this.purple.bravo(this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
