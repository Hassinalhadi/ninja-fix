package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yIW implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final K f11852W;

    /* renamed from: b, reason: collision with root package name */
    public final k8E f11853b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11854f9 = LazyKt.lazy(zQQ.f11911b);

    public yIW(k8E k8e, K k6) {
        this.f11853b = k8e;
        this.f11852W = k6;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11854f9.getValue();
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
            String sVU = Intrinsics.areEqual(this.f11852W.b(), i.f10596b) ? this.f11853b.sVU() : null;
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f11854f9.getValue(), sVU, new Hnm(new QS3(sVU))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
