package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class bb {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10191b = ICR.b(new byte[]{12, -1, -25, -68, 10, -7, 45, -55, -70, 115, 19, 38, 37, 8, -2, 64, -37, 72, -46, -42, 97, -77, -74, 97, -101, -103, -36, -104, -66, 119, 50, 83});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10190W = ICR.b(new byte[]{-3, -6, -76, -37, -48, 96, 123, -12, -28, 43, 1, 62, -105, 35, -54, -2, 98, -67, 126, 73, 1, 81, -45, -90, 55, 71, -67, 65, -52, -88, -105, 85});

    public static JSONObject b(Y2r y2r) {
        JSONObject jSONObject = new JSONObject();
        String str = y2r.f9976b;
        if (str != null) {
            jSONObject.put(f10191b, str);
        }
        String str2 = y2r.f9975W;
        if (str2 != null) {
            jSONObject.put(f10190W, str2);
        }
        return jSONObject;
    }
}
