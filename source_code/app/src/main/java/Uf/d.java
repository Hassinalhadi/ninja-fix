package Uf;

import Tf.ah;
import Tf.u;
import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class d extends Pd.h implements Xd.l {
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ u silver;
    public final /* synthetic */ ah teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u uVar, ah ahVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = uVar;
        this.teal = ahVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        d dVar = new d(this.silver, this.teal, cVar);
        dVar.red = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C2359i c2359i = (C2359i) this.red;
            kotlin.collections.l lVar = new kotlin.collections.l();
            this.purple = 1;
            if (b.bravo(c2359i, this.silver, lVar, this.teal, false, true, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
