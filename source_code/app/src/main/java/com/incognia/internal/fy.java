package com.incognia.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class fy implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f10450b = LazyKt.lazy(qdY.f11160b);

    /* renamed from: W, reason: collision with root package name */
    public final AtomicReference f10449W = new AtomicReference();

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10450b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        FzF fzF = (FzF) this.f10449W.get();
        if (fzF != null) {
            Result.Companion companion = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(new VhZ((String) this.f10450b.getValue(), fzF)));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(ResultKt.createFailure(new TYz((String) this.f10450b.getValue()))));
        }
        this.f10449W.set(null);
    }
}
