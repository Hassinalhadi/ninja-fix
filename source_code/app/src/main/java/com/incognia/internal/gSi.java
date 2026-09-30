package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class gSi extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gSi f10480b = new gSi();

    public gSi() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        syj syjVar = (syj) obj;
        String str = tP.f11393b;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = syjVar.f11342b;
        if (obj2 != null) {
            jSONObject.put(tP.f11393b, obj2);
        }
        Object obj3 = syjVar.f11339W;
        if (obj3 != null) {
            jSONObject.put(tP.f11390W, obj3);
        }
        Object obj4 = syjVar.f11344f9;
        if (obj4 != null) {
            jSONObject.put(tP.f11395f9, obj4);
        }
        Object obj5 = syjVar.sVU;
        if (obj5 != null) {
            jSONObject.put(tP.sVU, obj5);
        }
        Object obj6 = syjVar.gmP;
        if (obj6 != null) {
            jSONObject.put(tP.gmP, obj6);
        }
        Long l10 = syjVar.f11331J;
        if (l10 != null) {
            jSONObject.put(tP.f11382J, l10.longValue());
        }
        Object obj7 = syjVar.PqK;
        if (obj7 != null) {
            jSONObject.put(tP.PqK, obj7);
        }
        Boolean bool = syjVar.f11338V;
        if (bool != null) {
            jSONObject.put(tP.f11389V, bool.booleanValue());
        }
        Integer num = syjVar.olU;
        if (num != null) {
            jSONObject.put(tP.olU, num.intValue());
        }
        Integer num2 = syjVar.f11336R;
        if (num2 != null) {
            jSONObject.put(tP.f11387R, num2.intValue());
        }
        Double d4 = syjVar.DOu;
        if (d4 != null) {
            jSONObject.put(tP.DOu, d4.doubleValue());
        }
        Integer num3 = syjVar.IB;
        if (num3 != null) {
            jSONObject.put(tP.IB, num3.intValue());
        }
        Object obj8 = syjVar.Qs;
        if (obj8 != null) {
            jSONObject.put(tP.Qs, obj8);
        }
        Object obj9 = syjVar.f11327E;
        if (obj9 != null) {
            jSONObject.put(tP.f11378E, obj9);
        }
        Object obj10 = syjVar.f11346n9;
        if (obj10 != null) {
            jSONObject.put(tP.f11397n9, obj10);
        }
        Object obj11 = syjVar.f11340Y;
        if (obj11 != null) {
            jSONObject.put(tP.f11391Y, obj11);
        }
        Object obj12 = syjVar.f11335P;
        if (obj12 != null) {
            jSONObject.put(tP.f11386P, obj12);
        }
        if (syjVar.f11333L != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = syjVar.f11333L;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj13 = arrayList.get(i4);
                i4++;
                c7p c7pVar = (c7p) obj13;
                String str2 = M9r.f9104b;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(M9r.f9104b, c7pVar.f10225b);
                jSONObject2.put(M9r.f9103W, c7pVar.f10224W);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(tP.f11384L, jSONArray);
        }
        Object obj14 = syjVar.FL;
        if (obj14 != null) {
            jSONObject.put(tP.FL, obj14);
        }
        Long l11 = syjVar.f11341ar;
        if (l11 != null) {
            jSONObject.put(tP.f11392ar, l11.longValue());
        }
        Long l12 = syjVar.a2F;
        if (l12 != null) {
            jSONObject.put(tP.a2F, l12.longValue());
        }
        Boolean bool2 = syjVar.f11329H;
        if (bool2 != null) {
            jSONObject.put(tP.f11380H, bool2.booleanValue());
        }
        Boolean bool3 = syjVar.H02;
        if (bool3 != null) {
            jSONObject.put(tP.H02, bool3.booleanValue());
        }
        Object obj15 = syjVar.jgi;
        if (obj15 != null) {
            jSONObject.put(tP.jgi, obj15);
        }
        Object obj16 = syjVar.f11332K;
        if (obj16 != null) {
            jSONObject.put(tP.f11383K, obj16);
        }
        if (syjVar.qnE != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = syjVar.qnE.iterator();
            while (it.hasNext()) {
                jSONArray2.put((String) it.next());
            }
            jSONObject.put(tP.qnE, jSONArray2);
        }
        if (syjVar.f11348s0 != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator it2 = syjVar.f11348s0.iterator();
            while (it2.hasNext()) {
                jSONArray3.put((String) it2.next());
            }
            jSONObject.put(tP.f11399s0, jSONArray3);
        }
        Long l13 = syjVar.eeB;
        if (l13 != null) {
            jSONObject.put(tP.eeB, l13.longValue());
        }
        Object obj17 = syjVar.Gw;
        if (obj17 != null) {
            jSONObject.put(tP.Gw, obj17);
        }
        Double d9 = syjVar.f11328G;
        if (d9 != null) {
            jSONObject.put(tP.f11379G, d9.doubleValue());
        }
        Double d10 = syjVar.Pk;
        if (d10 != null) {
            jSONObject.put(tP.Pk, d10.doubleValue());
        }
        Boolean bool4 = syjVar.fI;
        if (bool4 != null) {
            jSONObject.put(tP.fI, bool4.booleanValue());
        }
        Boolean bool5 = syjVar.WdK;
        if (bool5 != null) {
            jSONObject.put(tP.WdK, bool5.booleanValue());
        }
        Object obj18 = syjVar.Sn;
        if (obj18 != null) {
            jSONObject.put(tP.Sn, obj18);
        }
        Long l14 = syjVar.jG;
        if (l14 != null) {
            jSONObject.put(tP.jG, l14.longValue());
        }
        Object obj19 = syjVar.oI;
        if (obj19 != null) {
            jSONObject.put(tP.oI, obj19);
        }
        Boolean bool6 = syjVar.iMc;
        if (bool6 != null) {
            jSONObject.put(tP.iMc, bool6.booleanValue());
        }
        Object obj20 = syjVar.vZZ;
        if (obj20 != null) {
            jSONObject.put(tP.vZZ, obj20);
        }
        Object obj21 = syjVar.f11345i;
        if (obj21 != null) {
            jSONObject.put(tP.f11396i, obj21);
        }
        Long l15 = syjVar.eHc;
        if (l15 != null) {
            jSONObject.put(tP.eHc, l15.longValue());
        }
        Long l16 = syjVar.f11337S;
        if (l16 != null) {
            jSONObject.put(tP.f11388S, l16.longValue());
        }
        Object obj22 = syjVar.mn;
        if (obj22 != null) {
            jSONObject.put(tP.mn, obj22);
        }
        Object obj23 = syjVar.Uj;
        if (obj23 != null) {
            jSONObject.put(tP.Uj, obj23);
        }
        Integer num4 = syjVar.VL;
        if (num4 != null) {
            jSONObject.put(tP.VL, num4.intValue());
        }
        Object obj24 = syjVar.wcf;
        if (obj24 != null) {
            jSONObject.put(tP.wcf, obj24);
        }
        Object obj25 = syjVar.f11334M;
        if (obj25 != null) {
            jSONObject.put(tP.f11385M, obj25);
        }
        Long l17 = syjVar.f11347r;
        if (l17 != null) {
            jSONObject.put(tP.f11398r, l17.longValue());
        }
        Object obj26 = syjVar.s1O;
        if (obj26 != null) {
            jSONObject.put(tP.s1O, obj26);
        }
        Object obj27 = syjVar.Lu;
        if (obj27 != null) {
            jSONObject.put(tP.Lu, obj27);
        }
        if (syjVar.f11330H8 != null) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator it3 = syjVar.f11330H8.iterator();
            while (it3.hasNext()) {
                jSONArray4.put((String) it3.next());
            }
            jSONObject.put(tP.f11381H8, jSONArray4);
        }
        Object obj28 = syjVar.n4S;
        if (obj28 != null) {
            jSONObject.put(tP.n4S, obj28);
        }
        if (syjVar.CM5 != null) {
            JSONArray jSONArray5 = new JSONArray();
            Iterator it4 = syjVar.CM5.iterator();
            while (it4.hasNext()) {
                jSONArray5.put((String) it4.next());
            }
            jSONObject.put(tP.CM5, jSONArray5);
        }
        if (syjVar.Q != null) {
            JSONArray jSONArray6 = new JSONArray();
            Iterator it5 = syjVar.Q.iterator();
            while (it5.hasNext()) {
                jSONArray6.put((String) it5.next());
            }
            jSONObject.put(tP.Q, jSONArray6);
        }
        if (syjVar.Mo1 != null) {
            JSONArray jSONArray7 = new JSONArray();
            Iterator it6 = syjVar.Mo1.iterator();
            while (it6.hasNext()) {
                jSONArray7.put((String) it6.next());
            }
            jSONObject.put(tP.Mo1, jSONArray7);
        }
        Integer num5 = syjVar.nK;
        if (num5 != null) {
            jSONObject.put(tP.nK, num5.intValue());
        }
        if (syjVar.AL != null) {
            JSONArray jSONArray8 = new JSONArray();
            Iterator it7 = syjVar.AL.iterator();
            while (it7.hasNext()) {
                jSONArray8.put((String) it7.next());
            }
            jSONObject.put(tP.AL, jSONArray8);
        }
        if (syjVar.OyQ != null) {
            JSONArray jSONArray9 = new JSONArray();
            Iterator it8 = syjVar.OyQ.iterator();
            while (it8.hasNext()) {
                jSONArray9.put((String) it8.next());
            }
            jSONObject.put(tP.OyQ, jSONArray9);
        }
        if (syjVar.f11349z != null) {
            JSONArray jSONArray10 = new JSONArray();
            Iterator it9 = syjVar.f11349z.iterator();
            while (it9.hasNext()) {
                jSONArray10.put((String) it9.next());
            }
            jSONObject.put(tP.f11400z, jSONArray10);
        }
        if (syjVar.C != null) {
            JSONArray jSONArray11 = new JSONArray();
            Iterator it10 = syjVar.C.iterator();
            while (it10.hasNext()) {
                jSONArray11.put((String) it10.next());
            }
            jSONObject.put(tP.C, jSONArray11);
        }
        if (syjVar.OJ != null) {
            JSONArray jSONArray12 = new JSONArray();
            Iterator it11 = syjVar.OJ.iterator();
            while (it11.hasNext()) {
                jSONArray12.put((String) it11.next());
            }
            jSONObject.put(tP.OJ, jSONArray12);
        }
        if (syjVar.TF1 != null) {
            JSONArray jSONArray13 = new JSONArray();
            Iterator it12 = syjVar.TF1.iterator();
            while (it12.hasNext()) {
                jSONArray13.put((String) it12.next());
            }
            jSONObject.put(tP.TF1, jSONArray13);
        }
        if (syjVar.mi != null) {
            JSONArray jSONArray14 = new JSONArray();
            Iterator it13 = syjVar.mi.iterator();
            while (it13.hasNext()) {
                jSONArray14.put((String) it13.next());
            }
            jSONObject.put(tP.mi, jSONArray14);
        }
        Object obj29 = syjVar.f11343b8;
        if (obj29 != null) {
            jSONObject.put(tP.f11394b8, obj29);
        }
        Long l18 = syjVar.nT;
        if (l18 != null) {
            jSONObject.put(tP.nT, l18.longValue());
        }
        Long l19 = syjVar.hod;
        if (l19 != null) {
            jSONObject.put(tP.hod, l19.longValue());
        }
        Boolean bool7 = syjVar.Ni;
        if (bool7 != null) {
            jSONObject.put(tP.Ni, bool7.booleanValue());
        }
        return jSONObject;
    }
}
