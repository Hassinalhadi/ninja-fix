package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class TJF implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9657W = LazyKt.lazy(ji.f10705b);

    /* renamed from: b, reason: collision with root package name */
    public final Z6 f9658b;

    public TJF(Z6 z62) {
        this.f9658b = z62;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9657W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(new q0e((String) wGk.zX.getValue(), this.f9658b.b()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
