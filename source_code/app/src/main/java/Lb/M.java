package Lb;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class M extends Pd.i implements Xd.l {
    public final /* synthetic */ String alpha;
    public final /* synthetic */ Y.s purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(String str, Y.s sVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = str;
        this.purple = sVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new M(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (this.alpha.length() == 0) {
            Y.s.bravo(this.purple);
        }
        return Unit.INSTANCE;
    }
}
