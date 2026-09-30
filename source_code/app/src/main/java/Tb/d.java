package Tb;

import Pd.i;
import Xd.l;
import Y.s;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class d extends i implements l {
    public final /* synthetic */ s alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = sVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        s.bravo(this.alpha);
        return Unit.INSTANCE;
    }
}
