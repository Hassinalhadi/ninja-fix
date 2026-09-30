package com.incognia.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class j8d implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f10657b = LazyKt.lazy(RwI.f9567b);

    /* renamed from: W, reason: collision with root package name */
    public final AtomicReference f10656W = new AtomicReference();

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10657b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        EG7 eg7 = (EG7) this.f10656W.get();
        if (eg7 != null) {
            Result.Companion companion = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(new ylq((String) this.f10657b.getValue(), eg7)));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(ResultKt.createFailure(new TYz((String) this.f10657b.getValue()))));
        }
        this.f10656W.set(null);
    }
}
