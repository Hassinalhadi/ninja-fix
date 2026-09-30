package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class z5 extends kotlin.jvm.internal.i implements Function1 {
    public z5(Me me2) {
        super(1, 0, Me.class, me2, "onTimeoutStep", "onTimeoutStep(Z)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j5;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Me me2 = (Me) this.receiver;
        if (booleanValue) {
            me2.getClass();
            kT kTVar = QHn.f9493f9;
            String str = Me.eeB;
            Long sVU = kTVar.sVU(str);
            if (sVU != null) {
                j5 = sVU.longValue();
            } else {
                j5 = 0;
            }
            kTVar.b(str, Long.valueOf(j5 + 1));
            me2.b(IW7.f8906b, new YO(me2));
        } else if (!me2.f9144E) {
            me2.b(rc.f11241b, QdM.f9507b);
            pl2 pl2Var = mXi.f10907b;
            me2.FL = mXi.b(Me.jG);
        }
        return Unit.INSTANCE;
    }
}
