package y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: y.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3348H extends Pd.i implements Function1 {
    public final /* synthetic */ C3344D alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3348H(C3344D c3344d, Nd.c cVar) {
        super(1, cVar);
        this.alpha = c3344d;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C3348H(this.alpha, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3348H) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.hotel();
        return Unit.INSTANCE;
    }
}
