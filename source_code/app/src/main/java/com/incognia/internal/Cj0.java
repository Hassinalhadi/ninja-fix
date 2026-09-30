package com.incognia.internal;

import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Cj0 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f8473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj0(CountDownLatch countDownLatch) {
        super(0);
        this.f8473b = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f8473b.countDown();
        return Unit.INSTANCE;
    }
}
