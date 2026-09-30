package com.incognia.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class f9I implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f10402b = LazyKt.lazy(pKn.f11070b);

    /* renamed from: W, reason: collision with root package name */
    public final AtomicReference f10401W = new AtomicReference();

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10402b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        OH oh = (OH) this.f10401W.get();
        if (oh != null) {
            Result.Companion companion = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(new kL((String) this.f10402b.getValue(), oh)));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            wa2.b(Result.m206constructorimpl(ResultKt.createFailure(new TYz((String) this.f10402b.getValue()))));
        }
        this.f10401W.set(null);
    }
}
