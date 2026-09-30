package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Unn {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9732b = ICR.b(new byte[]{-29, 74, -4, -94, -127, 100, -61, -95, -26, 50, -7, 121, 20, -91, 76, 9, 19, 64, 25, -112, 89, 37, 8, 22, 32, 65, -63, 21, -19, 70, 5, 109});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9731W = ICR.b(new byte[]{73, -61, -75, 35, 79, 78, -54, -49, 6, -109, 25, 119, -8, -119, -31, 12, -100, 69, -98, -35, -63, -81, -96, -107, 41, 39, -106, 45, 22, -34, -2, 33});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9733f9 = ICR.b(new byte[]{35, -91, -80, 103, 121, -44, 117, -97, 40, -39, -102, -121, -68, -127, -17, -107, 77, -42, 112, -54, -5, 14, -47, 60, -103, 69, -69, -101, 41, -95, -26, -86});
    public static final String sVU = ICR.b(new byte[]{26, -69, 19, -82, 40, -108, 34, -123, -121, 32, 14, -79, -45, -91, 81, -25, 7, 118, -86, 126, -70, 87, -3, 101, 65, -91, 14, 108, -24, -87, -78, 94});

    public static JSONObject b(oVD ovd) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f9732b, ovd.f11022b);
        jSONObject.put(f9731W, ovd.f11021W);
        Long l10 = ovd.f11023f9;
        if (l10 != null) {
            jSONObject.put(f9733f9, l10.longValue());
        }
        jSONObject.put(sVU, ovd.sVU);
        return jSONObject;
    }
}
