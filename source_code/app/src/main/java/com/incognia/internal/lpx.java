package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class lpx {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10848b = ICR.b(new byte[]{-33, 3, -54, -78, 4, -27, -43, 46, 78, 8, 84, -111, 84, 37, 74, 74, 4, -101, 73, -37, 50, 28, 10, -82, -95, -74, 107, -49, -103, -114, 28, -52});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10847W = ICR.b(new byte[]{-107, 12, 34, 85, 108, -100, -116, 3, -116, 37, 27, 16, 75, 118, 18, -52, -23, 41, 121, -41, -7, 52, -121, -30, -57, 103, -77, -66, 97, 30, -115, 95});

    public static JSONObject b(gQi gqi) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f10848b, gqi.f10479b);
        jSONObject.put(f10847W, gqi.f10478W);
        return jSONObject;
    }
}
