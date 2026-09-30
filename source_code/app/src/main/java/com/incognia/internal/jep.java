package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class jep implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10703W = LazyKt.lazy(CR.f8453b);

    /* renamed from: b, reason: collision with root package name */
    public final e2 f10704b;

    public jep(e2 e2Var) {
        this.f10704b = e2Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10703W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new xqS((String) this.f10703W.getValue(), new mqI(this.f10704b.b(), this.f10704b.W())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
