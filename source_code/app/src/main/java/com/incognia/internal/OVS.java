package com.incognia.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class OVS implements P0 {

    /* renamed from: J, reason: collision with root package name */
    public Set f9313J;
    public Set PqK;

    /* renamed from: V, reason: collision with root package name */
    public Set f9314V;

    /* renamed from: W, reason: collision with root package name */
    public final Vl f9315W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f9316b;

    /* renamed from: f9, reason: collision with root package name */
    public final Vpc f9317f9;
    public final Lazy gmP = LazyKt.lazy(w8d.f11600b);
    public Jme olU;
    public final EGE sVU;

    /* renamed from: R, reason: collision with root package name */
    public static final String f9312R = (String) wGk.tR.getValue();
    public static final String DOu = (String) wGk.ioA.getValue();
    public static final String IB = (String) wGk.Glr.getValue();
    public static final String[] Qs = {(String) wGk.Q7P.getValue()};

    /* renamed from: E, reason: collision with root package name */
    public static final String[] f9311E = {(String) wGk.g4p.getValue(), (String) wGk.f11606A4.getValue()};

    public OVS(S0A s0a, Vl vl, Vpc vpc, EGE ege) {
        this.f9316b = s0a;
        this.f9315W = vl;
        this.f9317f9 = vpc;
        this.sVU = ege;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.gmP.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    public final LinkedHashMap f9() {
        Jme jme = this.olU;
        if (jme == null) {
            jme = null;
        }
        LinkedHashMap linkedHashMap = jme.f8965W;
        if (linkedHashMap == null) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Set set = this.f9314V;
            if (set == null) {
                set = null;
            }
            if (set.contains(str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:3:0x0001, B:5:0x0026, B:6:0x002d, B:8:0x0051, B:9:0x0054, B:11:0x0078, B:12:0x007b, B:20:0x0094, B:23:0x00ab, B:26:0x00b0, B:29:0x00b9, B:31:0x00bd, B:33:0x00c8, B:36:0x00d6, B:41:0x00db, B:43:0x00f1, B:44:0x00fb, B:46:0x010d, B:47:0x0115), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:3:0x0001, B:5:0x0026, B:6:0x002d, B:8:0x0051, B:9:0x0054, B:11:0x0078, B:12:0x007b, B:20:0x0094, B:23:0x00ab, B:26:0x00b0, B:29:0x00b9, B:31:0x00bd, B:33:0x00c8, B:36:0x00d6, B:41:0x00db, B:43:0x00f1, B:44:0x00fb, B:46:0x010d, B:47:0x0115), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:3:0x0001, B:5:0x0026, B:6:0x002d, B:8:0x0051, B:9:0x0054, B:11:0x0078, B:12:0x007b, B:20:0x0094, B:23:0x00ab, B:26:0x00b0, B:29:0x00b9, B:31:0x00bd, B:33:0x00c8, B:36:0x00d6, B:41:0x00db, B:43:0x00f1, B:44:0x00fb, B:46:0x010d, B:47:0x0115), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    @Override // com.incognia.internal.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        int i4;
        String str;
        InputStream inputStream;
        Set set;
        Set set2;
        Jme jme;
        ArrayList arrayList;
        ArrayList arrayList2;
        Runtime b2;
        Process exec;
        try {
            Result.Companion companion = Result.INSTANCE;
            EGE ege = this.sVU;
            S0A s0a = ege.f8610b;
            String str2 = EGE.f8606W;
            ArrayList arrayList3 = EGE.f8600E;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str2, arrayList3));
            i4 = 0;
            if (((JSONObject) ege.f8610b.f9574b.get()).optBoolean(EGE.f8605V, false)) {
                C.addAll(arrayList3);
            }
            this.f9313J = C;
            EGE ege2 = this.sVU;
            S0A s0a2 = ege2.f8610b;
            String str3 = EGE.f8608f9;
            ArrayList arrayList4 = EGE.f8609n9;
            LinkedHashSet C10 = CollectionsKt.C(s0a2.b(str3, arrayList4));
            if (((JSONObject) ege2.f8610b.f9574b.get()).optBoolean(EGE.olU, false)) {
                C10.addAll(arrayList4);
            }
            this.PqK = C10;
            EGE ege3 = this.sVU;
            S0A s0a3 = ege3.f8610b;
            String str4 = EGE.sVU;
            ArrayList arrayList5 = EGE.f8607Y;
            LinkedHashSet C11 = CollectionsKt.C(s0a3.b(str4, arrayList5));
            if (((JSONObject) ege3.f8610b.f9574b.get()).optBoolean(EGE.f8604R, true)) {
                C11.addAll(arrayList5);
            }
            this.f9314V = C11;
            Vl vl = this.f9315W;
            str = IB;
            try {
                b2 = vl.b();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (b2 != null && (exec = b2.exec(str)) != null) {
            inputStream = exec.getInputStream();
            this.olU = this.f9317f9.b(inputStream);
            String str5 = (String) this.gmP.getValue();
            set = this.f9313J;
            if (set == null) {
                set = null;
            }
            set2 = this.PqK;
            if (set2 == null) {
                set2 = null;
            }
            LinkedHashSet mike = ab.mike(set, set2);
            jme = this.olU;
            if (jme == null) {
                jme = null;
            }
            arrayList = jme.f8966b;
            if (arrayList == null) {
                arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    if (mike.contains((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = null;
            }
            m206constructorimpl = Result.m206constructorimpl(new u1M(str5, new Zyk(arrayList2, !((JSONObject) this.f9316b.f9574b.get()).optBoolean(f9312R, true) ? this.f9315W.b(Qs, (String[]) null) : null, ((JSONObject) this.f9316b.f9574b.get()).optBoolean(DOu, true) ? this.f9315W.b(f9311E, (String[]) null) : null, f9())));
            Bo7.b(m206constructorimpl, wa2);
        }
        inputStream = null;
        this.olU = this.f9317f9.b(inputStream);
        String str52 = (String) this.gmP.getValue();
        set = this.f9313J;
        if (set == null) {
        }
        set2 = this.PqK;
        if (set2 == null) {
        }
        LinkedHashSet mike2 = ab.mike(set, set2);
        jme = this.olU;
        if (jme == null) {
        }
        arrayList = jme.f8966b;
        if (arrayList == null) {
        }
        m206constructorimpl = Result.m206constructorimpl(new u1M(str52, new Zyk(arrayList2, !((JSONObject) this.f9316b.f9574b.get()).optBoolean(f9312R, true) ? this.f9315W.b(Qs, (String[]) null) : null, ((JSONObject) this.f9316b.f9574b.get()).optBoolean(DOu, true) ? this.f9315W.b(f9311E, (String[]) null) : null, f9())));
        Bo7.b(m206constructorimpl, wa2);
    }
}
