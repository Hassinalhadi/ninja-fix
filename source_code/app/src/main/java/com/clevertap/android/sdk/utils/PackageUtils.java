package com.clevertap.android.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.d;

/* loaded from: classes3.dex */
public class PackageUtils {
    private static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    private static final String GOOGLE_PLAY_STORE_PACKAGE_OLD = "com.google.market";

    public static boolean isGooglePlayServicesAvailable(Context context) {
        try {
            String str = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
            if (d.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isGooglePlayStoreAvailable(Context context) {
        if (!isPackageAvailable(context, "com.android.vending") && !isPackageAvailable(context, GOOGLE_PLAY_STORE_PACKAGE_OLD)) {
            return false;
        }
        return true;
    }

    private static boolean isPackageAvailable(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
