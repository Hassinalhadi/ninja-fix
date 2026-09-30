package com.incognia.internal;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Qvm {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9525b = ICR.b(new byte[]{49, 11, 96, -53, 71, 3, -45, 93, -61, 112, -116, -6, 22, 17, -38, -21, -63, 52, -36, -50, 99, -66, -48, 8, -90, 84, -121, 78, -104, 47, 85, 63});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9524W = ICR.b(new byte[]{24, -54, 109, -5, -74, 42, 41, 120, 27, 47, 63, 76, -42, 4, 5, -23, -82, 40, 100, -81, -39, 65, 60, -105, 51, -105, 48, 53, -92, -118, -14, 13});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9526f9 = ICR.b(new byte[]{77, 63, 125, -19, 57, 15, 20, -75, -23, Byte.MIN_VALUE, -84, Byte.MIN_VALUE, -113, -83, -34, 126, 111, -92, 10, 98, -103, 53, -78, 95, -123, 83, -28, -45, -60, -69, 62, -63});
    public static final String sVU = ICR.b(new byte[]{-78, 92, -20, -20, 65, -81, 55, 99, -28, 51, 107, -93, 84, 45, 58, 9, 101, -2, -28, 29, -12, 72, -65, -67, 33, -52, 115, -57, 112, -34, -93, -73});

    public static JSONObject b(Zyk zyk) {
        JSONObject jSONObject = new JSONObject();
        if (zyk.f10077b != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = zyk.f10077b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                jSONArray.put((String) obj);
            }
            jSONObject.put(f9525b, jSONArray);
        }
        String str = zyk.f10076W;
        if (str != null) {
            jSONObject.put(f9524W, str);
        }
        String str2 = zyk.f10078f9;
        if (str2 != null) {
            jSONObject.put(f9526f9, str2);
        }
        if (zyk.sVU != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : zyk.sVU.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put(sVU, jSONObject2);
        }
        return jSONObject;
    }
}
