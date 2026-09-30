package com.incognia.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class KZN {

    /* renamed from: f9, reason: collision with root package name */
    public static final List f9008f9 = CollectionsKt.emptyList();
    public static final List sVU = CollectionsKt.listOf("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE");

    /* renamed from: W, reason: collision with root package name */
    public final KDK f9009W;

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f9010b;

    public KZN(Ssq ssq, KDK kdk) {
        this.f9010b = ssq;
        this.f9009W = kdk;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        Ssq ssq = this.f9010b;
        String str = ssq.olU;
        if (Intrinsics.areEqual(str, str) || ssq.f9628f9) {
            try {
                PackageInfo packageInfo = ssq.f9626W.getPackageInfo(str, 6);
                ArrayList arrayList2 = new ArrayList();
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                if (activityInfoArr != null) {
                    CollectionsKt.amber(arrayList2, activityInfoArr);
                }
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (serviceInfoArr != null) {
                    CollectionsKt.amber(arrayList2, serviceInfoArr);
                }
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    CollectionsKt.amber(arrayList2, providerInfoArr);
                }
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                if (activityInfoArr2 != null) {
                    CollectionsKt.amber(arrayList2, activityInfoArr2);
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    if (((ComponentInfo) obj).enabled) {
                        arrayList3.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                arrayList = new ArrayList(collectionSizeOrDefault);
                int size2 = arrayList3.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList3.get(i5);
                    i5++;
                    arrayList.add(((ComponentInfo) obj2).name);
                }
            } catch (Throwable unused) {
            }
            if (arrayList != null) {
                return false;
            }
            return arrayList.containsAll(f9008f9);
        }
        arrayList = null;
        if (arrayList != null) {
        }
    }
}
