package com.incognia.internal;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class SM {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9592b = ICR.b(new byte[]{103, -13, -73, 125, 43, 23, 7, -69, -26, -110, -127, -2, -119, -84, -21, 68, 86, 98, -4, 65, 69, -9, -94, -124, -127, 96, -27, 76, 115, -80, -90, -67});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9591W = ICR.b(new byte[]{-2, -82, -47, 123, 61, -41, 20, 71, -104, 71, 29, -73, -20, -77, 60, 32, -103, 54, -113, 61, -59, 9, -70, 48, -79, 114, 104, 64, -112, -119, 34, 54});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9593f9 = ICR.b(new byte[]{104, -54, 69, 76, -32, 91, 19, 33, 106, 111, -112, 120, -18, -26, -116, -108, -13, 116, -68, -4, -34, -17, 34, -34, -59, 46, 2, 8, -87, -124, -60, -106});

    public static Am b(JSONObject jSONObject) {
        String str = f9592b;
        if (!jSONObject.isNull(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            String str2 = f9591W;
            if (!jSONObject.isNull(str2)) {
                long j5 = jSONObject.getLong(str2);
                String str3 = f9593f9;
                if (!jSONObject.isNull(str3)) {
                    return new Am(jSONObject2, j5, jSONObject.getLong(str3));
                }
                throw new IllegalArgumentException("Non-nullable field missing in JSON.");
            }
            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
