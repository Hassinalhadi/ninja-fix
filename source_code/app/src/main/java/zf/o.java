package zf;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class o extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ InterfaceC3439i purple;
    public final /* synthetic */ ab red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC3439i interfaceC3439i, ab abVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = interfaceC3439i;
        this.red = abVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new o(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            this.alpha = 1;
            if (this.purple.collect(this.red, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
