package d;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2683j0;

/* loaded from: classes3.dex */
public final class x0 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ m0.u red;
    public final /* synthetic */ Pd.i silver;
    public final /* synthetic */ Function1 teal;
    public final /* synthetic */ N white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(m0.u uVar, Xd.m mVar, Function1 function1, N n5, Nd.c cVar) {
        super(2, cVar);
        this.red = uVar;
        this.silver = (Pd.i) mVar;
        this.teal = function1;
        this.white = n5;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        Function1 function1 = this.teal;
        N n5 = this.white;
        x0 x0Var = new x0(this.red, this.silver, function1, n5, cVar);
        x0Var.purple = obj;
        return x0Var;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Xd.m, Pd.i] */
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
            w0 w0Var = new w0((vf.ab) this.purple, this.silver, this.teal, this.white, null);
            this.alpha = 1;
            if (AbstractC2683j0.bravo(this.red, w0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
