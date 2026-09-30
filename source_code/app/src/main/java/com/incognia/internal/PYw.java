package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class PYw {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9427b = ICR.b(new byte[]{-42, 101, -91, -65, -34, 55, 75, 73, 106, -1, -17, -127, -14, -88, -76, -75, -82, 5, -67, 37, -31, 48, 7, 15, -105, -2, 7, -10, 67, -2, -32, 70});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9426W = ICR.b(new byte[]{-49, 86, -82, -50, -20, -41, -35, -46, 62, 121, 89, -65, 124, -47, -54, -34, -91, -95, 28, -79, -102, -125, -14, 68, -50, 83, 62, 87, 25, -22, -123, -58});

    public static JSONObject b(Ip7 ip7) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = ip7.f8923b;
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = ip7.f8923b;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            jSONArray.put((String) obj);
        }
        jSONObject.put(f9427b, jSONArray);
        if (ip7.f8922W != null) {
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList3 = ip7.f8922W;
            int size2 = arrayList3.size();
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                jSONArray2.put((String) obj2);
            }
            jSONObject.put(f9426W, jSONArray2);
        }
        return jSONObject;
    }
}
