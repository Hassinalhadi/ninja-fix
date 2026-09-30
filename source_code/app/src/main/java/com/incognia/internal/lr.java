package com.incognia.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class lr implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f10850b = LazyKt.lazy(ne7.f10961b);

    /* renamed from: W, reason: collision with root package name */
    public final AtomicReference f10849W = new AtomicReference();

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10850b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        ao aoVar = (ao) this.f10849W.get();
        if (aoVar != null) {
            Result.Companion companion = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(new T4((String) this.f10850b.getValue(), aoVar)));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(ResultKt.createFailure(new TYz((String) this.f10850b.getValue()))));
        }
        this.f10849W.set(null);
    }
}
