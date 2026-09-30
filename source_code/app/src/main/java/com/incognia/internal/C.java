package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class C implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8431W = LazyKt.lazy(UN.f9704b);

    /* renamed from: b, reason: collision with root package name */
    public final q8 f8432b;

    public C(q8 q8Var) {
        this.f8432b = q8Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8431W.getValue();
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
            String b2 = this.f8432b.b("always_finish_activities");
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f8431W.getValue(), b2, new Hnm(new vj(b2))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
