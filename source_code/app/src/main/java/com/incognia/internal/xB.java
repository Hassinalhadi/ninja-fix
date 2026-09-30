package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class xB implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f11779W = LazyKt.lazy(ptb.f11107b);

    /* renamed from: b, reason: collision with root package name */
    public final N4 f11780b;

    public xB(N4 n42) {
        this.f11780b = n42;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11779W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new X4J((String) this.f11779W.getValue(), new uK(this.f11780b.W(), this.f11780b.b())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
