package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class uXH {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11480b = ICR.b(new byte[]{-44, -47, -123, -91, 38, 18, 15, -106, -89, -12, -104, -77, -75, 110, -69, 70, -117, -118, 52, 116, 47, -58, 45, -81, 28, 99, -35, 126, -9, 12, 26, -2});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11479W = ICR.b(new byte[]{39, -94, 126, 112, -88, -2, -124, 3, 31, -81, -96, 30, -68, -115, 33, 42, -93, -63, 99, 82, 35, 101, -25, -120, -81, -24, -84, Byte.MIN_VALUE, -42, -67, -60, 109});

    public static JSONObject b(FCF fcf) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f11480b, fcf.f8652b.booleanValue());
        jSONObject.put(f11479W, fcf.f8651W.booleanValue());
        return jSONObject;
    }
}
