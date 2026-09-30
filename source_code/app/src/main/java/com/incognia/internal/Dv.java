package com.incognia.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Dv {
    public static final long sVU = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: W, reason: collision with root package name */
    public final XMI f8573W;

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f8574b;

    /* renamed from: f9, reason: collision with root package name */
    public final Nkf f8575f9;

    public Dv(Ssq ssq, XMI xmi, W6 w62) {
        this.f8574b = ssq;
        this.f8573W = xmi;
        this.f8575f9 = new Nkf(w62, sVU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0243, code lost:
    
        if (20 > (r3 - r6.size())) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(Ox ox) {
        int i4;
        List<r3> list;
        Iterable<r3> emptyList;
        LinkedHashMap linkedHashMap;
        boolean z2;
        int i5;
        List list2;
        Map map;
        Object obj;
        Object obj2;
        List list3;
        int collectionSizeOrDefault;
        String str;
        ApplicationInfo applicationInfo;
        List list4;
        int collectionSizeOrDefault2;
        Object obj3 = null;
        if (this.f8575f9.sVU == null) {
            Ssq ssq = this.f8574b;
            String str2 = Ssq.f9623R;
            if (ssq.f9628f9) {
                List<PackageInfo> b2 = Uck.b(ssq.f9626W, 0);
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(b2, 10);
                list4 = new ArrayList(collectionSizeOrDefault2);
                for (PackageInfo packageInfo : b2) {
                    ssq.sVU.getClass();
                    list4.add(H2T.b(packageInfo, null));
                }
            } else {
                list4 = 0;
            }
            if (list4 == 0) {
                list4 = CollectionsKt.emptyList();
            }
            Nkf nkf = this.f8575f9;
            Pwq pwq = Pwq.f9457b;
            nkf.b(new U6T(list4, kotlin.collections.y.romeo(new Pair(pwq, Boolean.TRUE))));
            if (Intrinsics.areEqual(ox, pwq)) {
                return;
            }
        }
        int b4 = ox.b();
        boolean b6 = this.f8573W.b(ox);
        U6T u6t = (U6T) this.f8575f9.sVU;
        if (u6t != null) {
            i4 = u6t.b();
        } else {
            i4 = 0;
        }
        Ssq ssq2 = this.f8574b;
        int i10 = b4 & (i4 ^ b4);
        if (ssq2.f9628f9) {
            List<PackageInfo> b10 = Uck.b(ssq2.f9626W, i10);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(b10, 10);
            list = new ArrayList(collectionSizeOrDefault);
            for (PackageInfo packageInfo2 : b10) {
                if (b6 && packageInfo2 != null) {
                    try {
                        applicationInfo = packageInfo2.applicationInfo;
                    } catch (Throwable unused) {
                    }
                    if (applicationInfo != null) {
                        str = ssq2.f9626W.getApplicationLabel(applicationInfo).toString();
                        ssq2.sVU.getClass();
                        list.add(H2T.b(packageInfo2, str));
                    }
                }
                str = null;
                ssq2.sVU.getClass();
                list.add(H2T.b(packageInfo2, str));
            }
        } else {
            list = 0;
        }
        if (list == 0) {
            list = CollectionsKt.emptyList();
        }
        U6T u6t2 = (U6T) this.f8575f9.sVU;
        if (u6t2 != null && (list3 = u6t2.f9693b) != null) {
            emptyList = CollectionsKt.B(list3);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List emptyList2 = CollectionsKt.emptyList();
        for (r3 r3Var : emptyList) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((r3) obj2).f11196R, r3Var.f11196R)) {
                        break;
                    }
                } else {
                    obj2 = obj3;
                    break;
                }
            }
            r3 r3Var2 = (r3) obj2;
            if (r3Var2 == null) {
                emptyList2 = CollectionsKt.plus(emptyList2, r3Var);
            } else {
                long j5 = r3Var2.f11200b;
                long j6 = r3Var2.f11198W;
                long j7 = r3Var2.f11201f9;
                boolean z10 = r3Var2.sVU;
                List list5 = r3Var2.gmP;
                if (list5 == null) {
                    list5 = r3Var.gmP;
                }
                List list6 = r3Var2.f11193J;
                if (list6 == null) {
                    list6 = r3Var.f11193J;
                }
                Iterable iterable = emptyList;
                List list7 = r3Var2.PqK;
                if (list7 == null) {
                    list7 = r3Var.PqK;
                }
                List list8 = list7;
                List list9 = r3Var2.f11197V;
                if (list9 == null) {
                    list9 = r3Var.f11197V;
                }
                List list10 = list9;
                Integer num = r3Var2.olU;
                if (num == null) {
                    num = r3Var.olU;
                }
                Integer num2 = num;
                String str3 = r3Var2.f11196R;
                if (str3 == null) {
                    str3 = r3Var.f11196R;
                }
                String str4 = str3;
                String str5 = r3Var2.DOu;
                if (str5 == null) {
                    str5 = r3Var.DOu;
                }
                String str6 = str5;
                Bundle bundle = r3Var2.IB;
                if (bundle == null) {
                    bundle = r3Var.IB;
                }
                Bundle bundle2 = bundle;
                String str7 = r3Var2.Qs;
                if (str7 == null) {
                    str7 = r3Var.Qs;
                }
                String str8 = str7;
                Integer num3 = r3Var2.f11192E;
                if (num3 == null) {
                    num3 = r3Var.f11192E;
                }
                Integer num4 = num3;
                String str9 = r3Var2.f11202n9;
                if (str9 == null) {
                    str9 = r3Var.f11202n9;
                }
                String str10 = str9;
                List list11 = r3Var2.f11199Y;
                if (list11 == null) {
                    list11 = r3Var.f11199Y;
                }
                List list12 = list11;
                String str11 = r3Var2.f11195P;
                if (str11 == null) {
                    str11 = r3Var.f11195P;
                }
                String str12 = str11;
                String str13 = r3Var2.f11194L;
                if (str13 == null) {
                    str13 = r3Var.f11194L;
                }
                emptyList2 = CollectionsKt.plus(emptyList2, new r3(j5, j6, j7, z10, list5, list6, list8, list10, num2, str4, str6, bundle2, str8, num4, str10, list12, str12, str13));
                emptyList = iterable;
                obj3 = null;
            }
        }
        Iterable iterable2 = emptyList;
        for (r3 r3Var3 : list) {
            Iterator it2 = iterable2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (Intrinsics.areEqual(((r3) obj).f11196R, r3Var3.f11196R)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                emptyList2 = CollectionsKt.plus(emptyList2, r3Var3);
            }
        }
        U6T u6t3 = (U6T) this.f8575f9.sVU;
        if (u6t3 != null && (map = u6t3.f9692W) != null) {
            linkedHashMap = kotlin.collections.y.amber(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (!Intrinsics.areEqual(ox, Pwq.f9457b) && !list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((r3) it3.next()).f11196R, this.f8574b.olU)) {
                        U6T u6t4 = (U6T) this.f8575f9.sVU;
                        if (u6t4 != null && (list2 = u6t4.f9693b) != null) {
                            i5 = list2.size();
                        } else {
                            i5 = 0;
                        }
                    }
                }
            }
            z2 = false;
            linkedHashMap.put(ox, Boolean.valueOf(z2));
            this.f8575f9.b(new U6T(emptyList2, linkedHashMap));
        }
        z2 = true;
        linkedHashMap.put(ox, Boolean.valueOf(z2));
        this.f8575f9.b(new U6T(emptyList2, linkedHashMap));
    }

    public final synchronized U6T b(Ox ox) {
        U6T u6t;
        boolean z2;
        try {
            if (!this.f8575f9.b() && (u6t = (U6T) this.f8575f9.sVU) != null) {
                int b2 = ox.b();
                int b4 = u6t.b();
                if (!u6t.f9692W.isEmpty() && b2 == (b4 & b2)) {
                    z2 = u6t.b(ox);
                } else {
                    z2 = false;
                }
                if (z2) {
                }
            }
            W(ox);
        } catch (Throwable unused) {
            return null;
        }
        return (U6T) this.f8575f9.sVU;
    }
}
