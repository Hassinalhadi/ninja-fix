package com.clevertap.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import ao.ad;

/* loaded from: classes3.dex */
public final class StorageHelper {
    public static boolean getBoolean(Context context, String str, boolean z2) {
        return getPreferences(context).getBoolean(str, z2);
    }

    public static boolean getBooleanFromPrefs(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig.isDefaultInstance()) {
            boolean z2 = getBoolean(context, storageKeyWithSuffix(cleverTapInstanceConfig, str), false);
            if (!z2) {
                return getBoolean(context, str, false);
            }
            return z2;
        }
        return getBoolean(context, storageKeyWithSuffix(cleverTapInstanceConfig, str), false);
    }

    public static int getInt(Context context, String str, int i4) {
        return getPreferences(context).getInt(str, i4);
    }

    public static int getIntFromPrefs(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, int i4) {
        if (cleverTapInstanceConfig.isDefaultInstance()) {
            int i5 = getInt(context, storageKeyWithSuffix(cleverTapInstanceConfig, str), Constants.EMPTY_NOTIFICATION_ID);
            if (i5 != -1000) {
                return i5;
            }
            return getInt(context, str, i4);
        }
        return getInt(context, storageKeyWithSuffix(cleverTapInstanceConfig, str), i4);
    }

    public static long getLong(Context context, String str, long j5) {
        return getPreferences(context).getLong(str, j5);
    }

    public static long getLongFromPrefs(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, int i4, String str2) {
        if (cleverTapInstanceConfig.isDefaultInstance()) {
            long j5 = getLong(context, str2, storageKeyWithSuffix(cleverTapInstanceConfig, str), -1000L);
            if (j5 != -1000) {
                return j5;
            }
            return getLong(context, str2, str, i4);
        }
        return getLong(context, str2, storageKeyWithSuffix(cleverTapInstanceConfig, str), i4);
    }

    public static SharedPreferences getPreferences(Context context, String str) {
        String str2;
        if (str != null) {
            str2 = "WizRocket_".concat(str);
        } else {
            str2 = Constants.CLEVERTAP_STORAGE_TAG;
        }
        return context.getSharedPreferences(str2, 0);
    }

    public static String getString(Context context, String str, String str2) {
        return getPreferences(context).getString(str, str2);
    }

    public static String getStringFromPrefs(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        if (cleverTapInstanceConfig.isDefaultInstance()) {
            String string = getString(context, storageKeyWithSuffix(cleverTapInstanceConfig, str), str2);
            if (string != null) {
                return string;
            }
            return getString(context, str, str2);
        }
        return getString(context, storageKeyWithSuffix(cleverTapInstanceConfig, str), str2);
    }

    public static void persist(SharedPreferences.Editor editor) {
        try {
            editor.apply();
        } catch (Throwable th) {
            Logger.v("CRITICAL: Failed to persist shared preferences!", th);
        }
    }

    public static void persistImmediately(SharedPreferences.Editor editor) {
        try {
            editor.commit();
        } catch (Throwable th) {
            Logger.v("CRITICAL: Failed to persist shared preferences!", th);
        }
    }

    public static void putBoolean(Context context, String str, boolean z2) {
        persist(getPreferences(context).edit().putBoolean(str, z2));
    }

    public static void putBooleanImmediate(Context context, String str, boolean z2) {
        persistImmediately(getPreferences(context).edit().putBoolean(str, z2));
    }

    public static void putInt(Context context, String str, int i4) {
        persist(getPreferences(context).edit().putInt(str, i4));
    }

    public static void putIntImmediate(Context context, String str, int i4) {
        persistImmediately(getPreferences(context).edit().putInt(str, i4));
    }

    public static void putLong(Context context, String str, long j5) {
        persist(getPreferences(context).edit().putLong(str, j5));
    }

    public static void putString(Context context, String str, String str2) {
        persist(getPreferences(context).edit().putString(str, str2));
    }

    public static void putStringImmediate(Context context, String str, String str2) {
        persistImmediately(getPreferences(context).edit().putString(str, str2));
    }

    public static void remove(Context context, String str) {
        persist(getPreferences(context).edit().remove(str));
    }

    public static void removeImmediate(Context context, String str) {
        persistImmediately(getPreferences(context).edit().remove(str));
    }

    @Deprecated
    public static String storageKeyWithSuffix(CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        StringBuilder beige = ad.beige(str, ":");
        beige.append(cleverTapInstanceConfig.getAccountId());
        return beige.toString();
    }

    public static long getLong(Context context, String str, String str2, long j5) {
        return getPreferences(context, str).getLong(str2, j5);
    }

    public static String getString(Context context, String str, String str2, String str3) {
        return getPreferences(context, str).getString(str2, str3);
    }

    public static SharedPreferences getPreferences(Context context) {
        return getPreferences(context, null);
    }

    public static void putString(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        persist(getPreferences(context).edit().putString(storageKeyWithSuffix(cleverTapInstanceConfig, str), str2));
    }

    public static String storageKeyWithSuffix(String str, String str2) {
        return ad.amber(str2, ":", str);
    }
}
