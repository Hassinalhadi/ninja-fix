package zendesk.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import ao.ad;
import com.clevertap.android.sdk.network.api.CtApi;
import com.zendesk.logger.Logger;
import com.zendesk.util.LocaleUtil;
import com.zendesk.util.StringUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DeviceInfo {
    private static final int BAD_VALUE = -1;
    private static final long BYTES_MULTIPLIER = 1024;
    private static final int EXPECTED_TOKEN_COUNT = 3;
    private static final String LOG_TAG = "DeviceInfo";
    private static final String PLATFORM_ANDROID = "Android";
    private final ActivityManager activityManager;
    private final Context context;

    public DeviceInfo(Context context) {
        this.context = context;
        this.activityManager = (ActivityManager) context.getSystemService("activity");
    }

    private long getAvailableInternalDiskMemory() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("level", -1);
    }

    private String getBytesInMb(long j5) {
        return String.valueOf(j5 / 1048576);
    }

    public static Locale getCurrentLocale(Context context) {
        LocaleList locales;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale;
        }
        return context.getResources().getConfiguration().locale;
    }

    private long getDiskSize() {
        return getTotalInternalDiskSize();
    }

    private String getManufacturer() {
        String str = Build.MANUFACTURER;
        if (!"unknown".equals(str) && !StringUtils.isEmpty(str)) {
            return str;
        }
        return "";
    }

    private String getOS() {
        String str = Build.VERSION.RELEASE;
        if (!"unknown".equals(str)) {
            StringUtils.isEmpty(str);
        }
        int i4 = Build.VERSION.SDK_INT;
        Locale locale = Locale.US;
        return str + "/" + i4;
    }

    private long getTotalInternalDiskSize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    private long getTotalMemory() {
        Logger.d(LOG_TAG, "Using getTotalMemoryApi() to determine memory", new Object[0]);
        return getTotalMemoryApi();
    }

    private long getTotalMemoryApi() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private long getUsedDiskSpace() {
        return getDiskSize() - getAvailableInternalDiskMemory();
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    public Map<String, String> getInfo() {
        HashMap hashMap = new HashMap();
        String os = getOS();
        String model = getModel();
        long usedMemory = getUsedMemory();
        long totalMemory = getTotalMemory();
        long diskSize = getDiskSize();
        long usedDiskSpace = getUsedDiskSpace();
        int batteryLevel = getBatteryLevel();
        String locale = getLocale();
        String manufacturer = getManufacturer();
        if (!StringUtils.isEmpty(os)) {
            hashMap.put(CtApi.QUERY_PARAM_OS_KEY, os);
        }
        if (!StringUtils.isEmpty(model)) {
            hashMap.put("model", model);
        }
        if (usedMemory != -1) {
            hashMap.put("memory_used", getBytesInMb(usedMemory));
        }
        if (totalMemory != -1) {
            hashMap.put("memory_total", getBytesInMb(totalMemory));
        }
        if (diskSize != -1) {
            hashMap.put("disk_total", getBytesInMb(diskSize));
        }
        if (usedDiskSpace != -1) {
            hashMap.put("disk_used", getBytesInMb(usedDiskSpace));
        }
        if (batteryLevel != -1) {
            hashMap.put("battery_level", String.valueOf(batteryLevel));
        }
        if (!StringUtils.isEmpty(locale)) {
            hashMap.put("sys_locale", locale);
        }
        if (!StringUtils.isEmpty(manufacturer)) {
            hashMap.put("manufacturer", manufacturer);
        }
        hashMap.put("platform", "Android");
        return hashMap;
    }

    public String getLocale() {
        return LocaleUtil.toLanguageTag(Locale.getDefault());
    }

    public String getModel() {
        boolean z2;
        String str = Build.MODEL;
        boolean z10 = true;
        if (!"unknown".equals(str) && !StringUtils.isEmpty(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str2 = Build.DEVICE;
        if (!"unknown".equals(str2) && !StringUtils.isEmpty(str2)) {
            z10 = false;
        }
        if (z2 && z10) {
            return "";
        }
        if (str.equals(str2)) {
            return str;
        }
        Locale locale = Locale.US;
        return ad.amber(str, "/", str2);
    }
}
