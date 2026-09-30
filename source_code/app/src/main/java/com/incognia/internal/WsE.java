package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class WsE {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9880b = ICR.b(new byte[]{63, 52, 29, -98, -16, 15, -108, 84, 31, 54, 86, -53, -127, -122, 97, -88, -98, -47, -46, -50, 80, 66, -46, 77, -49, 122, -19, -11, 19, -80, -19, 35});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9879W = ICR.b(new byte[]{Byte.MAX_VALUE, 25, -122, 19, 3, -91, 72, -3, -14, 62, 51, 51, -95, -41, -73, -24, -72, -6, 68, -99, -117, 103, -98, 39, -11, -64, 89, 123, -28, -80, -44, 16});

    public static JSONObject b(mqI mqi) {
        JSONObject jSONObject = new JSONObject();
        String str = mqi.f10923b;
        if (str != null) {
            jSONObject.put(f9880b, str);
        }
        Integer num = mqi.f10922W;
        if (num != null) {
            jSONObject.put(f9879W, num.intValue());
        }
        return jSONObject;
    }
}
