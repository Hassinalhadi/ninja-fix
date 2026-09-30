package b;

import f.C1674k;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ak extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ al purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(al alVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = alVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ak(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ak) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        Object obj3 = new Object();
        Object obj4 = new Object();
        al alVar = this.purple;
        yf.az azVar = ((C1674k) alVar.alpha).alpha;
        aj ajVar = new aj(obj2, obj3, obj4, alVar, 0);
        this.alpha = 1;
        azVar.getClass();
        yf.az.juliet(azVar, ajVar, this);
        return aVar;
    }
}
