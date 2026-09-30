package zf;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class ae extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ InterfaceC3440j red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        super(2, cVar);
        this.red = interfaceC3440j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ae aeVar = new ae(this.red, cVar);
        aeVar.purple = obj;
        return aeVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ae) create(obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Object obj2 = this.purple;
            this.alpha = 1;
            if (this.red.emit(obj2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
