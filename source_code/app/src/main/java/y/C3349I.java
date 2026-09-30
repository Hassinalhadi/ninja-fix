package y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: y.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3349I extends Pd.i implements Function1 {
    public final /* synthetic */ C3344D alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3349I(C3344D c3344d, Nd.c cVar) {
        super(1, cVar);
        this.alpha = c3344d;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C3349I(this.alpha, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3349I) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C3344D c3344d = this.alpha;
        c3344d.foxtrot(c3344d.azure);
        return Unit.INSTANCE;
    }
}
