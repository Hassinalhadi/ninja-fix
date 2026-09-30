package com.incognia.internal;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class hf {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10561b = ICR.b(new byte[]{25, 18, -111, -7, -87, -19, 91, 11, 36, -58, -83, 124, 3, 112, 112, -126, 73, -37, -97, -14, 54, 20, -4, -124, 55, -1, -81, -28, 46, 63, Byte.MIN_VALUE, -12});

    /* renamed from: W, reason: collision with root package name */
    public static final String f10560W = ICR.b(new byte[]{117, -42, -111, -17, -127, 25, -8, -79, -32, -125, -108, -63, -79, -59, 74, -28, 21, 113, -77, -84, -103, -76, -61, 84, 21, 108, -108, -53, -114, 45, 63, -56});

    public static JSONObject b(XOw xOw) {
        JSONObject jSONObject = new JSONObject();
        if (xOw.f9923b != null) {
            JSONArray jSONArray = new JSONArray();
            for (v0k v0kVar : xOw.f9923b) {
                String str = pm.f11103b;
                JSONObject jSONObject2 = new JSONObject();
                Integer num = v0kVar.f11526b;
                if (num != null) {
                    jSONObject2.put(pm.f11103b, num.intValue());
                }
                String str2 = v0kVar.f11523W;
                if (str2 != null) {
                    jSONObject2.put(pm.f11100W, str2);
                }
                Boolean bool = v0kVar.f11527f9;
                if (bool != null) {
                    jSONObject2.put(pm.f11104f9, bool.booleanValue());
                }
                Boolean bool2 = v0kVar.sVU;
                if (bool2 != null) {
                    jSONObject2.put(pm.sVU, bool2.booleanValue());
                }
                Boolean bool3 = v0kVar.gmP;
                if (bool3 != null) {
                    jSONObject2.put(pm.gmP, bool3.booleanValue());
                }
                Boolean bool4 = v0kVar.f11518J;
                if (bool4 != null) {
                    jSONObject2.put(pm.f11095J, bool4.booleanValue());
                }
                Boolean bool5 = v0kVar.PqK;
                if (bool5 != null) {
                    jSONObject2.put(pm.PqK, bool5.booleanValue());
                }
                Boolean bool6 = v0kVar.f11522V;
                if (bool6 != null) {
                    jSONObject2.put(pm.f11099V, bool6.booleanValue());
                }
                Boolean bool7 = v0kVar.olU;
                if (bool7 != null) {
                    jSONObject2.put(pm.olU, bool7.booleanValue());
                }
                Boolean bool8 = v0kVar.f11521R;
                if (bool8 != null) {
                    jSONObject2.put(pm.f11098R, bool8.booleanValue());
                }
                Boolean bool9 = v0kVar.DOu;
                if (bool9 != null) {
                    jSONObject2.put(pm.DOu, bool9.booleanValue());
                }
                if (v0kVar.IB != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = v0kVar.IB.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((String) it.next());
                    }
                    jSONObject2.put(pm.IB, jSONArray2);
                }
                Integer num2 = v0kVar.Qs;
                if (num2 != null) {
                    jSONObject2.put(pm.Qs, num2.intValue());
                }
                String str3 = v0kVar.f11517E;
                if (str3 != null) {
                    jSONObject2.put(pm.f11094E, str3);
                }
                String str4 = v0kVar.f11528n9;
                if (str4 != null) {
                    jSONObject2.put(pm.f11105n9, str4);
                }
                Integer num3 = v0kVar.f11524Y;
                if (num3 != null) {
                    jSONObject2.put(pm.f11101Y, num3.intValue());
                }
                Integer num4 = v0kVar.f11520P;
                if (num4 != null) {
                    jSONObject2.put(pm.f11097P, num4.intValue());
                }
                Integer num5 = v0kVar.f11519L;
                if (num5 != null) {
                    jSONObject2.put(pm.f11096L, num5.intValue());
                }
                Long l10 = v0kVar.FL;
                if (l10 != null) {
                    jSONObject2.put(pm.FL, l10.longValue());
                }
                String str5 = v0kVar.f11525ar;
                if (str5 != null) {
                    jSONObject2.put(pm.f11102ar, str5);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(f10561b, jSONArray);
        }
        Boolean bool10 = xOw.f9922W;
        if (bool10 != null) {
            jSONObject.put(f10560W, bool10.booleanValue());
        }
        return jSONObject;
    }
}
