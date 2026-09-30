package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class SCk implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f9585W = LazyKt.lazy(uf.f11490b);

    /* renamed from: b, reason: collision with root package name */
    public final q8 f9586b;

    public SCk(q8 q8Var) {
        this.f9586b = q8Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9585W.getValue();
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
            String b2 = this.f9586b.b("stay_on_while_plugged_in");
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9585W.getValue(), b2, new Hnm(new bCX(b2))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
