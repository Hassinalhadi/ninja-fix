package N9;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class b extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ c purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Nd.c cVar2) {
        super(2, cVar2);
        this.purple = cVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            c cVar = this.purple;
            InterfaceC3439i foxtrot = cVar.bravo.foxtrot();
            Ba.e eVar = new Ba.e(5, cVar);
            this.alpha = 1;
            if (foxtrot.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
