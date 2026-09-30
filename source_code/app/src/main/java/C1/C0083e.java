package C1;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: C1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0083e extends Pd.i implements Function1 {
    public int alpha;

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new Pd.i(1, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0083e) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
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
        this.alpha = 1;
        throw null;
    }
}
