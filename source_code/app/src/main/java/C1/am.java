package C1;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class am extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ap red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ap apVar, Nd.c cVar) {
        super(2, cVar);
        this.red = apVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        am amVar = new am(this.red, cVar);
        amVar.purple = obj;
        return amVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((am) create((as) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            as asVar = (as) this.purple;
            this.alpha = 1;
            if (ap.delta(this.red, asVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
