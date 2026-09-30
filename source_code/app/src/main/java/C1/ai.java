package C1;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ai extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ Pd.i purple;
    public final /* synthetic */ C0080b red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ai(Xd.l lVar, C0080b c0080b, Nd.c cVar) {
        super(2, cVar);
        this.purple = (Pd.i) lVar;
        this.red = c0080b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ai(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ai) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Xd.l, Pd.i] */
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
        Object obj2 = this.red.bravo;
        this.alpha = 1;
        Object invoke = this.purple.invoke(obj2, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
