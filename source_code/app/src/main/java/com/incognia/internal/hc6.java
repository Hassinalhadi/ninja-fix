package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class hc6 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10556b = ICR.b(new byte[]{126, -66, -78, 116, 85, -96, 100, 33, -75, 18, -113, 23, -99, 22, 48, -14, -15, 14, -47, 30, 115, -56, -94, -24, -28, 59, 71, 106, 8, 83, -69, -72});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10555W = ICR.b(new byte[]{33, 2, 35, -55, 82, 81, 90, 120, 6, -79, 99, -37, 13, -46, 63, -64, -118, -53, 16, -60, -127, -29, -50, 4, 72, -33, -76, 61, -40, 81, 26, 61});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10557f9 = ICR.b(new byte[]{73, -50, 42, 98, 33, -81, -79, 108, 36, 126, 65, 79, -82, -100, -56, 19, 37, 99, 55, -84, 106, -7, 3, 91, -48, -81, 24, -48, 97, -57, 81, -29});
    public static final String sVU = ICR.b(new byte[]{34, -16, -110, -21, 113, 100, 109, 58, 117, 70, -18, -111, -36, -123, -17, 113, 39, -5, -94, -67, 83, 81, 96, -63, -50, 13, 58, -61, -98, 34, -89, Byte.MAX_VALUE});
    public static final String gmP = ICR.b(new byte[]{53, 69, -63, 76, -93, -82, -34, 123, -35, -44, -19, -47, 110, 86, 20, -15, 54, 56, -17, -83, 108, 7, -121, 108, -26, 125, -72, -79, -97, Byte.MIN_VALUE, -127, -31});

    /* renamed from: J, reason: collision with root package name */
    public static final String f10552J = ICR.b(new byte[]{12, -76, -46, 87, -99, 18, 70, -124, -96, -73, -117, -60, -7, -50, -103, -75, -48, 3, -85, -62, -112, -29, -81, -108, -25, 73, -27, -46, -21, 23, 24, -94, -60, -21, -117, 29, -114, -31, -120, 57, -7, 76, -79, -53, -42, 103, 121, -41});
    public static final String PqK = ICR.b(new byte[]{-74, -121, 37, -109, 84, 66, 82, 59, 70, 76, 91, Byte.MIN_VALUE, 22, -25, -71, 104, 65, 25, -86, -91, -91, -24, 75, 117, -124, 16, 75, -64, -79, -78, 99, 111, -61, -13, 93, -104, 59, -36, 105, 27, 18, 47, -74, -47, 92, 16, -109, -127});

    /* renamed from: V, reason: collision with root package name */
    public static final String f10554V = ICR.b(new byte[]{119, 65, 123, -105, -38, 19, 28, 44, -93, -28, 98, 20, 114, 39, 12, -98, 15, -65, -97, -121, -127, -66, -35, 12, -106, 81, -123, -30, -45, 58, 45, 21, -70, -114, 66, 19, 106, -54, -46, -98, 36, -125, -64, -117, 123, 43, 16, 16});
    public static final String olU = ICR.b(new byte[]{-27, -7, -15, -113, -10, -102, -117, 3, -35, -87, 122, -118, -107, -27, -63, -17, 83, -111, 101, 76, -57, 47, -11, 107, -102, -95, 94, 120, 20, -63, -127, 33});

    /* renamed from: R, reason: collision with root package name */
    public static final String f10553R = ICR.b(new byte[]{123, 101, -11, 56, -100, 77, -76, -121, -37, -90, 113, -49, -94, -24, 10, -115, 55, 107, -99, -122, 47, -47, 124, 6, -127, 10, -61, -31, 107, 51, 122, -20, 94, 95, -40, -23, 59, 2, -33, 10, 48, -57, 71, -100, -46, -118, -62, 58});

    public static JSONObject b(XOD xod) {
        JSONObject jSONObject = new JSONObject();
        int i4 = 0;
        if (xod.f9920b != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = xod.f9920b;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                jSONArray.put((String) obj);
            }
            jSONObject.put(f10556b, jSONArray);
        }
        if (xod.f9919W != null) {
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList2 = xod.f9919W;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                jSONArray2.put((String) obj2);
            }
            jSONObject.put(f10555W, jSONArray2);
        }
        if (xod.f9921f9 != null) {
            JSONArray jSONArray3 = new JSONArray();
            ArrayList arrayList3 = xod.f9921f9;
            int size3 = arrayList3.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                jSONArray3.put((String) obj3);
            }
            jSONObject.put(f10557f9, jSONArray3);
        }
        Boolean bool = xod.sVU;
        if (bool != null) {
            jSONObject.put(sVU, bool.booleanValue());
        }
        JSONArray jSONArray4 = new JSONArray();
        ArrayList arrayList4 = xod.gmP;
        int size4 = arrayList4.size();
        while (i4 < size4) {
            Object obj4 = arrayList4.get(i4);
            i4++;
            jSONArray4.put((String) obj4);
        }
        jSONObject.put(gmP, jSONArray4);
        if (xod.f9916J != null) {
            JSONArray jSONArray5 = new JSONArray();
            Iterator it = xod.f9916J.iterator();
            while (it.hasNext()) {
                jSONArray5.put((String) it.next());
            }
            jSONObject.put(f10552J, jSONArray5);
        }
        if (xod.PqK != null) {
            JSONArray jSONArray6 = new JSONArray();
            Iterator it2 = xod.PqK.iterator();
            while (it2.hasNext()) {
                jSONArray6.put((String) it2.next());
            }
            jSONObject.put(PqK, jSONArray6);
        }
        if (xod.f9918V != null) {
            JSONArray jSONArray7 = new JSONArray();
            for (CS cs : xod.f9918V) {
                String str = R0.f9530b;
                JSONObject jSONObject2 = new JSONObject();
                String str2 = cs.f8456b;
                if (str2 != null) {
                    jSONObject2.put(R0.f9530b, str2);
                }
                String str3 = cs.f8455W;
                if (str3 != null) {
                    jSONObject2.put(R0.f9529W, str3);
                }
                Boolean bool2 = cs.f8457f9;
                if (bool2 != null) {
                    jSONObject2.put(R0.f9531f9, bool2.booleanValue());
                }
                jSONArray7.put(jSONObject2);
            }
            jSONObject.put(f10554V, jSONArray7);
        }
        Boolean bool3 = xod.olU;
        if (bool3 != null) {
            jSONObject.put(olU, bool3.booleanValue());
        }
        if (xod.f9917R != null) {
            JSONArray jSONArray8 = new JSONArray();
            for (CS cs2 : xod.f9917R) {
                String str4 = R0.f9530b;
                JSONObject jSONObject3 = new JSONObject();
                String str5 = cs2.f8456b;
                if (str5 != null) {
                    jSONObject3.put(R0.f9530b, str5);
                }
                String str6 = cs2.f8455W;
                if (str6 != null) {
                    jSONObject3.put(R0.f9529W, str6);
                }
                Boolean bool4 = cs2.f8457f9;
                if (bool4 != null) {
                    jSONObject3.put(R0.f9531f9, bool4.booleanValue());
                }
                jSONArray8.put(jSONObject3);
            }
            jSONObject.put(f10553R, jSONArray8);
        }
        return jSONObject;
    }
}
