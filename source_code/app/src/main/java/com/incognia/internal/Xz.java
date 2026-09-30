package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Xz extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Xz f9973b = new Xz();

    public Xz() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 s0Var = (s0) obj;
        String str = Kdw.f9016b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Kdw.f9016b, s0Var.f11255b);
        jSONObject.put(Kdw.f9015W, s0Var.f11254W);
        return jSONObject;
    }
}
