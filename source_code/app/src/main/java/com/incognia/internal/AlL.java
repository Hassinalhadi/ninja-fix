package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AlL {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8377b = ICR.b(new byte[]{62, 106, 18, -95, 50, 59, 103, -46, -108, -15, 1, 6, -105, 71, -69, -106, 72, 126, 23, -71, -35, -6, 117, -79, -81, 17, 46, -122, 98, -79, -113, -124});

    /* renamed from: W, reason: collision with root package name */
    public static final String f8376W = ICR.b(new byte[]{-80, -30, 0, 111, 29, 100, -41, -108, -37, -99, 78, 103, -28, 59, 54, 113, -68, 29, -111, 103, 113, -34, -97, 65, -35, 121, -117, 23, -12, -97, 52, 98});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f8378f9 = ICR.b(new byte[]{119, 109, 24, -82, 26, 124, 24, 80, -51, 122, -62, 46, -57, -14, 83, -40, 95, -116, 121, 114, -79, 73, 26, -126, 116, -80, -120, 33, 52, -78, -25, 4});
    public static final String sVU = ICR.b(new byte[]{99, 98, -90, -4, -88, 96, -109, -24, 126, 78, 78, 90, -29, -55, -55, -77, 55, 24, -44, -69, 24, -13, -38, -52, -3, -101, 110, 96, -114, 44, 107, 100});

    public static JSONObject b(Kq kq) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = kq.f9028b;
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = kq.f9028b;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            jSONArray.put(X4G.b((D) obj));
        }
        jSONObject.put(f8377b, jSONArray);
        jSONObject.put(f8376W, kq.f9027W.intValue());
        jSONObject.put(f8378f9, kq.f9029f9.intValue());
        jSONObject.put(sVU, kq.sVU.booleanValue());
        return jSONObject;
    }
}
