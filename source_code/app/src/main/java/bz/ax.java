package bz;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ax extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ a0 purple;
    public final /* synthetic */ F red;
    public final /* synthetic */ Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(Nd.c cVar, F f5, a0 a0Var, Object obj) {
        super(1, cVar);
        this.purple = a0Var;
        this.red = f5;
        this.silver = obj;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        Object obj = this.silver;
        return new ax(cVar, this.red, this.purple, obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ax) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        a0 a0Var = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            aw awVar = new aw(null, this.red, a0Var, this.silver);
            this.alpha = 1;
            if (vf.ad.mike(awVar, this) == aVar) {
                return aVar;
            }
        }
        a0Var.juliet();
        return Unit.INSTANCE;
    }
}
