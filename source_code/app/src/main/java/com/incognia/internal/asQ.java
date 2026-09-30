package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class asQ {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10121b = ICR.b(new byte[]{-88, -96, 16, -97, 118, 111, -73, -100, -33, -108, 21, -41, 121, 37, -100, -99, 35, 105, 35, 92, -126, 8, -102, -111, -56, -112, -83, -87, 77, -113, 38, -52});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10120W = ICR.b(new byte[]{79, -42, -24, -58, -21, -39, -98, -55, 121, 21, 58, 19, -88, -98, 47, -78, -53, -83, 57, -116, 112, -108, 116, 27, -102, 118, -91, 58, -55, -39, 28, -16});

    public static JSONObject b(Z1e z1e) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f10121b, z1e.f10021b);
        jSONObject.put(f10120W, z1e.f10020W);
        return jSONObject;
    }
}
