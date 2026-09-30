package com.incognia.internal;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class XhM implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f9942b = LazyKt.lazy(J.f8929b);

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9942b.getValue();
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
            String lowerCase = ((iA) IZZ.f8909W.get()).b().toLowerCase(Locale.ROOT);
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) wGk.f11690f9.getValue(), lowerCase, new Hnm(new m(lowerCase))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
