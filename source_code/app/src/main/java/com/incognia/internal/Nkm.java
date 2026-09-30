package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class Nkm implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final dGS f9249W;

    /* renamed from: b, reason: collision with root package name */
    public final d94 f9250b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f9251f9 = LazyKt.lazy(sX5.f11302b);

    public Nkm(d94 d94Var, dGS dgs) {
        this.f9250b = d94Var;
        this.f9249W = dgs;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9251f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        if (!this.f9249W.b()) {
            Result.Companion companion = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(ResultKt.createFailure(new bJ((String) this.f9251f9.getValue()))));
            return;
        }
        try {
            Result.Companion companion2 = Result.INSTANCE;
            String str = (String) this.f9251f9.getValue();
            d94 d94Var = this.f9250b;
            m206constructorimpl = Result.m206constructorimpl(new yIO(str, new FCF(Boolean.valueOf(d94Var.gmP()), Boolean.valueOf(d94Var.PqK()))));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
