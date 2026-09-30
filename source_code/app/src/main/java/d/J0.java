package d;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2683j0;

/* loaded from: classes3.dex */
public final class J0 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ m0.u red;
    public final /* synthetic */ Pd.i silver;
    public final /* synthetic */ Function1 teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J0(m0.u uVar, Xd.m mVar, b.ag agVar, b.ag agVar2, Function1 function1, Nd.c cVar) {
        super(2, cVar);
        this.red = uVar;
        this.silver = (Pd.i) mVar;
        this.teal = function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        Function1 function1 = this.teal;
        J0 j02 = new J0(this.red, this.silver, null, null, function1, cVar);
        j02.purple = obj;
        return j02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((J0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            vf.ab abVar = (vf.ab) this.purple;
            m0.u uVar = this.red;
            N n5 = new N(uVar);
            I0 i02 = new I0(abVar, this.silver, null, null, this.teal, n5, null);
            this.alpha = 1;
            if (AbstractC2683j0.bravo(uVar, i02, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
