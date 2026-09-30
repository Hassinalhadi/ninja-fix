package T0;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class g extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ j purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, long j5, Nd.c cVar) {
        super(2, cVar);
        this.purple = jVar;
        this.red = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            j jVar = this.purple;
            this.alpha = 1;
            if (jVar.alpha.bravo(this.red, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
