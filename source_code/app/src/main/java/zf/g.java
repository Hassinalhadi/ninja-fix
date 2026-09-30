package zf;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ h red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Nd.c cVar) {
        super(2, cVar);
        this.red = hVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        g gVar = new g(this.red, cVar);
        gVar.purple = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC3440j interfaceC3440j = (InterfaceC3440j) this.purple;
            this.alpha = 1;
            if (this.red.hotel(interfaceC3440j, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
