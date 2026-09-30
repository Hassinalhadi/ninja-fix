package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class aMe implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10095W = LazyKt.lazy(quh.f11180b);

    /* renamed from: b, reason: collision with root package name */
    public final CF f10096b;

    public aMe(CF cf2) {
        this.f10096b = cf2;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10095W.getValue();
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
            this.f10096b.getClass();
            Integer W5 = CF.W();
            String str = (String) this.f10095W.getValue();
            this.f10096b.getClass();
            m206constructorimpl = Result.m206constructorimpl(new P7R(str, CF.W(), new Jj6(new E5(W5))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
