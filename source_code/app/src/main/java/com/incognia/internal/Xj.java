package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Xj {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9946b = ICR.b(new byte[]{12, -117, -88, 73, -27, 13, 111, 26, -83, 25, -6, 50, 21, -40, 51, -1, 41, 61, -84, 34, -22, 35, -8, -20, -43, -36, 41, 44, 31, 33, -126, 15});

    /* renamed from: W, reason: collision with root package name */
    public static final String f9945W = ICR.b(new byte[]{-101, -15, 45, 60, 84, 59, 122, -96, 101, -43, -67, -42, -64, 115, -114, 122, -29, -119, 55, -36, -25, -26, 30, 40, -4, -40, -103, -62, 108, 4, 117, -82});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9947f9 = ICR.b(new byte[]{113, -27, 38, 64, 6, 32, -112, 1, 32, -125, -25, -4, 7, -114, -17, 123, 47, 29, 81, -7, -102, -16, 99, 67, -36, 87, 73, 48, 54, -5, 119, 117});
    public static final String sVU = ICR.b(new byte[]{-19, -70, -98, 74, -101, -13, -112, -26, -67, -27, 87, 16, 115, -61, 97, 12, -17, 26, -86, 117, -95, -34, -68, 87, 93, 18, 68, -99, 41, -97, -1, -24});
    public static final String gmP = ICR.b(new byte[]{-44, -94, -95, 90, -109, -118, -104, 124, 7, -116, 115, -9, 117, -119, 123, 59, 54, 18, -67, 119, 119, 30, 59, 45, -45, -100, -108, 28, 16, -45, 121, Byte.MAX_VALUE});

    /* renamed from: J, reason: collision with root package name */
    public static final String f9944J = ICR.b(new byte[]{12, -125, -17, -65, 39, -78, 111, -47, -94, -121, -2, -26, 71, -112, 58, -37, 20, -19, 103, -117, -43, 91, -14, -44, 118, 10, 65, -60, -16, 93, -26, -68});
    public static final String PqK = ICR.b(new byte[]{-72, 28, -62, 114, 8, -26, 27, -42, 0, 42, 44, 66, 71, 103, -95, 54, 26, 78, -114, 104, -73, 22, 49, -115, 76, 20, 101, -114, 81, 74, -124, -121});

    public static JSONObject b(EG7 eg7) {
        JSONObject jSONObject = new JSONObject();
        k7Q k7q = eg7.f8598b;
        if (k7q != null) {
            jSONObject.put(f9946b, nO.b(k7q));
        }
        zm zmVar = eg7.f8597W;
        if (zmVar != null) {
            String str = f9945W;
            String str2 = d2b.f10272b;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(d2b.f10272b, zmVar.f11944b);
            jSONObject2.put(d2b.f10271W, zmVar.f11943W);
            Long l10 = zmVar.f11945f9;
            if (l10 != null) {
                jSONObject2.put(d2b.f10273f9, l10.longValue());
            }
            jSONObject.put(str, jSONObject2);
        }
        int i4 = 0;
        if (eg7.f8599f9 != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = eg7.f8599f9;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                n52 n52Var = (n52) obj;
                String str3 = g1I.f10457b;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(g1I.f10457b, n52Var.f10931b);
                String str4 = g1I.f10456W;
                String str5 = bU.f10177b;
                jSONObject3.put(str4, bU.b(n52Var.f10930W));
                jSONArray.put(jSONObject3);
            }
            jSONObject.put(f9947f9, jSONArray);
        }
        JCV jcv = eg7.sVU;
        if (jcv != null) {
            String str6 = sVU;
            String str7 = I8.f8885b;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(I8.f8885b, jcv.f8938b);
            String str8 = jcv.f8937W;
            if (str8 != null) {
                jSONObject4.put(I8.f8884W, str8);
            }
            Integer num = jcv.f8939f9;
            if (num != null) {
                jSONObject4.put(I8.f8886f9, num.intValue());
            }
            Double d4 = jcv.sVU;
            if (d4 != null) {
                jSONObject4.put(I8.sVU, d4.doubleValue());
            }
            jSONObject.put(str6, jSONObject4);
        }
        if (eg7.gmP != null) {
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList2 = eg7.gmP;
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                Xqi xqi = (Xqi) obj2;
                String str9 = nEt.f10937b;
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(nEt.f10937b, xqi.f9955b);
                i3p i3pVar = xqi.f9954W;
                if (i3pVar != null) {
                    jSONObject5.put(nEt.f10936W, TIF.b(i3pVar));
                }
                i3p i3pVar2 = xqi.f9956f9;
                if (i3pVar2 != null) {
                    jSONObject5.put(nEt.f10938f9, TIF.b(i3pVar2));
                }
                String str10 = xqi.sVU;
                if (str10 != null) {
                    jSONObject5.put(nEt.sVU, str10);
                }
                String str11 = xqi.gmP;
                if (str11 != null) {
                    jSONObject5.put(nEt.gmP, str11);
                }
                jSONArray2.put(jSONObject5);
            }
            jSONObject.put(gmP, jSONArray2);
        }
        Xh xh = eg7.f8596J;
        if (xh != null) {
            String str12 = f9944J;
            String str13 = lYo.f10830b;
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(lYo.f10830b, xh.f9939b);
            Double d9 = xh.f9938W;
            if (d9 != null) {
                jSONObject6.put(lYo.f10829W, d9.doubleValue());
            }
            Double d10 = xh.f9940f9;
            if (d10 != null) {
                jSONObject6.put(lYo.f10831f9, d10.doubleValue());
            }
            String str14 = xh.sVU;
            if (str14 != null) {
                jSONObject6.put(lYo.sVU, str14);
            }
            String str15 = xh.gmP;
            if (str15 != null) {
                jSONObject6.put(lYo.gmP, str15);
            }
            jSONObject.put(str12, jSONObject6);
        }
        Object obj3 = eg7.PqK;
        if (obj3 != null) {
            jSONObject.put(PqK, obj3);
        }
        return jSONObject;
    }
}
