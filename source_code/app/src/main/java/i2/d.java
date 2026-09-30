package i2;

import Pd.i;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class d extends i implements l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ e purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = eVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        d dVar = new d(this.purple, cVar);
        dVar.alpha = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        throw null;
    }
}
