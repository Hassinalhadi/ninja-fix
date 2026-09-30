package androidx.work.impl.workers;

import A2.z;
import J2.p;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class i extends Pd.i implements l {
    public final /* synthetic */ p alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = pVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((F2.c) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        String str = j.alpha;
        z.echo().alpha(str, "Constraints changed for " + this.alpha);
        return Unit.INSTANCE;
    }
}
