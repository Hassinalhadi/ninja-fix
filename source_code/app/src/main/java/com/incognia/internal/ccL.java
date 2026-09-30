package com.incognia.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ccL {

    /* renamed from: W, reason: collision with root package name */
    public static final String f10254W = (String) wGk.ORU.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public static final Map f10255f9;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f10256b;

    static {
        String str = (String) wGk.f11680b.getValue();
        int i4 = AI.f8345V;
        Pair pair = new Pair(str, OiT.b(false));
        Pair pair2 = new Pair((String) wGk.f11664W.getValue(), OiT.b(false));
        Pair pair3 = new Pair((String) wGk.f11690f9.getValue(), OiT.b(false));
        Pair pair4 = new Pair((String) wGk.sVU.getValue(), OiT.b(false));
        Pair pair5 = new Pair((String) wGk.gmP.getValue(), OiT.b(false));
        Pair pair6 = new Pair((String) wGk.PqK.getValue(), OiT.b(false));
        Pair pair7 = new Pair((String) wGk.f11660V.getValue(), OiT.b(false));
        Pair pair8 = new Pair((String) wGk.olU.getValue(), OiT.b(false));
        Pair pair9 = new Pair((String) wGk.f11732w.getValue(), OiT.b(false));
        Pair pair10 = new Pair((String) wGk.f11649R.getValue(), OiT.b(false));
        String str2 = (String) wGk.DOu.getValue();
        TimeUnit timeUnit = TimeUnit.DAYS;
        Long valueOf = Long.valueOf(timeUnit.toMillis(7L));
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        Pair pair11 = new Pair(str2, new AI(valueOf, bool, bool2, bool2, (Boolean) null, 40));
        Pair pair12 = new Pair((String) wGk.IB.getValue(), OiT.b(false));
        Pair pair13 = new Pair((String) wGk.f11708n9.getValue(), OiT.b(false));
        Pair pair14 = new Pair((String) wGk.f11670Y.getValue(), OiT.b());
        Pair pair15 = new Pair((String) wGk.Qs.getValue(), OiT.b(true));
        Pair pair16 = new Pair((String) wGk.f11614E.getValue(), OiT.b(false));
        Pair pair17 = new Pair((String) wGk.f11699k.getValue(), OiT.b());
        Pair pair18 = new Pair((String) wGk.f11642P.getValue(), OiT.b(false));
        Pair pair19 = new Pair((String) wGk.kTC.getValue(), OiT.b(false));
        Pair pair20 = new Pair((String) wGk.f11630L.getValue(), OiT.b(false));
        Pair pair21 = new Pair((String) wGk.FL.getValue(), OiT.b(false));
        Pair pair22 = new Pair((String) wGk.f11678ar.getValue(), OiT.b(false));
        Pair pair23 = new Pair((String) wGk.H02.getValue(), OiT.b(false));
        Pair pair24 = new Pair((String) wGk.jgi.getValue(), OiT.b(false));
        Pair pair25 = new Pair((String) wGk.f11628K.getValue(), OiT.b(false));
        Pair pair26 = new Pair((String) wGk.f11645P7.getValue(), new AI(Long.valueOf(timeUnit.toMillis(1L)), bool, bool2, bool2, bool2, 8));
        Pair pair27 = new Pair((String) wGk.qnE.getValue(), OiT.b(false));
        Pair pair28 = new Pair((String) wGk.f11723s0.getValue(), OiT.b(false));
        Pair pair29 = new Pair((String) wGk.eeB.getValue(), OiT.b(false));
        Pair pair30 = new Pair((String) wGk.Gw.getValue(), OiT.b(false));
        Pair pair31 = new Pair((String) wGk.f11733x.getValue(), new AI(Long.valueOf(timeUnit.toMillis(1L)), bool, bool2, bool2, bool2, 8));
        Pair pair32 = new Pair((String) wGk.f11617G.getValue(), OiT.b(false));
        Pair pair33 = new Pair((String) wGk.Sn.getValue(), OiT.b(false));
        Pair pair34 = new Pair((String) wGk.jG.getValue(), OiT.b(false));
        Pair pair35 = new Pair((String) wGk.iMc.getValue(), OiT.b(false));
        Pair pair36 = new Pair((String) wGk.lCi.getValue(), OiT.b());
        Pair pair37 = new Pair((String) wGk.bCl.getValue(), OiT.b());
        Pair pair38 = new Pair((String) wGk.f11696i.getValue(), OiT.b(true));
        Pair pair39 = new Pair((String) wGk.eHc.getValue(), OiT.b());
        Pair pair40 = new Pair((String) wGk.f11653S.getValue(), OiT.b());
        Pair pair41 = new Pair((String) wGk.mn.getValue(), OiT.b(false));
        Pair pair42 = new Pair((String) wGk.Uj.getValue(), OiT.b(false));
        Pair pair43 = new Pair((String) wGk.VL.getValue(), OiT.b());
        Pair pair44 = new Pair((String) wGk.wcf.getValue(), OiT.b(false));
        Pair pair45 = new Pair((String) wGk.f11633M.getValue(), OiT.b(false));
        String str3 = (String) wGk.f11718r.getValue();
        int i5 = AI.f8345V;
        f10255f9 = kotlin.collections.y.sierra(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, new Pair(str3, OiT.b()), new Pair((String) wGk.s1O.getValue(), OiT.b(false)), new Pair((String) wGk.Lu.getValue(), OiT.b(false)), new Pair((String) wGk.f11621H8.getValue(), new AI(Long.valueOf(timeUnit.toMillis(1L)), bool, bool2, bool, bool2, 8)), new Pair((String) wGk.n4S.getValue(), OiT.b(false)), new Pair((String) wGk.CM5.getValue(), OiT.b(false)), new Pair((String) wGk.i2a.getValue(), OiT.b(false)), new Pair((String) wGk.Q.getValue(), OiT.b(true)), new Pair((String) wGk.rkR.getValue(), OiT.b()), new Pair((String) wGk.AL.getValue(), OiT.b()), new Pair((String) wGk.OyQ.getValue(), OiT.b()), new Pair((String) wGk.f11736z.getValue(), OiT.b(false)), new Pair((String) wGk.C.getValue(), OiT.b(false)), new Pair((String) wGk.OJ.getValue(), OiT.b(false)), new Pair((String) wGk.TF1.getValue(), OiT.b(false)), new Pair((String) wGk.mi.getValue(), OiT.b(false)), new Pair((String) wGk.f11681b8.getValue(), OiT.b(false)), new Pair((String) wGk.nT.getValue(), OiT.b(false)), new Pair((String) wGk.hod.getValue(), OiT.b(false)), new Pair((String) wGk.Ni.getValue(), OiT.b()), new Pair((String) wGk.grA.getValue(), OiT.b(false)), new Pair((String) wGk.iM.getValue(), OiT.b(true)), new Pair((String) wGk.f11734xg.getValue(), OiT.b(false)), new Pair((String) wGk.Wdw.getValue(), OiT.b(false)), new Pair((String) wGk.zX.getValue(), OiT.b(false)), new Pair((String) wGk.f11735y.getValue(), OiT.b(false)), new Pair((String) wGk.pTL.getValue(), OiT.b(false)), new Pair((String) wGk.PRS.getValue(), OiT.b(false)), new Pair((String) wGk.GT.getValue(), OiT.b(false)), new Pair((String) wGk.oRC.getValue(), OiT.b(false)), new Pair((String) wGk.f11722s.getValue(), OiT.b(false)), new Pair((String) wGk.YaL.getValue(), OiT.b(false)), new Pair((String) wGk.el.getValue(), OiT.b(false)), new Pair((String) wGk.j43.getValue(), OiT.b(false)), new Pair((String) wGk.JE.getValue(), OiT.b(false)));
    }

    public ccL(S0A s0a) {
        this.f10256b = s0a;
    }

    public final boolean W(String str) {
        Boolean bool;
        AI b2 = b(str);
        if (b2 != null && (bool = b2.f8349f9) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.t] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.HashMap] */
    public final AI b(String str) {
        Long l10;
        Boolean bool;
        Boolean bool2;
        ArrayList arrayList;
        Boolean bool3;
        JSONObject optJSONObject;
        S0A s0a = this.f10256b;
        String str2 = f10254W;
        ?? r22 = t.alpha;
        JSONObject optJSONObject2 = ((JSONObject) s0a.f9574b.get()).optJSONObject(str2);
        if (optJSONObject2 != null) {
            r22 = new HashMap();
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (optJSONObject = optJSONObject2.optJSONObject(next)) != null) {
                    r22.put(next, optJSONObject);
                }
            }
        }
        JSONObject jSONObject = (JSONObject) r22.get(str);
        if (jSONObject != null) {
            String str3 = uTx.f11473b;
            Boolean bool4 = null;
            if (!jSONObject.isNull(str3)) {
                l10 = Long.valueOf(jSONObject.getLong(str3));
            } else {
                l10 = null;
            }
            String str4 = uTx.f11472W;
            if (!jSONObject.isNull(str4)) {
                bool = Boolean.valueOf(jSONObject.getBoolean(str4));
            } else {
                bool = null;
            }
            String str5 = uTx.f11474f9;
            if (!jSONObject.isNull(str5)) {
                bool2 = Boolean.valueOf(jSONObject.getBoolean(str5));
            } else {
                bool2 = null;
            }
            String str6 = uTx.sVU;
            if (!jSONObject.isNull(str6)) {
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray(str6);
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList2.add(jSONArray.getString(i4));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            String str7 = uTx.gmP;
            if (!jSONObject.isNull(str7)) {
                bool3 = Boolean.valueOf(jSONObject.getBoolean(str7));
            } else {
                bool3 = null;
            }
            String str8 = uTx.f11471J;
            if (!jSONObject.isNull(str8)) {
                bool4 = Boolean.valueOf(jSONObject.getBoolean(str8));
            }
            return new AI(l10, bool, bool2, arrayList, bool3, bool4);
        }
        return (AI) f10255f9.get(str);
    }
}
