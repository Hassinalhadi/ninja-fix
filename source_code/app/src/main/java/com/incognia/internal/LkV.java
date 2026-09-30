package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class LkV implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9068W = LazyKt.lazy(YKA.f9987b);

    /* renamed from: b, reason: collision with root package name */
    public final vY f9069b;

    public LkV(vY vYVar) {
        this.f9069b = vYVar;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9068W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new doQ((String) this.f9068W.getValue(), new bXV(this.f9069b.f11553b, cxz.b())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        wa2.invoke(new Result(m206constructorimpl));
    }
}
