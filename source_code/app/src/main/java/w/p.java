package w;

import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import t0.AbstractC2931o0;
import vf.ab;

/* loaded from: classes3.dex */
public final class p extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ q purple;
    public final /* synthetic */ C3226d red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, C3226d c3226d, Nd.c cVar) {
        super(2, cVar);
        this.purple = qVar;
        this.red = c3226d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new p(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((p) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        this.alpha = 1;
        AbstractC2931o0.alpha(this.purple, this.red, this);
        return aVar;
    }
}
