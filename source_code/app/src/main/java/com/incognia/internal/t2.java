package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class t2 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f11350W = LazyKt.lazy(Sj.f9617b);

    /* renamed from: b, reason: collision with root package name */
    public final q8 f11351b;

    public t2(q8 q8Var) {
        this.f11351b = q8Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11350W.getValue();
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
            String b2 = CnH.b(CnH.f8484b, 24, 0, 2) ? this.f11351b.b("boot_count") : null;
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f11350W.getValue(), b2, new Hnm(new Ov(b2))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
