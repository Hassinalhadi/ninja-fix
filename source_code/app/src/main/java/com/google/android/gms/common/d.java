package com.google.android.gms.common;

import V5.ah;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import e6.AbstractC1630b;
import g6.C1754b;

/* loaded from: classes2.dex */
public class d {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final String TRACKING_SOURCE_DIALOG = "d";
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final d zza = new Object();

    public static d getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        e.cancelAvailabilityErrorNotifications(context);
    }

    public int getApkVersion(Context context) {
        return e.getApkVersion(context);
    }

    @Deprecated
    public Intent getErrorResolutionIntent(int i4) {
        return getErrorResolutionIntent(null, i4, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i4, int i5) {
        return getErrorResolutionPendingIntent(context, i4, i5, null);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i4) {
        return e.isPlayServicesPossiblyUpdating(context, i4);
    }

    public boolean isPlayStorePossiblyUpdating(Context context, int i4) {
        return e.isPlayStorePossiblyUpdating(context, i4);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return e.zza(context, str);
    }

    public void verifyGooglePlayServicesIsAvailable(Context context, int i4) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        e.ensurePlayServicesAvailable(context, i4);
    }

    public Intent getErrorResolutionIntent(Context context, int i4, String str) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return null;
            }
            int i5 = ah.alpha;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && AbstractC1630b.foxtrot(context)) {
            int i10 = ah.alpha;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C1754b.alpha(context).charlie(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        int i11 = ah.alpha;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(Constants.KEY_ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i4, int i5, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i4, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i5, errorResolutionIntent, 201326592);
    }

    public int isGooglePlayServicesAvailable(Context context, int i4) {
        int isGooglePlayServicesAvailable = e.isGooglePlayServicesAvailable(context, i4);
        if (e.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }
}
