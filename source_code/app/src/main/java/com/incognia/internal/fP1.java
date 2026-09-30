package com.incognia.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class fP1 implements sX {

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10413f9 = (String) wGk.ZOi.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final AtomicBoolean f10414W = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final lhI f10415b;

    public fP1(lhI lhi) {
        this.f10415b = lhi;
    }

    @Override // com.incognia.internal.sX
    public final void b(S0A s0a) {
        this.f10414W.set(((JSONObject) s0a.f9574b.get()).optBoolean(f10413f9, false));
    }
}
