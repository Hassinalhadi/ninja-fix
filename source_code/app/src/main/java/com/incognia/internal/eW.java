package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1824b;
import h9.ag;
import h9.ai;
import h9.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class eW implements Gg, tcn {
    public Function1 IB;

    /* renamed from: J, reason: collision with root package name */
    public final S0A f10368J;
    public final lDy PqK;

    /* renamed from: V, reason: collision with root package name */
    public final ccL f10370V;

    /* renamed from: W, reason: collision with root package name */
    public final XuT f10371W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f10372b;

    /* renamed from: f9, reason: collision with root package name */
    public final L8H f10373f9;
    public final d94 gmP;
    public final dGS olU;
    public final W6 sVU;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f10366Y = (String) wGk.iM.getValue();

    /* renamed from: P, reason: collision with root package name */
    public static final String f10365P = (String) wGk.UGv.getValue();

    /* renamed from: L, reason: collision with root package name */
    public static final long f10364L = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: R, reason: collision with root package name */
    public D5f f10369R = aNe.f10097b;
    public boolean DOu = W();
    public final YKm Qs = new ag(this, 1);

    /* renamed from: E, reason: collision with root package name */
    public final pYm f10367E = new h9.aj(this, 0);

    /* renamed from: n9, reason: collision with root package name */
    public final ozT f10374n9 = new ozT(lFG.f10814b, uS.f11470b, f10366Y);

    public eW(pl2 pl2Var, XuT xuT, L8H l8h, YT yt, W6 w62, d94 d94Var, S0A s0a, lDy ldy, ccL ccl, dGS dgs) {
        this.f10372b = pl2Var;
        this.f10371W = xuT;
        this.f10373f9 = l8h;
        this.sVU = w62;
        this.gmP = d94Var;
        this.f10368J = s0a;
        this.PqK = ldy;
        this.f10370V = ccl;
        this.olU = dgs;
    }

    public final boolean DOu() {
        try {
            return this.gmP.b(new h9.aj(this, 1));
        } catch (Throwable th) {
            this.f10373f9.b(th, false);
            return false;
        }
    }

    public final void IB() {
        try {
            ArrayList W5 = this.gmP.W();
            if (W5 != null) {
                W(W5);
            }
            this.gmP.W(this.f10367E);
        } catch (Throwable th) {
            this.f10373f9.b(th, false);
        }
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f10369R = tOI.f11377b;
    }

    @Override // com.incognia.internal.tcn
    public final void PqK() {
        njO.b(this, new ai(this, 0));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final ArrayList R() {
        JSONArray optJSONArray;
        try {
            ozT ozt = this.f10374n9;
            String gmP = QHn.f9492b.gmP(f10366Y);
            ozt.getClass();
            if (gmP == null || (optJSONArray = new JSONObject(gmP).optJSONArray(ozt.f11043f9)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                arrayList.add(ozt.f11041W.invoke(optJSONArray.getJSONObject(i4)));
            }
            return arrayList;
        } catch (Throwable unused) {
            QHn.f9492b.b(f10366Y);
            return null;
        }
    }

    @Override // com.incognia.internal.tcn
    public final void V() {
        DF7.b(this);
    }

    @Override // com.incognia.internal.tcn
    public final boolean W() {
        return this.f10370V.W(f10366Y) && this.olU.b();
    }

    @Override // com.incognia.internal.sX
    public final void b(S0A s0a) {
        DF7.W(this);
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f10369R = b66.f10146b;
        njO.b(this, new ai(this, 3));
    }

    @Override // com.incognia.internal.tcn
    public final boolean gmP() {
        return this.DOu;
    }

    @Override // com.incognia.internal.tcn
    public final void olU() {
        njO.b(this, new ai(this, 2));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f10369R;
    }

    public static final void sVU(eW eWVar) {
        dGS dgs = eWVar.olU;
        dgs.f10306f9.add(eWVar.Qs);
        if (eWVar.DOu) {
            eWVar.IB();
        }
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10372b;
    }

    public static final void W(eW eWVar) {
        eWVar.getClass();
        try {
            eWVar.gmP.f9(eWVar.f10367E);
        } catch (Throwable th) {
            eWVar.f10373f9.b(th, false);
        }
    }

    @Override // com.incognia.internal.tcn
    public final void b(boolean z2) {
        this.DOu = z2;
    }

    public static final void b(eW eWVar, Function0 function0) {
        if (eWVar.DOu) {
            try {
                eWVar.gmP.f9(eWVar.f10367E);
            } catch (Throwable th) {
                eWVar.f10373f9.b(th, false);
            }
        }
        dGS dgs = eWVar.olU;
        dgs.f10306f9.remove(eWVar.Qs);
        eWVar.f10369R = L4.f9041b;
        function0.invoke();
    }

    public static final void f9(eW eWVar, List list) {
        njO.b(eWVar, new ak(eWVar, list, 1));
    }

    public static final void f9(eW eWVar) {
        eWVar.IB();
    }

    public static final void W(eW eWVar, List list) {
        ArrayList R10 = eWVar.W(list) ? eWVar.R() : null;
        Function1 function1 = eWVar.IB;
        if (function1 != null) {
            j.quebec(Result.m206constructorimpl(R10), function1);
        }
        eWVar.IB = null;
    }

    public static final void sVU(eW eWVar, List list) {
        Object obj;
        if (list != null) {
            ArrayList R10 = eWVar.R();
            if (eWVar.W(list)) {
                Function1 function1 = eWVar.IB;
                Object obj2 = null;
                if (function1 != null) {
                    Result.Companion companion = Result.INSTANCE;
                    j.quebec(Result.m206constructorimpl(eWVar.R()), function1);
                    eWVar.IB = null;
                    return;
                }
                if (((JSONObject) eWVar.f10368J.f9574b.get()).optBoolean(f10365P, true)) {
                    lDy ldy = eWVar.PqK;
                    if (R10 != null && !R10.isEmpty() && !list.isEmpty()) {
                        int size = R10.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                obj = null;
                                break;
                            }
                            obj = R10.get(i4);
                            i4++;
                            if (((MM) obj).sVU) {
                                break;
                            }
                        }
                        MM mm = (MM) obj;
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((MM) next).sVU) {
                                obj2 = next;
                                break;
                            }
                        }
                        MM mm2 = (MM) obj2;
                        if (mm != null && mm2 != null) {
                            String str = mm.PqK;
                            String str2 = mm.f9113J;
                            zPj zpj = new zPj(str, str2);
                            zPj zpj2 = new zPj(mm2.PqK, mm2.f9113J);
                            if ((str != null || str2 != null) && Intrinsics.areEqual(zpj, zpj2)) {
                                return;
                            }
                        }
                        LinkedHashMap b2 = ldy.b(R10);
                        LinkedHashMap b4 = ldy.b(list);
                        double q4 = CollectionsKt.q(b4.values()) + CollectionsKt.q(b2.values());
                        double d4 = 0.0d;
                        if (q4 != 0.0d) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : b2.entrySet()) {
                                if (b4.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            double q5 = CollectionsKt.q(linkedHashMap.values());
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : b4.entrySet()) {
                                if (b2.containsKey(entry2.getKey())) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            d4 = (CollectionsKt.q(linkedHashMap2.values()) + q5) / q4;
                        }
                        if (d4 > 0.15d) {
                            return;
                        }
                    }
                    eWVar.f10371W.b(new Nh(PiD.f9444W));
                    return;
                }
                return;
            }
            return;
        }
        eWVar.getClass();
    }

    public static final void b(eW eWVar, boolean z2) {
        njO.b(eWVar, new ai(eWVar, 1));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final boolean W(List list) {
        if (list != null && !b(list)) {
            ArrayList R10 = R();
            if (R10 != null && !R10.isEmpty() && !list.isEmpty() && R10.size() == list.size()) {
                if (!R10.isEmpty()) {
                    int size = R10.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = R10.get(i4);
                        i4++;
                        if (!list.contains((MM) obj)) {
                        }
                    }
                }
            }
            ozT ozt = this.f10374n9;
            ozt.getClass();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(ozt.f11042b.invoke(it.next()));
            }
            JSONObject put = new JSONObject().put(ozt.f11043f9, jSONArray);
            QHn.f9492b.b(f10366Y, put != null ? put.toString() : null);
            return true;
        }
        return false;
    }

    public static final void b(eW eWVar) {
        eWVar.getClass();
        DF7.b(eWVar);
    }

    public final void b(xSL xsl) {
        if (njO.b(this, new C1824b(29, this, xsl))) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        xsl.b(Result.m206constructorimpl(ResultKt.createFailure(new KcS(f10366Y))));
    }

    public static final void b(eW eWVar, Function1 function1) {
        if (eWVar.R() != null && !eWVar.b(eWVar.R())) {
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(eWVar.R()), function1);
        } else if (!eWVar.DOu()) {
            Result.Companion companion2 = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new kx3(f10366Y))), function1);
        } else {
            eWVar.IB = function1;
        }
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(28, this, cj0));
    }

    public static final void b(eW eWVar, List list) {
        njO.b(eWVar, new ak(eWVar, list, 0));
    }

    public final boolean b(List list) {
        Long l10;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((MM) it.next()).f9117f9);
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((MM) it.next()).f9117f9);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l10 = valueOf;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            return true;
        }
        this.sVU.getClass();
        return System.currentTimeMillis() - l10.longValue() > f10364L;
    }
}
