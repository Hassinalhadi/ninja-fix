package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class XSb implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f9928b = LazyKt.lazy(UD.f9698b);

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9928b.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new SfK((String) this.f9928b.getValue(), new OME(CnH.f8479R, CnH.DOu, CnH.f8475E, String.valueOf(CnH.IB))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
