package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class TBu {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9642b = ICR.b(new byte[]{-120, 83, 44, 117, 78, -64, -29, -38, -3, 99, -66, 28, -10, 36, -111, -64, 14, 29, 123, 113, 65, 72, -84, 94, 89, -41, 16, -65, -3, 109, 125, 113});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9641W = ICR.b(new byte[]{-58, 88, 11, 29, 20, 86, 1, -32, 65, -42, -11, -97, -76, 4, 63, -106, -81, 41, -10, -126, -41, -92, 45, -101, -100, -80, 91, -127, -70, 100, 45, 58});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9643f9 = ICR.b(new byte[]{74, -72, -4, 101, 33, 2, 105, 110, -24, 73, -60, 77, -120, -75, 50, 90, 89, 18, -53, Byte.MIN_VALUE, -63, 41, -122, -122, -66, -45, -39, -115, -84, 121, -79, -5});
    public static final String sVU = ICR.b(new byte[]{14, 87, -103, -38, -68, 5, 12, 120, -71, -89, -101, -106, 16, 75, -58, -87, -121, -74, 5, 1, 95, 120, 28, -44, 18, -23, 85, 112, -88, 44, -105, -7});

    public static JSONObject b(fKw fkw) {
        JSONObject jSONObject = new JSONObject();
        String str = fkw.f10409b;
        if (str != null) {
            jSONObject.put(f9642b, str);
        }
        String str2 = fkw.f10408W;
        if (str2 != null) {
            jSONObject.put(f9641W, str2);
        }
        Integer num = fkw.f10410f9;
        if (num != null) {
            jSONObject.put(f9643f9, num.intValue());
        }
        String str3 = fkw.sVU;
        if (str3 != null) {
            jSONObject.put(sVU, str3);
        }
        return jSONObject;
    }
}
