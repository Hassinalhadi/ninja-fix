package com.incognia.internal;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class nO {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10953b = ICR.b(new byte[]{43, 9, 114, 109, -95, 104, 6, 5, 78, 2, 123, 83, -43, -65, -122, -19, -109, 59, 58, 45, 116, -77, -82, -98, -34, -111, -5, -116, -24, 73, 121, 18});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10952W = ICR.b(new byte[]{-71, -42, 45, 83, 97, 36, 28, 39, -2, 17, -49, -50, -12, 36, -102, 126, -115, 114, 103, 25, -12, -12, -81, 28, 21, -89, -107, 63, 99, 20, -104, -116});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10954f9 = ICR.b(new byte[]{-38, 76, -104, 1, -45, 59, -59, 19, 69, 58, Byte.MAX_VALUE, -97, -16, -125, -94, -72, -44, -2, -52, -99, Byte.MIN_VALUE, -72, -57, 76, -45, -21, -46, -62, -86, -84, -28, -58});
    public static final String sVU = ICR.b(new byte[]{93, 76, -88, -37, -89, -46, 119, 91, -86, -113, 21, -70, 78, -52, -120, -28, -86, 37, -97, -10, 2, 38, Byte.MAX_VALUE, -66, 3, 81, 103, 47, -1, 0, -2, 36});
    public static final String gmP = ICR.b(new byte[]{28, 1, -71, 102, 17, -52, -63, 78, 23, -6, 60, -45, -123, -110, -33, 100, 62, -104, 106, -4, -115, -97, -30, 87, 120, -2, -83, -85, 108, 102, 45, 37});

    public static JSONObject b(k7Q k7q) {
        JSONObject jSONObject = new JSONObject();
        String str = k7q.f10737b;
        if (str != null) {
            jSONObject.put(f10953b, str);
        }
        String str2 = k7q.f10736W;
        if (str2 != null) {
            jSONObject.put(f10952W, str2);
        }
        if (k7q.f10738f9 != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : k7q.f10738f9.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put(f10954f9, jSONObject2);
        }
        String str3 = k7q.sVU;
        if (str3 != null) {
            jSONObject.put(sVU, str3);
        }
        String str4 = k7q.gmP;
        if (str4 != null) {
            jSONObject.put(gmP, str4);
        }
        return jSONObject;
    }
}
