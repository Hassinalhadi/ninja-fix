package com.incognia.internal;

import com.clevertap.android.sdk.Constants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b6 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Vl f10143W;

    /* renamed from: b, reason: collision with root package name */
    public final EGE f10144b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f10145f9 = LazyKt.lazy(oE.f11003b);
    public Set sVU;
    public static final String gmP = (String) wGk.Vg.getValue();

    /* renamed from: J, reason: collision with root package name */
    public static final String f10142J = (String) wGk.Fr.getValue();

    public b6(EGE ege, Vl vl) {
        this.f10144b = ege;
        this.f10143W = vl;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10145f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList f9() {
        InputStream inputStream;
        Scanner scanner;
        String[] strArr;
        Runtime b2;
        Process exec;
        ArrayList arrayList = new ArrayList();
        Vl vl = this.f10143W;
        String str = gmP;
        try {
            b2 = vl.b();
        } catch (Throwable unused) {
        }
        if (b2 != null && (exec = b2.exec(str)) != null) {
            inputStream = exec.getInputStream();
            if (inputStream != null) {
                try {
                    scanner = new Scanner(inputStream);
                } catch (Throwable unused2) {
                    scanner = null;
                }
                try {
                    strArr = (String[]) StringsKt.maroon(scanner.useDelimiter("\\A").next(), new String[]{"\n"}, 6).toArray(new String[0]);
                    scanner.close();
                    inputStream.close();
                } catch (Throwable unused3) {
                    if (scanner != null) {
                        scanner.close();
                    }
                    inputStream.close();
                    strArr = null;
                    if (strArr != null) {
                    }
                }
                if (strArr != null) {
                    return null;
                }
                for (String str2 : strArr) {
                    String[] strArr2 = (String[]) StringsKt.maroon(str2, new String[]{" "}, 6).toArray(new String[0]);
                    if (strArr2.length >= 4) {
                        String str3 = strArr2[1];
                        ArrayList B = CollectionsKt.B(StringsKt.maroon(strArr2[3], new String[]{Constants.SEPARATOR_COMMA}, 6));
                        Set set = this.sVU;
                        if (set == null) {
                            set = null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : set) {
                            if (kotlin.text.r.hotel(str3, (String) obj, true) && B.contains(f10142J)) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList.addAll(arrayList2);
                    }
                }
                return arrayList;
            }
            strArr = null;
            if (strArr != null) {
            }
        }
        inputStream = null;
        if (inputStream != null) {
        }
        strArr = null;
        if (strArr != null) {
        }
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            EGE ege = this.f10144b;
            S0A s0a = ege.f8610b;
            String str = EGE.PqK;
            ArrayList arrayList = EGE.FL;
            LinkedHashSet C = CollectionsKt.C(s0a.b(str, arrayList));
            S0A s0a2 = ege.f8610b;
            if (((JSONObject) s0a2.f9574b.get()).optBoolean(EGE.Qs, false)) {
                C.addAll(arrayList);
            }
            this.sVU = C;
            ArrayList f92 = f9();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f10145f9.getValue(), f92, new QUz(new Kyl(f92))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
