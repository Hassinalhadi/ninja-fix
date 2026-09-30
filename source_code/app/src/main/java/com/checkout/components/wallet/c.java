package com.checkout.components.wallet;

import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.i implements Function1 {
    public c(ah.b bVar) {
        super(1, 0, ah.b.class, bVar, "launch", "launch(Ljava/lang/Object;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Task p02 = (Task) obj;
        Intrinsics.echo(p02, "p0");
        ((ah.b) this.receiver).alpha(p02);
        return Unit.INSTANCE;
    }
}
