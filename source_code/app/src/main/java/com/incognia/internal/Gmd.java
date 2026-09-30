package com.incognia.internal;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Gmd {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8811b = ICR.b(new byte[]{-98, -56, 74, 79, -66, 47, 3, 109, -81, -47, 34, 67, -47, 82, -30, 60, 43, 92, 56, -63, 101, -85, -98, 96, -108, 70, -94, 112, -106, -102, -62, -98});

    /* renamed from: W, reason: collision with root package name */
    public static final String f8810W = ICR.b(new byte[]{7, -10, 53, -1, -56, 114, 62, -61, -20, 76, -67, 96, -51, 4, -69, -81, 29, -99, -23, 23, 123, -71, -70, 59, -13, 46, 20, 41, 81, 62, -44, 84});

    public static JSONObject b(py pyVar) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = pyVar.f11115b;
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = pyVar.f11115b;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            jSONArray.put((String) obj);
        }
        jSONObject.put(f8811b, jSONArray);
        if (pyVar.f11114W != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : pyVar.f11114W.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put(f8810W, jSONObject2);
        }
        return jSONObject;
    }
}
