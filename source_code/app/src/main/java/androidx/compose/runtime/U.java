package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class U extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ X red;
    public final /* synthetic */ at silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x4, at atVar, Nd.c cVar) {
        super(2, cVar);
        this.red = x4;
        this.silver = atVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        U u4 = new U(this.red, this.silver, cVar);
        u4.purple = obj;
        return u4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        vf.ab abVar = (vf.ab) this.purple;
        this.alpha = 1;
        this.red.invoke(abVar, this.silver, this);
        return aVar;
    }
}
