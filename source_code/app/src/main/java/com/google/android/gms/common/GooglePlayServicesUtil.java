package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.fragment.app.ai;
import com.clevertap.android.sdk.Constants;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class GooglePlayServicesUtil extends e {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i4, Activity activity, int i5) {
        return getErrorDialog(i4, activity, i5, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i4, Context context, int i5) {
        return d.getInstance().getErrorResolutionPendingIntent(context, i4, i5);
    }

    @Deprecated
    public static String getErrorString(int i4) {
        return ConnectionResult.E(i4);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return e.isGooglePlayServicesAvailable(context, e.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 3 || i4 == 9;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i4, Activity activity, int i5) {
        return showErrorDialogFragment(i4, activity, i5, null);
    }

    @Deprecated
    public static void showErrorNotification(int i4, Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (!e.isPlayServicesPossiblyUpdating(context, i4) && !e.isPlayStorePossiblyUpdating(context, i4)) {
            googleApiAvailability.showErrorNotification(context, i4);
        } else {
            googleApiAvailability.zaf(context);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i4, Activity activity, int i5, DialogInterface.OnCancelListener onCancelListener) {
        if (true == e.isPlayServicesPossiblyUpdating(activity, i4)) {
            i4 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i4, i5, onCancelListener);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i4) {
        return e.isGooglePlayServicesAvailable(context, i4);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i4, Activity activity, int i5, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i4, activity, null, i5, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i4, Activity activity, ai aiVar, int i5, DialogInterface.OnCancelListener onCancelListener) {
        if (true == e.isPlayServicesPossiblyUpdating(activity, i4)) {
            i4 = 18;
        }
        int i10 = i4;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (aiVar == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i10, i5, onCancelListener);
        }
        Dialog zaa = googleApiAvailability.zaa(activity, i10, new V5.o(GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i10, Constants.INAPP_DATA_TAG), aiVar, i5, 1), onCancelListener, null);
        if (zaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, zaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
