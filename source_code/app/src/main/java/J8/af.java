package J8;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class af extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ak purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ak akVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = akVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new af(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((af) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            ak akVar = this.purple;
            ah ahVar = akVar.delta;
            Ba.e eVar = new Ba.e(2, akVar);
            this.alpha = 1;
            if (ahVar.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
