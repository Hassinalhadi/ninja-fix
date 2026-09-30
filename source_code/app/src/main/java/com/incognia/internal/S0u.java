package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class S0u implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9575W = LazyKt.lazy(hCK.f10525b);

    /* renamed from: b, reason: collision with root package name */
    public final CF f9576b;

    public S0u(CF cf2) {
        this.f9576b = cf2;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9575W.getValue();
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
            this.f9576b.getClass();
            String f92 = CF.f9();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9575W.getValue(), f92, new Hnm(new nv6(f92))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
