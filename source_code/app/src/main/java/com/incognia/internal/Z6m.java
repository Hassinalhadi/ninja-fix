package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Z6m {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10026b = ICR.b(new byte[]{-108, 10, 12, -84, -33, 53, -117, 27, 42, 101, -12, 56, -45, 110, 125, 115, 67, -64, -26, -76, 21, 70, -47, -75, -35, 44, 26, 70, -78, 124, 115, -104});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10025W = ICR.b(new byte[]{2, 75, -17, -4, -39, -36, 95, -48, -91, 6, -62, -80, -115, 69, -63, -1, -16, -125, 76, -58, 41, -117, 26, 108, 110, 114, 35, -37, 114, 105, 72, -54});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10027f9 = ICR.b(new byte[]{82, -51, -79, 106, 6, 123, -57, -114, 44, 22, 40, 62, 49, 113, -118, -22, -9, -58, -104, 98, 114, -114, 55, -91, 52, 43, 27, -38, 58, 125, 56, 99});
    public static final String sVU = ICR.b(new byte[]{94, 34, -66, 5, 87, 19, 88, -76, -5, 57, 112, 96, 17, -58, 111, 116, -41, 62, -90, 94, -88, 30, -94, 88, -58, 45, 14, -43, -44, -77, -75, -99});

    public static JSONObject b(OME ome) {
        JSONObject jSONObject = new JSONObject();
        String str = ome.f9300b;
        if (str != null) {
            jSONObject.put(f10026b, str);
        }
        String str2 = ome.f9299W;
        if (str2 != null) {
            jSONObject.put(f10025W, str2);
        }
        jSONObject.put(f10027f9, ome.f9301f9);
        jSONObject.put(sVU, ome.sVU);
        return jSONObject;
    }
}
