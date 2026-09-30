package com.incognia.internal;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class FG implements P0 {
    public Set DOu;
    public Set IB;

    /* renamed from: J, reason: collision with root package name */
    public final Lazy f8657J = LazyKt.lazy(Fe.f8720b);
    public Set PqK;

    /* renamed from: R, reason: collision with root package name */
    public Set f8658R;

    /* renamed from: V, reason: collision with root package name */
    public Set f8659V;

    /* renamed from: W, reason: collision with root package name */
    public final Dv f8660W;

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f8661b;

    /* renamed from: f9, reason: collision with root package name */
    public final SWf f8662f9;
    public final vY gmP;
    public Set olU;
    public final jCW sVU;
    public static final String Qs = (String) wGk.Daf.getValue();

    /* renamed from: E, reason: collision with root package name */
    public static final String f8655E = (String) wGk.NI.getValue();

    /* renamed from: n9, reason: collision with root package name */
    public static final Qi f8656n9 = Qi.f9515b;

    public FG(Ssq ssq, Dv dv, SWf sWf, jCW jcw, vY vYVar) {
        this.f8661b = ssq;
        this.f8660W = dv;
        this.f8662f9 = sWf;
        this.sVU = jcw;
        this.gmP = vYVar;
    }

    public static ArrayList sVU(List list) {
        int collectionSizeOrDefault;
        Bundle bundle;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            r3 r3Var = (r3) obj;
            if (r3Var.f11196R != null && (bundle = r3Var.IB) != null && bundle.containsKey(f8655E)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((r3) obj2).f11196R);
        }
        return arrayList2;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8657J.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List f9(List list) {
        Object m206constructorimpl;
        List list2;
        List list3;
        String str;
        fKw fkw;
        String str2;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (list != null && this.gmP.sVU) {
            Intent intent = new Intent((String) wGk.nn.getValue());
            Ssq ssq = this.f8661b;
            String str3 = Ssq.f9623R;
            ssq.getClass();
            try {
                list3 = Uck.b(ssq.f9626W, intent);
            } catch (Throwable unused) {
                list3 = null;
            }
            if (list3 != null) {
                if (list3.isEmpty()) {
                    list2 = CollectionsKt.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((r3) obj2).sVU) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        String str4 = ((r3) obj3).f11196R;
                        if (str4 != null) {
                            arrayList2.add(str4);
                        }
                    }
                    HashSet x4 = CollectionsKt.x(arrayList2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                        if (activityInfo != null) {
                            str = activityInfo.packageName;
                        } else {
                            str = null;
                        }
                        if (activityInfo != null && activityInfo.exported && str != null && !linkedHashMap.containsKey(str) && !x4.contains(str)) {
                            Ssq ssq2 = this.f8661b;
                            ssq2.getClass();
                            try {
                                fkw = ssq2.f9(str);
                            } catch (Throwable unused2) {
                                fkw = null;
                            }
                            if (fkw != null) {
                                str2 = fkw.f10409b;
                            } else {
                                str2 = null;
                            }
                            linkedHashMap.put(str, new CS(str, str2, Boolean.FALSE));
                        }
                    }
                    list2 = CollectionsKt.z(linkedHashMap.values());
                }
                m206constructorimpl = Result.m206constructorimpl(list2);
                if (!(m206constructorimpl instanceof k)) {
                    obj = m206constructorimpl;
                }
                return (List) obj;
            }
        }
        list2 = null;
        m206constructorimpl = Result.m206constructorimpl(list2);
        if (!(m206constructorimpl instanceof k)) {
        }
        return (List) obj;
    }

    public final ArrayList W(List list) {
        int collectionSizeOrDefault;
        if (list == null) {
            return null;
        }
        Set set = this.PqK;
        if (set == null) {
            set = null;
        }
        Set set2 = this.f8659V;
        if (set2 == null) {
            set2 = null;
        }
        LinkedHashSet mike = ab.mike(set, set2);
        Set set3 = this.olU;
        if (set3 == null) {
            set3 = null;
        }
        LinkedHashSet mike2 = ab.mike(mike, set3);
        Set set4 = this.f8658R;
        if (set4 == null) {
            set4 = null;
        }
        LinkedHashSet mike3 = ab.mike(mike2, set4);
        Set set5 = this.DOu;
        LinkedHashSet mike4 = ab.mike(mike3, set5 != null ? set5 : null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((r3) obj).f11196R;
            if (str != null && mike4.contains(str)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((r3) obj2).f11196R);
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0214 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0003, B:5:0x0027, B:6:0x002e, B:8:0x0053, B:9:0x0056, B:11:0x007a, B:12:0x007d, B:14:0x00a1, B:15:0x00a4, B:17:0x00c8, B:18:0x00cb, B:20:0x00ef, B:21:0x00f2, B:23:0x0113, B:24:0x0117, B:26:0x011d, B:28:0x0129, B:29:0x012f, B:31:0x0135, B:33:0x0141, B:34:0x0148, B:36:0x015c, B:38:0x0168, B:40:0x0173, B:41:0x018c, B:43:0x01a0, B:44:0x01a7, B:48:0x0200, B:51:0x0205, B:52:0x020e, B:54:0x0214, B:56:0x0225, B:58:0x022d, B:66:0x0238, B:68:0x0246, B:75:0x01c2, B:77:0x01c8, B:78:0x01d1, B:80:0x01d7, B:82:0x01e5, B:84:0x01eb, B:88:0x01f1, B:94:0x01fa), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0238 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0003, B:5:0x0027, B:6:0x002e, B:8:0x0053, B:9:0x0056, B:11:0x007a, B:12:0x007d, B:14:0x00a1, B:15:0x00a4, B:17:0x00c8, B:18:0x00cb, B:20:0x00ef, B:21:0x00f2, B:23:0x0113, B:24:0x0117, B:26:0x011d, B:28:0x0129, B:29:0x012f, B:31:0x0135, B:33:0x0141, B:34:0x0148, B:36:0x015c, B:38:0x0168, B:40:0x0173, B:41:0x018c, B:43:0x01a0, B:44:0x01a7, B:48:0x0200, B:51:0x0205, B:52:0x020e, B:54:0x0214, B:56:0x0225, B:58:0x022d, B:66:0x0238, B:68:0x0246, B:75:0x01c2, B:77:0x01c8, B:78:0x01d1, B:80:0x01d7, B:82:0x01e5, B:84:0x01eb, B:88:0x01f1, B:94:0x01fa), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0244  */
    @Override // com.incognia.internal.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        U6T b2;
        List list;
        List r4;
        List r5;
        List r10;
        List f92;
        String str;
        ArrayList W5;
        ArrayList b4;
        ArrayList sVU;
        Boolean valueOf;
        Set set;
        List b6;
        List p4;
        List W10;
        List W11;
        int i4 = 1;
        try {
            Result.Companion companion = Result.INSTANCE;
            jCW jcw = this.sVU;
            S0A s0a = jcw.f10673b;
            String str2 = jCW.f10668W;
            ArrayList arrayList = jCW.f10661E;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str2, arrayList));
            if (((JSONObject) jcw.f10673b.f9574b.get()).optBoolean(jCW.f10671f9, true)) {
                C.addAll(arrayList);
            }
            this.PqK = C;
            jCW jcw2 = this.sVU;
            S0A s0a2 = jcw2.f10673b;
            String str3 = jCW.sVU;
            ArrayList arrayList2 = jCW.f10672n9;
            LinkedHashSet C10 = CollectionsKt.C(s0a2.b(str3, arrayList2));
            if (((JSONObject) jcw2.f10673b.f9574b.get()).optBoolean(jCW.gmP, false)) {
                C10.addAll(arrayList2);
            }
            this.f8659V = C10;
            jCW jcw3 = this.sVU;
            S0A s0a3 = jcw3.f10673b;
            String str4 = jCW.f10663J;
            ArrayList arrayList3 = jCW.f10669Y;
            LinkedHashSet C11 = CollectionsKt.C(s0a3.b(str4, arrayList3));
            if (((JSONObject) jcw3.f10673b.f9574b.get()).optBoolean(jCW.PqK, false)) {
                C11.addAll(arrayList3);
            }
            this.olU = C11;
            jCW jcw4 = this.sVU;
            S0A s0a4 = jcw4.f10673b;
            String str5 = jCW.f10667V;
            ArrayList arrayList4 = jCW.f10665P;
            LinkedHashSet C12 = CollectionsKt.C(s0a4.b(str5, arrayList4));
            if (((JSONObject) jcw4.f10673b.f9574b.get()).optBoolean(jCW.olU, true)) {
                C12.addAll(arrayList4);
            }
            this.f8658R = C12;
            jCW jcw5 = this.sVU;
            S0A s0a5 = jcw5.f10673b;
            String str6 = jCW.f10666R;
            ArrayList arrayList5 = jCW.f10664L;
            LinkedHashSet C13 = CollectionsKt.C(s0a5.b(str6, arrayList5));
            if (((JSONObject) jcw5.f10673b.f9574b.get()).optBoolean(jCW.DOu, false)) {
                C13.addAll(arrayList5);
            }
            this.DOu = C13;
            jCW jcw6 = this.sVU;
            S0A s0a6 = jcw6.f10673b;
            String str7 = jCW.IB;
            ArrayList arrayList6 = jCW.FL;
            LinkedHashSet C14 = CollectionsKt.C(s0a6.b(str7, arrayList6));
            if (((JSONObject) jcw6.f10673b.f9574b.get()).optBoolean(jCW.Qs, false)) {
                C14.addAll(arrayList6);
            }
            this.IB = C14;
            int optInt = ((JSONObject) this.sVU.f10673b.f9574b.get()).optInt(jCW.f10670ar, 10);
            b2 = this.f8660W.b(f8656n9);
            list = b2 != null ? b2.f9693b : null;
            r4 = (!this.gmP.sVU || (W11 = W(list, this.f8662f9.W())) == null) ? null : CollectionsKt.r(W11, optInt);
            r5 = (!this.gmP.sVU || (W10 = W(list, this.f8662f9.b())) == null) ? null : CollectionsKt.r(W10, optInt);
            r10 = (!((JSONObject) this.sVU.f10673b.f9574b.get()).optBoolean(jCW.f10662H, true) || (b6 = b(list, this.f8662f9.b())) == null || (p4 = CollectionsKt.p(b6, new kPh())) == null) ? null : CollectionsKt.r(p4, ((JSONObject) this.sVU.f10673b.f9574b.get()).optInt(jCW.a2F, 10));
            f92 = ((JSONObject) this.sVU.f10673b.f9574b.get()).optBoolean(jCW.H02, false) ? f9(list) : null;
            str = (String) this.f8657J.getValue();
            W5 = W(list);
            b4 = b(list);
            sVU = sVU(list);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (list != null && !list.isEmpty()) {
            String str8 = this.f8661b.olU;
            int i5 = 0;
            for (Object obj : list) {
                int i10 = i4 == true ? 1 : 0;
                String str9 = ((r3) obj).f11196R;
                if (str9 != null && (StringsKt.beige(str8, str9, false) || StringsKt.beige(str9, str8, false))) {
                    i5++;
                }
                i4 = i10;
            }
            valueOf = Boolean.valueOf(i5 > i4 ? i4 : 0);
            set = this.IB;
            if (set == null) {
                set = null;
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj2 : set) {
                Boolean bool = valueOf;
                Boolean b10 = this.f8661b.b((String) obj2);
                if (b10 != null ? b10.booleanValue() : false) {
                    arrayList7.add(obj2);
                }
                valueOf = bool;
            }
            m206constructorimpl = Result.m206constructorimpl(new AiT(str, new XOD(W5, b4, sVU, valueOf, arrayList7, r4, r5, r10, b2 == null ? Boolean.valueOf(b2.b(f8656n9)) : null, f92)));
            Bo7.b(m206constructorimpl, wa2);
        }
        valueOf = null;
        set = this.IB;
        if (set == null) {
        }
        ArrayList arrayList72 = new ArrayList();
        while (r7.hasNext()) {
        }
        m206constructorimpl = Result.m206constructorimpl(new AiT(str, new XOD(W5, b4, sVU, valueOf, arrayList72, r4, r5, r10, b2 == null ? Boolean.valueOf(b2.b(f8656n9)) : null, f92)));
        Bo7.b(m206constructorimpl, wa2);
    }

    public final List W(List list, List list2) {
        fKw fkw;
        Object obj;
        if (list == null || list2 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!linkedHashSet.contains(str)) {
                Ssq ssq = this.f8661b;
                ssq.getClass();
                try {
                    fkw = ssq.f9(str);
                } catch (Throwable unused) {
                    fkw = null;
                }
                String str2 = fkw != null ? fkw.f10409b : null;
                boolean z2 = str2 != null && Intrinsics.areEqual((String) wGk.ESK.getValue(), str2);
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.areEqual(((r3) obj).f11196R, str)) {
                        break;
                    }
                }
                r3 r3Var = (r3) obj;
                boolean z10 = r3Var != null ? r3Var.sVU : false;
                if (!z2 && !z10) {
                    linkedHashSet.add(str);
                }
            }
        }
        return CollectionsKt.z(linkedHashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b(List list, List list2) {
        String str;
        Iterator it;
        Object obj;
        fKw fkw;
        if (list == null || list2 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!linkedHashSet2.contains(str2)) {
                if (this.gmP.sVU) {
                    Ssq ssq = this.f8661b;
                    ssq.getClass();
                    try {
                        fkw = ssq.f9(str2);
                    } catch (Throwable unused) {
                        fkw = null;
                    }
                    if (fkw != null) {
                        str = fkw.f10409b;
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.areEqual(((r3) obj).f11196R, str2)) {
                                break;
                            }
                        }
                        r3 r3Var = (r3) obj;
                        CS cs = new CS(str2, str, r3Var == null ? Boolean.valueOf(r3Var.sVU) : null);
                        linkedHashSet2.add(str2);
                        linkedHashSet.add(cs);
                    }
                }
                str = null;
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                r3 r3Var2 = (r3) obj;
                CS cs2 = new CS(str2, str, r3Var2 == null ? Boolean.valueOf(r3Var2.sVU) : null);
                linkedHashSet2.add(str2);
                linkedHashSet.add(cs2);
            }
        }
        return CollectionsKt.z(linkedHashSet);
    }

    public static ArrayList b(List list) {
        int collectionSizeOrDefault;
        List list2;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            r3 r3Var = (r3) obj;
            if (r3Var.f11196R != null && (list2 = r3Var.f11197V) != null && list2.contains(Qs)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((r3) obj2).f11196R);
        }
        return arrayList2;
    }
}
