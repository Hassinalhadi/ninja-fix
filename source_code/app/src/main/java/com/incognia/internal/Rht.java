package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Rht {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9557b = ICR.b(new byte[]{-9, -50, -121, -11, 33, -16, 103, 89, -10, -60, 53, 120, 6, -28, -58, -122, -67, 69, 47, -66, Byte.MAX_VALUE, -58, -124, 99, 82, -72, 57, 15, -1, -64, -57, -63});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9556W = ICR.b(new byte[]{8, 19, 67, -22, 35, 74, -111, -39, 29, 121, 90, -12, 15, Byte.MIN_VALUE, 47, 118, Byte.MIN_VALUE, 109, -60, -11, -19, 92, -81, -126, 123, -90, 14, -109, 105, 119, -19, -102});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9558f9 = ICR.b(new byte[]{-90, 63, -52, -30, -30, -81, -109, 102, 23, -35, -64, -38, -32, 88, 57, 79, -59, Byte.MAX_VALUE, -115, 84, -127, -17, 87, -98, -4, -62, 36, -91, -43, -40, -43, -96, -94, 108, 89, 52, 118, 69, -104, -13, 72, -62, 125, 93, -27, -124, -85, 56});

    public static JSONObject b(hW4 hw4) {
        JSONObject jSONObject = new JSONObject();
        String str = hw4.f10545b;
        if (str != null) {
            jSONObject.put(f9557b, str);
        }
        String str2 = hw4.f10544W;
        if (str2 != null) {
            jSONObject.put(f9556W, str2);
        }
        String str3 = hw4.f10546f9;
        if (str3 != null) {
            jSONObject.put(f9558f9, str3);
        }
        return jSONObject;
    }
}
