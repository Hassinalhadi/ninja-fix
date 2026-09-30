package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class dBS implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f10302b = LazyKt.lazy(sJ6.f11289b);

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10302b.getValue();
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
            Boolean bool = (Boolean) Mui.f9175b.getValue();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f10302b.getValue(), bool, new pFh(new nyF(bool.booleanValue()))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
