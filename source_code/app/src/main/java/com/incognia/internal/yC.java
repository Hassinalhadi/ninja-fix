package com.incognia.internal;

import android.os.Debug;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class yC implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f11842W = LazyKt.lazy(l3j.f10796b);

    /* renamed from: b, reason: collision with root package name */
    public final fpY f11843b;

    public yC(fpY fpy) {
        this.f11843b = fpy;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11842W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new HS((String) this.f11842W.getValue(), new gQi(Debug.isDebuggerConnected(), this.f11843b.b())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
