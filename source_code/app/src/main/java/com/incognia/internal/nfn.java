package com.incognia.internal;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class nfn extends kotlin.jvm.internal.i implements Function1 {
    public nfn(Me me2) {
        super(1, 0, Me.class, me2, "onFinished", "onFinished(Ljava/lang/Object;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Me.b((Me) this.receiver, ((Result) obj).alpha);
        return Unit.INSTANCE;
    }
}
