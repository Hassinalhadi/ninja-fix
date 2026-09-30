package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class l3c implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10794W = LazyKt.lazy(q5.f11126b);

    /* renamed from: b, reason: collision with root package name */
    public final k8E f10795b;

    public l3c(k8E k8e) {
        this.f10795b = k8e;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10794W.getValue();
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
            String W5 = this.f10795b.W();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f10794W.getValue(), W5, new Hnm(new q2(W5))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
