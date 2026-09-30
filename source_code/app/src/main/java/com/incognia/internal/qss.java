package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class qss {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11179b = ICR.b(new byte[]{48, -64, -5, -125, 83, -28, -127, 32, -98, -108, -125, -120, -25, 96, 51, 29, -66, 40, -120, 104, 125, 57, -18, 59, 102, -90, 124, -46, -37, -124, 49, 94});

    public static JSONObject b(rx4 rx4Var) {
        JSONObject jSONObject = new JSONObject();
        Integer num = rx4Var.f11251b;
        if (num != null) {
            jSONObject.put(f11179b, num.intValue());
        }
        return jSONObject;
    }
}
