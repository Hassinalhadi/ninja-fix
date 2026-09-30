package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class yq {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11879b = ICR.b(new byte[]{-2, 100, -16, 48, -2, 14, 94, -97, 16, 41, 102, -103, 93, 94, 4, 71, -30, 100, 60, 103, -18, 3, 14, 43, -122, 65, 14, -51, -121, 40, -91, -19});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11878W = ICR.b(new byte[]{28, 107, 29, 22, 116, -16, 6, 1, 25, 46, -19, -51, -91, 18, 12, 31, 2, 37, -25, -108, 26, 58, -106, -102, 120, 112, 39, 69, -81, 18, -104, -61});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11880f9 = ICR.b(new byte[]{-42, -110, 87, -79, 107, 10, 25, 70, 96, -81, -64, 52, 99, -121, -101, 65, 68, 23, -17, 24, -69, -125, -9, -1, -125, 96, -116, -90, -74, -21, -92, 17});
    public static final String sVU = ICR.b(new byte[]{-76, 110, 72, -108, 5, -103, 67, 60, -46, -79, 99, -85, -28, -60, 7, 5, -82, -110, 66, -124, 122, -1, -91, -125, 8, 76, -3, -98, -3, -25, -23, -80});
    public static final String gmP = ICR.b(new byte[]{-56, 109, -10, -100, 86, -110, 123, 59, -65, -74, -70, 115, -27, 116, -111, 109, 108, -6, -21, 22, -84, 40, 24, -22, -40, -118, -95, -125, -106, 115, -12, 49});

    /* renamed from: J, reason: collision with root package name */
    public static final String f11875J = ICR.b(new byte[]{-102, -2, -18, 95, 17, -34, 76, 71, 1, 112, 12, -20, 120, 22, 20, 38, -14, 82, 64, 97, -113, -76, 12, 0, -58, -22, -83, -96, 93, 110, 120, 6});
    public static final String PqK = ICR.b(new byte[]{110, -77, -75, -115, -114, -69, -38, -96, -87, 92, 67, -75, -64, -49, 53, -25, -17, -61, 48, -64, -90, Byte.MAX_VALUE, 30, -65, 114, 50, -124, 31, 25, 72, 42, 66});

    /* renamed from: V, reason: collision with root package name */
    public static final String f11877V = ICR.b(new byte[]{104, 35, 67, -18, -61, 87, -7, 94, -18, -112, -91, -62, 89, 25, Byte.MAX_VALUE, -101, -57, 114, -14, 3, -126, -53, -113, -119, -60, 93, -115, 13, 72, -113, 125, -20});
    public static final String olU = ICR.b(new byte[]{-126, -48, 0, -55, 120, 117, 74, 59, 31, -101, 44, 23, 91, -3, 9, -98, 45, 39, -4, -86, 34, 55, 16, 116, 118, -122, -119, 78, 58, 53, -97, 89});

    /* renamed from: R, reason: collision with root package name */
    public static final String f11876R = ICR.b(new byte[]{66, -21, 63, -43, 21, 65, -7, 16, 74, -124, -74, 32, 23, -45, 11, -110, 29, -124, 36, 103, 48, -14, -102, 36, -59, -117, 47, 72, 45, -29, -55, 108});
    public static final String DOu = ICR.b(new byte[]{5, -7, -93, -1, -90, -94, 0, 84, 111, -2, 37, -8, 94, 57, -113, 23, 22, -53, 40, -61, -90, 115, 12, 52, 31, -84, -80, -14, -29, -43, 86, -54});
    public static final String IB = ICR.b(new byte[]{-23, 66, -30, 111, 58, 44, -110, 11, 0, 23, -51, -117, 39, 34, 86, 68, -14, -123, -52, 110, -97, 18, -118, 52, 30, -78, 41, -19, 83, 107, 45, 99, -99, 93, 31, -59, -125, -62, 125, 33, -27, 73, -120, -124, 40, -118, -106, 50});

    public static JSONObject b(G4 g42) {
        JSONObject jSONObject = new JSONObject();
        Object obj = g42.f8752b;
        if (obj != null) {
            jSONObject.put(f11879b, obj);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = g42.f8751W;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            jSONArray.put((String) obj2);
        }
        jSONObject.put(f11878W, jSONArray);
        Object obj3 = g42.f8753f9;
        if (obj3 != null) {
            jSONObject.put(f11880f9, obj3);
        }
        s1p s1pVar = g42.sVU;
        if (s1pVar != null) {
            String str = sVU;
            String str2 = dJG.f10308b;
            JSONObject jSONObject2 = new JSONObject();
            if (s1pVar.f11257b != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = s1pVar.f11257b.iterator();
                while (it.hasNext()) {
                    jSONArray2.put((String) it.next());
                }
                jSONObject2.put(dJG.f10308b, jSONArray2);
            }
            String str3 = s1pVar.f11256W;
            if (str3 != null) {
                jSONObject2.put(dJG.f10307W, str3);
            }
            String str4 = s1pVar.f11258f9;
            if (str4 != null) {
                jSONObject2.put(dJG.f10309f9, str4);
            }
            jSONObject2.put(dJG.sVU, s1pVar.sVU.intValue());
            jSONObject.put(str, jSONObject2);
        }
        Object obj4 = g42.gmP;
        if (obj4 != null) {
            jSONObject.put(gmP, obj4);
        }
        JSONArray jSONArray3 = new JSONArray();
        ArrayList arrayList2 = g42.f8748J;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj5 = arrayList2.get(i10);
            i10++;
            jSONArray3.put((String) obj5);
        }
        jSONObject.put(f11875J, jSONArray3);
        Integer num = g42.PqK;
        if (num != null) {
            jSONObject.put(PqK, num.intValue());
        }
        Object obj6 = g42.f8750V;
        if (obj6 != null) {
            jSONObject.put(f11877V, obj6);
        }
        Object obj7 = g42.olU;
        if (obj7 != null) {
            jSONObject.put(olU, obj7);
        }
        JSONArray jSONArray4 = new JSONArray();
        ArrayList arrayList3 = g42.f8749R;
        int size3 = arrayList3.size();
        while (i4 < size3) {
            Object obj8 = arrayList3.get(i4);
            i4++;
            NF3 nf3 = (NF3) obj8;
            String str5 = mch.f10910b;
            JSONObject jSONObject3 = new JSONObject();
            String str6 = nf3.f9194b;
            if (str6 != null) {
                jSONObject3.put(mch.f10910b, str6);
            }
            String str7 = nf3.f9193W;
            if (str7 != null) {
                jSONObject3.put(mch.f10909W, str7);
            }
            String str8 = nf3.f9195f9;
            if (str8 != null) {
                jSONObject3.put(mch.f10911f9, str8);
            }
            jSONArray4.put(jSONObject3);
        }
        jSONObject.put(f11876R, jSONArray4);
        Boolean bool = g42.DOu;
        if (bool != null) {
            jSONObject.put(DOu, bool.booleanValue());
        }
        Boolean bool2 = g42.IB;
        if (bool2 != null) {
            jSONObject.put(IB, bool2.booleanValue());
        }
        return jSONObject;
    }
}
