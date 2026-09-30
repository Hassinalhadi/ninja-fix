package bz;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class B extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ F silver;
    public final /* synthetic */ a0 teal;
    public final /* synthetic */ float white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Object obj, Object obj2, F f5, a0 a0Var, float f10, Nd.c cVar) {
        super(1, cVar);
        this.purple = obj;
        this.red = obj2;
        this.silver = f5;
        this.teal = a0Var;
        this.white = f10;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new B(this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((B) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

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
            A a6 = new A(this.purple, this.red, this.silver, this.teal, this.white, null);
            this.alpha = 1;
            if (vf.ad.mike(a6, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
