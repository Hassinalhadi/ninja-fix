package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.clevertap.android.sdk.bitmap.BitmapDownloadRequest;
import com.clevertap.android.sdk.bitmap.HttpBitmapLoader;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.DownloadedBitmapFactory;
import com.clevertap.android.sdk.utils.Clock;
import com.google.firebase.messaging.RemoteMessage;
import g1.AbstractC1735d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Utils {
    private static final Pattern normalizedNameExcludePattern = Pattern.compile("\\s+");

    public static boolean areNamesNormalizedEqual(String str, String str2) {
        return Objects.equals(getNormalizedName(str), getNormalizedName(str2));
    }

    public static void cleanupOldGIFs(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Clock clock) {
        File[] listFiles;
        File dir = context.getDir(Constants.PUSH_DIRECTORY_NAME, 0);
        if (dir != null) {
            try {
                if (dir.exists() && (listFiles = dir.listFiles()) != null) {
                    long currentTimeMillis = clock.currentTimeMillis();
                    int i4 = 0;
                    for (File file : listFiles) {
                        if (file.isFile() && file.getName().endsWith(".gif")) {
                            try {
                                String name = file.getName();
                                if (currentTimeMillis - Long.parseLong(name.substring(0, name.lastIndexOf(".gif"))) >= Constants.ONE_DAY_IN_MILLIS) {
                                    if (file.delete()) {
                                        i4++;
                                    } else {
                                        cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Failed to delete old GIF file: " + file.getName());
                                    }
                                }
                            } catch (Exception unused) {
                                cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Skipping file with invalid file name format: " + file.getName());
                            }
                        }
                    }
                    if (i4 > 0) {
                        cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Cleaned up " + i4 + " old animated notification files");
                    }
                }
            } catch (Exception e) {
                cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Error during animated image cleanup: " + e.getMessage());
            }
        }
    }

    public static boolean containsIgnoreCase(Collection<String> collection, String str) {
        if (collection != null && str != null) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static HashMap<String, Object> convertBundleObjectToHashMap(Bundle bundle) {
        HashMap<String, Object> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                hashMap.putAll(convertBundleObjectToHashMap((Bundle) obj));
            } else {
                hashMap.put(str, bundle.get(str));
            }
        }
        return hashMap;
    }

    public static ArrayList<HashMap<String, Object>> convertJSONArrayOfJSONObjectsToArrayListOfHashMaps(JSONArray jSONArray) {
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                try {
                    arrayList.add(convertJSONObjectToHashMap(jSONArray.getJSONObject(i4)));
                } catch (JSONException e) {
                    Logger.v("Could not convert JSONArray of JSONObjects to ArrayList of HashMaps - " + e.getMessage());
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<String> convertJSONArrayToArrayList(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                try {
                    arrayList.add(jSONArray.getString(i4));
                } catch (JSONException e) {
                    Logger.v("Could not convert JSONArray to ArrayList - " + e.getMessage());
                }
            }
        }
        return arrayList;
    }

    public static HashMap<String, Object> convertJSONObjectToHashMap(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    hashMap.putAll(convertJSONObjectToHashMap((JSONObject) obj));
                } else {
                    hashMap.put(next, jSONObject.get(next));
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static String convertToTitleCase(String str) {
        if (str != null && !str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            boolean z2 = true;
            for (char c3 : str.toCharArray()) {
                if (Character.isSpaceChar(c3)) {
                    z2 = true;
                } else if (z2) {
                    c3 = Character.toTitleCase(c3);
                    z2 = false;
                } else {
                    c3 = Character.toLowerCase(c3);
                }
                sb2.append(c3);
            }
            return sb2.toString();
        }
        return str;
    }

    private static DownloadedBitmap downloadGif(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        CleverTapInstanceConfig cleverTapInstanceConfig2;
        if (str != null) {
            try {
                if (str.toLowerCase().endsWith(".gif")) {
                    cleverTapInstanceConfig2 = cleverTapInstanceConfig;
                    try {
                        DownloadedBitmap httpBitmap = HttpBitmapLoader.getHttpBitmap(HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_BYTES_WITH_TIME_LIMIT, new BitmapDownloadRequest(str, false, context, cleverTapInstanceConfig2, 5000L, -1));
                        cleverTapInstanceConfig2.getLogger().debug(cleverTapInstanceConfig2.getAccountId(), "Downloaded GIF in : " + httpBitmap.getDownloadTime());
                        if (httpBitmap.getStatus() == DownloadedBitmap.Status.SUCCESS && httpBitmap.getBytes() != null) {
                            return httpBitmap;
                        }
                        cleverTapInstanceConfig2.getLogger().debug(cleverTapInstanceConfig2.getAccountId(), "Failed to download gif " + httpBitmap.getStatus().getStatusValue());
                        return null;
                    } catch (Exception e) {
                        e = e;
                        Exception exc = e;
                        cleverTapInstanceConfig2.getLogger().debug(cleverTapInstanceConfig2.getAccountId(), "Couldn't download gif for notification: " + exc.getMessage());
                        return null;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                cleverTapInstanceConfig2 = cleverTapInstanceConfig;
            }
        }
        return null;
    }

    public static Bitmap drawableToBitmap(Drawable drawable) throws NullPointerException {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static DownloadedBitmap getAppIcon(Context context) throws NullPointerException {
        try {
            Drawable applicationLogo = context.getPackageManager().getApplicationLogo(context.getApplicationInfo());
            if (applicationLogo != null) {
                return DownloadedBitmapFactory.INSTANCE.successBitmap(drawableToBitmap(applicationLogo), 0L, null);
            }
            throw new Exception("Logo is null");
        } catch (Exception e) {
            e.printStackTrace();
            return DownloadedBitmapFactory.INSTANCE.successBitmap(drawableToBitmap(context.getPackageManager().getApplicationIcon(context.getApplicationInfo())), 0L, null);
        }
    }

    public static Bitmap getBitmapFromURL(String str) {
        return HttpBitmapLoader.getHttpBitmap(HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_INAPP_BITMAP, new BitmapDownloadRequest(str)).getBitmap();
    }

    @SuppressLint({"MissingPermission"})
    public static String getCurrentNetworkType(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "Unavailable";
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && networkInfo.isConnected()) {
                return "WiFi";
            }
            return getDeviceNetworkType(context);
        } catch (Throwable unused) {
            return "Unavailable";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String getDeviceNetworkType(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "Unavailable";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (hasPermission(context, "android.permission.READ_PHONE_STATE")) {
                try {
                    networkType = Rf.a.alpha(telephonyManager);
                } catch (SecurityException e) {
                    Logger.d("Security Exception caught while fetch network type" + e.getMessage());
                }
            } else {
                Logger.d("READ_PHONE_STATE permission not asked by the app or not granted by the user");
            }
            networkType = 0;
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        if (networkType != 20) {
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return "4G";
                default:
                    return "Unknown";
            }
        }
        return "5G";
    }

    public static DownloadedBitmap getDownloadedBitmapPostFallbackIconCheck(boolean z2, Context context, DownloadedBitmap downloadedBitmap) {
        if (downloadedBitmap.getBitmap() == null && z2) {
            return getAppIcon(context);
        }
        return downloadedBitmap;
    }

    public static long getMemoryConsumption() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public static String getNormalizedName(String str) {
        if (str == null) {
            return null;
        }
        return normalizedNameExcludePattern.matcher(str).replaceAll("").toLowerCase(Locale.ENGLISH);
    }

    public static DownloadedBitmap getNotificationBitmapWithTimeout(String str, boolean z2, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j5) throws NullPointerException {
        return HttpBitmapLoader.getHttpBitmap(HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT, new BitmapDownloadRequest(str, z2, context, cleverTapInstanceConfig, j5));
    }

    public static DownloadedBitmap getNotificationBitmapWithTimeoutAndSize(String str, boolean z2, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j5, int i4) throws NullPointerException {
        return HttpBitmapLoader.getHttpBitmap(HttpBitmapLoader.HttpBitmapOperation.DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT, new BitmapDownloadRequest(str, z2, context, cleverTapInstanceConfig, j5, i4));
    }

    public static Uri getNotificationGifURI(String str, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Clock clock) {
        DownloadedBitmap downloadGif = downloadGif(str, context, cleverTapInstanceConfig);
        if (downloadGif == null) {
            return null;
        }
        return saveGifToFileAndGetUri(downloadGif.getBytes(), context, cleverTapInstanceConfig, clock);
    }

    public static long getNowInMillis() {
        return System.currentTimeMillis();
    }

    public static String getSCDomain(String str) {
        String[] split = str.split("\\.", 2);
        return split[0] + ".auth." + split[1];
    }

    public static int getThumbnailImage(Context context, String str) {
        if (context != null) {
            return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        }
        return -1;
    }

    public static boolean hasPermission(Context context, String str) {
        if (AbstractC1735d.alpha(context, str) != 0) {
            return false;
        }
        return true;
    }

    public static double haversineDistance(Location location, Location location2) {
        double latitude = location.getLatitude() * 0.017453292519943295d;
        double latitude2 = location2.getLatitude() * 0.017453292519943295d;
        double latitude3 = (location2.getLatitude() - location.getLatitude()) * 0.017453292519943295d;
        double longitude = (location2.getLongitude() - location.getLongitude()) * 0.017453292519943295d;
        double sin = Math.sin(latitude3 / 2.0d);
        double sin2 = Math.sin(longitude / 2.0d);
        double cos = (Math.cos(latitude2) * Math.cos(latitude) * sin2 * sin2) + (sin * sin);
        return Math.atan2(Math.sqrt(cos), Math.sqrt(1.0d - cos)) * 12756.4d;
    }

    public static boolean isActivityDead(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static boolean isMainProcess(Context context, String str) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid && str.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isRenderFallback(RemoteMessage remoteMessage, Context context) {
        boolean parseBoolean = Boolean.parseBoolean((String) ((bv.e) remoteMessage.o()).get(Constants.WZRK_TSR_FB));
        boolean parseBoolean2 = Boolean.parseBoolean((String) ((bv.e) remoteMessage.o()).get(Constants.NOTIFICATION_RENDER_FALLBACK));
        if (!parseBoolean && parseBoolean2) {
            return true;
        }
        return false;
    }

    public static boolean isServiceAvailable(Context context, Class cls) {
        if (cls == null) {
            return false;
        }
        try {
            for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services) {
                if (serviceInfo.name.equals(cls.getName())) {
                    Logger.v("Service " + serviceInfo.name + " found");
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Logger.d("Intent Service name not found exception - " + e.getLocalizedMessage());
        }
        return false;
    }

    public static void navigateToAndroidSettingsForNotifications(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.addFlags(268435456);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        context.startActivity(intent);
    }

    public static String optionalStringKey(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static String readAssetFile(Context context, String str) throws IOException {
        InputStream open = context.getAssets().open(str);
        try {
            String next = new Scanner(open).useDelimiter("\\A").next();
            if (open != null) {
                open.close();
            }
            return next;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    private static Uri saveGifToFileAndGetUri(byte[] bArr, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Clock clock) {
        Path path;
        try {
            File dir = context.getDir(Constants.PUSH_DIRECTORY_NAME, 0);
            if (dir == null) {
                cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "CleverTap.Push dir not available for gif");
                return null;
            }
            File file = new File(dir, clock.currentTimeMillis() + ".gif");
            path = file.toPath();
            Files.write(path, bArr, new OpenOption[0]);
            return FileProvider.getUriForFile(context, context.getPackageName() + ".clevertap.fileprovider", file);
        } catch (Exception e) {
            cleverTapInstanceConfig.getLogger().debug(cleverTapInstanceConfig.getAccountId(), "Failed to write gif to file or create URI: " + e);
            return null;
        }
    }

    public static void setPackageNameFromResolveInfoList(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities != null) {
            String packageName = context.getPackageName();
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (packageName.equals(it.next().activityInfo.packageName)) {
                    intent.setPackage(packageName);
                    return;
                }
            }
        }
    }

    public static Bundle stringToBundle(String str) throws JSONException {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        }
        return bundle;
    }

    public static List<JSONObject> toJSONObjectList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.getJSONObject(i4));
        }
        return arrayList;
    }

    public static boolean validateCTID(String str) {
        if (str == null) {
            Logger.i("CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is NULL.");
            return false;
        }
        if (str.isEmpty()) {
            Logger.i("CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is empty.");
            return false;
        }
        if (str.length() > 64) {
            Logger.i("Custom CleverTap ID passed is greater than 64 characters. ");
            return false;
        }
        if (!str.matches("[=|<>;+.A-Za-z0-9()!:$@_-]*")) {
            Logger.i("Custom CleverTap ID cannot contain special characters apart from : =,(,),_,!,@,$,|<,>,;,+,. and - ");
            return false;
        }
        return true;
    }
}
