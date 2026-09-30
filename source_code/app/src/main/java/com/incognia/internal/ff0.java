package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ff0 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10430b = ICR.b(new byte[]{-102, 97, -125, -75, -99, 112, -48, 125, 87, -20, -17, 111, 18, -35, 79, -43, 16, 119, 67, 1, -84, 109, -124, -62, -99, -12, 36, Byte.MIN_VALUE, -55, 46, -38, 7});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10429W = ICR.b(new byte[]{72, -21, 27, 90, -81, 87, -82, -27, 115, 74, 20, 120, 41, 113, 16, 85, 41, -9, -113, -14, -93, -20, -126, 88, 99, -93, -82, -1, 56, 19, -106, 9});

    public static JSONObject b(pBF pbf) {
        JSONObject jSONObject = new JSONObject();
        String str = pbf.f11057b;
        if (str != null) {
            jSONObject.put(f10430b, str);
        }
        String str2 = pbf.f11056W;
        if (str2 != null) {
            jSONObject.put(f10429W, str2);
        }
        return jSONObject;
    }
}
