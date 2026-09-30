package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class O3 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9283W = LazyKt.lazy(c3.f10222b);

    /* renamed from: b, reason: collision with root package name */
    public final Av7 f9284b;

    public O3(Av7 av7) {
        this.f9284b = av7;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9283W.getValue();
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
            String W5 = this.f9284b.W();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9283W.getValue(), W5, new Hnm(new wH(W5))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
