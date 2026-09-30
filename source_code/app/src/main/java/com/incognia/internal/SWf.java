package com.incognia.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class SWf {
    public static final long sVU = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: W, reason: collision with root package name */
    public final Nkf f9599W;

    /* renamed from: b, reason: collision with root package name */
    public final Nkf f9600b;

    /* renamed from: f9, reason: collision with root package name */
    public final AccessibilityManager f9601f9;

    public SWf(Context context, W6 w62) {
        long j5 = sVU;
        this.f9600b = new Nkf(w62, j5);
        this.f9599W = new Nkf(w62, j5);
        this.f9601f9 = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final synchronized List W() {
        AccessibilityManager accessibilityManager;
        if (this.f9599W.b() && (accessibilityManager = this.f9601f9) != null) {
            Nkf nkf = this.f9599W;
            List<AccessibilityServiceInfo> installedAccessibilityServiceList = accessibilityManager.getInstalledAccessibilityServiceList();
            ArrayList arrayList = new ArrayList();
            Iterator<AccessibilityServiceInfo> it = installedAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(it.next().getResolveInfo().serviceInfo.packageName);
                } catch (Throwable unused) {
                }
            }
            nkf.b(arrayList);
        }
        return (List) this.f9599W.sVU;
    }

    public final synchronized List b() {
        AccessibilityManager accessibilityManager;
        if (this.f9600b.b() && (accessibilityManager = this.f9601f9) != null) {
            Nkf nkf = this.f9600b;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            ArrayList arrayList = new ArrayList();
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(it.next().getResolveInfo().serviceInfo.packageName);
                } catch (Throwable unused) {
                }
            }
            nkf.b(arrayList);
        }
        return (List) this.f9600b.sVU;
    }
}
