package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class pxn implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f11113b = LazyKt.lazy(DDN.f8519b);

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11113b.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new kIx((String) this.f11113b.getValue(), CollectionsKt.peach(QHn.f9492b.b(), QHn.f9491W.b(), QHn.f9493f9.b())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
