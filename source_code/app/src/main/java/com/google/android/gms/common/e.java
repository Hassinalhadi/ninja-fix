package com.google.android.gms.common;

import V5.x;
import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.appcompat.widget.P0;
import delivery.samurai.android.R;
import e6.AbstractC1630b;
import g6.C1754b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class e {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = "com.google.android.gsf";
    static boolean zza;
    private static boolean zzb;

    @Deprecated
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException e) {
                Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e);
            }
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i4) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = d.getInstance().isGooglePlayServicesAvailable(context, i4);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = d.getInstance().getErrorResolutionIntent(context, isGooglePlayServicesAvailable, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + isGooglePlayServicesAvailable);
            if (errorResolutionIntent == null) {
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
            }
            throw new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageInfo = C1754b.alpha(context).charlie(128, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i4) {
        return d.getInstance().getErrorResolutionIntent(null, i4, null);
    }

    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!zza) {
                try {
                    PackageInfo charlie = C1754b.alpha(context).charlie(64, "com.google.android.gms");
                    f.bravo(context);
                    if (charlie != null && !f.echo(charlie, false) && f.echo(charlie, true)) {
                        zzb = true;
                    } else {
                        zzb = false;
                    }
                    zza = true;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                    zza = true;
                }
            }
            if (!zzb && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            zza = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int isGooglePlayServicesAvailable(Context context, int i4) {
        boolean z2;
        boolean z10;
        String packageName;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        int i5;
        boolean z11;
        Bundle bundle;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            synchronized (x.alpha) {
                try {
                    if (!x.bravo) {
                        x.bravo = true;
                        try {
                            bundle = C1754b.alpha(context).bravo(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            x.charlie = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i10 = x.charlie;
            if (i10 != 0) {
                if (i10 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                    throw new GooglePlayServicesIncorrectManifestValueException(i10);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        try {
            if (!AbstractC1630b.foxtrot(context)) {
                if (AbstractC1630b.echo == null) {
                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC1630b.echo = Boolean.valueOf(z11);
                }
                if (!AbstractC1630b.echo.booleanValue()) {
                    z2 = true;
                    if (i4 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x.bravo(z10);
                    packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (!z2) {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    } else {
                        packageInfo = null;
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    f.bravo(context);
                    if (f.echo(packageInfo2, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    } else {
                        if (z2) {
                            x.hotel(packageInfo);
                            if (!f.echo(packageInfo, true)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (z2 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        } else {
                            int i11 = packageInfo2.versionCode;
                            int i12 = -1;
                            if (i11 == -1) {
                                i5 = -1;
                            } else {
                                i5 = i11 / 1000;
                            }
                            if (i4 != -1) {
                                i12 = i4 / 1000;
                            }
                            if (i5 < i12) {
                                StringBuilder green = P0.green("Google Play services out of date for ", packageName, ".  Requires ", " but found ", i4);
                                green.append(i11);
                                Log.w("GooglePlayServicesUtil", green.toString());
                                return 2;
                            }
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e4) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e4);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 0;
                            }
                            return 3;
                        }
                    }
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            f.bravo(context);
            if (f.echo(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
        z2 = false;
        if (i4 < 0) {
        }
        x.bravo(z10);
        packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (!z2) {
        }
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i4) {
        return AbstractC1630b.echo(context, i4);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i4) {
        if (i4 == 18) {
            return true;
        }
        if (i4 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i4) {
        if (i4 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        Object systemService = context.getSystemService("user");
        x.hotel(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        if (AbstractC1630b.delta == null) {
            AbstractC1630b.delta = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return AbstractC1630b.delta.booleanValue();
    }

    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i4, String str) {
        return AbstractC1630b.golf(context, i4, str);
    }

    @TargetApi(21)
    public static boolean zza(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (!applicationInfo.enabled || isRestrictedUserProfile(context)) {
            return false;
        }
        return true;
    }
}
