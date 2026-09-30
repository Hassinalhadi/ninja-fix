package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class v05 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11514b = ICR.b(new byte[]{-86, -48, -32, 95, -113, -125, -115, -22, -83, 120, 54, 97, 99, -54, 84, -37, -9, -78, 51, 108, -35, 75, -126, -17, 117, -81, 109, -62, 98, -98, 101, 111});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11513W = ICR.b(new byte[]{-74, 99, -107, -90, 80, 84, -90, 72, 64, 64, -22, -112, 65, 2, 61, -31, -101, 2, -66, -90, 97, 75, -53, -118, -82, 83, 47, -118, -103, -90, -56, 38});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11515f9 = ICR.b(new byte[]{82, 86, 69, -60, -24, -123, 10, 47, 5, -4, -3, 39, -48, 55, -48, -69, 16, 79, 116, -112, 76, -81, 11, 7, -5, 67, 47, -21, -100, -76, 71, 33});
    public static final String sVU = ICR.b(new byte[]{60, -116, 7, -118, 48, 78, 47, 20, -30, 104, 91, -97, 104, 36, -112, 38, -121, -23, -114, 54, -13, -103, -21, 48, -96, 77, -48, Byte.MAX_VALUE, 83, -124, 65, -95});
    public static final String gmP = ICR.b(new byte[]{77, -12, 59, 123, -34, 94, 84, -30, -22, -92, 106, -118, -125, -37, -57, Byte.MIN_VALUE, -119, 41, -96, -10, -126, 109, 65, 47, 47, -65, 34, -24, -72, 13, -23, 116});

    /* renamed from: J, reason: collision with root package name */
    public static final String f11512J = ICR.b(new byte[]{71, -37, 56, 99, -57, -60, -32, 69, 114, 12, -14, 0, -100, -108, 38, -6, -19, 65, 33, -50, 75, -118, -116, -15, 25, 70, -67, 3, 59, -42, 20, 26});
    public static final String PqK = ICR.b(new byte[]{84, -39, -80, -83, -14, -102, 107, 34, 95, -18, 73, -2, 51, -34, -63, 100, 84, 121, 16, 112, -67, -102, -39, -107, 7, 32, 103, 1, 33, 52, -119, 94});

    public static JSONObject b(K0 k02) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f11514b, k02.f8980b);
        Boolean bool = k02.f8979W;
        if (bool != null) {
            jSONObject.put(f11513W, bool.booleanValue());
        }
        Long l10 = k02.f8981f9;
        if (l10 != null) {
            jSONObject.put(f11515f9, l10.longValue());
        }
        Long l11 = k02.sVU;
        if (l11 != null) {
            jSONObject.put(sVU, l11.longValue());
        }
        Boolean bool2 = k02.gmP;
        if (bool2 != null) {
            jSONObject.put(gmP, bool2.booleanValue());
        }
        Long l12 = k02.f8978J;
        if (l12 != null) {
            jSONObject.put(f11512J, l12.longValue());
        }
        Long l13 = k02.PqK;
        if (l13 != null) {
            jSONObject.put(PqK, l13.longValue());
        }
        return jSONObject;
    }
}
