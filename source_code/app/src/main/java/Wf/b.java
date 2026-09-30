package Wf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class b extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ Function1 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, Nd.c cVar) {
        super(2, cVar);
        this.purple = function1;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        Object invoke = this.purple.invoke(this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
