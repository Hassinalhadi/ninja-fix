package V5;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import bv.aw;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import e6.AbstractC1630b;
import g6.C1754b;
import java.util.Locale;
import s6.T6;

/* loaded from: classes2.dex */
public abstract class n {
    public static final aw alpha = new aw(0);
    public static Locale bravo;

    public static String alpha(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C1754b.alpha(context).purple;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String bravo(int i4, Context context) {
        Resources resources = context.getResources();
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(delivery.samurai.android.R.string.common_google_play_services_enable_button);
            }
            return resources.getString(delivery.samurai.android.R.string.common_google_play_services_update_button);
        }
        return resources.getString(delivery.samurai.android.R.string.common_google_play_services_install_button);
    }

    public static String charlie(int i4, Context context) {
        Resources resources = context.getResources();
        String alpha2 = alpha(context);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 7) {
                            if (i4 != 9) {
                                if (i4 != 20) {
                                    switch (i4) {
                                        case 16:
                                            return echo(context, "common_google_play_services_api_unavailable_text", alpha2);
                                        case 17:
                                            return echo(context, "common_google_play_services_sign_in_failed_text", alpha2);
                                        case 18:
                                            return resources.getString(delivery.samurai.android.R.string.common_google_play_services_updating_text, alpha2);
                                        default:
                                            return resources.getString(delivery.samurai.android.R.string.common_google_play_services_unknown_issue, alpha2);
                                    }
                                }
                                return echo(context, "common_google_play_services_restricted_profile_text", alpha2);
                            }
                            return resources.getString(delivery.samurai.android.R.string.common_google_play_services_unsupported_text, alpha2);
                        }
                        return echo(context, "common_google_play_services_network_error_text", alpha2);
                    }
                    return echo(context, "common_google_play_services_invalid_account_text", alpha2);
                }
                return resources.getString(delivery.samurai.android.R.string.common_google_play_services_enable_text, alpha2);
            }
            if (AbstractC1630b.foxtrot(context)) {
                return resources.getString(delivery.samurai.android.R.string.common_google_play_services_wear_update_text);
            }
            return resources.getString(delivery.samurai.android.R.string.common_google_play_services_update_text, alpha2);
        }
        return resources.getString(delivery.samurai.android.R.string.common_google_play_services_install_text, alpha2);
    }

    public static String delta(int i4, Context context) {
        Resources resources = context.getResources();
        switch (i4) {
            case 1:
                return resources.getString(delivery.samurai.android.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(delivery.samurai.android.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(delivery.samurai.android.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return foxtrot(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return foxtrot(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i4);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return foxtrot(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return foxtrot(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String echo(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String foxtrot = foxtrot(context, str);
        if (foxtrot == null) {
            foxtrot = resources.getString(delivery.samurai.android.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, foxtrot, str2);
    }

    public static String foxtrot(Context context, String str) {
        aw awVar = alpha;
        synchronized (awVar) {
            try {
                Locale locale = T6.alpha(context.getResources().getConfiguration()).alpha.get(0);
                if (!locale.equals(bravo)) {
                    awVar.clear();
                    bravo = locale;
                }
                String str2 = (String) awVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, CTVariableUtils.STRING, "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                awVar.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
