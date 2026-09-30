package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class LxD {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9092b = ICR.b(new byte[]{75, 49, -110, 67, 124, -111, 85, -92, -40, 49, 4, 78, 6, -58, 47, -72, -28, 43, 0, -56, 79, -76, 31, -53, 119, -17, 114, -104, -42, -102, -97, -26});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9091W = ICR.b(new byte[]{-103, 98, 65, -75, -7, -84, -75, 58, 67, -111, 44, 86, -95, 53, 77, -112, 108, -9, 95, 85, -88, 38, 56, 83, 70, -47, 14, -119, 111, -22, -110, -35});

    public static JSONObject b(hCR hcr) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f9092b, hcr.f10527b.longValue());
        Long l10 = hcr.f10526W;
        if (l10 != null) {
            jSONObject.put(f9091W, l10.longValue());
        }
        return jSONObject;
    }
}
