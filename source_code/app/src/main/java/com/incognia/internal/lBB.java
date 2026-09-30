package com.incognia.internal;

import A0.ae;
import Xd.l;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lBB {

    /* renamed from: J, reason: collision with root package name */
    public final Nkf f10809J;

    /* renamed from: W, reason: collision with root package name */
    public final Dv f10810W;

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f10811b;

    /* renamed from: f9, reason: collision with root package name */
    public final SWf f10812f9;
    public Long gmP;
    public final FW sVU;
    public static final String PqK = (String) wGk.E48.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final int f10808V = 27;
    public static final int olU = 10;

    /* renamed from: R, reason: collision with root package name */
    public static final long f10807R = TimeUnit.MINUTES.toMillis(10);
    public static final kZ4 DOu = kZ4.f10773b;

    public lBB(Ssq ssq, Dv dv, SWf sWf, FW fw, W6 w62) {
        this.f10811b = ssq;
        this.f10810W = dv;
        this.f10812f9 = sWf;
        this.sVU = fw;
        this.f10809J = new Nkf(w62, f10807R);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final XOw b() {
        int collectionSizeOrDefault;
        boolean z2;
        Set set;
        String str;
        List list;
        boolean z10;
        List list2;
        Iterator it;
        boolean z11;
        List list3;
        boolean z12;
        Ssq ssq;
        List list4;
        List list5;
        Long l10;
        Set set2;
        Object obj;
        String str2;
        Long l11;
        r3 r3Var;
        Signature signature;
        PackageInfo b2;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        fKw fkw;
        U6T b4 = this.f10810W.b(DOu);
        Set set3 = null;
        if (b4 == null) {
            return null;
        }
        List list6 = b4.f9693b;
        List W5 = this.f10812f9.W();
        if (W5 == null) {
            W5 = CollectionsKt.emptyList();
        }
        List b6 = this.f10812f9.b();
        if (b6 == null) {
            b6 = CollectionsKt.emptyList();
        }
        Long b10 = b(list6);
        ArrayList arrayList = new ArrayList();
        Iterator it5 = list6.iterator();
        while (it5.hasNext()) {
            r3 r3Var2 = (r3) it5.next();
            String str3 = r3Var2.f11196R;
            List list7 = r3Var2.f11197V;
            if (list7 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list7) {
                    String str4 = (String) obj2;
                    if (kotlin.text.r.quebec(str4, PqK, false) && Intrinsics.areEqual(this.f10811b.W(str4), Boolean.TRUE)) {
                        arrayList2.add(obj2);
                    }
                }
                z2 = true;
                set = CollectionsKt.D(arrayList2);
            } else {
                z2 = true;
                set = set3;
            }
            Integer num = r3Var2.olU;
            String str5 = r3Var2.f11196R;
            if (str5 != null) {
                Ssq ssq2 = this.f10811b;
                ssq2.getClass();
                try {
                    fkw = ssq2.f9(str5);
                } catch (Throwable unused) {
                    fkw = set3;
                }
                if (fkw != 0) {
                    str = fkw.f10409b;
                    list = r3Var2.gmP;
                    if (list != null && !list.isEmpty()) {
                        it4 = list.iterator();
                        while (it4.hasNext()) {
                            if (Intrinsics.areEqual(((ServiceInfo) it4.next()).permission, "android.permission.BIND_ACCESSIBILITY_SERVICE")) {
                                z10 = z2;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    String str6 = r3Var2.f11196R;
                    boolean z13 = (str6 == null && W5.contains(str6)) ? z2 : false;
                    String str7 = r3Var2.f11196R;
                    boolean z14 = (str7 == null && b6.contains(str7)) ? z2 : false;
                    boolean b11 = r3Var2.b();
                    list2 = r3Var2.gmP;
                    if (list2 != null && !list2.isEmpty()) {
                        it3 = list2.iterator();
                        while (it3.hasNext()) {
                            it = it5;
                            if (Intrinsics.areEqual(((ServiceInfo) it3.next()).permission, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
                                z11 = z2;
                                break;
                            }
                            it5 = it;
                        }
                    }
                    it = it5;
                    z11 = false;
                    boolean areEqual = Intrinsics.areEqual(Long.valueOf(r3Var2.f11201f9), b10);
                    list3 = r3Var2.f11193J;
                    if (list3 != null && !list3.isEmpty()) {
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            z12 = areEqual;
                            Iterator it6 = it2;
                            if (Intrinsics.areEqual(((ActivityInfo) it2.next()).permission, "android.permission.BIND_DEVICE_ADMIN")) {
                                break;
                            }
                            it2 = it6;
                            areEqual = z12;
                        }
                    }
                    z12 = areEqual;
                    z2 = false;
                    boolean z15 = r3Var2.sVU;
                    List list8 = r3Var2.PqK;
                    Signature signature2 = list8 == null ? (Signature) CollectionsKt.green(list8) : null;
                    ssq = this.f10811b;
                    synchronized (ssq) {
                        list4 = W5;
                        try {
                            if (ssq.f9625V == null) {
                                String str8 = Ssq.f9623R;
                                list5 = b6;
                                try {
                                    int b12 = OFM.f9292b.b();
                                    l10 = b10;
                                    if ((Intrinsics.areEqual(str8, ssq.olU) || ssq.f9628f9) && (b2 = Uck.b(ssq.f9626W, str8, b12)) != null) {
                                        ssq.sVU.getClass();
                                        set2 = null;
                                        try {
                                            r3Var = H2T.b(b2, null);
                                        } catch (Throwable unused2) {
                                        }
                                        if (r3Var != 0) {
                                            try {
                                                List list9 = r3Var.PqK;
                                                if (list9 != null) {
                                                    signature = (Signature) CollectionsKt.green(list9);
                                                    ssq.f9625V = signature;
                                                }
                                            } catch (Throwable unused3) {
                                                obj = set2;
                                                boolean areEqual2 = Intrinsics.areEqual(signature2, obj);
                                                List list10 = r3Var2.f11199Y;
                                                if (list10 != null) {
                                                }
                                                List list11 = r3Var2.gmP;
                                                if (list11 != null) {
                                                }
                                                List list12 = r3Var2.f11193J;
                                                if (list12 != null) {
                                                }
                                                String str9 = r3Var2.f11202n9;
                                                str2 = r3Var2.Qs;
                                                if (str2 != null) {
                                                }
                                                arrayList.add(new v0k(null, str3, Boolean.valueOf(z12), Boolean.valueOf(areEqual2), Boolean.valueOf(z15), Boolean.valueOf(z10), Boolean.valueOf(z13), Boolean.valueOf(z14), Boolean.valueOf(b11), Boolean.valueOf(z11), Boolean.valueOf(z2), set, num, str, r3Var2.f11194L, r27, r28, r29, l11, str9));
                                                set3 = set2;
                                                it5 = it;
                                                W5 = list4;
                                                b6 = list5;
                                                b10 = l10;
                                            }
                                        }
                                        signature = set2;
                                        ssq.f9625V = signature;
                                    }
                                    set2 = null;
                                    r3Var = set2;
                                    if (r3Var != 0) {
                                    }
                                    signature = set2;
                                    ssq.f9625V = signature;
                                } catch (Throwable unused4) {
                                    l10 = b10;
                                    set2 = null;
                                    obj = set2;
                                    boolean areEqual22 = Intrinsics.areEqual(signature2, obj);
                                    List list102 = r3Var2.f11199Y;
                                    if (list102 != null) {
                                    }
                                    List list112 = r3Var2.gmP;
                                    if (list112 != null) {
                                    }
                                    List list122 = r3Var2.f11193J;
                                    if (list122 != null) {
                                    }
                                    String str92 = r3Var2.f11202n9;
                                    str2 = r3Var2.Qs;
                                    if (str2 != null) {
                                    }
                                    arrayList.add(new v0k(null, str3, Boolean.valueOf(z12), Boolean.valueOf(areEqual22), Boolean.valueOf(z15), Boolean.valueOf(z10), Boolean.valueOf(z13), Boolean.valueOf(z14), Boolean.valueOf(b11), Boolean.valueOf(z11), Boolean.valueOf(z2), set, num, str, r3Var2.f11194L, r27, r28, r29, l11, str92));
                                    set3 = set2;
                                    it5 = it;
                                    W5 = list4;
                                    b6 = list5;
                                    b10 = l10;
                                }
                            } else {
                                list5 = b6;
                                l10 = b10;
                                set2 = null;
                            }
                            obj = ssq.f9625V;
                        } catch (Throwable unused5) {
                            list5 = b6;
                        }
                    }
                    boolean areEqual222 = Intrinsics.areEqual(signature2, obj);
                    List list1022 = r3Var2.f11199Y;
                    Integer valueOf = list1022 != null ? Integer.valueOf(list1022.size()) : set2;
                    List list1122 = r3Var2.gmP;
                    Integer valueOf2 = list1122 != null ? Integer.valueOf(list1122.size()) : set2;
                    List list1222 = r3Var2.f11193J;
                    Integer valueOf3 = list1222 != null ? Integer.valueOf(list1222.size()) : set2;
                    String str922 = r3Var2.f11202n9;
                    str2 = r3Var2.Qs;
                    if (str2 != null) {
                        this.sVU.getClass();
                        l11 = FW.b(str2);
                    } else {
                        l11 = set2;
                    }
                    arrayList.add(new v0k(null, str3, Boolean.valueOf(z12), Boolean.valueOf(areEqual222), Boolean.valueOf(z15), Boolean.valueOf(z10), Boolean.valueOf(z13), Boolean.valueOf(z14), Boolean.valueOf(b11), Boolean.valueOf(z11), Boolean.valueOf(z2), set, num, str, r3Var2.f11194L, valueOf, valueOf2, valueOf3, l11, str922));
                    set3 = set2;
                    it5 = it;
                    W5 = list4;
                    b6 = list5;
                    b10 = l10;
                }
            }
            str = set3;
            list = r3Var2.gmP;
            if (list != null) {
                it4 = list.iterator();
                while (it4.hasNext()) {
                }
            }
            z10 = false;
            String str62 = r3Var2.f11196R;
            if (str62 == null) {
            }
            String str72 = r3Var2.f11196R;
            if (str72 == null) {
            }
            boolean b112 = r3Var2.b();
            list2 = r3Var2.gmP;
            if (list2 != null) {
                it3 = list2.iterator();
                while (it3.hasNext()) {
                }
            }
            it = it5;
            z11 = false;
            boolean areEqual3 = Intrinsics.areEqual(Long.valueOf(r3Var2.f11201f9), b10);
            list3 = r3Var2.f11193J;
            if (list3 != null) {
                it2 = list3.iterator();
                while (it2.hasNext()) {
                }
            }
            z12 = areEqual3;
            z2 = false;
            boolean z152 = r3Var2.sVU;
            List list82 = r3Var2.PqK;
            if (list82 == null) {
            }
            ssq = this.f10811b;
            synchronized (ssq) {
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj3 = arrayList.get(i4);
            i4++;
            v0k v0kVar = (v0k) obj3;
            int i5 = !Intrinsics.areEqual((String) wGk.ESK.getValue(), v0kVar.f11517E) ? 1 : 0;
            Boolean bool = v0kVar.f11518J;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                i5 += 5;
            }
            if (Intrinsics.areEqual(v0kVar.PqK, bool2)) {
                i5 += 7;
            }
            if (Intrinsics.areEqual(v0kVar.f11522V, bool2)) {
                i5 += 10;
            }
            Set set4 = v0kVar.IB;
            if (set4 != null && set4.size() >= olU) {
                i5++;
            }
            if (Intrinsics.areEqual(v0kVar.olU, bool2)) {
                i5++;
            }
            Boolean bool3 = v0kVar.gmP;
            Boolean bool4 = Boolean.FALSE;
            if (Intrinsics.areEqual(bool3, bool4)) {
                i5++;
            }
            Integer num2 = v0kVar.Qs;
            if (num2 != null && num2.intValue() <= f10808V) {
                i5++;
            }
            if (Intrinsics.areEqual(v0kVar.sVU, bool4)) {
                i5++;
            }
            if (Intrinsics.areEqual(v0kVar.DOu, bool2)) {
                i5++;
            }
            if (Intrinsics.areEqual(v0kVar.f11521R, bool2)) {
                i5++;
            }
            if (Intrinsics.areEqual(v0kVar.f11527f9, bool4)) {
                i5++;
            }
            arrayList3.add(new v0k(Integer.valueOf(i5), v0kVar.f11523W, v0kVar.f11527f9, v0kVar.sVU, v0kVar.gmP, v0kVar.f11518J, v0kVar.PqK, v0kVar.f11522V, v0kVar.olU, v0kVar.f11521R, v0kVar.DOu, v0kVar.IB, v0kVar.Qs, v0kVar.f11517E, v0kVar.f11528n9, v0kVar.f11524Y, v0kVar.f11520P, v0kVar.f11519L, v0kVar.FL, v0kVar.f11525ar));
        }
        return new XOw(arrayList3, Boolean.valueOf(b4.b(DOu)));
    }

    public final Long b(List list) {
        Long l10 = this.gmP;
        if (l10 != null) {
            return l10;
        }
        ArrayList arrayList = new ArrayList(list);
        kotlin.collections.p.romeo(arrayList, new ae(4, l65.f10798b));
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        long j5 = -1;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            r3 r3Var = (r3) obj;
            if (j5 != -1) {
                if (j5 != r3Var.f11201f9 || i5 >= 2) {
                    break;
                }
            } else {
                j5 = r3Var.f11201f9;
            }
            i5++;
        }
        long valueOf = i5 > 1 ? Long.valueOf(j5) : -1L;
        this.gmP = valueOf;
        return valueOf;
    }

    public static final int b(l lVar, Object obj, Object obj2) {
        return ((Number) lVar.invoke(obj, obj2)).intValue();
    }
}
