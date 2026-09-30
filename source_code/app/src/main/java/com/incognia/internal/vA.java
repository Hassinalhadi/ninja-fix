package com.incognia.internal;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vA extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final vA f11534b = new vA();

    public vA() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = GbW.f8794b;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : ((P6) obj).f9388b.entrySet()) {
            jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        jSONObject.put(GbW.f8794b, jSONObject2);
        return jSONObject;
    }
}
