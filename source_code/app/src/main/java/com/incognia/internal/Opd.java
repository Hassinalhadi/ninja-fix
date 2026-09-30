package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Opd {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9367b = ICR.b(new byte[]{42, 53, -119, -33, 20, 123, -40, 50, -58, 104, -101, -91, -50, 118, 116, 65, 58, -81, -81, 36, 82, -42, -117, -1, -100, 52, 75, -48, 95, -111, -50, 59});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9366W = ICR.b(new byte[]{77, 35, Byte.MAX_VALUE, -3, 53, 38, 58, -102, 44, 90, 52, 54, 35, -127, 61, 59, 35, 55, -102, -10, -84, 121, 13, 99, Byte.MAX_VALUE, -65, -124, 124, -14, 21, 97, -107});

    public static JSONObject b(LA0 la0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f9367b, la0.f9051b);
        jSONObject.put(f9366W, la0.f9050W);
        return jSONObject;
    }
}
