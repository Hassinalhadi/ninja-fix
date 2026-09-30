package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class BLn implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8413W = LazyKt.lazy(pva.f11110b);

    /* renamed from: b, reason: collision with root package name */
    public final lhI f8414b;

    public BLn(lhI lhi) {
        this.f8414b = lhi;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8413W.getValue();
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
            Boolean PqK = this.f8414b.PqK();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f8413W.getValue(), PqK, new pFh(new gmy(PqK))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
