package com.incognia.internal;

import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class ll2 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10841W = LazyKt.lazy(id.f10627b);

    /* renamed from: b, reason: collision with root package name */
    public final Dm f10842b;

    public ll2(Dm dm) {
        this.f10842b = dm;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10841W.getValue();
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
            String str = (String) this.f10841W.getValue();
            Set b2 = this.f10842b.b();
            m206constructorimpl = Result.m206constructorimpl(new NmR(str, b2 != null ? CollectionsKt.z(b2) : null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
