package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class bDV implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10162W = LazyKt.lazy(UXx.f9706b);

    /* renamed from: b, reason: collision with root package name */
    public final UZ6 f10163b;

    public bDV(UZ6 uz6) {
        this.f10163b = uz6;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10162W.getValue();
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
            UZ6 uz6 = this.f10163b;
            m206constructorimpl = Result.m206constructorimpl(new zX((String) this.f10162W.getValue(), new rKz(uz6.f9712b, uz6.f9711W, uz6.f9713f9, uz6.sVU, uz6.gmP, uz6.f9708J, uz6.PqK, uz6.f9710V, uz6.olU, uz6.f9709R, uz6.DOu)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
