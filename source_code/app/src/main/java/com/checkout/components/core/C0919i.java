package com.checkout.components.core;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.core.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0919i extends Pd.i implements Xd.l {
    public C0919i(Nd.c cVar) {
        super(2, cVar);
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0919i(cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        new C0919i((Nd.c) obj2);
        Unit unit = Unit.INSTANCE;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(unit);
        return unit;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return Unit.INSTANCE;
    }
}
