package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class D0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ Pd.i purple;
    public final /* synthetic */ N red;
    public final /* synthetic */ m0.r silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D0(Xd.m mVar, N n5, m0.r rVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = (Pd.i) mVar;
        this.red = n5;
        this.silver = rVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new D0(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((D0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            Z.b bVar = new Z.b(this.silver.charlie);
            this.alpha = 1;
            if (this.purple.invoke(this.red, bVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
