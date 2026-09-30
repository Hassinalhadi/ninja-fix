package com.incognia.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class sAG {

    /* renamed from: W, reason: collision with root package name */
    public final Dv f11277W;

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f11278b;

    /* renamed from: f9, reason: collision with root package name */
    public final FW f11279f9;
    public final XMI sVU;
    public static final Pwq gmP = Pwq.f9457b;

    /* renamed from: J, reason: collision with root package name */
    public static final aE f11276J = aE.f10090b;

    public sAG(Ssq ssq, Dv dv, W6 w62, FW fw, XMI xmi) {
        this.f11278b = ssq;
        this.f11277W = dv;
        this.f11279f9 = fw;
        this.sVU = xmi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ec A[Catch: all -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f6, blocks: (B:67:0x00c2, B:69:0x00ca, B:133:0x00cf, B:141:0x00ec), top: B:66:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.incognia.internal.fKw] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xf7 b() {
        qn2 qn2Var;
        r3 r3Var;
        Object obj;
        ?? r11;
        ?? r14;
        Integer num;
        Long b2;
        List<ActivityInfo> list;
        String str;
        List list2;
        int indigo;
        ?? r12;
        ApplicationInfo applicationInfo;
        U6T b4 = this.f11277W.b(gmP);
        r3 r3Var2 = null;
        if (b4 == null) {
            return null;
        }
        List list3 = b4.f9693b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            r3 r3Var3 = (r3) obj2;
            String str2 = r3Var3.f11196R;
            if (str2 != null && r3Var3.DOu != null && r3Var3.Qs != null && str2.length() <= 20) {
                FW fw = this.f11279f9;
                String str3 = r3Var3.Qs;
                fw.getClass();
                Long b6 = FW.b(str3);
                if (b6 == null || b6.longValue() <= 100000) {
                    try {
                        ZipFile zipFile = new ZipFile(r3Var3.Qs);
                        try {
                            Enumeration<? extends ZipEntry> entries = zipFile.entries();
                            while (true) {
                                if (entries.hasMoreElements()) {
                                    if (entries.nextElement().getTime() + TimeZone.getDefault().getOffset(r8) != 1230768000000L) {
                                        zipFile.close();
                                        break;
                                    }
                                } else {
                                    zipFile.close();
                                    arrayList.add(obj2);
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                                break;
                            } catch (Throwable th2) {
                                AbstractC2716m6.alpha(zipFile, th);
                                throw th2;
                                break;
                            }
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
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
                Ssq ssq = this.f11278b;
                aE aEVar = f11276J;
                aEVar.getClass();
                boolean b10 = this.sVU.b(aEVar);
                ssq.getClass();
                if (Intrinsics.areEqual(str4, ssq.olU) || ssq.f9628f9) {
                    PackageInfo b11 = Uck.b(ssq.f9626W, str4, 1);
                    if (b10 && b11 != null) {
                        try {
                            applicationInfo = b11.applicationInfo;
                        } catch (Throwable unused2) {
                        }
                        if (applicationInfo != null) {
                            r12 = ssq.f9626W.getApplicationLabel(applicationInfo).toString();
                            if (b11 != null) {
                                ssq.sVU.getClass();
                                r3Var = H2T.b(b11, r12);
                                if (r3Var == null) {
                                    obj = r3Var.f11196R;
                                } else {
                                    obj = r3Var2;
                                }
                                if (obj != null && r3Var.f11192E != null && r3Var.DOu != null && r3Var.Qs != null && !r3Var.sVU) {
                                    Ssq ssq2 = this.f11278b;
                                    String str5 = r3Var.f11196R;
                                    ssq2.getClass();
                                    try {
                                        r11 = ssq2.f9(str5);
                                    } catch (Throwable unused3) {
                                        r11 = r3Var2;
                                    }
                                    if (r11 == 0) {
                                        r14 = r11.f10409b;
                                    } else {
                                        r14 = r3Var2;
                                    }
                                    if (!Intrinsics.areEqual(r14, (String) wGk.ESK.getValue()) && (num = r3Var.f11192E) != null && num.intValue() == 0 && r3Var.f11200b == 1 && Intrinsics.areEqual(r3Var.DOu, "1.0")) {
                                        FW fw2 = this.f11279f9;
                                        String str6 = r3Var.Qs;
                                        fw2.getClass();
                                        b2 = FW.b(str6);
                                        if (b2 != null || b2.longValue() <= 100000) {
                                            list = r3Var.f11199Y;
                                            str = r3Var.f11196R;
                                            ?? arrayList3 = new ArrayList();
                                            if (str != null && list != null) {
                                                indigo = StringsKt.indigo(6, str, ".");
                                                if (indigo != -1) {
                                                    str = str.substring(0, indigo);
                                                }
                                                for (ActivityInfo activityInfo : list) {
                                                    String str7 = activityInfo.name;
                                                    if (str7 != null && !kotlin.text.r.quebec(str7, str, false)) {
                                                        arrayList3.add(activityInfo.name);
                                                    } else {
                                                        arrayList3 = CollectionsKt.emptyList();
                                                        break;
                                                    }
                                                }
                                            }
                                            list2 = arrayList3;
                                            if (!list2.isEmpty()) {
                                                qn2Var = new qn2(r3Var.f11196R, r14, r3Var.f11202n9, r3Var.f11192E, Long.valueOf(r3Var.f11200b), r3Var.DOu, list2, b2);
                                                if (qn2Var == null) {
                                                    arrayList2.add(qn2Var);
                                                }
                                                r3Var2 = null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    r12 = r3Var2;
                    if (b11 != null) {
                    }
                }
                r3Var = r3Var2;
                if (r3Var == null) {
                }
                if (obj != null) {
                    Ssq ssq22 = this.f11278b;
                    String str52 = r3Var.f11196R;
                    ssq22.getClass();
                    r11 = ssq22.f9(str52);
                    if (r11 == 0) {
                    }
                    if (!Intrinsics.areEqual(r14, (String) wGk.ESK.getValue())) {
                        FW fw22 = this.f11279f9;
                        String str62 = r3Var.Qs;
                        fw22.getClass();
                        b2 = FW.b(str62);
                        if (b2 != null) {
                        }
                        list = r3Var.f11199Y;
                        str = r3Var.f11196R;
                        ?? arrayList32 = new ArrayList();
                        if (str != null) {
                            indigo = StringsKt.indigo(6, str, ".");
                            if (indigo != -1) {
                            }
                            while (r3.hasNext()) {
                            }
                        }
                        list2 = arrayList32;
                        if (!list2.isEmpty()) {
                        }
                    }
                }
            }
            qn2Var = null;
            if (qn2Var == null) {
            }
            r3Var2 = null;
        }
        return new xf7(arrayList2, Boolean.valueOf(b4.b(gmP)));
    }
}
