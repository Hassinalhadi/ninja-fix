package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class Jg implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8954W = LazyKt.lazy(jn.f10711b);

    /* renamed from: b, reason: collision with root package name */
    public final W4L f8955b;

    public Jg(W4L w4l) {
        this.f8955b = w4l;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8954W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                wa2.b(Result.m206constructorimpl(new up((String) this.f8954W.getValue(), new Pw0(this.f8955b.b(), null, 2))));
            } catch (Throwable th) {
                if (th instanceof Exception) {
                    Result.Companion companion2 = Result.INSTANCE;
                    wa2.b(Result.m206constructorimpl(new up((String) this.f8954W.getValue(), new Pw0(null, lzc.b(th), 1))));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    wa2.b(Result.m206constructorimpl(ResultKt.createFailure(th)));
                }
            }
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
