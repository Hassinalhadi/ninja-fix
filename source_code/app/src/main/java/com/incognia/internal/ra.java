package com.incognia.internal;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class ra implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f11238W = LazyKt.lazy(u.f11429b);

    /* renamed from: b, reason: collision with root package name */
    public final K f11239b;

    public ra(K k6) {
        this.f11239b = k6;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11238W.getValue();
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
            String lowerCase = this.f11239b.b().b().toLowerCase(Locale.ROOT);
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) wGk.f11649R.getValue(), lowerCase, new Hnm(new nX(lowerCase))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
