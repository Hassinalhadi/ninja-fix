package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class yOi {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11861b = ICR.b(new byte[]{75, -40, -126, -64, 25, 44, -1, -61, 25, -12, 16, 124, -22, -18, -46, 3, -107, -110, 25, -64, 57, 88, 30, -55, 12, -116, 114, 67, 121, -117, 101, 4});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11860W = ICR.b(new byte[]{49, 52, -68, 64, 34, 110, 122, -5, -33, 58, -112, 86, -68, 93, 22, 68, -79, -43, 119, -91, 121, -6, 51, -92, 4, -2, 109, -126, -57, -82, 32, -55});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11862f9 = ICR.b(new byte[]{2, -85, -45, 68, -95, -89, 17, 102, 93, 48, -81, 38, 1, -92, 34, -66, -73, 61, 6, 86, 17, -78, 126, 63, -25, 74, 26, -17, -94, 38, 119, -76});
    public static final String sVU = ICR.b(new byte[]{108, -36, 125, -94, -117, -90, 3, -54, -69, 83, -86, 111, 109, 91, -121, 11, 9, 126, -126, 47, -86, 11, -81, 114, 35, -106, -44, -51, -112, -71, 17, 73});
    public static final String gmP = ICR.b(new byte[]{-114, -27, 105, 61, -69, -123, -100, 76, -12, 21, -48, 87, -101, Byte.MIN_VALUE, 25, 41, -109, 99, 36, -79, -75, -24, 60, 67, 57, 88, 43, -33, -19, 21, 71, 0});

    /* renamed from: J, reason: collision with root package name */
    public static final String f11859J = ICR.b(new byte[]{59, 26, 34, 12, 5, -67, 120, -102, -27, 84, -38, -96, 68, -35, -86, 14, 76, 82, -68, -76, -54, 88, -4, 6, 38, 45, -103, -12, -125, 0, 16, 5});

    public static JSONObject b(GW gw) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f11861b, gw.f8787b.intValue());
        jSONObject.put(f11860W, gw.f8786W.intValue());
        jSONObject.put(f11862f9, gw.f8788f9.intValue());
        jSONObject.put(sVU, gw.sVU.intValue());
        jSONObject.put(gmP, gw.gmP.intValue());
        jSONObject.put(f11859J, gw.f8785J.intValue());
        return jSONObject;
    }
}
