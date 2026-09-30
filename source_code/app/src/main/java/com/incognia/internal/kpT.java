package com.incognia.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class kpT implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Qfa f10781W;

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f10782b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f10783f9 = LazyKt.lazy(bFN.f10166b);
    public Set gmP;
    public Set sVU;

    public kpT(Ssq ssq, Qfa qfa) {
        this.f10782b = ssq;
        this.f10781W = qfa;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10783f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    public final HashMap f9() {
        Bundle bundle;
        int collectionSizeOrDefault;
        String str;
        HashMap hashMap = new HashMap();
        r3 b2 = this.f10782b.b();
        if (b2 != null && (bundle = b2.IB) != null) {
            Set<String> set = this.sVU;
            if (set == null) {
                set = null;
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (String str2 : set) {
                String string = bundle.getString(str2);
                if (string != null) {
                    str = (String) hashMap.put(str2, string);
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
        }
        if (b2 == null) {
            return null;
        }
        return hashMap;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Qfa qfa = this.f10781W;
            S0A s0a = qfa.f9513b;
            String str = Qfa.f9511W;
            ArrayList arrayList = Qfa.gmP;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str, arrayList));
            S0A s0a2 = qfa.f9513b;
            String str2 = Qfa.sVU;
            if (((JSONObject) s0a2.f9574b.get()).optBoolean(str2, false)) {
                C.addAll(arrayList);
            }
            this.sVU = C;
            Qfa qfa2 = this.f10781W;
            S0A s0a3 = qfa2.f9513b;
            String str3 = Qfa.f9512f9;
            ArrayList arrayList2 = Qfa.f9510J;
            LinkedHashSet C10 = CollectionsKt.C(s0a3.b(str3, arrayList2));
            if (((JSONObject) qfa2.f9513b.f9574b.get()).optBoolean(str2, false)) {
                C10.addAll(arrayList2);
            }
            this.gmP = C10;
            String str4 = (String) wGk.oRC.getValue();
            Set set = this.gmP;
            if (set == null) {
                set = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : set) {
                try {
                    Class.forName((String) obj);
                    arrayList3.add(obj);
                } catch (Throwable unused) {
                }
            }
            m206constructorimpl = Result.m206constructorimpl(new eCz(str4, new py(arrayList3, f9())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
