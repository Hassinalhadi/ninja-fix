package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class EV implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8618W = LazyKt.lazy(gv8.f10502b);

    /* renamed from: b, reason: collision with root package name */
    public final TI9 f8619b;

    public EV(TI9 ti9) {
        this.f8619b = ti9;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8618W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new chP((String) this.f8618W.getValue(), (fKN) this.f8619b.f9653f9.getValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
