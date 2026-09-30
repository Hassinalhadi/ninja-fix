package com.incognia.internal;

import com.zendesk.service.HttpConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class xV implements P0 {
    public static final String gmP = (String) wGk.WQ.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final Dv f11797W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f11798b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11799f9 = LazyKt.lazy(qcw.f11159b);
    public final F4x sVU = new F4x();

    public xV(S0A s0a, Dv dv) {
        this.f11798b = s0a;
        this.f11797W = dv;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11799f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        int collectionSizeOrDefault;
        pAe pae;
        try {
            Result.Companion companion = Result.INSTANCE;
            U6T b2 = this.f11797W.b(OFM.f9292b);
            List list = b2 != null ? b2.f9693b : null;
            if (list == null) {
                pae = new pAe((String) this.f11799f9.getValue(), null);
            } else {
                int min = Math.min(((JSONObject) this.f11798b.f9574b.get()).optInt(gmP, 20), HttpConstants.HTTP_INTERNAL_ERROR);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((r3) obj).sVU) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    Long valueOf = Long.valueOf(((r3) obj2).f11201f9);
                    Object obj3 = linkedHashMap.get(valueOf);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(valueOf, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((List) entry.getValue()).size() == 1) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                List<r3> r4 = CollectionsKt.r(CollectionsKt.p(CollectionsKt.indigo(linkedHashMap2.values()), new Vis()), min);
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                for (r3 r3Var : r4) {
                    this.sVU.getClass();
                    arrayList2.add(new D(r3Var.f11200b, r3Var.f11198W, r3Var.f11201f9, r3Var.f11195P, r3Var.DOu, r3Var.f11196R, null, r3Var.f11202n9, r3Var.f11194L));
                }
                Integer valueOf2 = Integer.valueOf(list.size());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (((r3) obj4).sVU) {
                        arrayList3.add(obj4);
                    }
                }
                pae = new pAe((String) this.f11799f9.getValue(), new Kq(arrayList2, valueOf2, Integer.valueOf(arrayList3.size()), Boolean.valueOf(b2.b(OFM.f9292b))));
            }
            m206constructorimpl = Result.m206constructorimpl(pae);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
