package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class jKj {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10679b = ICR.b(new byte[]{-4, 23, -92, 103, 93, 3, -66, -33, -116, -34, 120, 94, -50, -91, 23, 120, -98, -78, -92, 89, 25, 83, 85, -92, 52, -4, 71, -54, -97, 16, 98, 74});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10678W = ICR.b(new byte[]{15, 66, -7, -124, 41, -38, 83, 17, -119, 108, -63, 1, -21, -49, -5, 112, -107, 118, 97, 89, 54, -127, -69, -20, -74, -59, 80, -17, -78, -61, -36, -113});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10680f9 = ICR.b(new byte[]{-51, Byte.MAX_VALUE, -2, 9, 39, -21, 69, 30, -89, -119, -2, -53, -5, 40, -3, 126, 78, 50, 72, -73, -2, -127, 105, -112, -55, 48, -111, -55, -86, -53, 55, -113});
    public static final String sVU = ICR.b(new byte[]{-57, -67, -25, 95, 100, 99, -124, -97, -10, 10, -99, 69, -65, 74, -29, 39, -91, 83, 72, -28, -79, 105, -96, Byte.MAX_VALUE, 125, -113, 51, 113, -63, 74, 15, -106});
    public static final String gmP = ICR.b(new byte[]{72, -26, -8, 76, 8, -96, 44, -59, 84, 65, -51, -68, 82, 107, 107, -22, 121, -71, 16, -83, -108, -98, -107, -102, 98, 55, 75, 64, -92, -126, -43, -29});

    /* renamed from: J, reason: collision with root package name */
    public static final String f10676J = ICR.b(new byte[]{-34, 94, 89, 4, -66, 38, -73, 12, 2, -115, 112, 109, -94, 22, -7, 10, 63, 77, 11, 50, 57, 52, -3, -42, 91, -113, -12, -105, 67, -23, -39, 7});
    public static final String PqK = ICR.b(new byte[]{-115, -91, -82, -84, 66, 22, 97, 30, 74, 59, 115, -16, 84, 100, 44, -18, 36, -97, -31, 3, 54, 109, 29, 31, 32, -35, 105, 124, 52, -12, 29, 9});

    /* renamed from: V, reason: collision with root package name */
    public static final String f10677V = ICR.b(new byte[]{-105, 110, -104, -86, -25, -59, 49, 77, -58, 12, 40, -60, 108, -5, 16, -77, -33, 68, 58, -22, -109, -63, -10, -24, 65, 1, 84, 65, -55, -36, 31, 96});
    public static final String olU = ICR.b(new byte[]{-79, -74, -91, -43, 74, -32, -78, -126, 31, 56, 52, -70, -91, 104, 63, 87, -38, -60, -71, -118, -63, 104, 41, -21, 20, -19, 113, 13, -125, -1, 2, Byte.MIN_VALUE});

    public static JSONObject b(Ve ve2) {
        JSONObject jSONObject = new JSONObject();
        String str = ve2.f9787b;
        if (str != null) {
            jSONObject.put(f10679b, str);
        }
        jSONObject.put(f10678W, ve2.f9786W);
        String str2 = ve2.f9788f9;
        if (str2 != null) {
            jSONObject.put(f10680f9, str2);
        }
        jSONObject.put(sVU, ve2.sVU);
        jSONObject.put(gmP, ve2.gmP);
        Integer num = ve2.f9784J;
        if (num != null) {
            jSONObject.put(f10676J, num.intValue());
        }
        Integer num2 = ve2.PqK;
        if (num2 != null) {
            jSONObject.put(PqK, num2.intValue());
        }
        if (ve2.f9785V != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = ve2.f9785V;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                jSONArray.put((String) obj);
            }
            jSONObject.put(f10677V, jSONArray);
        }
        Integer num3 = ve2.olU;
        if (num3 != null) {
            jSONObject.put(olU, num3.intValue());
        }
        return jSONObject;
    }
}
