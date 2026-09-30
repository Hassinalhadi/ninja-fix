package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class kja implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10778W = LazyKt.lazy(dQ7.f10313b);

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f10779b;

    public kja(Ssq ssq) {
        this.f10779b = ssq;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10778W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        fKw fkw;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = (String) this.f10778W.getValue();
            Ssq ssq = this.f10779b;
            synchronized (ssq) {
                try {
                    if (ssq.PqK == null) {
                        ssq.PqK = ssq.f9(ssq.olU);
                    }
                    fkw = ssq.PqK;
                } catch (Throwable unused) {
                    fkw = null;
                }
            }
            m206constructorimpl = Result.m206constructorimpl(new eG(str, fkw));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
