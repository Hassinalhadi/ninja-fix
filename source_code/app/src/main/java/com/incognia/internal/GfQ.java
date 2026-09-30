package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class GfQ {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8806b = ICR.b(new byte[]{47, 63, -114, 16, -41, -102, -93, 38, -63, -19, -2, -62, -24, 115, 1, 21, -91, 104, -18, -34, 106, -97, -55, 95, 72, 98, 121, 66, 37, -108, -12, 60});

    /* renamed from: W, reason: collision with root package name */
    public static final String f8805W = ICR.b(new byte[]{81, -91, -15, -82, -73, 77, 91, Byte.MIN_VALUE, 43, 79, 27, -50, 54, 70, 63, 107, -59, 34, -31, 3, -84, -68, -125, 119, 87, 73, -102, 52, 21, 106, -42, -31});

    public static JSONObject b(jW jWVar) {
        JSONObject jSONObject = new JSONObject();
        String str = f8806b;
        String str2 = Sc.f9610b;
        jSONObject.put(str, Sc.b(jWVar.f10695b));
        NnB nnB = jWVar.f10694W;
        if (nnB != null) {
            jSONObject.put(f8805W, bU.b(nnB));
        }
        return jSONObject;
    }
}
