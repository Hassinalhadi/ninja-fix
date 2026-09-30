package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class l8M {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10804b = ICR.b(new byte[]{-14, -79, 35, 0, 113, -126, 109, -79, -48, 83, 115, -33, 71, 24, 14, 61, -59, 100, 75, -33, -66, 92, -113, -67, -88, 16, 77, -125, -125, 15, -79, -17});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10803W = ICR.b(new byte[]{-18, 16, -100, -6, 2, -25, 74, 43, 96, -125, -35, 2, -81, 124, -124, 25, -109, -84, -38, -83, 116, 16, 117, 91, -100, -47, 21, 30, -7, -28, 79, -52});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10805f9 = ICR.b(new byte[]{-60, 3, -93, 65, 80, 45, -40, -10, -25, 17, 51, 117, -45, -121, 16, -21, 64, -77, -53, 19, -100, 1, 56, Byte.MAX_VALUE, -27, -81, -72, 28, -112, 31, 26, 29});
    public static final String sVU = ICR.b(new byte[]{46, 47, -101, 125, -94, -118, Byte.MAX_VALUE, 11, 19, -6, -34, -113, -77, -79, -103, 59, -70, -76, 78, 44, -47, 28, -73, 54, -49, 49, 79, 52, 13, -61, 31, -16});
    public static final String gmP = ICR.b(new byte[]{54, -30, 21, -89, -32, -54, -30, -23, 10, -31, 11, 21, -41, -70, 91, -77, -89, -105, -26, 106, 7, 12, -19, 1, 55, -63, -30, 99, 54, 105, 87, -51});

    /* renamed from: J, reason: collision with root package name */
    public static final String f10800J = ICR.b(new byte[]{43, Byte.MIN_VALUE, 24, 32, -88, -40, -17, -94, 17, -49, -70, -35, 126, 56, -118, 29, -31, -117, 98, 63, 115, 121, -9, 78, 102, 97, 59, -43, 29, 27, 96, 107});
    public static final String PqK = ICR.b(new byte[]{69, 101, 5, -80, 82, -38, 118, -53, 122, 68, 89, -16, -63, 120, 105, 122, 46, -80, 115, -18, 21, -9, -102, -80, 82, -36, -92, 65, -83, 83, -47, -111});

    /* renamed from: V, reason: collision with root package name */
    public static final String f10802V = ICR.b(new byte[]{-97, 28, 86, 100, 22, 42, -21, -44, 84, 21, -61, 64, 38, 9, 33, -53, -81, -127, 117, 63, -119, 19, 53, -70, -10, 56, -126, 17, -81, -58, -19, -60});
    public static final String olU = ICR.b(new byte[]{10, 75, 11, -116, 8, -29, 67, -72, 20, -19, -77, -71, -49, 48, -116, 117, 77, -46, 24, -86, -121, -120, -11, 101, -117, 99, 79, -90, -31, 20, 53, 50});

    /* renamed from: R, reason: collision with root package name */
    public static final String f10801R = ICR.b(new byte[]{-25, 29, 93, 44, 77, 82, 50, 115, -124, 70, 12, 28, 70, 51, -11, 41, -48, -57, -77, -96, 83, -31, Byte.MIN_VALUE, -64, 70, 1, 93, -48, -116, -35, -66, 59});
    public static final String DOu = ICR.b(new byte[]{-16, -125, -91, 66, 9, 105, 19, -24, 61, -81, -13, Byte.MAX_VALUE, -107, 70, 114, 67, -100, -113, -106, -51, 11, 28, -21, -68, 35, -55, 48, -120, 124, -78, -65, -120});

    public static JSONObject b(p8 p8Var) {
        JSONObject jSONObject = new JSONObject();
        Boolean bool = p8Var.f11052b;
        if (bool != null) {
            jSONObject.put(f10804b, bool.booleanValue());
        }
        Boolean bool2 = p8Var.f11051W;
        if (bool2 != null) {
            jSONObject.put(f10803W, bool2.booleanValue());
        }
        Boolean bool3 = p8Var.f11053f9;
        if (bool3 != null) {
            jSONObject.put(f10805f9, bool3.booleanValue());
        }
        Boolean bool4 = p8Var.sVU;
        if (bool4 != null) {
            jSONObject.put(sVU, bool4.booleanValue());
        }
        Boolean bool5 = p8Var.gmP;
        if (bool5 != null) {
            jSONObject.put(gmP, bool5.booleanValue());
        }
        Boolean bool6 = p8Var.f11048J;
        if (bool6 != null) {
            jSONObject.put(f10800J, bool6.booleanValue());
        }
        Boolean bool7 = p8Var.PqK;
        if (bool7 != null) {
            jSONObject.put(PqK, bool7.booleanValue());
        }
        Boolean bool8 = p8Var.f11050V;
        if (bool8 != null) {
            jSONObject.put(f10802V, bool8.booleanValue());
        }
        Boolean bool9 = p8Var.olU;
        if (bool9 != null) {
            jSONObject.put(olU, bool9.booleanValue());
        }
        Integer num = p8Var.f11049R;
        if (num != null) {
            jSONObject.put(f10801R, num.intValue());
        }
        Boolean bool10 = p8Var.DOu;
        if (bool10 != null) {
            jSONObject.put(DOu, bool10.booleanValue());
        }
        return jSONObject;
    }
}
