package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class FZA extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final FZA f8714b = new FZA();

    public FZA() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SO so = (SO) obj;
        String str = u24.f11439b;
        JSONObject jSONObject = new JSONObject();
        Long l10 = so.f9595b;
        if (l10 != null) {
            jSONObject.put(u24.f11439b, l10.longValue());
        }
        Long l11 = so.f9594W;
        if (l11 != null) {
            jSONObject.put(u24.f11438W, l11.longValue());
        }
        return jSONObject;
    }
}
