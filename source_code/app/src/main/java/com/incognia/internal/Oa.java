package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class Oa extends kotlin.jvm.internal.i implements Function1 {
    public Oa(Me me2) {
        super(1, 0, Me.class, me2, "onData", "onData(Lcom/incognia/internal/data/CollectableData;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AxM axM = (AxM) obj;
        Me me2 = (Me) this.receiver;
        if (me2.IB) {
            me2.sVU.f9820b.put(axM.f8393b, axM);
        }
        return Unit.INSTANCE;
    }
}
