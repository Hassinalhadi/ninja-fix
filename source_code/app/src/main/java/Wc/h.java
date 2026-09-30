package Wc;

import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.az;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ l purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((h) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        l lVar = this.purple;
        az azVar = lVar.coral().delta;
        g gVar = new g(lVar, 0);
        this.alpha = 1;
        azVar.getClass();
        az.juliet(azVar, gVar, this);
        return aVar;
    }
}
