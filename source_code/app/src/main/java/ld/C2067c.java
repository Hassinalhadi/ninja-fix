package ld;

import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import pd.AbstractC2304b;

/* renamed from: ld.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2067c extends Pd.i implements l {
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Pd.i(2, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2067c) create((AbstractC2304b) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return Unit.INSTANCE;
    }
}
