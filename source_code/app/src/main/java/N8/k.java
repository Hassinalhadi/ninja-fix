package N8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import vf.ab;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public n alpha;
    public int purple;
    public final /* synthetic */ n red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Nd.c cVar) {
        super(2, cVar);
        this.red = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                nVar = this.alpha;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            n nVar2 = this.red;
            InterfaceC3439i alpha = nVar2.alpha.alpha();
            this.alpha = nVar2;
            this.purple = 1;
            Object november = AbstractC3428A.november(alpha, this);
            if (november == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj = november;
        }
        n.alpha(nVar, new G1.b(y.amber(((G1.b) obj).alpha()), true));
        return Unit.INSTANCE;
    }
}
