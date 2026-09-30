package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class Ct0 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8492W = LazyKt.lazy(i7I.f10607b);

    /* renamed from: b, reason: collision with root package name */
    public final H53 f8493b;

    public Ct0(H53 h53) {
        this.f8493b = h53;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8492W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        String str;
        H53 h53;
        RUd rUd;
        try {
            Result.Companion companion = Result.INSTANCE;
            str = (String) this.f8492W.getValue();
            h53 = this.f8493b;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            rUd = new Wk(h53.f8819b, h53.f8818W).b();
            m206constructorimpl = Result.m206constructorimpl(new k5V(str, rUd));
            Bo7.b(m206constructorimpl, wa2);
        }
        rUd = null;
        m206constructorimpl = Result.m206constructorimpl(new k5V(str, rUd));
        Bo7.b(m206constructorimpl, wa2);
    }
}
