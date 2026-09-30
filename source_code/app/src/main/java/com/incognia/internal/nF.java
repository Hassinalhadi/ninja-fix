package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class nF implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10939W = LazyKt.lazy(z5J.f11885b);

    /* renamed from: b, reason: collision with root package name */
    public final lhI f10940b;

    public nF(lhI lhi) {
        this.f10940b = lhi;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10939W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new ktj((String) this.f10939W.getValue(), this.f10940b.gmP()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
