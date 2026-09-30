package com.incognia.internal;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.t;
import kotlin.k;

/* loaded from: classes2.dex */
public final class H9w implements M1 {
    static {
    }

    @Override // com.incognia.internal.M1
    public final boolean W() {
        return true;
    }

    @Override // com.incognia.internal.M1
    public final int b() {
        return 3;
    }

    @Override // com.incognia.internal.M1
    public final void b(Context context) {
        Object m206constructorimpl;
        Set g2 = ArraysKt.g(new String[]{(String) wGk.f11657U.getValue(), (String) wGk.f11664W.getValue(), (String) wGk.zT.getValue()});
        Nk6 nk6 = QHn.sVU;
        nk6.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = g2.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(nk6.f9((String) it.next()));
            }
            Map<String, ?> all = nk6.f9244b.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!linkedHashSet.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.y.quebec(linkedHashMap.size()));
            for (Object obj : linkedHashMap.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Object value = ((Map.Entry) obj).getValue();
                linkedHashMap2.put(key, value != null ? value.toString() : null);
            }
            m206constructorimpl = Result.m206constructorimpl(linkedHashMap2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        t tVar = t.alpha;
        if (m206constructorimpl instanceof k) {
            m206constructorimpl = tVar;
        }
        Map map = (Map) m206constructorimpl;
        kT kTVar = QHn.f9492b;
        kTVar.getClass();
        try {
            for (Map.Entry entry2 : map.entrySet()) {
                String str = (String) entry2.getKey();
                String str2 = (String) entry2.getValue();
                if (str2 != null) {
                    kTVar.gmP.put(str, str2);
                } else {
                    kTVar.gmP.remove(str);
                }
            }
            kTVar.f10760J.incrementAndGet();
            kTVar.sVU();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        QHn.sVU.b(g2);
    }
}
