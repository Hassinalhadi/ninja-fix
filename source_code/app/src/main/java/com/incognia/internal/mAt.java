package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class mAt {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10889b = ICR.b(new byte[]{-76, -63, -118, 69, 13, 31, -123, -70, 118, -28, -32, 85, 20, -31, -117, -107, 83, 35, -57, -101, 47, 79, 119, -124, -119, -26, 79, -54, -21, -67, -44, -56});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10888W = ICR.b(new byte[]{-77, 88, 117, -11, -110, 65, -37, -38, -93, 76, 0, -77, 121, -104, -82, 110, 36, -86, -17, -66, 102, 27, 5, -40, 29, -90, 22, -105, 86, 82, 62, 4});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10890f9 = ICR.b(new byte[]{-6, 17, 113, -21, 67, 12, -58, 74, -11, -81, 116, -115, 26, 83, 119, 0, 116, 100, 32, 79, 110, 93, 97, 90, 49, -92, 31, 56, 118, 110, 100, 96});
    public static final String sVU = ICR.b(new byte[]{55, -7, -13, -49, 53, 47, -22, -119, -22, -86, -112, 85, -60, 1, -61, -71, 30, 104, 28, -78, -104, 92, -76, 1, 20, 15, 36, 125, -81, -64, -16, -9});
    public static final String gmP = ICR.b(new byte[]{74, -62, 70, 51, 21, 26, -13, -91, -20, 58, 4, 4, 81, -56, 44, 22, -124, 39, 86, -76, 121, 11, 87, 30, -125, -37, -121, 30, -64, 84, 109, -17});

    /* renamed from: J, reason: collision with root package name */
    public static final String f10886J = ICR.b(new byte[]{-120, -74, -46, -109, -57, -14, -123, 123, -13, 11, -13, -97, -100, Byte.MIN_VALUE, -101, -17, -39, -73, 108, -117, -11, -98, -83, -17, 86, -104, 117, -58, -46, 80, 110, 58});
    public static final String PqK = ICR.b(new byte[]{-42, -79, -85, 100, 30, 91, 38, -17, -85, -116, 109, -48, -35, -93, 2, -4, 100, -64, -28, 16, -47, 13, -15, -34, -55, -67, 81, 115, Byte.MIN_VALUE, -22, 100, -98});

    /* renamed from: V, reason: collision with root package name */
    public static final String f10887V = ICR.b(new byte[]{2, -81, 115, 100, 104, -102, -75, -62, -75, 20, 42, -124, -2, 30, -101, 25, -99, -69, 43, 64, 68, 117, 2, 7, -62, -3, -50, -19, -117, -124, -126, -68, -1, -32, -41, 20, -116, -10, 123, 78, -40, -22, -94, 99, 114, -99, 114, 57});
    public static final String olU = ICR.b(new byte[]{88, -126, 101, -78, -70, 68, 26, 77, -115, -62, 15, -9, -25, 42, -45, 67, 13, 61, 74, 47, -76, -104, 120, -29, Byte.MAX_VALUE, -127, -21, 27, -37, -4, 29, -57});

    public static JSONObject b(ipD ipd) {
        JSONObject jSONObject = new JSONObject();
        Integer num = ipd.f10638b;
        if (num != null) {
            jSONObject.put(f10889b, num.intValue());
        }
        String str = ipd.f10637W;
        if (str != null) {
            jSONObject.put(f10888W, str);
        }
        Integer num2 = ipd.f10639f9;
        if (num2 != null) {
            jSONObject.put(f10890f9, num2.intValue());
        }
        String str2 = ipd.sVU;
        if (str2 != null) {
            jSONObject.put(sVU, str2);
        }
        Boolean bool = ipd.gmP;
        if (bool != null) {
            jSONObject.put(gmP, bool.booleanValue());
        }
        Integer num3 = ipd.f10635J;
        if (num3 != null) {
            jSONObject.put(f10886J, num3.intValue());
        }
        Integer num4 = ipd.PqK;
        if (num4 != null) {
            jSONObject.put(PqK, num4.intValue());
        }
        Boolean bool2 = ipd.f10636V;
        if (bool2 != null) {
            jSONObject.put(f10887V, bool2.booleanValue());
        }
        Long l10 = ipd.olU;
        if (l10 != null) {
            jSONObject.put(olU, l10.longValue());
        }
        return jSONObject;
    }
}
