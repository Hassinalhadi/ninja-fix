package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class yx9 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f11881W = LazyKt.lazy(zL.f11904b);

    /* renamed from: b, reason: collision with root package name */
    public final Av7 f11882b;

    public yx9(Av7 av7) {
        this.f11882b = av7;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11881W.getValue();
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
            String f92 = this.f11882b.f9();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f11881W.getValue(), f92, new Hnm(new RK(f92))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
