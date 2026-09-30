package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class E extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ J purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(J j5, Nd.c cVar) {
        super(2, cVar);
        this.purple = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new E(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        xf.e eVar = this.purple.echo;
        this.alpha = 1;
        Object mike = vf.ad.mike(new C1518A(eVar, null), this);
        if (mike == aVar) {
            return aVar;
        }
        return mike;
    }
}
