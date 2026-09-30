package com.incognia.internal;

import com.incognia.RequestTokenWithStatus;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class Kpk extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f9025W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f9026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kpk(Ref.ObjectRef objectRef, CountDownLatch countDownLatch) {
        super(1);
        this.f9026b = objectRef;
        this.f9025W = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f9026b.alpha = (RequestTokenWithStatus) obj;
        this.f9025W.countDown();
        return Unit.INSTANCE;
    }
}
