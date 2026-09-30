package y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: y.K, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3351K extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ Pd.i purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3351K(Function1 function1, Nd.c cVar) {
        super(2, cVar);
        this.purple = (Pd.i) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Pd.i, kotlin.jvm.functions.Function1] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3351K(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3351K) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Pd.i, kotlin.jvm.functions.Function1] */
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
            this.alpha = 1;
            if (this.purple.invoke(this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
