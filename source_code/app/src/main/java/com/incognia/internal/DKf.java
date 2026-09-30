package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class DKf implements P0 {

    /* renamed from: f9, reason: collision with root package name */
    public static final String f8530f9 = (String) wGk.EH.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8531W = LazyKt.lazy(FF.f8654b);

    /* renamed from: b, reason: collision with root package name */
    public final S0A f8532b;

    public DKf(S0A s0a) {
        this.f8532b = s0a;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8531W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        ORV orv;
        try {
            Result.Companion companion = Result.INSTANCE;
            synchronized (qhx.f11164b) {
                ORV b2 = qhx.b();
                orv = new ORV(b2.f9307b, b2.f9306W);
                QHn.f9492b.b(qhx.f11163W, new ORV(), g6x.f10460b);
            }
            m206constructorimpl = Result.m206constructorimpl(new H5V((String) this.f8531W.getValue(), b(orv)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }

    public final ORV b(ORV orv) {
        int optInt = ((JSONObject) this.f8532b.f9574b.get()).optInt(f8530f9, 100);
        return (orv.f9307b.size() > optInt || orv.f9306W.size() > optInt) ? new ORV(CollectionsKt.s(optInt, orv.f9307b), CollectionsKt.s(optInt, orv.f9306W)) : orv;
    }
}
