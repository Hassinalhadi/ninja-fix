package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class uNM {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11464b = ICR.b(new byte[]{-121, 113, 107, 59, -6, -40, 37, 83, -108, 24, -95, 119, 17, 94, 117, -75, 90, 105, -6, 29, 28, Byte.MAX_VALUE, -36, 25, 108, 78, 73, 118, 63, -95, 74, 111});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11463W = ICR.b(new byte[]{-4, 1, -102, 67, -103, -119, 125, -97, -100, -10, -117, -100, Byte.MIN_VALUE, -4, 22, 91, -41, -62, 61, 108, 9, 119, -4, 98, 125, 16, -98, 61, 39, -86, -38, 118});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11465f9 = ICR.b(new byte[]{126, -86, 25, -2, 92, -8, -34, -48, 54, 65, 91, -48, 119, -39, -74, -11, -111, -33, 42, -66, -13, -64, 37, 49, 56, -27, -92, Byte.MAX_VALUE, 22, -61, 123, 39});
    public static final String sVU = ICR.b(new byte[]{-42, -68, 96, 115, -16, 55, 105, 55, 111, 64, 54, -35, -66, 15, -100, -112, -75, -106, 82, 59, -8, 13, -88, 50, 63, -99, -53, -121, -21, 35, -96, -105});
    public static final String gmP = ICR.b(new byte[]{-10, -86, -18, -19, -4, 7, -91, -64, 116, 83, 2, -16, -39, -112, -81, 16, -26, 97, 89, 86, -122, 14, 20, -105, -102, -41, 30, 96, -6, -43, -122, Byte.MAX_VALUE});

    /* renamed from: J, reason: collision with root package name */
    public static final String f11461J = ICR.b(new byte[]{119, 20, -13, -68, 26, -54, -84, -122, 24, -32, 68, -101, -60, -42, -24, -98, -24, 55, 42, 117, -9, -32, 68, -66, 71, -22, 25, -30, -37, Byte.MIN_VALUE, Byte.MAX_VALUE, -7});
    public static final String PqK = ICR.b(new byte[]{-78, 76, 44, 54, 113, 104, 119, -37, 71, 20, 87, -47, 108, -71, 9, 65, -17, -97, 41, -87, -53, -116, -86, -89, -111, -48, 18, 34, 60, -70, -47, 67});

    /* renamed from: V, reason: collision with root package name */
    public static final String f11462V = ICR.b(new byte[]{95, -112, 38, -53, -18, 96, -21, 65, 96, 25, 95, 81, 41, -83, -24, -8, 58, 56, -36, -22, -6, -70, 89, 89, -37, 121, -109, -122, 19, 34, -13, -84});
    public static final String olU = ICR.b(new byte[]{-78, 104, 31, -2, 9, 120, -32, -67, -34, 13, -125, 2, 110, -1, -67, -44, 60, 82, 49, -52, -111, -47, 93, -34, -39, 47, -107, Byte.MIN_VALUE, 49, -60, 1, -20});

    public static JSONObject b(MM mm) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f11464b, mm.f9116b);
        jSONObject.put(f11463W, mm.f9115W);
        jSONObject.put(f11465f9, mm.f9117f9);
        jSONObject.put(sVU, mm.sVU);
        jSONObject.put(gmP, mm.gmP);
        String str = mm.f9113J;
        if (str != null) {
            jSONObject.put(f11461J, str);
        }
        String str2 = mm.PqK;
        if (str2 != null) {
            jSONObject.put(PqK, str2);
        }
        Integer num = mm.f9114V;
        if (num != null) {
            jSONObject.put(f11462V, num.intValue());
        }
        Boolean bool = mm.olU;
        if (bool != null) {
            jSONObject.put(olU, bool.booleanValue());
        }
        return jSONObject;
    }
}
