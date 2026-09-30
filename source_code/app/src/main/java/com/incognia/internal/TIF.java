package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class TIF {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9655b = ICR.b(new byte[]{-58, -4, 29, -40, Byte.MIN_VALUE, -115, Byte.MAX_VALUE, -106, 93, 14, 74, 126, -57, -80, -112, -55, -124, -62, 77, -26, -63, 32, 65, -22, -19, 66, 93, -11, 92, -18, 1, 101});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9654W = ICR.b(new byte[]{51, 108, 76, -125, 33, Byte.MAX_VALUE, 11, -40, 102, 89, -52, -90, 95, -75, 4, 111, 121, 67, 68, -6, 77, 25, 6, 94, 60, -91, -63, -43, -22, -23, -111, 33});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9656f9 = ICR.b(new byte[]{47, 83, -55, -114, -104, 44, -65, -72, 113, 91, -51, -16, -101, 46, -82, 59, -85, 86, -71, 83, 68, 68, -35, -127, 41, 87, 124, 38, 69, 28, 93, -111});
    public static final String sVU = ICR.b(new byte[]{101, 73, -14, 7, -72, -43, 61, -65, -80, -94, -47, 59, -104, 30, -92, -25, -77, 83, -5, 20, 23, 41, -110, 2, 18, 66, -99, 33, 44, 55, 76, -2});

    public static JSONObject b(i3p i3pVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f9655b, i3pVar.f10604b);
        jSONObject.put(f9654W, i3pVar.f10603W);
        String str = i3pVar.f10605f9;
        if (str != null) {
            jSONObject.put(f9656f9, str);
        }
        String str2 = i3pVar.sVU;
        if (str2 != null) {
            jSONObject.put(sVU, str2);
        }
        return jSONObject;
    }
}
