package com.incognia.internal;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class r4 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L7E f11203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(L7E l7e) {
        super(0);
        this.f11203b = l7e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        L7E l7e = this.f11203b;
        De0 de0 = l7e.sVU;
        l7e.f9044f9.getClass();
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        de0.getClass();
        QHn.f9492b.b(de0.f8552b, valueOf);
        return Unit.INSTANCE;
    }
}
