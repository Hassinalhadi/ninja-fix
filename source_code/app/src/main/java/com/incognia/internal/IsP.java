package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class IsP implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final dGS f8925W;

    /* renamed from: b, reason: collision with root package name */
    public final tNn f8926b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f8927f9 = LazyKt.lazy(QG.f9489b);

    public IsP(tNn tnn, dGS dgs) {
        this.f8926b = tnn;
        this.f8925W = dgs;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8927f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        if (!this.f8925W.b()) {
            Result.Companion companion = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(ResultKt.createFailure(new bJ((String) this.f8927f9.getValue()))));
            return;
        }
        try {
            Result.Companion companion2 = Result.INSTANCE;
            String str = (String) this.f8927f9.getValue();
            tNn tnn = this.f8926b;
            m206constructorimpl = Result.m206constructorimpl(new YCr(str, new qfn(tnn.W("gps"), tnn.W("network"))));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
