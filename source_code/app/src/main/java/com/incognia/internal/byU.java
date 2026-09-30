package com.incognia.internal;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class byU {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10218b = ICR.b(new byte[]{126, -28, -35, -2, -28, 45, 22, -18, 93, -19, -44, 14, 101, 23, -22, -70, 69, 48, 5, -65, -66, -29, -74, 105, 7, 22, -58, -73, -38, -80, -89, -103});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10217W = ICR.b(new byte[]{-55, -12, 119, -95, -57, -69, 38, -68, 48, -30, -49, -111, 93, 32, 100, -105, -33, 60, 25, -67, 86, 0, -2, -93, -10, 74, 104, -37, 96, -2, -121, -35});

    public static JSONObject b(zVT zvt) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f10218b, zvt.f11915b);
        if (zvt.f11914W != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = zvt.f11914W.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.put(f10217W, jSONArray);
        }
        return jSONObject;
    }
}
