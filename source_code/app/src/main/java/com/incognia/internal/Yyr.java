package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Yyr {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10015b = ICR.b(new byte[]{-35, 67, 68, -111, 109, -93, 114, -24, -104, 21, -116, -115, -127, 24, 20, -2, 70, 105, 66, 57, 59, 105, 37, 90, -30, 2, 48, 2, 106, 54, 29, -4});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10014W = ICR.b(new byte[]{-116, -66, 116, -87, 13, 39, 4, -110, 20, 32, -121, -109, -122, -28, 12, -103, -33, -113, -32, -113, -88, -101, -26, 22, 79, -12, 6, -75, -116, 32, -69, -107});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10016f9 = ICR.b(new byte[]{23, -50, 76, -31, -35, -122, -94, 8, 12, -25, 74, 34, 79, -17, 52, -41, 87, -31, Byte.MAX_VALUE, -92, 115, -118, -83, -81, -1, 18, 125, 14, -27, 101, 35, -124});
    public static final String sVU = ICR.b(new byte[]{-94, 15, -101, -98, -104, -120, -82, 93, 100, -11, 17, 83, 43, -122, -109, 85, -81, -76, -80, 45, 4, 69, -111, -14, -25, 114, 31, -116, -41, 39, 114, -83});

    public static JSONObject b(s8 s8Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f10015b, s8Var.f11266b);
        jSONObject.put(f10014W, s8Var.f11265W);
        jSONObject.put(f10016f9, s8Var.f11267f9);
        jSONObject.put(sVU, s8Var.sVU);
        return jSONObject;
    }
}
