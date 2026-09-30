package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Ink {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8921b = ICR.b(new byte[]{46, 59, 29, 16, 109, -69, 62, -115, 18, 123, 104, 12, -43, -8, -23, 21, -8, -75, 107, -5, 76, 93, -31, -55, 8, -81, 26, -113, -69, -21, 100, 47});

    /* renamed from: W, reason: collision with root package name */
    public static final String f8920W = ICR.b(new byte[]{-109, 91, -100, -74, 92, 125, 67, 33, -39, 111, -108, 49, 33, -48, -76, -117, -72, -84, -54, 29, -16, 44, -88, -42, 65, 57, -114, -48, -58, -2, 24, 113, 56, 88, 75, 1, -33, 55, 24, -98, -83, -7, 54, 103, -124, -124, -25, -102});

    public static JSONObject b(JBP jbp) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f8921b, jbp.f8936b.booleanValue());
        Boolean bool = jbp.f8935W;
        if (bool != null) {
            jSONObject.put(f8920W, bool.booleanValue());
        }
        return jSONObject;
    }
}
