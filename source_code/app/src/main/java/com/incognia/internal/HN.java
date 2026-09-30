package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class HN implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8838W = LazyKt.lazy(sdI.f11309b);

    /* renamed from: b, reason: collision with root package name */
    public final k8E f8839b;

    public HN(k8E k8e) {
        this.f8839b = k8e;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8838W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        try {
            this.f8839b.b(new O(wa2, this));
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(ResultKt.createFailure(th)));
        }
    }
}
