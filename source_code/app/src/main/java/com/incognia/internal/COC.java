package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class COC implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8448W = LazyKt.lazy(j4p.f10653b);

    /* renamed from: b, reason: collision with root package name */
    public final vY f8449b;

    public COC(vY vYVar) {
        this.f8449b = vYVar;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8448W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new Qe3((String) this.f8448W.getValue(), this.f8449b));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
