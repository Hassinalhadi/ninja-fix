package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class OG implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f9293b = LazyKt.lazy(Cg.f8466b);

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9293b.getValue();
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
            CnH cnH = CnH.f8484b;
            m206constructorimpl = Result.m206constructorimpl(new GUg((String) wGk.f11630L.getValue(), new DdD(CnH.f8481W, CnH.f8485f9, CnH.sVU, CnH.gmP, CnH.f8476J, CnH.PqK, CnH.f8480V, CnH.olU, cnH.b(), CnH.f8486n9, CnH.f8482Y, cnH.W(), cnH.f9(), cnH.sVU(), cnH.PqK(), cnH.gmP(), cnH.J(), CnH.f8478P, CnH.f8477L, CnH.FL, CnH.f8483ar)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
