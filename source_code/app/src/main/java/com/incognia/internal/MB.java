package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class MB {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9106b = ICR.b(new byte[]{-82, 111, 48, -44, 45, -12, -110, 35, 49, 77, -15, -23, -30, 17, -105, -2, -107, 54, 7, 94, 55, -39, -110, 67, -14, 33, 22, 90, -88, -11, -84, -118});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9105W = ICR.b(new byte[]{85, -101, -78, -111, -97, -89, -58, 14, 45, -103, 41, 116, -18, -20, 38, 71, 50, -69, 75, -115, 125, -96, 36, -48, 51, -9, -80, -50, -77, 104, -98, 11});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9107f9 = ICR.b(new byte[]{103, -95, -31, 5, -37, -11, 99, 23, 33, 78, 51, -75, 122, 33, 85, 16, -2, 32, 120, -11, -11, -34, 75, 87, 69, -64, 116, -109, -15, -22, 9, -127});
    public static final String sVU = ICR.b(new byte[]{58, -87, -28, -38, -59, -31, -82, -77, 119, 9, -5, -98, -61, 105, 45, 56, -76, -77, -50, 89, -104, -111, -74, 55, 51, 109, 125, 54, -84, 24, -67, -16});

    public static JSONObject b(IlU ilU) {
        JSONObject jSONObject = new JSONObject();
        String str = ilU.f8918b;
        if (str != null) {
            jSONObject.put(f9106b, str);
        }
        String str2 = ilU.f8917W;
        if (str2 != null) {
            jSONObject.put(f9105W, str2);
        }
        Integer num = ilU.f8919f9;
        if (num != null) {
            jSONObject.put(f9107f9, num.intValue());
        }
        Float f5 = ilU.sVU;
        if (f5 != null) {
            jSONObject.put(sVU, f5);
        }
        return jSONObject;
    }
}
