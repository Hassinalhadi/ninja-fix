package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class mBO implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10891W = LazyKt.lazy(jsr.f10728b);

    /* renamed from: b, reason: collision with root package name */
    public final CF f10892b;

    public mBO(CF cf2) {
        this.f10892b = cf2;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10891W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f10891W.getValue(), this.f10892b.b(), new Hnm(new TSr(this.f10892b.b()))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
