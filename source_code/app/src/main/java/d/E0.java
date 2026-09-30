package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class E0 extends Pd.i implements Xd.l {
    public final /* synthetic */ N alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(N n5, Nd.c cVar) {
        super(2, cVar);
        this.alpha = n5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new E0(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.delta();
        return Unit.INSTANCE;
    }
}
