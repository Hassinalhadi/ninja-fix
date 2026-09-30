package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class Up5 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9734W = LazyKt.lazy(eoX.f10390b);

    /* renamed from: b, reason: collision with root package name */
    public final QiA f9735b;

    public Up5(QiA qiA) {
        this.f9735b = qiA;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9734W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new NCT((String) this.f9734W.getValue(), this.f9735b.b()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
