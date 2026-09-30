package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wc implements P0 {

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11753f9 = (String) wGk.f11691g.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f11754W = LazyKt.lazy(I4.f8882b);

    /* renamed from: b, reason: collision with root package name */
    public final S0A f11755b;

    public wc(gnv gnvVar, S0A s0a) {
        this.f11755b = s0a;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11754W.getValue();
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
            m206constructorimpl = Result.m206constructorimpl(new s7((String) wGk.Sn.getValue(), new Y2r(gnv.b(Tt.f9686b), ((JSONObject) this.f11755b.f9574b.get()).optBoolean(f11753f9, true) ? gnv.b(sP.f11296b) : null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
