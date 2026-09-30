package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class CN1 {

    /* renamed from: W, reason: collision with root package name */
    public static final String f8446W = (String) wGk.f11611D.getValue();

    /* renamed from: b, reason: collision with root package name */
    public final S0A f8447b;

    public CN1(S0A s0a) {
        this.f8447b = s0a;
    }

    public final boolean b() {
        S0A s0a = this.f8447b;
        return ((JSONObject) s0a.f9574b.get()).optBoolean(f8446W, true);
    }
}
