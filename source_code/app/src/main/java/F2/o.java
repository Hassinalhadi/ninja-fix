package F2;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.InterfaceC3439i;

/* loaded from: classes3.dex */
public final class o extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ n purple;
    public final /* synthetic */ J2.p red;
    public final /* synthetic */ j silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, J2.p pVar, j jVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = nVar;
        this.red = pVar;
        this.silver = jVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new o(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            J2.p pVar = this.red;
            InterfaceC3439i bravo = this.purple.bravo(pVar);
            E.e eVar = new E.e(3, this.silver, pVar);
            this.alpha = 1;
            if (bravo.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
