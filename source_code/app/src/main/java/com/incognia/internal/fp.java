package com.incognia.internal;

import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class fp implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public static final String f10439W = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f10440b = LazyKt.lazy(W1.f9817b);

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10440b.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f10440b.getValue(), f10439W, new Hnm(kgB.f10776b)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
