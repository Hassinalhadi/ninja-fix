package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ALD {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8355b = ICR.b(new byte[]{-119, -111, -52, 26, -65, -71, -90, -14, 15, 29, 22, 8, 85, -11, -62, 53, 109, -100, -110, 68, 46, 109, -72, 77, 12, -62, 85, -8, -112, 1, -9, -65});

    /* renamed from: W, reason: collision with root package name */
    public static final String f8354W = ICR.b(new byte[]{-60, 19, -104, -39, -36, 81, 30, 109, 30, 12, -95, 42, 76, -23, -104, -90, 5, 74, -78, -56, -64, -117, 94, -122, 40, -65, -56, 72, -3, 109, -54, -16});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f8356f9 = ICR.b(new byte[]{53, -39, -102, 112, 33, 73, 57, 7, -112, -56, 16, 76, 113, 106, 96, -18, 26, -84, 99, 91, 28, 118, 111, 19, 25, 101, -1, -96, -38, 52, 49, -37});
    public static final String sVU = ICR.b(new byte[]{67, 110, 126, -8, -50, -119, -68, 105, 102, 48, 98, -33, -46, -104, 117, 117, -46, -104, -64, -86, -103, -100, 20, 53, -43, 59, 26, -38, -62, -49, 13, 73});

    public static JSONObject b(HLa hLa) {
        JSONObject jSONObject = new JSONObject();
        String str = hLa.f8836b;
        if (str != null) {
            jSONObject.put(f8355b, str);
        }
        String str2 = hLa.f8835W;
        if (str2 != null) {
            jSONObject.put(f8354W, str2);
        }
        String str3 = hLa.f8837f9;
        if (str3 != null) {
            jSONObject.put(f8356f9, str3);
        }
        Integer num = hLa.sVU;
        if (num != null) {
            jSONObject.put(sVU, num.intValue());
        }
        return jSONObject;
    }
}
