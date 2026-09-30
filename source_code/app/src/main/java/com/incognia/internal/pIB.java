package com.incognia.internal;

import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class pIB {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11065b = ICR.b(new byte[]{92, -51, -12, 85, -54, -113, 96, Byte.MIN_VALUE, -103, -25, -54, -78, -95, 34, -47, 114, 25, 102, -116, -106, 96, -24, -17, Byte.MAX_VALUE, 119, -106, 21, 18, -22, Byte.MIN_VALUE, 110, 65});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11064W = ICR.b(new byte[]{53, -55, 19, 122, 46, 103, 126, -11, 92, 76, 57, 110, -74, 3, -28, 95, 12, 108, 48, 0, 100, 79, -56, 62, 74, -38, 37, 116, 46, 115, -87, 6});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11066f9 = ICR.b(new byte[]{8, 101, -83, -88, 73, 72, 24, 125, 32, -2, 20, -42, -11, -98, 59, -127, -109, -116, -60, 18, 109, -113, -14, 101, 9, 78, -104, -69, -92, -16, 57, 30});
    public static final String sVU = ICR.b(new byte[]{-127, 122, -86, 18, 115, 80, 97, 54, 80, 121, -125, -65, 55, 86, 29, -87, -79, -27, 93, 67, 31, 28, -37, -58, -68, -101, -62, -34, 45, 82, -67, -5});
    public static final String gmP = ICR.b(new byte[]{69, 93, -45, 69, -18, 5, -30, 85, 26, 95, -97, -113, -68, 112, -51, 110, -122, -105, -57, -120, -10, 11, -34, -20, -42, 59, 8, 52, 6, -98, -87, 41});

    /* renamed from: J, reason: collision with root package name */
    public static final String f11063J = ICR.b(new byte[]{26, -67, -92, 34, 13, -55, -83, 49, -125, -19, -53, -68, -33, 25, 2, 11, 59, 14, 124, 55, 44, 6, -51, -81, -54, 28, -67, 97, -61, -39, 34, -94});
    public static final String PqK = ICR.b(new byte[]{-17, -16, 108, 100, 24, -127, -85, -89, 37, -86, -94, -26, 36, -23, 75, -53, 75, -50, 1, 92, -64, 84, 67, -60, -19, 27, -99, -122, -10, -99, 87, -14});

    public static JSONObject b(zhK zhk) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f11065b, zhk.f11937b.b().toLowerCase(Locale.US));
        jSONObject.put(f11064W, zhk.f11936W);
        jSONObject.put(f11066f9, zhk.f11938f9);
        jSONObject.put(sVU, zhk.sVU);
        jSONObject.put(gmP, zhk.gmP);
        String str = zhk.f11935J;
        if (str != null) {
            jSONObject.put(f11063J, str);
        }
        String str2 = zhk.PqK;
        if (str2 != null) {
            jSONObject.put(PqK, str2);
        }
        return jSONObject;
    }
}
