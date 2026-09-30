package com.incognia.internal;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Uck {
    public static final PackageInfo b(PackageManager packageManager, String str, int i4) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT >= 33) {
            of2 = PackageManager.PackageInfoFlags.of(i4);
            packageInfo = packageManager.getPackageInfo(str, of2);
            return packageInfo;
        }
        return packageManager.getPackageInfo(str, i4);
    }

    public static final List b(PackageManager packageManager, int i4) {
        PackageManager.PackageInfoFlags of2;
        List installedPackages;
        if (Build.VERSION.SDK_INT >= 33) {
            of2 = PackageManager.PackageInfoFlags.of(i4);
            installedPackages = packageManager.getInstalledPackages(of2);
            return installedPackages;
        }
        return packageManager.getInstalledPackages(i4);
    }

    public static final List b(PackageManager packageManager, Intent intent) {
        PackageManager.ResolveInfoFlags of2;
        List queryIntentActivities;
        if (Build.VERSION.SDK_INT >= 33) {
            of2 = PackageManager.ResolveInfoFlags.of(0);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of2);
            return queryIntentActivities;
        }
        return packageManager.queryIntentActivities(intent, 0);
    }
}
