package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class X4G {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9887b = ICR.b(new byte[]{-42, 105, -37, 73, 62, -108, 19, 27, 82, 79, -16, 47, -74, -11, -95, 124, -110, 98, 68, 27, 69, 61, 78, -49, -45, 85, -78, 21, 124, 31, 75, 112});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9886W = ICR.b(new byte[]{-101, 1, -58, 116, -77, -22, 106, -33, 123, 15, -82, -69, -110, 55, 67, 9, -77, -38, 21, 82, -26, -24, -90, 50, -13, -98, -98, 16, -91, 97, 21, 16});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9888f9 = ICR.b(new byte[]{-123, -109, -29, -38, 0, 50, 25, 78, 104, -104, -27, -123, 90, -55, -47, -25, 122, 9, -105, -43, -60, -83, 12, 50, -31, -4, 120, -54, 17, 57, -40, -5});
    public static final String sVU = ICR.b(new byte[]{46, 53, 38, -35, -37, -92, -39, -62, -75, -32, -110, 57, 125, 82, -88, -10, -58, 24, -55, -97, -67, -19, 11, 47, -19, -19, -123, 49, -78, 96, -6, 39});
    public static final String gmP = ICR.b(new byte[]{-82, 2, -40, -10, -115, -91, -126, 89, -90, -78, 48, -96, -95, -12, 109, -79, -74, 76, 126, 103, -122, -23, -59, 79, -4, 7, 23, -52, -120, 52, -86, -30});

    /* renamed from: J, reason: collision with root package name */
    public static final String f9884J = ICR.b(new byte[]{-98, -67, -85, 28, -71, 107, 36, -99, 22, 52, 65, -74, 32, 113, -87, -116, -2, 80, -67, 107, 54, 63, -67, -108, 30, -114, 37, -126, 88, -23, -29, 51});
    public static final String PqK = ICR.b(new byte[]{81, 107, -29, -19, 100, 20, -7, 103, 41, -16, 99, 77, -122, -10, -30, -2, 121, 66, -100, 3, -90, 114, -125, -17, 91, 68, 66, 40, -111, -7, -106, -63});

    /* renamed from: V, reason: collision with root package name */
    public static final String f9885V = ICR.b(new byte[]{-109, 14, 38, 83, -3, -73, 71, 62, -123, -22, -127, -32, -117, 57, 61, 32, -35, -15, -88, -37, 91, -6, 108, 78, -51, 42, 80, 14, -96, -95, 83, -99});
    public static final String olU = ICR.b(new byte[]{20, -80, 71, -40, -35, -10, 88, 17, -57, 104, 79, 124, -20, 77, -88, 118, 96, 32, -14, 97, -72, 36, 88, 115, -66, -67, -58, -24, 59, -26, 22, 7});

    public static JSONObject b(D d4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f9887b, d4.f8509b);
        jSONObject.put(f9886W, d4.f8508W);
        jSONObject.put(f9888f9, d4.f8510f9);
        String str = d4.sVU;
        if (str != null) {
            jSONObject.put(sVU, str);
        }
        String str2 = d4.gmP;
        if (str2 != null) {
            jSONObject.put(gmP, str2);
        }
        String str3 = d4.f8506J;
        if (str3 != null) {
            jSONObject.put(f9884J, str3);
        }
        String str4 = d4.PqK;
        if (str4 != null) {
            jSONObject.put(PqK, str4);
        }
        String str5 = d4.f8507V;
        if (str5 != null) {
            jSONObject.put(f9885V, str5);
        }
        String str6 = d4.olU;
        if (str6 != null) {
            jSONObject.put(olU, str6);
        }
        return jSONObject;
    }
}
