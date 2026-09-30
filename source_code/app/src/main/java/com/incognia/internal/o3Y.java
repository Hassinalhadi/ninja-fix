package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class o3Y {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10992b = ICR.b(new byte[]{-116, -26, -122, -71, -19, -83, 45, 106, -47, 48, 34, 55, -123, -7, -17, 108, -89, -3, -77, -13, -120, -112, -1, 68, -53, 19, 124, -116, -2, -96, -61, Byte.MIN_VALUE});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10991W = ICR.b(new byte[]{-59, 71, 99, -54, 15, 33, -119, 33, -49, 98, -2, 95, 84, -44, -124, 99, 3, -88, 1, -24, 125, -13, 87, 25, 27, 75, -10, 71, -21, 77, -44, -49});

    public static JSONObject b(qfn qfnVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f10992b, qfnVar.f11162b);
        jSONObject.put(f10991W, qfnVar.f11161W);
        return jSONObject;
    }
}
