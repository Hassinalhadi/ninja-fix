package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class MXa {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9136b = ICR.b(new byte[]{-125, -99, 116, -33, 46, -36, 58, -76, -91, 94, -18, -4, -123, -38, 56, 99, 96, 93, 86, 116, -54, -57, 51, 85, -36, -29, -107, -26, -113, 92, 85, 91});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9135W = ICR.b(new byte[]{0, 96, -105, 51, -111, -45, 70, 18, -111, -27, 65, -66, -94, 94, -91, 122, -108, 88, 116, -34, -116, 69, -20, -97, -22, 114, 80, 76, -20, 68, -69, -23});

    public static JSONObject b(N6W n6w) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f9136b, n6w.f9183b);
        jSONObject.put(f9135W, n6w.f9182W);
        return jSONObject;
    }
}
