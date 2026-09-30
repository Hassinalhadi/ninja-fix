package com.incognia.internal;

import com.incognia.Incognia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class qy5 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final qy5 f11186b = new qy5();

    public qy5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("clearAccountId", sV5.f11300b);
        return Unit.INSTANCE;
    }
}
