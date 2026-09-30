package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class c {
    public static final V5.g alpha = new V5.g("CommonUtils", "");

    public static String alpha(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            V5.g gVar = alpha;
            if (Log.isLoggable(gVar.alpha, 6)) {
                Log.e("CommonUtils", gVar.bravo(concat));
                return "";
            }
            return "";
        }
    }
}
