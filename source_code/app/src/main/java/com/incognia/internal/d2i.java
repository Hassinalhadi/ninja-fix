package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class d2i {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10275b = ICR.b(new byte[]{58, 3, -20, 112, -109, 104, -118, 3, -55, -40, -96, -42, 114, -118, 71, 20, -121, -81, 37, -84, 51, -20, -104, -10, 125, 89, -98, -14, -1, -44, 73, 85});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10274W = ICR.b(new byte[]{-89, -37, -123, -89, -108, 69, -6, 50, -27, 16, -83, 37, -7, -27, 104, -106, 15, 97, 55, -106, -83, -13, -47, 29, -99, 101, 12, 66, -71, -31, -38, -72});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10276f9 = ICR.b(new byte[]{17, 121, -26, -81, 124, -54, -81, -126, 105, 21, 56, -95, -115, -11, 56, 38, -115, -49, -5, -92, -63, 77, 62, 111, 28, -77, 118, 118, -7, 60, -5, 108});
    public static final String sVU = ICR.b(new byte[]{78, 102, 4, 20, 74, -4, 19, -86, 47, -17, -117, -36, 84, -61, -103, -13, -111, -106, 90, -31, -96, 56, Byte.MAX_VALUE, 115, 0, 105, -50, -116, -13, -8, 57, -56});

    public static JSONObject b(bXV bxv) {
        JSONObject jSONObject = new JSONObject();
        String str = bxv.f10188b;
        if (str != null) {
            jSONObject.put(f10275b, str);
        }
        jSONObject.put(f10274W, bxv.f10187W);
        jSONObject.put(f10276f9, 70901);
        jSONObject.put(sVU, 1776277729192L);
        return jSONObject;
    }
}
