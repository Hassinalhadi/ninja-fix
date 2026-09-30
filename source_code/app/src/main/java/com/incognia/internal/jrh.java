package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class jrh implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10724W = LazyKt.lazy(kg2.f10775b);

    /* renamed from: b, reason: collision with root package name */
    public final q8 f10725b;

    public jrh(q8 q8Var) {
        this.f10725b = q8Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10724W.getValue();
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
            String W5 = this.f10725b.W("android_id");
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) wGk.PqK.getValue(), W5, new Hnm(new v(W5))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
