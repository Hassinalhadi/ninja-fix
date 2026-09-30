package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11117b = ICR.b(new byte[]{86, 24, 87, -50, 41, -99, 75, -93, 60, -27, 83, 109, -109, 115, 49, 98, -80, -53, -39, -103, 85, -101, -40, 38, 14, -37, -62, -66, 46, 12, -25, 44, -36, 36, -11, -1, 3, 118, -33, 88, -41, 81, 27, -33, -74, -77, 17, 0});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11116W = ICR.b(new byte[]{75, 119, 53, 4, -45, 40, 87, 74, 63, 35, -6, 5, 79, 49, -12, -15, -86, 122, 15, 102, -107, 103, 4, -113, -24, 90, -71, -89, -125, 40, 48, 14, 63, -31, -1, 92, 92, -23, 56, -113, -25, -72, -74, -16, 41, -5, 104, 78});

    public static JSONObject b(N8 n82) {
        JSONObject jSONObject = new JSONObject();
        String str = n82.f9185b;
        if (str != null) {
            jSONObject.put(f11117b, str);
        }
        String str2 = n82.f9184W;
        if (str2 != null) {
            jSONObject.put(f11116W, str2);
        }
        return jSONObject;
    }
}
