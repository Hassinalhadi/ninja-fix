package y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class au extends Pd.i implements Function1 {
    public final /* synthetic */ C3344D alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(C3344D c3344d, Nd.c cVar) {
        super(1, cVar);
        this.alpha = c3344d;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new au(this.alpha, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((au) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.azure = false;
        return Unit.INSTANCE;
    }
}
