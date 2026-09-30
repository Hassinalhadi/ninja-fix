package F;

import f.C1674k;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class K2 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ L2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(L2 l22, Nd.c cVar) {
        super(2, cVar);
        this.purple = l22;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new K2(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((K2) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        Object obj2 = new Object();
        L2 l22 = this.purple;
        yf.az azVar = ((C1674k) l22.alpha).alpha;
        E.e eVar = new E.e(2, obj2, l22);
        this.alpha = 1;
        azVar.getClass();
        yf.az.juliet(azVar, eVar, this);
        return aVar;
    }
}
