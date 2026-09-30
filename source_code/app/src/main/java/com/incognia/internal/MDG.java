package com.incognia.internal;

import h9.C1834l;
import h9.n;
import h9.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MDG {

    /* renamed from: W, reason: collision with root package name */
    public final b8P f9108W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9109b;

    /* renamed from: f9, reason: collision with root package name */
    public final oAd f9110f9;
    public final LinkedHashMap gmP = new LinkedHashMap();
    public final K sVU;

    public MDG(pl2 pl2Var, b8P b8p, oAd oad, K k6) {
        this.f9109b = pl2Var;
        this.f9108W = b8p;
        this.f9110f9 = oad;
        this.sVU = k6;
    }

    public static final void W(MDG mdg, String str, List list, rCM rcm) {
        mdg.b(str, list, rcm, false);
    }

    public final void b(List list, rCM rcm, Czx czx) {
        this.f9109b.b(new C1834l(list, czx, this, rcm));
    }

    public static final void b(List list, Czx czx, MDG mdg, rCM rcm) {
        if (list.isEmpty()) {
            if (czx != null) {
                czx.b(true, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        try {
            String uuid = UUID.randomUUID().toString();
            mdg.gmP.put(uuid, new HIN(CollectionsKt.C(list), new LinkedHashSet(), new LinkedHashSet(), new NEA(czx)));
            mdg.b(uuid, rcm);
        } catch (Throwable unused) {
            if (czx != null) {
                czx.b(false, CollectionsKt.emptyList());
            }
        }
    }

    public static final void b(MDG mdg, String str, List list, rCM rcm, Object obj) {
        mdg.f9109b.b(new o(mdg, str, list, rcm, 0));
    }

    public static final void b(MDG mdg, String str, List list, rCM rcm) {
        mdg.b(str, list, rcm, true);
    }

    public static final void b(MDG mdg, String str, List list, rCM rcm, cQM cqm) {
        mdg.f9109b.b(new o(mdg, str, list, rcm, 1));
    }

    public final void b(String str, rCM rcm) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        int i4;
        int i5;
        int i10 = 1;
        HIN hin = (HIN) this.gmP.get(str);
        boolean z2 = false;
        if (hin == null) {
            arrayList = null;
        } else {
            ArrayList B = CollectionsKt.B(CollectionsKt.p(hin.f8831b, new Qry()));
            arrayList = new ArrayList();
            int i11 = 0;
            while (!B.isEmpty()) {
                XD xd2 = (XD) B.remove(0);
                arrayList.add(xd2);
                i11 += xd2.b();
                if (i11 >= 1048576) {
                    break;
                }
            }
        }
        if (arrayList == null) {
            return;
        }
        r3 b2 = this.f9110f9.f11001b.b();
        Long valueOf = b2 != null ? Long.valueOf(b2.f11200b) : null;
        String str2 = b2 != null ? b2.DOu : null;
        long currentTimeMillis = System.currentTimeMillis();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + i10;
            JSONObject W5 = ((XD) obj).W();
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = W5.keys();
            while (keys.hasNext()) {
                int i14 = i10;
                String next = keys.next();
                jSONObject.put(next, W5.get(next));
                z2 = z2;
                i10 = i14;
            }
            int i15 = i10;
            boolean z10 = z2;
            String str3 = ZW.f10043b;
            JSONObject jSONObject2 = new JSONObject();
            if (valueOf != null) {
                i4 = size;
                i5 = i13;
                jSONObject2.put(ZW.f10043b, valueOf.longValue());
            } else {
                i4 = size;
                i5 = i13;
            }
            if (str2 != null) {
                jSONObject2.put(ZW.f10042W, str2);
            }
            jSONObject2.put(ZW.f10044f9, 70901);
            jSONObject2.put(ZW.sVU, currentTimeMillis);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                jSONObject.put(next2, jSONObject2.get(next2));
            }
            arrayList2.add(jSONObject);
            size = i4;
            i12 = i5;
            z2 = z10;
            i10 = i15;
        }
        int i16 = i10;
        boolean z11 = z2;
        TOS tos = new TOS(arrayList2);
        K k6 = this.sVU;
        b8P b8p = this.f9108W;
        iA b4 = k6.b();
        Pair pair = new Pair((String) wGk.eAe.getValue(), (String) wGk.nps.getValue());
        Pair pair2 = new Pair((String) wGk.jz.getValue(), b4.b().toUpperCase(Locale.US));
        Pair pair3 = new Pair((String) wGk.ZSR.getValue(), rcm.b());
        Pair[] pairArr = new Pair[3];
        pairArr[z11 ? 1 : 0] = pair;
        pairArr[i16] = pair2;
        pairArr[2] = pair3;
        b8p.b(tos, true, kotlin.collections.y.tango(pairArr), new n(this, str, arrayList, rcm), new n(this, str, arrayList, rcm));
    }

    public final void b(String str, List list, rCM rcm, boolean z2) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        HIN hin = (HIN) this.gmP.get(str);
        if (hin == null) {
            return;
        }
        if (z2) {
            LinkedHashSet linkedHashSet = hin.f8830W;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((XD) it.next()).gmP);
            }
            linkedHashSet.addAll(arrayList);
        } else {
            LinkedHashSet linkedHashSet2 = hin.f8832f9;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((XD) it2.next()).gmP);
            }
            linkedHashSet2.addAll(arrayList2);
        }
        hin.f8831b.removeAll(CollectionsKt.D(list));
        if (hin.f8831b.isEmpty()) {
            hin.sVU.invoke(Boolean.valueOf(!hin.f8830W.isEmpty()), CollectionsKt.z(hin.f8830W));
            this.gmP.remove(str);
        } else {
            b(str, rcm);
        }
    }
}
