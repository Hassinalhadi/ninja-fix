package com.incognia.internal;

import com.incognia.RequestTokenWithStatus;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class WLO extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Lambda f9848W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WLO(AtomicReference atomicReference, Function1 function1) {
        super(1);
        this.f9849b = atomicReference;
        this.f9848W = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RequestTokenWithStatus requestTokenWithStatus = (RequestTokenWithStatus) obj;
        ZJ zj = (ZJ) this.f9849b.get();
        if (zj == null || zj.f10037W.compareAndSet(0, 3)) {
            this.f9848W.invoke(requestTokenWithStatus);
        }
        return Unit.INSTANCE;
    }
}
