package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Vx {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9812b = ICR.b(new byte[]{-43, -123, -122, 89, -11, 61, -58, 77, -32, -99, 88, -98, 10, -10, -69, -113, -126, 117, -84, -97, 54, 10, 77, 33, -73, -36, 93, -64, -90, 11, 80, 50, 57, 72, 0, 122, Byte.MIN_VALUE, -4, -45, -22, -97, -67, 95, -10, 58, -15, -83, 2});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9811W = ICR.b(new byte[]{37, 94, -109, -72, 23, -96, 16, -68, -20, -118, -36, -107, -84, 1, -25, 85, -27, -78, 98, 54, -8, 102, -54, -104, -90, -9, -13, -31, -88, 104, 60, -107});

    public static JSONObject b(xf7 xf7Var) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = xf7Var.f11810b;
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = xf7Var.f11810b;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            qn2 qn2Var = (qn2) obj;
            String str = t6.f11356b;
            JSONObject jSONObject2 = new JSONObject();
            String str2 = qn2Var.f11174b;
            if (str2 != null) {
                jSONObject2.put(t6.f11356b, str2);
            }
            String str3 = qn2Var.f11173W;
            if (str3 != null) {
                jSONObject2.put(t6.f11355W, str3);
            }
            String str4 = qn2Var.f11175f9;
            if (str4 != null) {
                jSONObject2.put(t6.f11357f9, str4);
            }
            Integer num = qn2Var.sVU;
            if (num != null) {
                jSONObject2.put(t6.sVU, num.intValue());
            }
            jSONObject2.put(t6.gmP, qn2Var.gmP.longValue());
            String str5 = qn2Var.f11171J;
            if (str5 != null) {
                jSONObject2.put(t6.f11353J, str5);
            }
            jSONObject2.put(t6.PqK, true);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = qn2Var.PqK.iterator();
            while (it.hasNext()) {
                jSONArray2.put((String) it.next());
            }
            jSONObject2.put(t6.f11354V, jSONArray2);
            Long l10 = qn2Var.f11172V;
            if (l10 != null) {
                jSONObject2.put(t6.olU, l10.longValue());
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(f9812b, jSONArray);
        jSONObject.put(f9811W, xf7Var.f11809W.booleanValue());
        return jSONObject;
    }
}
