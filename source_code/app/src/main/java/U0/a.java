package U0;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class a extends Pd.i implements Xd.l {
    public final /* synthetic */ v alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = vVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new a(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.show();
        return Unit.INSTANCE;
    }
}
