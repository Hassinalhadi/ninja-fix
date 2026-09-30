package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class qFb implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f11134W = LazyKt.lazy(VJl.f9772b);

    /* renamed from: b, reason: collision with root package name */
    public final mID f11135b;

    public qFb(mID mid) {
        this.f11135b = mid;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11134W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new VHb((String) wGk.f11614E.getValue(), this.f11135b.b()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
