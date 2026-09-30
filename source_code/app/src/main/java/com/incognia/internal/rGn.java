package com.incognia.internal;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class rGn implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Ssq f11213W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11214b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11215f9 = LazyKt.lazy(byg.f10219b);
    public final F4x sVU = new F4x();

    public rGn(Context context, Ssq ssq) {
        this.f11214b = context;
        this.f11213W = ssq;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11215f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        Wi wi;
        try {
            Result.Companion companion = Result.INSTANCE;
            r3 b2 = this.f11213W.b();
            if (b2 == null) {
                wi = new Wi((String) this.f11215f9.getValue(), null);
            } else {
                this.sVU.getClass();
                long j5 = b2.f11200b;
                long j6 = b2.f11198W;
                long j7 = b2.f11201f9;
                String str = b2.f11195P;
                String str2 = b2.f11194L;
                wi = new Wi((String) this.f11215f9.getValue(), new D(j5, j6, j7, str, b2.DOu, b2.f11196R, this.f11214b.getApplicationInfo().className, b2.f11202n9, str2));
            }
            m206constructorimpl = Result.m206constructorimpl(wi);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
