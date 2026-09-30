package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class u2L {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11442b = ICR.b(new byte[]{-121, -106, 113, 115, -105, -125, 14, -24, -112, -78, -74, -92, 43, -35, -94, -98, -70, -107, -125, -5, -82, -24, -124, -25, 65, 71, -63, -43, 110, -24, 28, 8});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11441W = ICR.b(new byte[]{23, 66, -38, 13, 68, 36, -75, -37, -90, -44, 10, 93, 0, 1, 95, 65, -106, 74, -93, 41, 87, 95, -4, -3, -38, -62, 65, -64, 30, 77, 55, -122});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11443f9 = ICR.b(new byte[]{39, 70, 77, 116, 85, -38, 97, -108, -60, 112, -70, 38, -29, 50, -37, 61, -73, 25, 12, 94, 56, 66, 20, -63, -36, -113, 5, 63, -84, 28, 89, 31});
    public static final String sVU = ICR.b(new byte[]{-114, -93, -42, 36, 9, 64, 100, -18, 30, -53, -59, 55, 40, 32, -29, -6, 107, -30, -103, 11, -111, 9, 122, 39, 121, -22, -11, -77, 91, 123, 92, -52});
    public static final String gmP = ICR.b(new byte[]{-72, -87, 39, 108, -16, -29, -55, -121, 74, 30, -87, -12, 109, 24, 50, 13, -16, -67, -17, -101, -91, -27, 8, -12, 24, -55, 73, -102, 94, 56, 6, 44});

    /* renamed from: J, reason: collision with root package name */
    public static final String f11440J = ICR.b(new byte[]{-79, -126, -55, -107, 95, 120, 125, -2, -34, 16, 39, -57, -65, -14, -118, -10, -70, 95, -121, -47, 26, 29, -30, -9, 121, -34, -111, 72, 29, -84, -83, -89});
    public static final String PqK = ICR.b(new byte[]{48, 76, 115, -101, 19, 10, 34, 92, 20, -95, -89, -64, Byte.MAX_VALUE, -85, -108, 45, 113, 118, 14, 109, 48, -120, 23, 40, -24, -105, 55, -15, -82, -101, -13, 53});

    public static JSONObject b(Ye8 ye8) {
        JSONObject jSONObject = new JSONObject();
        int i4 = 0;
        if (ye8.f10003b != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = ye8.f10003b;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                jSONArray.put((String) obj);
            }
            jSONObject.put(f11442b, jSONArray);
        }
        if (ye8.f10002W != null) {
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList2 = ye8.f10002W;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                jSONArray2.put((String) obj2);
            }
            jSONObject.put(f11441W, jSONArray2);
        }
        if (ye8.f10004f9 != null) {
            JSONArray jSONArray3 = new JSONArray();
            ArrayList arrayList3 = ye8.f10004f9;
            int size3 = arrayList3.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                jSONArray3.put((String) obj3);
            }
            jSONObject.put(f11443f9, jSONArray3);
        }
        if (ye8.sVU != null) {
            JSONArray jSONArray4 = new JSONArray();
            ArrayList arrayList4 = ye8.sVU;
            int size4 = arrayList4.size();
            while (i4 < size4) {
                Object obj4 = arrayList4.get(i4);
                i4++;
                jSONArray4.put((String) obj4);
            }
            jSONObject.put(sVU, jSONArray4);
        }
        String str = ye8.gmP;
        if (str != null) {
            jSONObject.put(gmP, str);
        }
        Integer num = ye8.f10001J;
        if (num != null) {
            jSONObject.put(f11440J, num.intValue());
        }
        Integer num2 = ye8.PqK;
        if (num2 != null) {
            jSONObject.put(PqK, num2.intValue());
        }
        return jSONObject;
    }
}
