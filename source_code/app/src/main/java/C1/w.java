package C1;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class w extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ ag purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ag agVar, Nd.c cVar) {
        super(1, cVar);
        this.purple = agVar;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new w(this.purple, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((w) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
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
