package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class fM implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10411W = LazyKt.lazy(Df.f8554b);

    /* renamed from: b, reason: collision with root package name */
    public final xi8 f10412b;

    public fM(xi8 xi8Var) {
        this.f10412b = xi8Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10411W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        DfE dfE;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (CnH.b(CnH.f8484b, 21, 0, 2)) {
                dfE = new DfE((String) wGk.Btp.getValue(), new p8(this.f10412b.olU(), this.f10412b.V(), xi8.b(), this.f10412b.DOu(), this.f10412b.sVU(), this.f10412b.J(), xi8.gmP(), this.f10412b.R(), this.f10412b.PqK(), this.f10412b.W(), this.f10412b.f9()));
            } else {
                dfE = new DfE((String) wGk.Btp.getValue(), null);
            }
            m206constructorimpl = Result.m206constructorimpl(dfE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
