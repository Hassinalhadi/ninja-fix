package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class vkA {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11577b = ICR.b(new byte[]{-30, -33, 119, -94, 87, 119, 8, 112, -110, 47, 8, -17, 72, -83, -15, 30, -97, -22, -51, -73, 31, -40, -69, 105, 35, -50, -109, 126, -14, -106, 76, 102});

    /* renamed from: W, reason: collision with root package name */
    public static final String f11574W = ICR.b(new byte[]{49, 80, Byte.MAX_VALUE, 94, 40, 92, -84, -57, -85, -94, 92, 91, -70, -13, -89, -125, 72, -97, -67, 73, -24, -70, 50, 103, 123, -5, -70, -15, -103, -8, -74, 31});

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11578f9 = ICR.b(new byte[]{81, -74, -17, -96, -28, -46, -70, 29, -46, 67, -45, -69, -57, -45, -39, 44, 70, 66, 90, -68, -33, -77, -55, 126, -6, 61, -33, 26, -89, -18, 106, -47});
    public static final String sVU = ICR.b(new byte[]{-88, 124, 30, 47, -39, 118, -80, 83, 29, -34, 56, 82, -74, -63, -79, -13, 60, 8, 17, -38, -86, 54, 51, 52, 78, 57, 79, -49, 31, -74, 126, Byte.MAX_VALUE});
    public static final String gmP = ICR.b(new byte[]{92, -56, 5, 59, -9, -81, 63, 92, -10, 40, -11, -34, -93, 86, 110, 23, -115, 113, -95, -76, 48, 22, -57, 100, -33, 27, 21, -24, -29, -111, 113, -101});

    /* renamed from: J, reason: collision with root package name */
    public static final String f11569J = ICR.b(new byte[]{-38, 67, -86, 50, 9, 16, -78, 12, -60, 43, 90, 74, 124, -123, -3, 92, 15, -119, 32, 123, -122, -11, -124, -102, 83, -53, -72, 109, 96, 73, 84, -53});
    public static final String PqK = ICR.b(new byte[]{-68, 6, -72, -35, 78, Byte.MIN_VALUE, -111, -58, -47, -9, -32, -38, -39, -85, 82, -102, -70, Byte.MAX_VALUE, 119, 65, 41, -59, 115, -125, -30, 75, -44, -65, 111, 71, -72, -31});

    /* renamed from: V, reason: collision with root package name */
    public static final String f11573V = ICR.b(new byte[]{-103, 89, 28, 60, 4, -52, 112, 90, -104, 88, -4, -123, 123, -98, 120, -108, -82, 37, 23, 30, -97, 101, 55, -51, 3, -37, -28, 93, 60, -93, 26, 124});
    public static final String olU = ICR.b(new byte[]{35, 58, -101, -68, 41, -2, -21, -39, 126, -86, 104, 80, -53, -22, 9, -43, -29, -13, 1, -110, 98, 54, -125, -111, 108, -43, 25, 118, -52, -69, 49, 82});

    /* renamed from: R, reason: collision with root package name */
    public static final String f11572R = ICR.b(new byte[]{-123, 53, 125, 35, 124, 120, 66, 75, -34, 51, 117, -122, -56, 16, -123, -76, 106, 53, 70, 61, 45, -96, 8, -89, -7, 107, -119, -58, -19, -34, 44, -47});
    public static final String DOu = ICR.b(new byte[]{102, -117, -114, -111, 5, 61, -13, 71, 48, 120, -22, -77, 47, -46, -46, 116, -29, 75, 120, -21, 120, 27, 10, 86, -39, 96, -84, 69, 8, -60, 39, -44});
    public static final String IB = ICR.b(new byte[]{26, -81, -123, -22, 18, 97, 35, -31, 58, -45, -46, -122, 13, -123, -6, -21, 103, -90, -14, 119, -103, 94, 25, -64, 119, -72, 44, -13, -109, 30, -39, 56});
    public static final String Qs = ICR.b(new byte[]{59, 26, -56, -8, -101, 13, 16, 113, 115, 99, -39, 36, 64, -7, 19, 11, 86, -120, 116, 99, 116, 68, -22, 41, 119, 125, 51, 71, 57, -110, 2, -2});

    /* renamed from: E, reason: collision with root package name */
    public static final String f11568E = ICR.b(new byte[]{55, -5, 22, 96, 37, -39, 60, 52, -10, 41, -42, -116, -102, 71, 25, 8, 102, 66, 44, -54, 1, 43, -94, -47, -102, -31, -9, 90, -93, -18, 125, 123});

    /* renamed from: n9, reason: collision with root package name */
    public static final String f11579n9 = ICR.b(new byte[]{-92, 106, 119, 38, -77, 117, -18, 122, 112, 105, 54, 29, 90, 118, Byte.MIN_VALUE, 95, 109, 121, 34, 38, 104, -48, -11, 91, -21, 95, -106, 3, -55, -125, -32, 74});

    /* renamed from: Y, reason: collision with root package name */
    public static final String f11575Y = ICR.b(new byte[]{-76, 18, 64, -30, -121, -7, -35, -47, 124, 92, 114, -110, 72, 101, 46, 43, -43, -100, -35, 68, -27, -11, -77, 109, 121, 51, 109, 122, 108, -102, -45, -60});

    /* renamed from: P, reason: collision with root package name */
    public static final String f11571P = ICR.b(new byte[]{88, -93, 72, 34, -109, -113, 74, 62, 68, 104, -81, 52, -33, 20, -63, -41, -32, 94, 72, 126, 3, 20, 0, -32, -2, -111, 45, -8, 32, -82, 71, 19});

    /* renamed from: L, reason: collision with root package name */
    public static final String f11570L = ICR.b(new byte[]{-112, 87, -111, -50, 120, 2, -6, -13, -71, -101, 64, -86, 61, -79, -102, 107, -83, 72, -115, 78, 7, -34, -83, -3, -30, -58, -76, -16, 47, -21, -56, -112});
    public static final String FL = ICR.b(new byte[]{-103, 104, -59, 124, 106, 117, -79, -117, -7, 29, 79, -28, 91, 69, 103, -69, 57, -7, 41, -24, 69, 66, 110, 0, 45, 3, 96, 22, -85, 79, -97, 121});

    /* renamed from: ar, reason: collision with root package name */
    public static final String f11576ar = ICR.b(new byte[]{-5, 13, 109, -117, 88, 41, -71, -41, -58, 103, -17, 77, 43, 108, 80, -20, -98, 37, 13, 27, 39, 49, -33, 51, 57, 59, 69, 92, -73, -53, 99, -7});

    public static JSONObject b(PIe pIe) {
        Iterator it;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f11577b, pIe.f9412b);
        jSONObject.put(f11574W, pIe.f9409W);
        jSONObject.put(f11578f9, pIe.f9413f9);
        jSONObject.put(sVU, pIe.sVU);
        jSONObject.put(gmP, pIe.gmP);
        jSONObject.put(f11569J, pIe.f9404J);
        jSONObject.put(PqK, pIe.PqK);
        Object obj = pIe.f9408V;
        if (obj != null) {
            jSONObject.put(f11573V, obj);
        }
        Object obj2 = pIe.olU;
        if (obj2 != null) {
            jSONObject.put(olU, obj2);
        }
        Object obj3 = pIe.f9407R;
        if (obj3 != null) {
            jSONObject.put(f11572R, obj3);
        }
        Object obj4 = pIe.DOu;
        if (obj4 != null) {
            jSONObject.put(DOu, obj4);
        }
        Object obj5 = pIe.IB;
        if (obj5 != null) {
            jSONObject.put(IB, obj5);
        }
        Object obj6 = pIe.Qs;
        if (obj6 != null) {
            jSONObject.put(Qs, obj6);
        }
        Object obj7 = pIe.f9403E;
        if (obj7 != null) {
            jSONObject.put(f11568E, obj7);
        }
        Object obj8 = pIe.f9414n9;
        if (obj8 != null) {
            jSONObject.put(f11579n9, obj8);
        }
        Long l10 = pIe.f9410Y;
        if (l10 != null) {
            jSONObject.put(f11575Y, l10.longValue());
        }
        Object obj9 = pIe.f9406P;
        if (obj9 != null) {
            jSONObject.put(f11571P, obj9);
        }
        jSONObject.put(f11570L, pIe.f9405L);
        jSONObject.put(FL, pIe.FL);
        dz dzVar = pIe.f9411ar;
        if (dzVar != null) {
            String str = f11576ar;
            String str2 = vo.f11585b;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(vo.f11585b, dzVar.f10345b);
            jSONObject2.put(vo.f11584W, dzVar.f10344W);
            jSONObject2.put(vo.f11586f9, dzVar.f10346f9);
            jSONObject2.put(vo.sVU, dzVar.sVU);
            jSONObject2.put(vo.gmP, dzVar.gmP);
            Object obj10 = dzVar.f10341J;
            if (obj10 != null) {
                jSONObject2.put(vo.f11581J, obj10);
            }
            Object obj11 = dzVar.PqK;
            if (obj11 != null) {
                jSONObject2.put(vo.PqK, obj11);
            }
            Boolean bool = dzVar.f10343V;
            if (bool != null) {
                jSONObject2.put(vo.f11583V, bool.booleanValue());
            }
            s9t s9tVar = dzVar.olU;
            if (s9tVar != null) {
                String str3 = vo.olU;
                String str4 = Llq.f9075b;
                JSONObject jSONObject3 = new JSONObject();
                Long l11 = s9tVar.f11274b;
                if (l11 != null) {
                    jSONObject3.put(Llq.f9075b, l11.longValue());
                }
                Long l12 = s9tVar.f11273W;
                if (l12 != null) {
                    jSONObject3.put(Llq.f9074W, l12.longValue());
                }
                Object obj12 = s9tVar.f11275f9;
                if (obj12 != null) {
                    jSONObject3.put(Llq.f9076f9, obj12);
                }
                Object obj13 = s9tVar.sVU;
                if (obj13 != null) {
                    jSONObject3.put(Llq.sVU, obj13);
                }
                Object obj14 = s9tVar.gmP;
                if (obj14 != null) {
                    jSONObject3.put(Llq.gmP, obj14);
                }
                Object obj15 = s9tVar.f11270J;
                if (obj15 != null) {
                    jSONObject3.put(Llq.f9071J, obj15);
                }
                Object obj16 = s9tVar.PqK;
                if (obj16 != null) {
                    jSONObject3.put(Llq.PqK, obj16);
                }
                Long l13 = s9tVar.f11272V;
                if (l13 != null) {
                    jSONObject3.put(Llq.f9073V, l13.longValue());
                }
                Long l14 = s9tVar.olU;
                if (l14 != null) {
                    jSONObject3.put(Llq.olU, l14.longValue());
                }
                Long l15 = s9tVar.f11271R;
                if (l15 != null) {
                    jSONObject3.put(Llq.f9072R, l15.longValue());
                }
                if (s9tVar.DOu != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = s9tVar.DOu.iterator();
                    while (it2.hasNext()) {
                        ECc eCc = (ECc) it2.next();
                        String str5 = fwN.f10446b;
                        JSONObject jSONObject4 = new JSONObject();
                        Object obj17 = eCc.f8592b;
                        if (obj17 != null) {
                            jSONObject4.put(fwN.f10446b, obj17);
                        }
                        Integer num = eCc.f8591W;
                        if (num != null) {
                            jSONObject4.put(fwN.f10445W, num.intValue());
                        }
                        Boolean bool2 = eCc.f8593f9;
                        if (bool2 != null) {
                            jSONObject4.put(fwN.f10447f9, bool2.booleanValue());
                        }
                        Long l16 = eCc.sVU;
                        if (l16 != null) {
                            jSONObject4.put(fwN.sVU, l16.longValue());
                        }
                        Object obj18 = eCc.gmP;
                        if (obj18 != null) {
                            jSONObject4.put(fwN.gmP, obj18);
                        }
                        Object obj19 = eCc.f8589J;
                        if (obj19 != null) {
                            jSONObject4.put(fwN.f10443J, obj19);
                        }
                        RuF ruF = eCc.PqK;
                        if (ruF != null) {
                            jSONObject4.put(fwN.PqK, ruF.f9566b);
                        }
                        if (eCc.f8590V != null) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (q0n q0nVar : eCc.f8590V) {
                                String str6 = TKh.f9662b;
                                JSONObject jSONObject5 = new JSONObject();
                                String str7 = q0nVar.f11122b;
                                Iterator it3 = it2;
                                if (str7 != null) {
                                    jSONObject5.put(TKh.f9662b, str7);
                                }
                                Boolean bool3 = q0nVar.f11121W;
                                if (bool3 != null) {
                                    jSONObject5.put(TKh.f9661W, bool3.booleanValue());
                                }
                                jSONArray2.put(jSONObject5);
                                it2 = it3;
                            }
                            it = it2;
                            jSONObject4.put(fwN.f10444V, jSONArray2);
                        } else {
                            it = it2;
                        }
                        zJO zjo = eCc.olU;
                        if (zjo != null) {
                            jSONObject4.put(fwN.olU, zjo.f11902b);
                        }
                        jSONArray.put(jSONObject4);
                        it2 = it;
                    }
                    jSONObject3.put(Llq.DOu, jSONArray);
                }
                Long l17 = s9tVar.IB;
                if (l17 != null) {
                    jSONObject3.put(Llq.IB, l17.longValue());
                }
                Long l18 = s9tVar.Qs;
                if (l18 != null) {
                    jSONObject3.put(Llq.Qs, l18.longValue());
                }
                Long l19 = s9tVar.f11269E;
                if (l19 != null) {
                    jSONObject3.put(Llq.f9070E, l19.longValue());
                }
                jSONObject2.put(str3, jSONObject3);
            }
            Uxa uxa = dzVar.f10342R;
            if (uxa != null) {
                String str8 = vo.f11582R;
                String str9 = nnj.f10970b;
                JSONObject jSONObject6 = new JSONObject();
                Long l20 = uxa.f9743b;
                if (l20 != null) {
                    jSONObject6.put(nnj.f10970b, l20.longValue());
                }
                String str10 = uxa.f9742W;
                if (str10 != null) {
                    jSONObject6.put(nnj.f10969W, str10);
                }
                Long l21 = uxa.f9744f9;
                if (l21 != null) {
                    jSONObject6.put(nnj.f10971f9, l21.longValue());
                }
                if (uxa.sVU != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    ArrayList arrayList = uxa.sVU;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj20 = arrayList.get(i4);
                        i4++;
                        jSONArray3.put((String) obj20);
                    }
                    jSONObject6.put(nnj.sVU, jSONArray3);
                }
                Long l22 = uxa.gmP;
                if (l22 != null) {
                    jSONObject6.put(nnj.gmP, l22.longValue());
                }
                ipD ipd = uxa.f9741J;
                if (ipd != null) {
                    jSONObject6.put(nnj.f10968J, mAt.b(ipd));
                }
                jSONObject2.put(str8, jSONObject6);
            }
            jSONObject.put(str, jSONObject2);
        }
        return jSONObject;
    }

    public static PIe b(JSONObject jSONObject) {
        long j5;
        String str;
        int i4;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        String str6;
        String str7;
        dz dzVar;
        long j6;
        String str8;
        int i5;
        String str9;
        String str10;
        s9t s9tVar;
        s9t s9tVar2;
        Uxa uxa;
        ArrayList arrayList;
        ipD ipd;
        ArrayList arrayList2;
        RuF ruF;
        int i10;
        int i11;
        String str11;
        ArrayList arrayList3;
        zJO zjo;
        zJO zjo2;
        RuF ruF2;
        String str12 = f11577b;
        if (!jSONObject.isNull(str12)) {
            long j7 = jSONObject.getLong(str12);
            String str13 = f11574W;
            if (!jSONObject.isNull(str13)) {
                String string = jSONObject.getString(str13);
                String str14 = f11578f9;
                if (!jSONObject.isNull(str14)) {
                    int i12 = jSONObject.getInt(str14);
                    String str15 = sVU;
                    if (!jSONObject.isNull(str15)) {
                        String string2 = jSONObject.getString(str15);
                        String str16 = gmP;
                        if (!jSONObject.isNull(str16)) {
                            String string3 = jSONObject.getString(str16);
                            String str17 = f11569J;
                            if (!jSONObject.isNull(str17)) {
                                boolean z10 = jSONObject.getBoolean(str17);
                                String str18 = PqK;
                                if (!jSONObject.isNull(str18)) {
                                    boolean z11 = jSONObject.getBoolean(str18);
                                    String str19 = f11573V;
                                    String string4 = !jSONObject.isNull(str19) ? jSONObject.getString(str19) : null;
                                    String str20 = olU;
                                    String string5 = !jSONObject.isNull(str20) ? jSONObject.getString(str20) : null;
                                    String str21 = f11572R;
                                    String string6 = !jSONObject.isNull(str21) ? jSONObject.getString(str21) : null;
                                    String str22 = DOu;
                                    String string7 = !jSONObject.isNull(str22) ? jSONObject.getString(str22) : null;
                                    String str23 = IB;
                                    String string8 = !jSONObject.isNull(str23) ? jSONObject.getString(str23) : null;
                                    String str24 = Qs;
                                    String string9 = !jSONObject.isNull(str24) ? jSONObject.getString(str24) : null;
                                    String str25 = f11568E;
                                    String string10 = !jSONObject.isNull(str25) ? jSONObject.getString(str25) : null;
                                    String str26 = f11579n9;
                                    String string11 = !jSONObject.isNull(str26) ? jSONObject.getString(str26) : null;
                                    String str27 = f11575Y;
                                    Long valueOf = !jSONObject.isNull(str27) ? Long.valueOf(jSONObject.getLong(str27)) : null;
                                    String str28 = f11571P;
                                    String string12 = !jSONObject.isNull(str28) ? jSONObject.getString(str28) : null;
                                    String str29 = f11570L;
                                    if (!jSONObject.isNull(str29)) {
                                        long j10 = jSONObject.getLong(str29);
                                        String str30 = FL;
                                        if (!jSONObject.isNull(str30)) {
                                            String string13 = jSONObject.getString(str30);
                                            String str31 = f11576ar;
                                            if (jSONObject.isNull(str31)) {
                                                j5 = j7;
                                                str = string;
                                                i4 = i12;
                                                str2 = string2;
                                                str3 = string3;
                                                z2 = z10;
                                                str4 = string4;
                                                str5 = string6;
                                                str6 = string9;
                                                str7 = string12;
                                                dzVar = null;
                                            } else {
                                                String str32 = vo.f11585b;
                                                JSONObject jSONObject2 = jSONObject.getJSONObject(str31);
                                                String str33 = vo.f11585b;
                                                if (!jSONObject2.isNull(str33)) {
                                                    long j11 = jSONObject2.getLong(str33);
                                                    String str34 = vo.f11584W;
                                                    if (!jSONObject2.isNull(str34)) {
                                                        long j12 = jSONObject2.getLong(str34);
                                                        String str35 = vo.f11586f9;
                                                        if (!jSONObject2.isNull(str35)) {
                                                            int i13 = jSONObject2.getInt(str35);
                                                            String str36 = vo.sVU;
                                                            if (!jSONObject2.isNull(str36)) {
                                                                int i14 = jSONObject2.getInt(str36);
                                                                String str37 = vo.gmP;
                                                                if (!jSONObject2.isNull(str37)) {
                                                                    long j13 = jSONObject2.getLong(str37);
                                                                    String str38 = vo.f11581J;
                                                                    String string14 = !jSONObject2.isNull(str38) ? jSONObject2.getString(str38) : null;
                                                                    String str39 = vo.PqK;
                                                                    String string15 = !jSONObject2.isNull(str39) ? jSONObject2.getString(str39) : null;
                                                                    String str40 = vo.f11583V;
                                                                    Boolean valueOf2 = !jSONObject2.isNull(str40) ? Boolean.valueOf(jSONObject2.getBoolean(str40)) : null;
                                                                    String str41 = vo.olU;
                                                                    if (jSONObject2.isNull(str41)) {
                                                                        j6 = j7;
                                                                        str8 = string;
                                                                        i5 = i12;
                                                                        str9 = string2;
                                                                        str10 = string3;
                                                                        s9tVar = null;
                                                                    } else {
                                                                        String str42 = Llq.f9075b;
                                                                        JSONObject jSONObject3 = jSONObject2.getJSONObject(str41);
                                                                        String str43 = Llq.f9075b;
                                                                        Long valueOf3 = !jSONObject3.isNull(str43) ? Long.valueOf(jSONObject3.getLong(str43)) : null;
                                                                        String str44 = Llq.f9074W;
                                                                        Long valueOf4 = !jSONObject3.isNull(str44) ? Long.valueOf(jSONObject3.getLong(str44)) : null;
                                                                        String str45 = Llq.f9076f9;
                                                                        String string16 = !jSONObject3.isNull(str45) ? jSONObject3.getString(str45) : null;
                                                                        String str46 = Llq.sVU;
                                                                        String string17 = !jSONObject3.isNull(str46) ? jSONObject3.getString(str46) : null;
                                                                        String str47 = Llq.gmP;
                                                                        String string18 = !jSONObject3.isNull(str47) ? jSONObject3.getString(str47) : null;
                                                                        String str48 = Llq.f9071J;
                                                                        String string19 = !jSONObject3.isNull(str48) ? jSONObject3.getString(str48) : null;
                                                                        String str49 = Llq.PqK;
                                                                        String string20 = !jSONObject3.isNull(str49) ? jSONObject3.getString(str49) : null;
                                                                        String str50 = Llq.f9073V;
                                                                        Long valueOf5 = !jSONObject3.isNull(str50) ? Long.valueOf(jSONObject3.getLong(str50)) : null;
                                                                        String str51 = Llq.olU;
                                                                        Long valueOf6 = !jSONObject3.isNull(str51) ? Long.valueOf(jSONObject3.getLong(str51)) : null;
                                                                        String str52 = Llq.f9072R;
                                                                        Long valueOf7 = !jSONObject3.isNull(str52) ? Long.valueOf(jSONObject3.getLong(str52)) : null;
                                                                        String str53 = Llq.DOu;
                                                                        if (jSONObject3.isNull(str53)) {
                                                                            j6 = j7;
                                                                            str8 = string;
                                                                            arrayList2 = null;
                                                                        } else {
                                                                            j6 = j7;
                                                                            ArrayList arrayList4 = new ArrayList();
                                                                            JSONArray jSONArray = jSONObject3.getJSONArray(str53);
                                                                            int length = jSONArray.length();
                                                                            str8 = string;
                                                                            int i15 = 0;
                                                                            while (i15 < length) {
                                                                                String str54 = fwN.f10446b;
                                                                                int i16 = length;
                                                                                JSONObject jSONObject4 = jSONArray.getJSONObject(i15);
                                                                                JSONArray jSONArray2 = jSONArray;
                                                                                String str55 = fwN.f10446b;
                                                                                String string21 = !jSONObject4.isNull(str55) ? jSONObject4.getString(str55) : null;
                                                                                String str56 = fwN.f10445W;
                                                                                Integer valueOf8 = !jSONObject4.isNull(str56) ? Integer.valueOf(jSONObject4.getInt(str56)) : null;
                                                                                String str57 = fwN.f10447f9;
                                                                                Boolean valueOf9 = !jSONObject4.isNull(str57) ? Boolean.valueOf(jSONObject4.getBoolean(str57)) : null;
                                                                                String str58 = fwN.sVU;
                                                                                Long valueOf10 = !jSONObject4.isNull(str58) ? Long.valueOf(jSONObject4.getLong(str58)) : null;
                                                                                String str59 = fwN.gmP;
                                                                                String string22 = !jSONObject4.isNull(str59) ? jSONObject4.getString(str59) : null;
                                                                                String str60 = fwN.f10443J;
                                                                                String string23 = !jSONObject4.isNull(str60) ? jSONObject4.getString(str60) : null;
                                                                                String str61 = fwN.PqK;
                                                                                if (jSONObject4.isNull(str61)) {
                                                                                    ruF = null;
                                                                                } else {
                                                                                    String string24 = jSONObject4.getString(str61);
                                                                                    try {
                                                                                        Lazy lazy = RuF.f9565W;
                                                                                        ruF2 = NPn.b(string24);
                                                                                    } catch (Throwable unused) {
                                                                                        ruF2 = kR.f10758f9;
                                                                                    }
                                                                                    ruF = ruF2;
                                                                                }
                                                                                String str62 = fwN.f10444V;
                                                                                if (jSONObject4.isNull(str62)) {
                                                                                    i10 = i15;
                                                                                    i11 = i12;
                                                                                    str11 = string2;
                                                                                    arrayList3 = null;
                                                                                } else {
                                                                                    i10 = i15;
                                                                                    ArrayList arrayList5 = new ArrayList();
                                                                                    JSONArray jSONArray3 = jSONObject4.getJSONArray(str62);
                                                                                    i11 = i12;
                                                                                    int length2 = jSONArray3.length();
                                                                                    str11 = string2;
                                                                                    int i17 = 0;
                                                                                    while (i17 < length2) {
                                                                                        String str63 = TKh.f9662b;
                                                                                        int i18 = length2;
                                                                                        JSONObject jSONObject5 = jSONArray3.getJSONObject(i17);
                                                                                        JSONArray jSONArray4 = jSONArray3;
                                                                                        int i19 = i17;
                                                                                        String str64 = TKh.f9662b;
                                                                                        String string25 = !jSONObject5.isNull(str64) ? jSONObject5.getString(str64) : null;
                                                                                        String str65 = string3;
                                                                                        String str66 = TKh.f9661W;
                                                                                        arrayList5.add(new q0n(string25, !jSONObject5.isNull(str66) ? Boolean.valueOf(jSONObject5.getBoolean(str66)) : null));
                                                                                        i17 = i19 + 1;
                                                                                        length2 = i18;
                                                                                        jSONArray3 = jSONArray4;
                                                                                        string3 = str65;
                                                                                    }
                                                                                    arrayList3 = arrayList5;
                                                                                }
                                                                                String str67 = string3;
                                                                                String str68 = fwN.olU;
                                                                                if (jSONObject4.isNull(str68)) {
                                                                                    zjo = null;
                                                                                } else {
                                                                                    String string26 = jSONObject4.getString(str68);
                                                                                    try {
                                                                                        Lazy lazy2 = zJO.f11901W;
                                                                                        zjo2 = TVs.b(string26);
                                                                                    } catch (Throwable unused2) {
                                                                                        zjo2 = Cz7.f8505f9;
                                                                                    }
                                                                                    zjo = zjo2;
                                                                                }
                                                                                arrayList4.add(new ECc(string21, valueOf8, valueOf9, valueOf10, string22, string23, ruF, arrayList3, zjo));
                                                                                i15 = i10 + 1;
                                                                                length = i16;
                                                                                jSONArray = jSONArray2;
                                                                                i12 = i11;
                                                                                string2 = str11;
                                                                                string3 = str67;
                                                                            }
                                                                            arrayList2 = arrayList4;
                                                                        }
                                                                        i5 = i12;
                                                                        str9 = string2;
                                                                        str10 = string3;
                                                                        String str69 = Llq.IB;
                                                                        Long valueOf11 = !jSONObject3.isNull(str69) ? Long.valueOf(jSONObject3.getLong(str69)) : null;
                                                                        String str70 = Llq.Qs;
                                                                        Long valueOf12 = !jSONObject3.isNull(str70) ? Long.valueOf(jSONObject3.getLong(str70)) : null;
                                                                        String str71 = Llq.f9070E;
                                                                        s9tVar = new s9t(valueOf3, valueOf4, string16, string17, string18, string19, string20, valueOf5, valueOf6, valueOf7, arrayList2, valueOf11, valueOf12, !jSONObject3.isNull(str71) ? Long.valueOf(jSONObject3.getLong(str71)) : null);
                                                                    }
                                                                    String str72 = vo.f11582R;
                                                                    if (jSONObject2.isNull(str72)) {
                                                                        s9tVar2 = s9tVar;
                                                                        uxa = null;
                                                                    } else {
                                                                        String str73 = nnj.f10970b;
                                                                        JSONObject jSONObject6 = jSONObject2.getJSONObject(str72);
                                                                        String str74 = nnj.f10970b;
                                                                        Long valueOf13 = !jSONObject6.isNull(str74) ? Long.valueOf(jSONObject6.getLong(str74)) : null;
                                                                        String str75 = nnj.f10969W;
                                                                        String string27 = !jSONObject6.isNull(str75) ? jSONObject6.getString(str75) : null;
                                                                        String str76 = nnj.f10971f9;
                                                                        Long valueOf14 = !jSONObject6.isNull(str76) ? Long.valueOf(jSONObject6.getLong(str76)) : null;
                                                                        String str77 = nnj.sVU;
                                                                        if (jSONObject6.isNull(str77)) {
                                                                            arrayList = null;
                                                                        } else {
                                                                            ArrayList arrayList6 = new ArrayList();
                                                                            JSONArray jSONArray5 = jSONObject6.getJSONArray(str77);
                                                                            int length3 = jSONArray5.length();
                                                                            for (int i20 = 0; i20 < length3; i20++) {
                                                                                arrayList6.add(jSONArray5.getString(i20));
                                                                            }
                                                                            arrayList = arrayList6;
                                                                        }
                                                                        String str78 = nnj.gmP;
                                                                        Long valueOf15 = !jSONObject6.isNull(str78) ? Long.valueOf(jSONObject6.getLong(str78)) : null;
                                                                        String str79 = nnj.f10968J;
                                                                        if (jSONObject6.isNull(str79)) {
                                                                            ipd = null;
                                                                        } else {
                                                                            String str80 = mAt.f10889b;
                                                                            JSONObject jSONObject7 = jSONObject6.getJSONObject(str79);
                                                                            String str81 = mAt.f10889b;
                                                                            Integer valueOf16 = !jSONObject7.isNull(str81) ? Integer.valueOf(jSONObject7.getInt(str81)) : null;
                                                                            String str82 = mAt.f10888W;
                                                                            String string28 = !jSONObject7.isNull(str82) ? jSONObject7.getString(str82) : null;
                                                                            String str83 = mAt.f10890f9;
                                                                            Integer valueOf17 = !jSONObject7.isNull(str83) ? Integer.valueOf(jSONObject7.getInt(str83)) : null;
                                                                            String str84 = mAt.sVU;
                                                                            String string29 = !jSONObject7.isNull(str84) ? jSONObject7.getString(str84) : null;
                                                                            String str85 = mAt.gmP;
                                                                            Boolean valueOf18 = !jSONObject7.isNull(str85) ? Boolean.valueOf(jSONObject7.getBoolean(str85)) : null;
                                                                            String str86 = mAt.f10886J;
                                                                            Integer valueOf19 = !jSONObject7.isNull(str86) ? Integer.valueOf(jSONObject7.getInt(str86)) : null;
                                                                            String str87 = mAt.PqK;
                                                                            Integer valueOf20 = !jSONObject7.isNull(str87) ? Integer.valueOf(jSONObject7.getInt(str87)) : null;
                                                                            String str88 = mAt.f10887V;
                                                                            Boolean valueOf21 = !jSONObject7.isNull(str88) ? Boolean.valueOf(jSONObject7.getBoolean(str88)) : null;
                                                                            String str89 = mAt.olU;
                                                                            ipd = new ipD(valueOf16, string28, valueOf17, string29, valueOf18, valueOf19, valueOf20, valueOf21, !jSONObject7.isNull(str89) ? Long.valueOf(jSONObject7.getLong(str89)) : null);
                                                                        }
                                                                        s9tVar2 = s9tVar;
                                                                        uxa = new Uxa(valueOf13, string27, valueOf14, arrayList, valueOf15, ipd);
                                                                    }
                                                                    z2 = z10;
                                                                    str4 = string4;
                                                                    str5 = string6;
                                                                    str6 = string9;
                                                                    str7 = string12;
                                                                    dzVar = new dz(j11, j12, i13, i14, j13, string14, string15, valueOf2, s9tVar2, uxa);
                                                                    j5 = j6;
                                                                    str = str8;
                                                                    i4 = i5;
                                                                    str2 = str9;
                                                                    str3 = str10;
                                                                } else {
                                                                    throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                                                                }
                                                            } else {
                                                                throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                                                            }
                                                        } else {
                                                            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                                                }
                                            }
                                            return new PIe(j5, str, i4, str2, str3, z2, z11, str4, string5, str5, string7, string8, str6, string10, string11, valueOf, str7, j10, string13, dzVar);
                                        }
                                        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                                    }
                                    throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                                }
                                throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                            }
                            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                        }
                        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                    }
                    throw new IllegalArgumentException("Non-nullable field missing in JSON.");
                }
                throw new IllegalArgumentException("Non-nullable field missing in JSON.");
            }
            throw new IllegalArgumentException("Non-nullable field missing in JSON.");
        }
        throw new IllegalArgumentException("Non-nullable field missing in JSON.");
    }
}
