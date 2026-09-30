package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ES {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8616b = ICR.b(new byte[]{22, 43, 126, -18, 39, -68, -14, -23, -122, 17, -18, 18, -95, 49, 4, 13, 72, -89, 64, 113, 9, 110, 108, -88, -100, 29, -2, Byte.MAX_VALUE, 10, -63, -47, -118});

    /* renamed from: W, reason: collision with root package name */
    public static final String f8615W = ICR.b(new byte[]{105, 122, 13, 82, 22, 24, -23, 74, -3, -35, -103, 57, -67, 29, -123, Byte.MIN_VALUE, 88, 101, -59, 119, -127, 48, 1, -101, 115, -102, -97, 43, -5, -110, -62, -15});

    public static JSONObject b(fKN fkn) {
        JSONObject jSONObject = new JSONObject();
        String str = fkn.f10407b;
        if (str != null) {
            jSONObject.put(f8616b, str);
        }
        String str2 = fkn.f10406W;
        if (str2 != null) {
            jSONObject.put(f8615W, str2);
        }
        return jSONObject;
    }
}
