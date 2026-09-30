package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import r7.AbstractC2500b;
import r7.C2499a;
import r7.C2501c;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1300c1 {
    public static volatile AbstractC2500b alpha = C2499a.alpha;
    public static final Object bravo = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean alpha(Context context, Uri uri) {
        int i4;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (alpha.bravo()) {
            return ((Boolean) alpha.alpha()).booleanValue();
        }
        synchronized (bravo) {
            try {
                if (alpha.bravo()) {
                    return ((Boolean) alpha.alpha()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    PackageManager packageManager = context.getPackageManager();
                    if (Build.VERSION.SDK_INT < 29) {
                        i4 = 0;
                    } else {
                        i4 = 268435456;
                    }
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.phenotype", i4);
                    if (resolveContentProvider != null) {
                    }
                    alpha = new C2501c(Boolean.valueOf(z2));
                    return ((Boolean) alpha.alpha()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z2 = true;
                }
                alpha = new C2501c(Boolean.valueOf(z2));
                return ((Boolean) alpha.alpha()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
