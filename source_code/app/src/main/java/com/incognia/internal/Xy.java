package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Xy {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9972b = ICR.b(new byte[]{-120, 78, -18, 51, 19, -56, 101, -27, 125, 39, 12, -35, -81, 66, 122, -49, -19, 119, 100, -37, -11, -118, 108, 100, -96, -121, 46, -45, -103, -65, -95, -13});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9971W = ICR.b(new byte[]{53, 37, -80, -116, -78, 91, -86, 38, -92, -119, 121, -38, Byte.MIN_VALUE, 23, -13, -53, 5, 23, -46, 111, 15, 105, 74, -57, 96, 112, -40, 33, -10, Byte.MIN_VALUE, -66, 91});

    public static JSONObject b(gh ghVar) {
        JSONObject jSONObject = new JSONObject();
        String str = ghVar.f10488b;
        if (str != null) {
            jSONObject.put(f9972b, str);
        }
        String str2 = ghVar.f10487W;
        if (str2 != null) {
            jSONObject.put(f9971W, str2);
        }
        return jSONObject;
    }
}
