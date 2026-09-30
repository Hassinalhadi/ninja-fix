package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class wKf implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f11743W = LazyKt.lazy(Kk.f9021b);

    /* renamed from: b, reason: collision with root package name */
    public final dGS f11744b;

    public wKf(dGS dgs) {
        this.f11744b = dgs;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11743W.getValue();
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
            Boolean bool = (Boolean) this.f11744b.f10305b.get();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f11743W.getValue(), bool, new pFh(new xa(bool))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
