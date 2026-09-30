package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class gwv {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10506b = ICR.b(new byte[]{43, 78, 56, -2, 57, -10, -54, -43, 7, -114, -90, 40, 45, 97, -118, 94, 76, 62, -112, -119, 116, 77, Byte.MIN_VALUE, 105, -45, -88, 43, 110, 4, -80, 25, 15});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10505W = ICR.b(new byte[]{-89, 20, -51, 67, 49, -79, 27, 86, 85, -62, -110, 113, -3, -16, 57, 30, -45, -76, 2, -52, 14, 106, -88, -120, -15, -113, 116, 35, -85, 92, 0, 72});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10507f9 = ICR.b(new byte[]{-117, 108, -9, -43, -74, -118, 105, 120, -98, -2, 67, -56, 106, 114, 37, 39, -101, -26, 82, 116, -100, -103, 15, 33, -31, 78, -113, 87, 0, -122, -63, -98});
    public static final String sVU = ICR.b(new byte[]{-102, 90, -21, -26, -64, -27, 48, -45, -70, -44, 5, 65, -124, 31, -8, 22, 83, -98, 120, 86, -73, -17, 49, 66, -43, -115, -23, 65, -80, -44, -55, 126});
    public static final String gmP = ICR.b(new byte[]{-57, 42, 21, 0, 44, -77, Byte.MIN_VALUE, 124, -95, 44, -102, -26, -25, 7, 83, 93, -123, 18, 103, -96, -90, -8, 99, -91, -50, 48, 23, -98, -64, 116, 90, -20});

    /* renamed from: J, reason: collision with root package name */
    public static final String f10503J = ICR.b(new byte[]{48, 48, 31, -93, -64, 11, 71, 7, 99, -38, Byte.MIN_VALUE, 38, -68, -13, 29, 51, -77, -26, -3, 51, 30, 90, 105, 68, -68, -47, 38, -92, 93, -67, -27, -44});
    public static final String PqK = ICR.b(new byte[]{108, 45, -84, 37, 114, -109, -49, 84, -7, 119, -15, -126, 19, 105, 120, -88, 108, -32, -54, 94, -21, 74, -34, -121, -30, 94, 30, 96, -92, -112, 54, 79});

    /* renamed from: V, reason: collision with root package name */
    public static final String f10504V = ICR.b(new byte[]{10, -98, 88, 87, 90, 92, -33, 81, -49, -59, 80, 51, -82, 96, -12, 47, -8, -102, 37, -64, 26, 83, 72, 113, -93, 26, -32, -122, -41, -109, -124, -53});

    public static JSONObject b(TL1 tl1) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f10506b, tl1.f9669b.longValue());
        jSONObject.put(f10505W, tl1.f9668W.longValue());
        jSONObject.put(f10507f9, tl1.f9670f9.longValue());
        String str = tl1.sVU;
        if (str != null) {
            jSONObject.put(sVU, str);
        }
        jSONObject.put(gmP, tl1.gmP.longValue());
        String str2 = tl1.f9666J;
        if (str2 != null) {
            jSONObject.put(f10503J, str2);
        }
        jSONObject.put(PqK, tl1.PqK.longValue());
        String str3 = tl1.f9667V;
        if (str3 != null) {
            jSONObject.put(f10504V, str3);
        }
        return jSONObject;
    }
}
