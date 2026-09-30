package hd;

import kotlin.ResultKt;
import kotlin.Unit;
import od.C2226c;

/* loaded from: classes2.dex */
public final class q extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ boolean purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.purple = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        q qVar = new q(this.purple, cVar);
        qVar.alpha = obj;
        return qVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((C2226c) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ((C2226c) this.alpha).foxtrot.alpha(v.charlie, new Ec.ae(2, this.purple));
        return Unit.INSTANCE;
    }
}
