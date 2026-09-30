package com.incognia.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Hd implements P0 {

    /* renamed from: J, reason: collision with root package name */
    public Set f8853J;
    public Set PqK;

    /* renamed from: V, reason: collision with root package name */
    public Set f8854V;

    /* renamed from: W, reason: collision with root package name */
    public final Ol f8855W;

    /* renamed from: b, reason: collision with root package name */
    public final FW f8856b;

    /* renamed from: f9, reason: collision with root package name */
    public final Cc f8857f9;
    public Set gmP;
    public final Lazy sVU = LazyKt.lazy(hPP.f10540b);
    public static final String olU = (String) wGk.f11698j1.getValue();

    /* renamed from: R, reason: collision with root package name */
    public static final String f8852R = (String) wGk.pL3.getValue();

    public Hd(FW fw, i6C i6c, Ol ol, Cc cc2) {
        this.f8856b = fw;
        this.f8855W = ol;
        this.f8857f9 = cc2;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.sVU.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    public final ArrayList f9() {
        boolean z2;
        Set set = this.gmP;
        Set set2 = null;
        if (set == null) {
            set = null;
        }
        Set set3 = this.f8853J;
        if (set3 == null) {
            set3 = null;
        }
        LinkedHashSet mike = ab.mike(set, set3);
        Set set4 = this.PqK;
        if (set4 == null) {
            set4 = null;
        }
        LinkedHashSet mike2 = ab.mike(mike, set4);
        Set set5 = this.f8854V;
        if (set5 != null) {
            set2 = set5;
        }
        LinkedHashSet mike3 = ab.mike(mike2, set2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mike3) {
            String str = (String) obj;
            this.f8856b.getClass();
            try {
                z2 = new File(str).exists();
            } catch (Throwable unused) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ArrayList sVU() {
        String str;
        File file;
        boolean z2;
        ArrayList arrayList = null;
        try {
            str = System.getenv(olU);
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            arrayList = new ArrayList();
            for (String str2 : StringsKt.maroon(str, new String[]{":"}, 6)) {
                FW fw = this.f8856b;
                String str3 = f8852R;
                fw.getClass();
                if (str3 != null) {
                    try {
                        file = new File(str2, str3);
                    } catch (Throwable unused2) {
                        z2 = false;
                    }
                } else {
                    file = new File(str2);
                }
                z2 = file.exists();
                if (z2) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.gmP = this.f8855W.W();
            this.f8853J = this.f8855W.b();
            Ol ol = this.f8855W;
            S0A s0a = ol.f9331b;
            String str = Ol.PqK;
            List list = Ol.f9327R;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str, list));
            S0A s0a2 = ol.f9331b;
            if (((JSONObject) s0a2.f9574b.get()).optBoolean(Ol.sVU, false)) {
                C.addAll(list);
            }
            this.PqK = C;
            this.f8854V = this.f8857f9.b();
            m206constructorimpl = Result.m206constructorimpl(new bX7((String) this.sVU.getValue(), new Ip7(f9(), sVU())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
